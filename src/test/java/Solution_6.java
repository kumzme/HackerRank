import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution_6 {

    static void staircase(int n) {
        String space = "";
        ArrayList<String> aa = new ArrayList<String>();
        int last_Count = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= last_Count) {
                    space += "#";
                } else {
                    space += " ";
                }
            }
            aa.add(space);
            System.out.println(space);
            last_Count = last_Count - 1;
            space = "";
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int n = 10;
        staircase(n);

    }
}
