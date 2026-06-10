import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        int arr[] = {1,2,6,5,8,4,1,2,3,5,6,3,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        System.out.println("Duplicates: ");

        for(Integer key : map.keySet()){
            if (map.get(key)>1){
                System.out.println(key+"->"+map.get(key));
            }
        }
    }
}
