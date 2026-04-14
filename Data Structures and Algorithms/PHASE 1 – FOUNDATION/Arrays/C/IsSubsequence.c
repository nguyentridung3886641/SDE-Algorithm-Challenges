bool isSubsequence(char* s, char* t) {
    int tLength = strlen(t);
    int sLength = strlen(s);
    int count = 0;
    int j = 0;
    if (sLength == 0) return true;
    for (int i = 0; i < sLength; i++) {
        for (j; j < tLength; j++) {
            if (s[i] == t[j]) {
                ++count;
                ++j;
                break;
            }
        }
        if (count == sLength)
            return true;
    }
    return false;
}