/*
 1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Constraints
1 <= n < 10^9

Format
Input
"n" where n is any integer.

Output
"d" where d is the number of digits in the number "n"
 */
import java.util.*;
  
  public class ques6{
  
  public static void main(String[] args) {
    int n,count=0;
    Scanner scn=new Scanner(System.in);
    n=scn.nextInt();
    while(n!=0){
      count+=1;
      n/=10;
    }
    System.out.println(count);
    scn.close();
   }
  }