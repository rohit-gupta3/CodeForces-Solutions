import java.util.*;

public class B {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int result=0;
            if(a==0)
            {
                result =1;
            }
            if(a>0)
            {
                result = a+ 2* Math.min(b,c);
                result += Math.min(a+1,Math.abs(b-c)+d);

            }
            
            System.out.println(result);
        }
    }
}
