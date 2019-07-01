package General;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;

public class Solution_8 {

    final static Logger log = Logger.getLogger("Logger");

    static int[] climbingLeaderboard(int[] scores, int[] alice) throws IOException {
        int[] scores_s = new int[scores.length];
        int j = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length - 1) {
                if (scores[i] != scores[i - 1]) {
                    scores_s[j] = scores[i];
                }
            }
            if (i < scores.length - 1) {
                scores_s[j] = scores[i];
                if (scores[i] == scores[i + 1]) {
                    i = i + 1;
                }
            }
            j = j + 1;
        }
        int[] scores_Alice = new int[alice.length];

        for (int k = 0; k < alice.length; k++) {

            for (int i = 0; i < scores_s.length; i++) {
                if (alice[k] > scores_s[0]) {
                    scores_Alice[k] = 1;
                    i = scores_s.length + 1;
                } else {
                    if (alice[k] == scores_s[i]) {
                        scores_Alice[k] = i + 1;
                        i = scores_s.length + 1;
                    } else {
                        if (i < scores_s.length - 1) {
                            if ((scores_s[i] > alice[k]) && (alice[k] > scores_s[i + 1])) {
                                scores_Alice[k] = i + 2;
                                i = scores_s.length + 1;
                            }
                        } else {
                            if (i == scores_s.length - 1) {
                                if ((scores_s[i] > alice[k])) {
                                    scores_Alice[k] = i + 2;
                                    i = scores_s.length + 1;
                                }
                                if ((scores_s[i] == alice[k])) {
                                    scores_Alice[k] = i + 1;
                                    i = scores_s.length + 1;
                                }
                            }

                        }
                    }
                }

            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/resources/test_8_02.log", true));
            writer.append(String.valueOf(scores_Alice[k]) + "\n");
            writer.close();
        }
        return scores_Alice;

    }


    static int[] climbingLeaderboard_01(int[] scores, int[] alice) {
        List<Integer> results = new ArrayList<>();
        int[] distinctScores = Arrays.stream(scores)
                .boxed()
                .distinct()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .mapToInt(Integer::intValue)
                .toArray();
        int i = 0;
        int j = 0;

        for (j = 0; j < alice.length; j++) {
            for (i = 0; i < distinctScores.length; i++) {
                if (alice[j] >= distinctScores[i]) {
                    break;
                }
            }
            results.add(i + 1);
        }

        return results.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) throws IOException {

        int[] arr = new int[7];
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 50;
        arr[3] = 40;
        arr[4] = 40;
        arr[5] = 20;
        arr[6] = 10;
        int[] arr2 = new int[4];
        arr2[0] = 5;
        arr2[1] = 25;
        arr2[2] = 50;
        arr2[3] = 120;

        climbingLeaderboard_01(arr, arr2);

        List<String> content = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/src/main/resources/test_8_02.txt"), Charset.defaultCharset());

        String[] arr11 = content.get(1).split(" ");
        int[] numbers = new int[arr11.length];
        for (int i = 0; i < arr11.length; i++) numbers[i] = Integer.parseInt(arr11[i]);

        String[] arr12 = content.get(3).split(" ");
        int[] numbers1 = new int[arr11.length];
        for (int i = 0; i < arr12.length; i++) numbers1[i] = Integer.parseInt(arr12[i]);

        //climbingLeaderboard_01(numbers, numbers1);
        climbingLeaderboard(numbers, numbers1);
    }
}
