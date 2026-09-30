class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length(), b = word2.length();
        char[] res = new char[a + b];

        int n = Math.max(a, b);

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (j < a) {
                res[i++] = word1.charAt(j);
            }
            if (j < b) {
                res[i++] = word2.charAt(j);
            }

        }
        return new String(res);

    }
}