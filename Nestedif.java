
public class Nestedif {
    public static void main(String[] args) {
        int a=5;
        int b=11;
        int c=9;
        if(a>b){
            if(a>c){
                System.out.println(a+" lagrest");
            }
            else{
                System.out.println(c+" largest");
            }
        }
        else{
            if (b>c){
                System.out.println(b+" largest");
            }
            else{
                System.out.println(c+" largest");
            }
        }

        
    }
    
}
