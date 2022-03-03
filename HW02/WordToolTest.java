public class WordToolTest {
    public static void main(String[] args) {
        String paragraphText = "When he was nearly thirteen, my brother Jem got his arm badly broken at the elbow. When it healed, " +
                "and Jem's fears of never being able to play football were assuaged, he was seldom self-conscious about " +
                "his injury. His left arm was somewhat shorter than his right; when he stood or walked, the back of his " +
                "hand was at right angles to his body, his thumb parallel to his thigh. He couldn't have cared less, so " +
                "long as he could pass and punt.";
        String sentenceText = "The hottest day of the summer so far was drawing to a close and a drowsy silence lay over the " +
                "large, square houses of Privet Drive.";
        String wordText = "troubleshooting";

        WordTool paragraphWT = new WordTool(paragraphText);
        WordTool sentenceWT = new WordTool(sentenceText);
        WordTool wordWT = new WordTool(wordText);

        System.out.println("Stats for paragraph:");
        System.out.println("numSentences = " + paragraphWT.countSentences());
        System.out.println("numWords = " + paragraphWT.countWords());
        System.out.println("numCharacters = " + paragraphWT.countCharacters());
        System.out.println("charFreq = " + paragraphWT.characterFrequency('t'));
        System.out.println();

        System.out.println("Stats for sentence:");
        System.out.println("numSentences = " + sentenceWT.countSentences());
        System.out.println("numWords = " + sentenceWT.countWords());
        System.out.println("numCharacters = " + sentenceWT.countCharacters());
        System.out.println("charFreq = " + sentenceWT.characterFrequency('t'));
        System.out.println();

        System.out.println("Stats for word");
        System.out.println("numSentences = " + wordWT.countSentences());
        System.out.println("numWords = " + wordWT.countWords());
        System.out.println("numCharacters = " + wordWT.countCharacters());
        System.out.println("charFreq = " + wordWT.characterFrequency('t'));
        System.out.println();
    }
}
