import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_2 {

    /*
     * Complete the simpleArraySum function below.
     */
    static List<Integer> simpleArraySum(List<Integer> a, List<Integer> b) {

        List<Integer> aa = new ArrayList<Integer>(2);
        aa.add(0);
        aa.add(0);

        for (int i=0;i<a.size();i++) {
            int score = 0;
            if (a.get(i) > b.get(i)){
                score = aa.get(0) + 1;
                aa.set(0, score);
            }else{
                if (a.get(i) < b.get(i)){
                    score = aa.get(1) + 1;
                    aa.set(1, score);
                }
            }

        }
        return aa;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] sr = new int[]{1, 2, 3, 4, 8};
        List<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(6);
        a.add(4);

        List<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(5);
        b.add(4);
        b.add(4);
        b.add(4);
        b.add(4);
        List<Integer> result = simpleArraySum(a, b);
        System.out.println(result.get(0) + ":" + result.get(1));

    }
}
