import java.util.Scanner;

public class step0503_count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());
        int c= Integer.parseInt(scanner.nextLine());
        String[] asd=String.valueOf(a*b*c).split("");
        int[] count=new int[10];

        for(int i=0;i<asd.length;i++){
            count[Integer.parseInt(asd[i])]++;
        }
        for(int e: count){
            System.out.println(e);
        }
    }
}
