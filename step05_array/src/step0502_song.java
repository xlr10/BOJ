import java.util.Scanner;

public class step0502_song {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp= scanner.nextInt();
        int srd=0;

        if(tmp==1)  srd=1;
        else if(tmp==8)  srd=-1;
        else {
            System.out.println("mixed");
            return;
        }

        for(int a=0;a<7;a++){
            tmp+=srd;
            int next=scanner.nextInt();
            if(!(next == tmp)){
                System.out.println("mixed");
                return;
            }
        }
        scanner.nextLine();
        if(tmp==1) System.out.println("descending");
        else System.out.println("ascending");
    }
}
