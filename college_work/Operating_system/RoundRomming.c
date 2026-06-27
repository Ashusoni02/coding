#include <stdio.h>

int main() {
    int n, tq;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    int bt[n], at[n], rem[n];
    int ct[n], tat[n], wt[n];

    printf("Enter Arrival Time:\n");
    for (int i = 0; i < n; i++) {
        printf("P%d: ", i + 1);
        scanf("%d", &at[i]);
    }

    printf("Enter Burst Time:\n");
    for (int i = 0; i < n; i++) {
        printf("P%d: ", i + 1);
        scanf("%d", &bt[i]);
        rem[i] = bt[i];
    }

    printf("Enter Time Quantum: ");
    scanf("%d", &tq);

    int time = 0, completed = 0;

    while (completed < n) {
        int executed = 0;

        for (int i = 0; i < n; i++) {
            if (at[i] <= time && rem[i] > 0) {
                executed = 1;

                if (rem[i] > tq) {
                    time += tq;
                    rem[i] -= tq;
                } else {
                    time += rem[i];
                    rem[i] = 0;
                    ct[i] = time;
                    tat[i] = ct[i] - at[i];
                    wt[i] = tat[i] - bt[i];
                    completed++;
                }
            }
        }

        if (!executed)
            time++;
    }

    printf("\nP\tAT\tBT\tCT\tTAT\tWT\n");

    float avgWT = 0, avgTAT = 0;

    for (int i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\t%d\n",
               i + 1, at[i], bt[i], ct[i], tat[i], wt[i]);

        avgWT += wt[i];
        avgTAT += tat[i];
    }

    printf("\nAverage Waiting Time = %.2f", avgWT / n);
    printf("\nAverage Turnaround Time = %.2f\n", avgTAT / n);

    return 0;
}