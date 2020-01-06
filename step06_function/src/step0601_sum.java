import java.util.ArrayList;

public class step0601_sum {
    private static int[] db=new int[100001];
    public static void main(String[] args) {

        int tmp=1;

        while (tmp<10000){
            recursive(tmp);
            tmp++;
        }
        for(int a=1;a<10000;a++){
            if(db[a]==0)    System.out.println(a);
        }
    }

    private static void recursive(int n){
        if(n<10000){
            recursive(constructor(n));
        }
    }

    private static int constructor(int target){
        int tmp=target;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        while (tmp>0){
            arrayList.add(tmp%10);
            tmp/=10;
        }

        for(int e:arrayList){
            target+=e;
        }
        db[target]=1;

        return target;
    }

}
