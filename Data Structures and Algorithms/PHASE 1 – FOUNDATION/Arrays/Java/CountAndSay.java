class Solution {
    public String countAndSay(int n) {
        StringBuilder count = new StringBuilder(1024);
        StringBuilder say = new StringBuilder(1024);
        count.append(1);
        for (int j = 1; j < n; j++) {
            int countLength = count.length();
            for (int i = 0; i < countLength; i++) {
                int countDigit = 1;
                while (i < countLength - 1 && count.charAt(i) == count.charAt(i + 1)) {
                    ++countDigit;
                    ++i;
                }
                say.append(countDigit).append(count.charAt(i));
            }
            count = say;
            say = new StringBuilder(count.length() * 2);
        }
        return count.toString();
    }
}