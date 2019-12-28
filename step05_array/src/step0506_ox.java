import java.util.ArrayList;
import java.util.Scanner;

public class step0506_ox {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=Integer.parseInt(scanner.nextLine());
        ArrayList<String[]> arrayList=new ArrayList<>();

        for(int a=0;a<cnt;a++)  arrayList.add(scanner.nextLine().split(""));

        for(int a=0;a<cnt;a++){
            String[] now = arrayList.get(a);
            System.out.println(chk_score(now));
        }
    }
    private static int chk_score(String[] strings){
        int n=0;
        int sum=0;
        for(int a=0;a<strings.length;a++){
            if(strings[a].equals("O")){
                sum+=++n;
            }else {
                n=0;
            }
        }
        return sum;
    }
}
