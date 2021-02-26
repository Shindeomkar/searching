package searching;

import java.util.Scanner;

public class SquareRoot {
    static int sRoot(int x)
    {
        int l=1,r=x,ans=-1;
        while (l<=r)
        {
            int m=(l+r)/2;
            int msquare=m*m;
            if(msquare==x)
                return m;
            else if (msquare>x)
                r=m-1;
            else
            {   l=m+1;
                ans=m;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the square");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int sroot=sRoot(x);
        System.out.println("srooot="+sroot);
    }
}