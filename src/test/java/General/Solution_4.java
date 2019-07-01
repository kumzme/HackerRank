package General;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_4 {

    /*
     * Complete the simpleArraySum function below.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {

        int last_Int = arr.size() - 1;
        int first_Int = 0;
        int sum_Last = 0;
        int sum_1st = 0;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> curr_Array = arr.get(i);
            sum_1st = curr_Array.get(first_Int) + sum_1st;
            sum_Last = curr_Array.get(last_Int) + sum_Last;
            last_Int = last_Int - 1;
            first_Int = first_Int + 1;
        }
        int aa = sum_1st - sum_Last;

        return Math.abs(aa);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> e = new ArrayList<Integer>();
        e.add(8);
        e.add(2);
        e.add(3);
        arr.add(e);
        e = new ArrayList<Integer>();
        e.add(2);
        e.add(3);
        e.add(4);
        arr.add(e);
        e = new ArrayList<Integer>();
        e.add(897);
        e.add(6);
        e.add(7);
        long result = diagonalDifference(arr);
        System.out.println(result);

    }
}
