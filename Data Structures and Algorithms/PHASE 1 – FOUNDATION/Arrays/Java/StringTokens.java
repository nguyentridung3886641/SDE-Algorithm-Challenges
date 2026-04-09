import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println("0");
        }
        else {
            String[] result = s.split("[ !,?._'@]+");
            System.out.println(result.length);
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}