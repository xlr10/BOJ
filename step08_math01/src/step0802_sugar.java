import java.util.Scanner;

public class step0802_sugar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        int five=0;
        int three=0;

        while (n>=3){
            if(n%5==0){
                five++;
                n-=5;
            }else {
                three++;
                n-=3;
            }
        }
        if(n!=0) System.out.println(-1);
        else System.out.println(five+three);
    }
}
