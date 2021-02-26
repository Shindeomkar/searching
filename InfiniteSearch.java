package searching;

public class InfiniteSearch {
    static int bSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }
    static int infiniteSearch(int arr[],int x)
    {
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<x)
        {
            i=i*2;}
            if(arr[i]==x)
                return i;

        return bSearch(arr,i/2+1,i-1,x);
    }
    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50, 60, 70,80,90,100,150,200,240,300,500,600,700,800,9000 };

        int x = 100;

        System.out.println("pos="+infiniteSearch(arr,x));
    }

}
