package searching;

public class Binarysearch {
    static int binarySearch(int arr[],int x)
    {
        int l=0,r=arr.length,m;
        while (l<r)
        {
            m=(l+r)/2;
            if(arr[m]==x)
                return m;
            else if(arr[m]>x)
                r=m;
            else if (arr[m]<x)
                l=m;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60,70};
        int x=20;
        int result=binarySearch(arr,x);
        System.out.println("pos="+result);
    }
}
