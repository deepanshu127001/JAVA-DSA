/*
 Pattern 8
Easy

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
5

Sample Output
                *	
			*		
		*			
	*				
*
 */
import java.util.*;

public class ques8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j==i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
scn.close();
    }
}