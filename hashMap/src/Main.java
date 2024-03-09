import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        HashTable newHashMap = new HashTable();
//        newHashMap.set("one", 1);
//        newHashMap.set("two", 2);
//        newHashMap.set("three", 3);
//        newHashMap.set("four", 4);
//        newHashMap.printTable();
//
//        System.out.println(newHashMap.getKeys());
//        int[] array1 = {1, 3, 5};
//        int[] array2 = {2, 4, 5};
//
//        System.out.println(itemInCommon(array1, array2));


//        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        int[] nums = {1, 1, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }
    static boolean itemInCommon(int[] array1 ,int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (Integer e : array1) {
            hashMap.put(e, true);
        }

        for (Integer e : array2) {
            if(hashMap.get(e) != null) return true;
        }
        return false;
    }


    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> response = new ArrayList<>();
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int e: nums) {
            if(!hashMap.containsKey(e)) {
                hashMap.put(e, true);
            } else {
                if(!response.contains(e)) {
                    response.add(e);
                }
            }
        }

        return response;

    }

}