public class StringAnalyzer {

    String text;

    StringAnalyzer(String text) {
        this.text = text;
    }

    int countVowels() {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if ("aeiouyAEIOUY".indexOf(ch) >= 0)
                count++;
        }

        // int count = 0 ;
        // for(int i = 0; i < text.length(); i++){
        // char ch = text.charAt(i);
        // if( "aeiouyAEIOUY".indexOf(ch) >= 0) count++;
        // }

        return count;
    }

    int countDigits() {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if ('0' <= ch && ch <= '9')
                count++;
        }

        return count;
    }

    int countUppercase(){
        int count = 0;
        for (char ch : text.toCharArray()) {
            if ('A' <= ch && ch <= 'Z')
                count++;
        }

        return count;
    }

}
