import java.util.*;

public class step0501_max_value {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap();
        for(int a=0;a<9;a++){
            map.put(a,Integer.parseInt(scanner.nextLine()));
        }

        ArrayList<Integer> arrayList=new ArrayList<>(map.keySet());
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        System.out.println(map.get(arrayList.get(0)));
        System.out.println(arrayList.get(0)+1);
    }
}
