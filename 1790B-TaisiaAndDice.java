import java.util.*;
public class dice{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-- >0)
        {
            int n= in.nextInt();
            int s = in.nextInt();
            int r =in.nextInt();
            int first = s-r;
            System.out.print(first+" ");
            int x = r/(n-1);
            int rem = r % (n-1);
            
        
            for(int i=0;i<n-1;i++)
            {
                if(rem >0)
                {
                    System.out.print(x+1+" ");
                }
                else{
                    System.out.print(x+" ");
                }
                rem--;
                
            }
            System.out.println();

            
        }

    }
}