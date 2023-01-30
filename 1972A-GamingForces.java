// Monocarp is playing a computer game. He's going to kill n
//  monsters, the i
// -th of them has hi
//  health.

// Monocarp's character has two spells, either of which he can cast an arbitrary number of times (possibly, zero) and in an arbitrary order:

// choose exactly two alive monsters and decrease their health by 1
// ;
// choose a single monster and kill it.
// When a monster's health becomes 0
// , it dies.

// What's the minimum number of spell casts Monocarp should perform in order to kill all monsters?
import java.util.*;
public class A{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0)
        {
            int n= in.nextInt();
            int[] arr = new int[n];
            int one=0;
            for(int i=0;i<n;i++)
            {
                arr[i]= in.nextInt();
                if(arr[i]==1)
                {
                    one++;
                }
            }
            int shared=0;
            if(one %2 ==0)
            {
                shared = one/2;
            }
            else{
                shared = one/2 +1;
            }
            System.out.println(n-one+shared);  
        }
    }
}