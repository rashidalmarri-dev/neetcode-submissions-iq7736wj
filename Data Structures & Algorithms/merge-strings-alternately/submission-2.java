class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] res = new char[arr1.length + arr2.length];

        int n = (arr1.length > arr2.length) ? arr1.length: arr2.length;

        int i = 0;
        int j = 0;
        while (j < n) {
            if (j < arr1.length) {
                res[i] = arr1[j];
                i++;
            }
            if (j < arr2.length) {
                res[i] = arr2[j];
                i++;
            }
            j++;

        }
        return new String(res);

    }
}