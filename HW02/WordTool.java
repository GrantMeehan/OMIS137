public class WordTool {

    private String input;

    public WordTool(){
        this.input = "n/a";
    }

    public WordTool(String input) {
        this.input = input;
    }

    //countSentences counts the number of sentences (separated by . ; ! ?) in a string
    public int countSentences(){
        int numSentences = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.' || input.charAt(i) == ';' || input.charAt(i) == '!' || input.charAt(i) == '?') {
                numSentences++;
            }
        }
        return numSentences;
    }

    //countWords counts the number of words in a sentence
    public int countWords() {
        int numWords = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                numWords++;
            }
        }
        return numWords;
    }

    //countCharacters counts the number of characters in a word
    public int countCharacters() {
        return input.length();
    }

    //characterFrequency calculates the frequency of a character per word, sentence, or whole string based on its input
    public int characterFrequency(char character) {
        int numCharacter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                numCharacter++;
            }
        }
        return numCharacter;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
