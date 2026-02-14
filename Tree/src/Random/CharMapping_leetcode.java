package Random;

public class CharMapping_leetcode {

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int weightWord=0;
            char[] charArrayOfWords= words[i].toCharArray();
            for (int j = 0; j < charArrayOfWords.length; j++) {
                weightWord+=weights[charArrayOfWords[j]-'a'];
            }
            int mod = weightWord % 26;

            char ch = (char) ('z' - mod);

            result.append(ch);
        }
        return result.toString();
    }
}
