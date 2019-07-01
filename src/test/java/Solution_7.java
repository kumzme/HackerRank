import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Logger;

public class Solution_7 {

    final static Logger log = Logger.getLogger("Logger");

    static int countingValleys(int n, String s) {

        Boolean sea_Level_Reached_From_Below = false;
        Boolean started_Down = false;

        long sea_Level_C = 0;
        int valley_Count = 0;

        String[] sa = s.toLowerCase().split("");
        for (int i = 0; i < n; i++) {
            String curr_char = sa[i];
            if (curr_char.contains("d")) {
                sea_Level_C = sea_Level_C - 1;
                if (sea_Level_C < 0) {
                    started_Down = true;
                }
            }
            if (curr_char.contains("u")) {
                sea_Level_C = sea_Level_C + 1;
                if (sea_Level_C == 0 && (started_Down)) {
                    sea_Level_Reached_From_Below = true;
                }
            }

            if (sea_Level_Reached_From_Below) {
                valley_Count += 1;
                sea_Level_Reached_From_Below = false;
                started_Down = false;
            }

        }
        log.info(String.valueOf(valley_Count));
        return valley_Count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 2;

        String content = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/src/main/resources/test_7_02.txt")));
        //String content = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/src/main/resources/test_7_01.txt")));
        countingValleys(1000000, content);
        //countingValleys(1000000, "DDDUUDDDUDUUDUUUDDUDUDUDDUDUDDDDDDUUUUUDDUUDDDUUDUDUDDUDUDUUUDUUUDUUUUDUUDUUUDDDUDUDUUUDUDUDUUDDDUUDUDDDUUDD" + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a1a + a2a + a3a + a4a + a5a + a6a + a7a + a8a + a9a);

    }
}
