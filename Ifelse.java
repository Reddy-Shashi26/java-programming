import java.util.Scanner;
public class Ifelse {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            //int b=sc.nextInt();
            if (a%2 == 0){
                System.out.println(a+" is even number");
            }
            else{
                System.out.println(a+" is odd number ");
            }


        }
}
