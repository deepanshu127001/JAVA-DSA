/**
 1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

3. Take input "num1" and "num2" as the two numbers. 

4. Print their GCD and LCM.


Constraints
2 <= n <= 10^9

Format
Input
num1
num2
.. the numbers whose GCD and LCM we have to find.

Output
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.

Example
Sample Input

36
24

Sample Output
12
72
 */
import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        int a=24,b=36,gcd=0;
        Scanner scn=new Scanner(System.in);
        a=scn.nextInt();
        b=scn.nextInt();
        scn.close();
        for (int i = a<b?a:b; i >=2; i--) {
            if(a%i==0&&b%i==0){
                System.out.println(i);
                gcd=i;
                break;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
        
    }
}
