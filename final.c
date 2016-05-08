#include <stdio.h>
#include <stdlib.h>




void main()
{
    int a[10];
    int i;
    int e;

    for (i=0;i<10;i++)
    {
       scanf("%d",&e);
       a[i]=e;

    }

     for (i=0;i<10;i++)
    {
       printf("a[%d] = %d\n",i,a[i]);

    }


    int max(int b[10])
    {
        int max=b[0];
        int i;
     for (i=1;i<10;i++)
    {
       if (max<a[i]){
        max=a[i];
       }

    }
    return max;

    }

     int min(int b[10])
    {
        int min=b[0];
        int i;
     for (i=1;i<10;i++)
    {
       if (min>a[i]){
        min=a[i];
       }

    }
    return min;

    }

     int sum(int b[10])
    {

        int i,s=0;
     for (i=0;i<10;i++)
    {
       s=s+a[i];

    }
    return s;

    }



    printf("Max = %d\n",max(a));
    printf("Min = %d\n",min(a));
    printf("Sum = %d\n\n",sum(a));
    printf("Terminating Program.\n");

}
