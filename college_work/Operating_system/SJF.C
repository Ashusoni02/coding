#include <stdio.h>

int main() {
    int n, i;
    int p[20], at[20], bt[20], ct[20], tat[20], wt[20];
    int is_completed[20] = {0};
    float total_wt = 0, total_tat = 0;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        p[i] = i + 1;

        printf("Enter Arrival Time for Process %d: ", p[i]);
        scanf("%d", &at[i]);

        printf("Enter Burst Time for Process %d: ", p[i]);
        scanf("%d", &bt[i]);
    }

    int current_time = 0;
    int completed = 0;

    while (completed < n) {
        int min_index = -1;
        int min_bt = 99999;

        for (i = 0; i < n; i++) {
            if (at[i] <= current_time && is_completed[i] == 0) {

                if (bt[i] < min_bt) {
                    min_bt = bt[i];
                    min_index = i;
                }
                else if (bt[i] == min_bt) {
                    if (at[i] < at[min_index]) {
                        min_index = i;
                    }
                }
            }
        }

        if (min_index == -1) {
            current_time++;
        } else {
            current_time += bt[min_index];
            ct[min_index] = current_time;
            tat[min_index] = ct[min_index] - at[min_index];
            wt[min_index] = tat[min_index] - bt[min_index];

            total_tat += tat[min_index];
            total_wt += wt[min_index];

            is_completed[min_index] = 1;
            completed++;
        }
    }

    printf("\nProcess\tAT\tBT\tCT\tTAT\tWT\n");

    for (i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
               p[i], at[i], bt[i], ct[i], tat[i], wt[i]);
    }

    printf("\nAverage Turnaround Time = %.2f", total_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", total_wt / n);

    return 0;
}