public class Main {

    public static void main(String[] args) {
        Layer reader = new Reader();
        Layer tokenizer = new Tokenizer();
        Layer arrayCombinator = new ArrayCombinator();
        Layer printer = new Printer();

        reader.setNextLayer(tokenizer);
        tokenizer.setNextLayer(arrayCombinator);
        arrayCombinator.setNextLayer(printer);

        reader.execute(null);
    }
}
