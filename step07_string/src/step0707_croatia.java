import javax.lang.model.type.NullType;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class step0707_croatia {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        char[] target=new char[3];
        int cnt=0;

        Queue queue=new ArrayDeque();

        for(int a=0;a<s.length();a++){
            System.out.println(queue);
            char c= s.charAt(a);
            if(queue.size()==0){
                if(c=='c' || c=='d' || c=='l' || c=='n' || c=='s' || c=='z'){
                    queue.add(c);
                }else{
                    cnt++;
                }
            }else if(queue.size()==1) {
                if(c=='=' || c=='-' || c=='j'){
                    cnt++;
                    queue.clear();
                }else if (c=='z'){
                    queue.add(c);
                }else{
                    cnt+=2;
                }
            }else {
                if(c=='='){
                    cnt++;
                    queue.clear();
                }else{
                    cnt+=3;
                }
            }
        }

        System.out.println(cnt);

    }

}
