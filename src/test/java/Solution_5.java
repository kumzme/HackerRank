import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_5 {

    /*
     * Complete the simpleArraySum function below.
     */
    static void plusMinus(int[] arr) {
        double pcount = 0;
        double zcount = 0;
        double ncount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) pcount +=1;
            if (arr[i] < 0) ncount +=1;
            if (arr[i] == 0) zcount +=1;

        }
        DecimalFormat df = new DecimalFormat("#######.############");

        System.out.println(df.format(pcount / arr.length));
        System.out.println(df.format(ncount / arr.length));
        System.out.println(df.format(zcount / arr.length));


    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        plusMinus(arr);

    }
}
