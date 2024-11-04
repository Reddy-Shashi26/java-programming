//                   print the array in revere order
import java.util.Scanner;
public class array_in_reverse {
    public static void main(String[] args) {
        int len;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");    // asking user to enter lenght of array
        len =scan.nextInt();                                      // storing the lenght of array in len

        System.out.println("Enter the Array");        
        int [] arr= new int[len];                                 
        for(int i=0;i<len;i++){                                   
            arr[i]=scan.nextInt();
        }
        System.out.println("Reverse of the Array is ");  
        for(int i=len-1;i>=0;i--){                                   
            System.out.print(arr[i]+" ");
        }

    }
}
