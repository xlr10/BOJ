import java.util.Scanner;

public class step0401_cycle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=Integer.parseInt(scanner.nextLine());
        int init=tmp;
        int n=0;

        do {
            int pre_num= tmp/10;
            int post_num= tmp%10;

            tmp=post_num*10 + (pre_num+post_num)%10;
            n++;
        }while (!(tmp == init));
        System.out.println(n);
    }
}
