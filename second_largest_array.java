import java.util.Scanner;
public class second_largest_array {
    
    public static void main(String[] args) {
        int big;
        int sbig;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int[] arr = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        big=arr[0];
        sbig=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(big<arr[i]){
                big=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            
            if(sbig<arr[i] && big >arr[i]){
                sbig=arr[i];
            }
        }
        System.out.print("Biggest number ");
        System.out.println(big);
        System.out.print("Second Biggest number ");
        System.out.println(sbig);
    }
}
