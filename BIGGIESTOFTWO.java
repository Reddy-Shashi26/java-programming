import java.util.Scanner;
class BIGGIESTOFTWO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter another number ");
        int b=sc.nextInt();
        int d=(a>b)? a:b;
        System.out.println(d);
    }
}
