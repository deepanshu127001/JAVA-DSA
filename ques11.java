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
