
// it is to find a given number is in a array and print first least index of the number if there are same number multiple times


import java.util.Scanner;
public class binarysearch_array_prblm1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int start=0; // to store in starting index
        int end;    // to store ending index of array
        int len=0;  // to store length of the array
        int mid;    // to store mide value 
        int key;    // search number 
        int flag=0; // to indicate the absense of key
        int [] count= new int[len];  
        int j=0;

        System.out.println("Enter the length of the array");    // asking user to enter lenght of array
        len =scan.nextInt();                                      // storing the lenght of array in len
        end=len-1;                                                // as indexing will 1 less than length so end will be len-1

        System.out.println("Enter the Array (Sorted)");         // asking user to enter array note it should be sorted 
        int [] arr= new int[len];                                 // Declaring the array with user given length
        for(int i=0;i<len;i++){                                   // loop to store each elemnt entered until last in array
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the number to find in array "); // asking user to enter number to find
        key =scan.nextInt();                                        // storing itin key variable
                                        //Binary Search using for loop
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        for(int i=start;i<end;i++){
            mid =(start+end)/2;
            if (key==arr[mid]) {
            System.out.println("Number is Present"); 
            flag=1;
            //break;
            }
            else if(key<arr[mid]){
                end=mid-1;
            } 
            else if(key>arr[mid]){
                start=mid+1;
            }
            else {
                System.out.println("Something Went Wrong");
            }
        }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

                                        //Binary Search using while loop
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>                                        
        // while(start<=end){
        //     mid =(start+end)/2;
        //     if (key==arr[mid]) {
        //         System.out.println("Number is Present at index "+(mid+1)+" in array"); 
        //         flag=1;
        //         count[j]=mid;
        //         j++;
        //         }
        //         else if(key<arr[mid]){
        //             end=mid-1;
        //         } 
        //         else if(key>arr[mid]){
        //             start=mid+1;
        //         }
        //         else {
        //             System.out.println("Something Went Wrong");
        //         }
        // }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                        

        if(flag==0) System.out.println("NUmber is Not present");

    }
}
