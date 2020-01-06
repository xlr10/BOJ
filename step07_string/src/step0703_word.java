import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////틀림;
//////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

public class step0703_word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();
        int[] askii=new int[123];   //65~90 97~122
        int max=0;
        int max_pos=-1;

        for(int a=0;a<s.length();a++)
            askii[s.charAt(a)]++;

        //find max
        for(int a=0;a<123;a++){

            if(max<askii[a]){
                max=askii[a];
                max_pos=a;
            }
        }
//        System.out.println("debug: "+max);
//        System.out.println("debug: "+(char)max_pos);

        //find multi max
        askii[max_pos]=0;
        if(max!=1){
            for(int a=0;a<123;a++){
                if(max == askii[a]) {
                    System.out.println("?");
                    max=0;
                    break;
                }
            }
        }
        if(max!=0){
            if(max_pos>96){
                max_pos-=32;
            }
            System.out.println((char)max_pos);
        }
    }
}
