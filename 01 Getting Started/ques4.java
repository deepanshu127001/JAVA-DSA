/** 
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).

Constraints
2 <= low < high < 10 ^ 6
*/
import java.util.*;

public class ques4{
    public static void main(String[] args) {
        int low,high,flag;
        Scanner scn=new Scanner(System.in);
        low=scn.nextInt();
        high=scn.nextInt();
        for(int i=low;i<=high;i++){
            flag=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag+=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
        scn.close();
    }
}