import java.util.ArrayList;
import java.util.Scanner;

public class step0507_over_aver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=Integer.parseInt(scanner.nextLine());
        ArrayList<String[]> arrayList=new ArrayList<>();

        for(int a=0;a<cnt;a++){
            arrayList.add(scanner.nextLine().split(" "));
        }

        for(int a=0;a<cnt;a++){
            String[] now= arrayList.get(a);
            double aver=0;
            int n=0;
            for(int b=1;b<now.length;b++){
                aver+=Double.parseDouble(now[b]);
            }
            aver/=(double)now.length-1;

            for(int b=1;b<now.length;b++){
                if(Double.parseDouble(now[b])>aver){
                    n++;
                }
            }

            double asd= (double)n/(now.length-1)*100;

            System.out.format("%.3f%%\n",asd);
        }
    }
}
