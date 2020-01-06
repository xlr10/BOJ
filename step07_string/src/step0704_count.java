import java.io.BufferedReader;
import java.io.InputStreamReader;

public class step0704_count {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=bufferedReader.readLine().trim().split(" ");

        if(s[0].equals("")) System.out.println(0);
        else         System.out.println(s.length);
    }
}
