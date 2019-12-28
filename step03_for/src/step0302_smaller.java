
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class step0302_smaller {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt=scanner.nextInt();
        int std=scanner.nextInt();
        int now;

        for(int a=0;a<cnt;a++){
            now=scanner.nextInt();
            if(now<std) bufferedWriter.write(now+" ");
        }
        scanner.nextLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
