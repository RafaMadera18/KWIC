public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        Tokenizer tokenizer = new Tokenizer();
        ArrayCombinator arrayCombinator = new ArrayCombinator();
        Printer printer = new Printer();

        String text = reader.readString();
        String[] textArray = tokenizer.stringToArray(text, " ");
        String[][] combinations = arrayCombinator.combinateStringArray(textArray);
        printer.printCombinations(combinations);
    }
}
