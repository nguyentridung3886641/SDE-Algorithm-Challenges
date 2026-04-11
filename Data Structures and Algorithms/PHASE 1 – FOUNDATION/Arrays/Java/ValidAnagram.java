import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (s.equals(t) == true && sLength == 1) return true;
        if (s.equals(t)) return false;
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for (int i = 0; i < sLength; i++) {
            int index = s.charAt(i) - 'a';
            ++freqS[index];
        }
        for (int i = 0; i < tLength; i++) {
            int index = t.charAt(i) - 'a';
            ++freqT[index];
        }
        if (Arrays.equals(freqS, freqT)) return true;
        else return false;
    }
}