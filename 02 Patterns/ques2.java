/**
 * Pattern 2
Easy

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Format
Input

5

Sample Output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*
 */
import java.util.*;

public class ques2{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close();

    }
}