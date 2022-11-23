package note1_10;


/*
    单词距离
 */
public class WordDistance {


    public static void main(String[] args) {

        String[] words = new String[]{ "I", "am", "a", "student", "from",
                "a", "university", "in", "a", "city" };
        String word1 = "a";
        String word2 = "student";
        int result = findClosest( words, word1, word2 );
        System.out.println(result);
    }
    public static int findClosest(String[] words, String word1, String word2) {
//        int result = Integer.MAX_VALUE;
//        int index1 = -1;
//        int index2 = -1;
//        for (int i = 0 ; i < words.length ; i++) {
//            if ( words[i] == word1 ){
//                index1 = i ;
//            }
//            if ( words[i] == word2 ) {
//                index2 =i ;
//            }
//            if ( index1 != -1 && index2 != -1 ) {
//                result = Math.min(result, Math.abs(index1-index2))
//            }
//        }
//        return result;
//        易错：字字符串判断相等不能用==
        int result = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for (int i = 0 ; i < words.length ; i++) {
            if ( words[i].equals(word1) ){
                index1 = i ;
            }
            if ( words[i].equals(word2) ) {
                index2 =i ;
            }
            if ( index1 != -1 && index2 != -1 ) {
                result = Math.min(result, Math.abs(index1-index2));
            }
        }
        return result;
    }

}
