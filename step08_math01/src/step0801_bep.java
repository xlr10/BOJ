import java.io.BufferedReader;
import java.io.InputStreamReader;

public class step0801_bep {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bufferedReader.readLine().split(" ");
        int A= Integer.parseInt(strings[0]);
        int B= Integer.parseInt(strings[1]);
        int C= Integer.parseInt(strings[2]);


        //A+Bx < C*x
        //A< (C-B)*x
        //A/(C-B)<x
        if(B>=C){
            System.out.println(-1);
            return;
        }

        System.out.println(A/(C-B)+1);
    }
}
