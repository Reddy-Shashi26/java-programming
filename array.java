

       //int[] arr   // type-1  
       // int arr[]   // type-2
       // []int arr   // type-3

    //    int[] arr = new int[4]; // Declare the array with a size of 4
    //         arr[0] = 10;            // Initialize each element
    //         arr[1] = 20;
    //         arr[2] = 30;
    //         arr[3] = 40;
    //      or 
    //    int[] arr = {10, 20, 30, 40};

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int[] arr = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=3;i++){
            System.out.println(arr[i]);
        }  
    }
}
