
//Basic Idea is to compare each digit
// if digit is even it is distributed equally in x and y
// if are odd then we maitain a flag and then will add d/2 +1 in x and if again some odd value comes
// we then add the extra one to y so it will helo to balance the 1 in the number 
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String x = "";
            String y = "";
            Boolean flag = false;
            while (n > 0) {
                int d = n % 10;
                n /= 10;
                
                if (d % 2 == 0) {
                    int a = d / 2;
                    x = Character.forDigit(a, 10) + x;
                    y = Character.forDigit(a, 10) + y;

                } 
                else {
                    if (flag) {
                        int a = d / 2;
                        x = Character.forDigit(a , 10) + x;
                        y = Character.forDigit(a+1, 10) + y;
                        flag = false;
                    } else {
                        int a = d / 2;
                        x = Character.forDigit(a+1, 10) + x;
                        y = Character.forDigit(a , 10) + y;
                        flag = true;
                    }
                }
            }
            int a= Integer.parseInt(x);
            int b= Integer.parseInt(y);
            System.out.println(a+" "+b);
        }
    }
}