public class Main {

    public static void main(String[] args) {
        Layer input = new Input();
        Layer tokenizer = new Tokenizer();
        Layer combinations = new Combinations();
        Layer sorting = new Sorting();
        Layer output = new Output();

        input.setNextLayer(tokenizer);
        tokenizer.setNextLayer(combinations);
        combinations.setNextLayer(sorting);
        sorting.setNextLayer(output);

        input.execute(null);
    }
}
