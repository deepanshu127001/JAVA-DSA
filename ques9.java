import java.util.Scanner;

public class ques9 {
    public static int getNod(int n) {
        int count=0;
        while (n!=0) {
            n/=10;
            count++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int res=0;
        int nod=getNod(n);
        for (int i = 1; i <=nod; i++) {
            int digit=n%10;
            res+=i*(int)Math.pow(10, digit-1);
            n/=10;
        }
        System.out.println(res);
        //op - 4213
        scn.close();
    }
}
