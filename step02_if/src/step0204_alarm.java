import java.util.Scanner;

public class step0204_alarm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hh= scanner.nextInt();
        int mm= scanner.nextInt();

        if(mm>=45)  mm-=45;
        else{
            mm=60+(mm-45);
            hh--;
            if(hh<0)    hh+=24;
        }
        System.out.println(hh+" "+mm);
    }
}
