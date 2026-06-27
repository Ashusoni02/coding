#include <stdio.h>

int main() {
    int n, i;
    int p[20], at[20], bt[20], pr[20];
    int ct[20], tat[20], wt[20];
    int completed = 0, current_time = 0;
    int is_completed[20] = {0};
    float avg_tat = 0, avg_wt = 0;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++) {
        p[i] = i + 1;

        printf("\nProcess P%d\n", p[i]);

        printf("Arrival Time: ");
        scanf("%d", &at[i]);

        printf("Burst Time: ");
        scanf("%d", &bt[i]);

        printf("Priority: ");
        scanf("%d", &pr[i]);
    }

    while(completed < n) {
        int index = -1;
        int highest_priority = 9999;

        for(i = 0; i < n; i++) {
            if(at[i] <= current_time && is_completed[i] == 0) {

                if(pr[i] < highest_priority) {
                    highest_priority = pr[i];
                    index = i;
                }
                else if(pr[i] == highest_priority) {
                    if(at[i] < at[index])
                        index = i;
                }
            }
        }

        if(index == -1) {
            current_time++;
        }
        else {
            current_time += bt[index];
            ct[index] = current_time;
            tat[index] = ct[index] - at[index];
            wt[index] = tat[index] - bt[index];

            avg_tat += tat[index];
            avg_wt += wt[index];

            is_completed[index] = 1;
            completed++;
        }
    }

    printf("\nP\tAT\tBT\tPR\tCT\tTAT\tWT\n");

    for(i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
               p[i], at[i], bt[i], pr[i],
               ct[i], tat[i], wt[i]);
    }

    printf("\nAverage Turnaround Time = %.2f", avg_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", avg_wt / n);

    return 0;
}