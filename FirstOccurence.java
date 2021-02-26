package searching;

public class FirstOccurence {
    static int firstOccurence(int arr[],int x,int l,int r)
    {
        if(l>r)
            return -1;
        int m=(l+r)/2;
        if(arr[m]==x)
        {
           int i=0;
            for ( i = m; i > 0; i--)
            {
                if (arr[i] != x)
                    break;
            }
            return i+1;
        }
        else if(arr[m]>x)
        return firstOccurence(arr,x,l,m-1);
        else
       return firstOccurence(arr,x,m+1,r);

    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 30, 40, 50, 60, 70, 80,};
        System.out.println("pos=" + firstOccurence(arr,20,0,arr.length));
    }
}
