import java.util.Scanner;

public class step0202_exam_grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int grade= Integer.parseInt(scanner.nextLine());
        char score ='F';

        if(90<=grade && grade<=100) score='A';
        else if(80<=grade && grade<=89) score='B';
        else if(70<=grade && grade<=79) score='C';
        else if(60<=grade && grade<=69) score='D';
        else score='F';
        System.out.println(score);
    }
}
