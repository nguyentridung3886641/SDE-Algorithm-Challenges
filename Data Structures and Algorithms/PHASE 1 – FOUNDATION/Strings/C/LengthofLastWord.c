int lengthOfLastWord(char* s) {
    int sLength = strlen(s);
    int i = sLength - 1;
    int wordLength = 0;
    while (s[i] == ' ' && i >= 0) --i;
    while (s[i] != ' ' && i >= 0) {
        ++wordLength;
        --i;
    }
    return wordLength;
}