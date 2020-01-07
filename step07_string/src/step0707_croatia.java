////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////// 참고
//////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class step0707_croatia {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] db = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int a=0;a<8;a++){
            while (s.contains(db[a])){
                s=s.replaceFirst(db[a],"0");
            }
        }
        System.out.println(s.length());
    }
}
