class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int noteLength = ransomNote.length();
        int magazineLength = magazine.length();
        if (magazineLength < noteLength)
            return false;
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < noteLength && j < magazineLength) {
            int noteChar = ransomNote.charAt(i);
            int magazineChar = magazine.charAt(j);
            while (j < magazineLength && noteChar != magazineChar) {
                j++;
            }
            while (i < noteLength && j < magazineLength && noteChar == magazineChar){
                ++count;
                ++i;
                ++j;
            }
        }
        return (count < noteLength) ? false : true;
    }
}