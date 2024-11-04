import java.util.Scanner;
public class linearsearch_array {
    public static void main(String[] args) {
        int f;
        int count=0;
        int len;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Length of array");
        len=scan.nextInt();
        System.out.println("Enter the numbers in array");
        int[] arr = new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the numbers to find in array ");
        f=scan.nextInt();
        for(int i=0;i<arr.length;i++){
            if(f==arr[i]){
                count++;
                break;
            }
        }
        if(count>0) System.out.println("Number Exist");
        else System.out.println("Not Exist");
    }
    
}
