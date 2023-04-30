package ua.lviv.iot;

public class WordReverser {
    public String reverseWords(String sentence, int length) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == sentence.length()) {
                String wordWithoutQuestionMark;
                String pattern = "\\?$"; // match a question mark at the end of the string
                String wordWithoutQuestionMarkInTheEnd = word.replaceAll(pattern, ""); // replace with an empty string
                StringBuilder reversed = new StringBuilder(word).reverse();
                sb.append(reversed);
            } else {
/*                if (i == words.length -1){
                    String pattern = "\\?$"; // match a question mark at the end of the string
                    String wordWithoutQuestionMarkInTheEnd = word.replaceAll(pattern, ""); // replace with an empty string
                    StringBuilder reversed = new StringBuilder(word).reverse();
                    sb.append(reversed);
                    sb.append("?");
                }
                else {
                    sb.append(new StringBuilder(word).reverse());
                }*/
                if ( i == 0 || i == words.length - 1){

                    sb.append(word);
                }else{
                   sb.append(new StringBuilder(word).reverse());
                }

                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
