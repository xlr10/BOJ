import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class step0504_mod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer> integerSet=new HashSet<>();

        for(int a=0;a<10;a++){
            int tmp= Integer.parseInt(scanner.nextLine());
            integerSet.add(tmp%42);
        }

        System.out.println(integerSet.size());
    }
}
