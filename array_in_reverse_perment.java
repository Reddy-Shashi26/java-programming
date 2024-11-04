//                   make perment reverse of array and print the array 

import java.util.Scanner;

public class array_in_reverse_perment {
     public static void main(String[] args) {
        int len;
        int temp;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");    // asking user to enter lenght of array
        len =scan.nextInt();                                      // storing the lenght of array in len

        System.out.println("Enter the Array");        
        int [] arr= new int[len];               

        for(int i=0;i<len;i++){                                   
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<len/2;i++){
            temp=arr[len-i-1];
            arr[len-i-1]= arr[i];
            arr[i]=temp;
        }
        System.out.print("Reversed the Array: ");  
        for(int i=0;i<len;i++){                                   
            System.out.print(arr[i]);  
        }
    }
    
}
