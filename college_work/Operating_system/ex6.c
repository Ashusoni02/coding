#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int id;
    int arrival_time;
    int burst_time;
    int priority;
    int completion_time;
    int turnaround_time;
    int waiting_time;
} Process;

void reset_metrics(Process p[], int n) {
    for (int i = 0; i < n; i++) {
        p[i].completion_time = 0;
        p[i].turnaround_time = 0;
        p[i].waiting_time = 0;
    }
}

void print_metrics(Process p[], int n, const char* algo_name) {
    float total_wt = 0, total_tat = 0;
    printf("\n--- %s Scheduling Results ---\n", algo_name);
    printf("PID\tArrival\tBurst\tPriority\tCompletion\tTurnaround\tWaiting\n");
    for (int i = 0; i < n; i++) {
        total_wt += p[i].waiting_time;
        total_tat += p[i].turnaround_time;
        printf("P%d\t%d\t%d\t%d\t\t%d\t\t%d\t\t%d\n", 
               p[i].id, p[i].arrival_time, p[i].burst_time, 
               p[i].priority, p[i].completion_time, 
               p[i].turnaround_time, p[i].waiting_time);
    }
    printf("Average Waiting Time: %.2f\n", total_wt / n);
    printf("Average Turnaround Time: %.2f\n", total_tat / n);
}

// 1. First-Come, First-Served (FCFS)
void run_fcfs(Process p[], int n) {
    // Sort primarily by arrival time
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (p[j].arrival_time > p[j+1].arrival_time) {
                Process temp = p[j];
                p[j] = p[j+1];
                p[j+1] = temp;
            }
        }
    }

    int current_time = 0;
    for (int i = 0; i < n; i++) {
        if (current_time < p[i].arrival_time) {
            current_time = p[i].arrival_time;
        }
        p[i].completion_time = current_time + p[i].burst_time;
        p[i].turnaround_time = p[i].completion_time - p[i].arrival_time;
        p[i].waiting_time = p[i].turnaround_time - p[i].burst_time;
        current_time = p[i].completion_time;
    }
    print_metrics(p, n, "FCFS");
}

// 2. Non-Preemptive Shortest Job First (SJF)
void run_sjf(Process p[], int n) {
    int completed = 0, current_time = 0;
    int visited[20] = {0};

    while (completed < n) {
        int idx = -1;
        int min_burst = 1e9;
        
        for (int i = 0; i < n; i++) {
            if (p[i].arrival_time <= current_time && !visited[i]) {
                if (p[i].burst_time < min_burst) {
                    min_burst = p[i].burst_time;
                    idx = i;
                }
            }
        }

        if (idx != -1) {
            p[idx].completion_time = current_time + p[idx].burst_time;
            p[idx].turnaround_time = p[idx].completion_time - p[idx].arrival_time;
            p[idx].waiting_time = p[idx].turnaround_time - p[idx].burst_time;
            visited[idx] = 1;
            completed++;
            current_time = p[idx].completion_time;
        } else {
            current_time++; // CPU remains idle if no process has arrived
        }
    }
    print_metrics(p, n, "Non-Preemptive SJF");
}

// 3. Non-Preemptive Priority (Lower number = Higher Priority)
void run_priority(Process p[], int n) {
    int completed = 0, current_time = 0;
    int visited[20] = {0};

    while (completed < n) {
        int idx = -1;
        int highest_priority = 1e9;

        for (int i = 0; i < n; i++) {
            if (p[i].arrival_time <= current_time && !visited[i]) {
                if (p[i].priority < highest_priority) {
                    highest_priority = p[i].priority;
                    idx = i;
                }
            }
        }

        if (idx != -1) {
            p[idx].completion_time = current_time + p[idx].burst_time;
            p[idx].turnaround_time = p[idx].completion_time - p[idx].arrival_time;
            p[idx].waiting_time = p[idx].turnaround_time - p[idx].burst_time;
            visited[idx] = 1;
            completed++;
            current_time = p[idx].completion_time;
        } else {
            current_time++;
        }
    }
    print_metrics(p, n, "Priority");
}

int main() {
    int n = 4;
    // Base dataset to ensure fair comparison
    Process source_processes[] = {
        {1, 0, 5, 2, 0, 0, 0},
        {2, 1, 3, 1, 0, 0, 0},
        {3, 2, 8, 4, 0, 0, 0},
        {4, 4, 2, 3, 0, 0, 0}
    };

    Process p[4];

    // Execution 1: FCFS
    for(int i=0; i<n; i++) p[i] = source_processes[i];
    run_fcfs(p, n);

    // Execution 2: SJF
    for(int i=0; i<n; i++) p[i] = source_processes[i];
    run_sjf(p, n);

    // Execution 3: Priority
    for(int i=0; i<n; i++) p[i] = source_processes[i];
    run_priority(p, n);

    return 0;
}