public class Main {



    public static void main(String[] args) {
        StringReader stringReader = new StringReader();
        StringTokenizer stringTokenizer = new StringTokenizer();
        StringArrayCombinator stringArrayCombinator = new StringArrayCombinator();
        CombinationsPrinter combinationsPrinter = new CombinationsPrinter();

        String text = stringReader.readString();
        String[] textArray = stringTokenizer.stringToArray(text, " ");
        String[][] combinations = stringArrayCombinator.combinateStringArray(textArray);
        combinationsPrinter.printCombinations(combinations);
    }
}
