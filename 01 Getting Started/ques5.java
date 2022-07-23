/**
 * 1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.

Constraints
1 <= n < 40

Format
Input
n

Output
0
1
1
2
3
5
8
.. first n fibonaccis
 */
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int a=0,b=1,c;
        while(n!=0){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        scn.close();
    }
}
