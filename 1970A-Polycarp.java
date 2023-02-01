import java.util.*;
public class polycarp{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-- >0)
        {
            //long pie = (long)(Math.PI);
            //System.out.println(pie);
            String pi = "314159265358979323846264338327";
            String val = in.next();
            int count=0;
            for(int i=0;i<val.length();i++)
            {
                if(val.charAt(i)!= pi.charAt(i))
                {
                    break;
                }
                count++;
            }
            System.out.println(count);
        }

    }
}