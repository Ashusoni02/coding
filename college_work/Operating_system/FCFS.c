#include<stdio.h>
#include<conio.h>
int main()
{
  int bt[20],wt[20],tat[20],i,j,n;
  float wtavg,tatavg;
  printf("Enter the number of processes: ");
  scanf("%d",&n); 
  printf("Enter the burst time of the processes: ");
  for(i=0;i<n;i++)
  {
    scanf("%d",&bt[i]); }
  wt[0]=wtavg=0;
  tat[0]=tatavg=bt[0];
  for(i=1;i<n;i++)
  {
    wt[i]=wt[i-1]+bt[i-1];
    tat[i]=tat[i-1]+bt[i];
    wtavg=wtavg+wt[i];
    tatavg=tatavg+tat[i];
  }
  printf("Process\tBurst Time\tWaiting Time\tTurnaround Time\n");
  for(i=0;i<n;i++)
  {printf("%d\t%d\t\t%d\t\t%d\n",i+1,bt[i],wt[i],tat[i]);}
  printf("Average Waiting Time: %f\n",wtavg/n);
  printf("Average Turnaround Time: %f\n",tatavg/n);
  getch();  
  return 0;
}
