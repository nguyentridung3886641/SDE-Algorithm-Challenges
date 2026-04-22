import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        int left = 0, right = 0;
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < pLength; i++) {
            ++pFreq[p.charAt(i) - 'a'];
        }
        while (right - left < pLength) {
            ++windowFreq[right];
            ++right;
        }
        if (Arrays.equals(pFreq, windowFreq))
            res.add(left);
        while (right < sLength) {
            ++left;
            ++right;
            --windowFreq[left];
            ++windowFreq[right];
            if (Arrays.equals(pFreq, windowFreq))
                res.add(left);
        }
        return res;
    }
}