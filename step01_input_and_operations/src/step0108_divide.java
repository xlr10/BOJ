import java.util.Scanner;

public class step0108_divide{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println(scanner.nextDouble()/scanner.nextDouble());
        }catch (Exception e){
            System.out.println("not divide 0");
        }
    }
}
