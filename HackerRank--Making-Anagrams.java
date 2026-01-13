import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        
        for (char c : a.toCharArray()) {  // counting up all unique letters
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }
        HashSet<Character> uniqChars = new HashSet<>(); // keep track of ALL unique letters between both maps
        uniqChars.addAll(mapA.keySet());
        uniqChars.addAll(mapB.keySet());
        
        int deletions = 0;
        for (char c : uniqChars) { // for every uniq char
            int countA = mapA.getOrDefault(c, 0); // count up appearances per letter c
            int countB = mapB.getOrDefault(c, 0);
            deletions += Math.abs(countA - countB); // calculate the difference
            //if there IS a difference, it means there too many of 1 letter
        }
        return deletions;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
