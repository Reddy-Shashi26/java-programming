    
import java.util.Scanner;       //import the Scanner library

public class conditional_xor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);                    // inizilation of scanner
        System.out.print("enter the start number: ");         // asking to enter starting number
        int n;                                                  // Declare for storing user value
        int f;                                                  // Declare for storing user value 
        int x=0;                                                // declare fro storing for final value
        int i=0;
        n=scan.nextInt();                                       // taking input from user and storing in n variable
        System.out.print("enter the final number: ");         // asking to enter ending number
        f=scan.nextInt();                                       // taking input from user and storing in f variable
        //general method
        //============================================================================================================
        // for(i=n;i<=f;i++){                                  //running loop from i-1 to n value 
        //     x=x^(i);                                            // performing Xor Operation between x and i value
        // }       
       
        //  System.out.println(x);                                 // printing final value 
        //============================================================================================================

        // with time complexity with declaring in another method(function)
        //============================================================================================================
        System.out.println(calculate(n,f));                         // calling the function for getting answer and returned value will be printed
        //===========================================================================================================
    }       

    //for method/function testing we declared that time complexity in a method called calculate
    public static int calculate(int n,int f) {
        int x=0;
        int i=0;
        if(f%4==1) x=1;
        if(f%4==2) x=f+1;
        if(f%4==3) x=0;
        if(f%4==0) x=f;

        if((n-1)%4==1) i=1;
        if((n-1)%4==2) i=n;         //(n-1)+1 = n
        if((n-1)%4==3) i=0;
        if((n-1)%4==0) i=(n-1);

        x=x^i;
        return x;
    }


}

