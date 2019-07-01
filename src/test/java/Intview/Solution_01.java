package Intview;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Solution_01 {

    final static Logger log = Logger.getLogger("Logger");

    static int sockMerchant(int n, int[] ar) {

        int[] dis_Ar = Arrays.stream(ar).boxed().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).mapToInt(Integer::intValue).toArray();

        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());

        int aa = 0;
        for (int i = 0; i < dis_Ar.length; i++) {
            aa  += Collections.frequency(list, dis_Ar[i])/2;
            //log.info(String.valueOf(aa));
        }

        return aa;


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

        long result = sockMerchant(9, arr);

        System.out.println(result);

    }
}
