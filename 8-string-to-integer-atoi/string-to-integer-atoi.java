class Solution {
    public int myAtoi(String s) {
        int sLength = s.length();
        int i = 0, minus = 1;
        int result = 0;
        if (s.isEmpty()) return 0;
        while (i < sLength && s.charAt(i) == ' ') i++;
        if (i < sLength && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            minus = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < sLength && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return (minus == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
            ++i;
        }
        result *= minus;
        return result;
    }
}