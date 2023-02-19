// You are given a sequence a1,a2,…,an
// . Each element of a
//  is 1
//  or 2
// .

// Find out if an integer k
//  exists so that the following conditions are met.

// 1≤k≤n−1
// , and
// a1⋅a2⋅…⋅ak=ak+1⋅ak+2⋅…⋅an
// .
// If there exist multiple k
//  that satisfy the given condition, print the smallest.

import java.util.Scanner;
public class OneAndTwo{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0)
        {
            int n= in.nextInt();
            int[] a = new int[n];
            int twos=0;
            for(int i=0;i<n;i++)
            {
                a[i] = in.nextInt();
                if(a[i]==2) twos++;
            }
            int twoTill =0;
            int ans=-1;
            for(int i=0;i<n-1;i++)
            {
                if(a[i]==2)
                {
                    twoTill++;
                    twos--;
                }
                if(twoTill == twos)
                {
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);
           
        }
    }
}