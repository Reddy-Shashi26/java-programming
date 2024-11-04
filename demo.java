

//                                      printing
// public class demo {
//     public static void main(String[] args) {
//         System.out.println("shashi ");
//     }
// }
//===============================================================================================
//                                       Xor Operation
// example
// for 1,2 
//   1  0001
//   2  0010 xor
//  ------------
//      0011  ans is 3



// import java.util.Scanner;       //import the Scanner library

//     public class demo {
//         public static void main(String[] args) {
//             Scanner scan=new Scanner(System.in);        // inizilation of scanner
//             System.out.print("enter the number: ");   // asking to enter number
//             int n=0;                                    // Declare for storing user value
//             int x=0;                                    // declare fro storing for final value
//             n=scan.nextInt();                           // taking input from user and storing in n variable
//             for(int i=1;i<=n;i++){                      //running loop from i-1 to n value 
//                 x=x^(i);                                // performing Xor Operation between x and i value
//             }
//              System.out.println(x);                     // printing final value 
        

//     }
// }

// for time complexity if we want ot fine the 100000 by using loop its take the more time 
//  so to decrease the execution time we are reduced by using some pattern based program 
                //with a pattern  
                // n  Xor   pattern
                // 1 | 1     1
                // 2 | 3     n+1
                // 3 | 0     0
                // 4 | 4     n
         // ------------------------
                // 5 | 1     1
                // 6 | 7     n+1
                // 7 | 0     0
                // 8 | 8     n
import java.util.Scanner;
public class demo{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number ");
        int n;
        n=scan.nextInt();
        if(n%4==1){
            System.out.println(1);
        }
        else if(n%4==2){
            System.out.println(n+1);
        }
        else if(n%4==3){
            System.out.println(0);
        }
        else if(n%4==4){
            System.out.println(n);
        }
        //     another way of using if confitions
        if(n%4==1) System.out.println(1);
        if(n%4==2) System.out.println(n+1);
        if(n%4==3) System.out.println(0);
        if(n%4==0) System.out.println(n);

    }
}
//=============================================================================================
