
/*
 * Digits of a number
 * 1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Constraints
1 <= n < 10^9
Format
Input
"n" where n is any integer.
Output
d1
d2
d3
... digits of the number
Example
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3

 */
import java.util.*;
import java.lang.Math;

public class ques7 {
    public static int getNod(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int nod = getNod(n);
        int pow = (int) Math.pow(10, nod - 1);
        // System.out.println(pow);
        while (pow != 0) {
            int digit = n / pow;
            System.out.println(digit);
            n = n % pow;
            pow /= 10;
        }
        scn.close();
    }
}