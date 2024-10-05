public class Tokenizer extends Filter<String, String[]> {

    private String[] stringToArray(String string){
        return string.split(" ");
    }

    @Override
    protected String[] run(String string) {
        return stringToArray(string);
    }
}
