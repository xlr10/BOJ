import java.util.ArrayList;
import java.util.Scanner;

public class step0702_multi_string {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        ArrayList<String[]> arrayList=new ArrayList();

        for(int a=0;a<num;a++){
            arrayList.add(scanner.nextLine().split(""));
        }

        for(int a=0;a<num;a++){
            for(int b=2;b<arrayList.get(a).length;b++){
                for(int c=0;c<Integer.parseInt(arrayList.get(a)[0]);c++){
                    System.out.print(arrayList.get(a)[b]);
                }
            }
            System.out.println();
        }
    }
}
