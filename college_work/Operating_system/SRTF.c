#include <stdio.h>

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    int p[n], bt[n], rt[n], at[n];
    int ct[n], tat[n], wt[n];

    for (int i = 0; i < n; i++) {
        p[i] = i + 1;
        printf("Enter Arrival Time and Burst Time for Process %d: ", p[i]);
        scanf("%d %d", &at[i], &bt[i]);
        rt[i] = bt[i];
    }

    int current_time = 0, completed = 0;
    float total_wt = 0, total_tat = 0;

    while (completed != n) {
        int min_index = -1;
        int min_remaining = 99999;

        for (int i = 0; i < n; i++) {
            if (at[i] <= current_time && rt[i] > 0) {
                if (rt[i] < min_remaining) {
                    min_remaining = rt[i];
                    min_index = i;
                } else if (rt[i] == min_remaining && min_index != -1) {
                    if (at[i] < at[min_index]) {
                        min_index = i;
                    }
                }
            }
        }

        if (min_index == -1) {
            current_time++;
        } else {
            rt[min_index]--;
            current_time++;

            if (rt[min_index] == 0) {
                completed++;
                ct[min_index] = current_time;
                tat[min_index] = ct[min_index] - at[min_index];
                wt[min_index] = tat[min_index] - bt[min_index];

                total_tat += tat[min_index];
                total_wt += wt[min_index];
            }
        }
    }

    printf("\nProcess\tAT\tBT\tCT\tTAT\tWT\n");

    for (int i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
               p[i], at[i], bt[i], ct[i], tat[i], wt[i]);
    }

    printf("\nAverage Turnaround Time: %.2f\n", total_tat / n);
    printf("Average Waiting Time: %.2f\n", total_wt / n);

    return 0;
}