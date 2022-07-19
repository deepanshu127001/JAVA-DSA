/**
 * 1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
 */
import java.util.Scanner;
// import java.lang.Math;
public class ques3 {
    public static void main(String[] args) {
        int t,n,flag;
        Scanner scn=new Scanner(System.in);
        t=scn.nextInt();
        while (t!=0) {
            n=scn.nextInt();
            flag=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag++;
                    break;
                }
            }
            if(flag>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            t--;
        }
        scn.close();
    }
}
