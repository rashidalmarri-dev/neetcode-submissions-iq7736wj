class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[][] charArrs = new char[strs.length][];

        for (int i = 0; i < strs.length; i++) {
            charArrs[i] = strs[i].toCharArray();
        }

        Arrays.sort(charArrs, (a, b) -> Integer.compare(a.length, b.length));

        int resN = 0;
        for (int i = 0; i < charArrs[0].length; i++) {
            for (int j = 1; j < charArrs.length; j++) {
                if (charArrs[0][i] != charArrs[j][i]) {
                    return new String(charArrs[0], 0, resN);
                }
            }
            resN += 1;
        }
        return new String(charArrs[0]);

    }
}