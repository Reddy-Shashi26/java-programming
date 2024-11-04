//                   make perment 1st half reverse and print the array 

import java.util.Scanner;

public class array_1st_half_reverse_permt {
     public static void main(String[] args) {
        int len;
        int temp;
        int len2;           //for declaring 1st half
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");    // asking user to enter lenght of array
        len =scan.nextInt();                                        // storing the lenght of array in len
        len2=len/2;                                                 // storing the lenght of 1st half of array in len2

        System.out.println("Enter the Array");        
        int [] arr= new int[len];               

        for(int i=0;i<len;i++){                                   
            arr[i]=scan.nextInt();
        }
        
        for(int i=0;i<len2/2;i++){
            temp=arr[len2-i-1];
            arr[len2-i-1]= arr[i];
            arr[i]=temp;
        }
        System.out.print("Reversed the Array: ");  
        for(int i=0;i<len;i++){                                   
            System.out.print(arr[i]);  
        }



    }
    
}
