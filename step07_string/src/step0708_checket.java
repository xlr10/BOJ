import java.util.Arrays;
import java.util.Scanner;

public class step0708_checket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt= Integer.parseInt(scanner.nextLine());
        String[] strings=new String[cnt];

        for(int a=0;a<cnt;a++){
            strings[a]=scanner.nextLine();
        }

        int result=cnt;

        for(int a=0;a<cnt;a++){
            String word= strings[a];
            boolean[] check=new boolean[26];
            Arrays.fill(check,false);

            for(int b=1;b<word.length();b++){
                if(word.charAt(b) != word.charAt(b-1)){
                    if(check[word.charAt(b)-97]){
                        result--;
                        break;
                    }
                    check[word.charAt(b-1)-97]=true;
                }
            }
        }
        System.out.println(result);
    }
}
