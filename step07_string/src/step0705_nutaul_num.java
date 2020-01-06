import java.util.Scanner;

public class step0705_nutaul_num {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        int[] db=new int[2];

        for(int a=0;a<2;a++){
            char[] tmp1=strings[a].toCharArray();
            char tmp2 = tmp1[2];
            tmp1[2]=tmp1[0];
            tmp1[0]=tmp2;

            db[a]=Integer.parseInt(String.valueOf(tmp1));
        }

        if(db[0]>db[1]) System.out.println(db[0]);
        else System.out.println(db[1]);


    }
}
