//                   print the odd indexed elements in the array 

import java.util.Scanner;

public class array_odd_index {
     public static void main(String[] args) {
        int len;
        int temp;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");    // asking user to enter lenght of array
        len =scan.nextInt();                                        // storing the lenght of array in len


        System.out.println("Enter the Array");        
        int [] arr= new int[len];               

        for(int i=0;i<len;i++){                                   
            arr[i]=scan.nextInt();
        }
        System.out.print("even indexed the Array: ");  
        // for(int i=0;i<len;i++){      
        //     if(i%2==1)   {                       
        //     System.out.print(arr[i]+" ");  
        //     }
        // }
                    //or
            for(int i=1;i<len;i+=2){                           
                System.out.print(arr[i]+" ");     
            }



    }
    
}
