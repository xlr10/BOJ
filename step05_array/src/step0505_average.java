import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class step0505_average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt=scanner.nextInt();
        double sum=0;
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int a=0;a<cnt;a++){
            arrayList.add(scanner.nextInt());
        }
        scanner.nextLine();

        Collections.sort(arrayList);

        for(int e:arrayList){
            sum+= (double)e/arrayList.get(arrayList.size()-1)*100;
        }
        System.out.println(sum/cnt);
    }
}
