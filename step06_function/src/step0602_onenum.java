import java.util.ArrayList;
import java.util.Scanner;

public class step0602_onenum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int cnt=0;

        for(int a=1;a<=n;a++){
            if(is_one(a))   cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean is_one(int n){
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int a=(int)Math.log10(n);a>=0;a--){
            int tmp=(int)Math.pow(10,a);
            int tmp2=n/tmp;
            arrayList.add(tmp2);
            n-=(tmp2*tmp);
        }

        if (arrayList.size()!=1){
            int d=arrayList.get(0)-arrayList.get(1);
            for(int a=2;a<arrayList.size();a++){
                int d2=arrayList.get(a-1)-arrayList.get(a);
                if(d!=d2){
                    return false;
                }
            }
        }
        return true;
    }
}
