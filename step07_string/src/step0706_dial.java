import java.io.BufferedReader;
import java.io.InputStreamReader;

public class step0706_dial {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=bufferedReader.readLine().split("");
        int tmp=0;

        for(String e: s){
            tmp+=toNum(e)+1;
        }
        System.out.println(tmp);

    }
    private static int toNum(String s){
        int tmp=0;
        switch (s){
            case "A":
            case "B":
            case "C":
                tmp=2;
                break;
            case "D":
            case "E":
            case "F":
                tmp=3;
                break;
            case "G":
            case "H":
            case "I":
                tmp=4;
                break;
            case "J":
            case "K":
            case "L":
                tmp=5;
                break;
            case "M":
            case "N":
            case "O":
                tmp=6;
                break;
            case "P":
            case "Q":
            case "R":
            case "S":
                tmp=7;
                break;
            case "T":
            case "U":
            case "V":
                tmp=8;
                break;
            case "W":
            case "X":
            case "Y":
            case "Z":
                tmp=9;
                break;
        }
        return tmp;
    }
}
