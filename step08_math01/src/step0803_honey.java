import java.util.Scanner;

public class step0803_honey {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int a;

        for(a=0;;a++){
            if(n < 1+a*6){
                break;
            }
        }
        System.out.println(a);

    }
}
