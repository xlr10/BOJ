import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class step0205_three_num {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(scanner.nextInt());
        arrayList.add(scanner.nextInt());
        arrayList.add(scanner.nextInt());

        Collections.sort(arrayList);

        System.out.println(arrayList.get(1));
    }
}
