    
import java.util.Scanner;       //import the Scanner library

public class xorA {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);        // inizilation of scanner
        System.out.print("enter the number: ");   // asking to enter number
        int n=0;                                    // Declare for storing user value
        int x=0;                                    // declare fro storing for final value
        n=scan.nextInt();                           // taking input from user and storing in n variable
        for(int i=1;i<=n;i++){                      //running loop from i-1 to n value 
            x=x^(i);                                // performing Xor Operation between x and i value
        }
         System.out.println(x);                     // printing final value 
    

}
}

