
import java.util.Scanner;

public class biggest_in_array {
    public static void main(String[] args) {
        int big;
    Scanner scan=new Scanner(System.in);
    int[] arr = new int[4];
    for(int i=0;i<arr.length;i++){
        arr[i]=scan.nextInt();
    }
    big=arr[0];
    for(int i=0;i<arr.length;i++){
        
        if(big<arr[i]){
            big=arr[i];
        }
    }
    System.out.print("biggest number is ");
    System.out.println(big);
    }
}
