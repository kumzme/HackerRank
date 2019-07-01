package Intview;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Draft_01_Test {

    final static Logger log = Logger.getLogger("Logger");

    static String findNumber(List<Integer> arr, int k) {

        arr.sort(Comparator.comparingInt(Integer::intValue).reversed());
        for (int i = 0;i<arr.size();i++){
            if (arr.get(i)==k){
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[8];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;
        arr[5] = 50;
        arr[6] = 60;
        arr[7] = 60;
        List<Integer> aa = new ArrayList<>();
        aa.add(10);
        aa.add(20);
        aa.add(30);
        aa.add(40);

        String result = findNumber(aa, 10);

        System.out.println(result);

    }
}
