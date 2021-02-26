package searching;

public class RepeatedElement {
    static int checkRepeated(int arr[])
    {
        boolean visit[]=new boolean[arr.length];
        for (int i=0;i< arr.length;i++)
        {
            if(visit[arr[i]])
                return arr[i];
            visit[arr[i]]=true;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,1,0,3,4,5};
        int rvalue=checkRepeated(arr);
        System.out.println("repeated value="+rvalue);
    }
}
