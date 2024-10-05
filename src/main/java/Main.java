public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Tokenizer tokenizer = new Tokenizer();
        Combinations combinations = new Combinations();
        Sorting sorting = new Sorting();
        Output output = new Output();

        Pipe<String> pipe1 = new Pipe<>();
        Pipe<String[]> pipe2 = new Pipe<>();
        Pipe<String[][]> pipe3 = new Pipe<>();
        Pipe<String[][]> pipe4 = new Pipe<>();

        input.setPipe(pipe1);
        pipe1.setNextFilter(tokenizer);
        tokenizer.setOutputPipe(pipe2);
        pipe2.setNextFilter(combinations);
        combinations.setOutputPipe(pipe3);
        pipe3.setNextFilter(sorting);
        sorting.setOutputPipe(pipe4);
        pipe4.setOutput(output);

        input.execute();
    }
}
