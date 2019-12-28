import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class step0301_speed {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int cnt= Integer.parseInt(bufferedReader.readLine());
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int a=0;a<cnt;a++){
            String[] tmp=bufferedReader.readLine().split(" ");
            int tmp2=Integer.parseInt(tmp[0])+Integer.parseInt(tmp[1]);
            bufferedWriter.write(tmp2+"\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
