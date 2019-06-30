import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_3 {

    /*
     * Complete the simpleArraySum function below.
     */
    static long simpleArraySum(long[] ar) {

        long retur  = 0;
        for(int i=0;i< ar.length;i++){

            retur += ar[i];
        }

        return retur;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long[] aa = {11111111,11111111, 11111111, 11111111, 11111111};
        long result = simpleArraySum(aa);
        System.out.println(result);

    }
}
