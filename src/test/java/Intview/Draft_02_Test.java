package Intview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class Draft_02_Test {

    final static Logger log = Logger.getLogger("Logger");

    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> aa = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            int current_int = i;
            if (i%2 == 1 ){
                aa.add(i);
            }

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
        List<Integer> aa = new ArrayList<>();
        aa.add(10);
        aa.add(20);
        aa.add(30);
        aa.add(40);

        List<Integer> result = oddNumbers(5, 20);

        System.out.println(result);

    }
}
