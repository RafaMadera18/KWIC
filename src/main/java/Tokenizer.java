public class Tokenizer extends Layer {

    private String[] stringToArray(String string){
        return string.split(" ");
    }

    @Override
    public Object run(Object object) {
        return stringToArray((String) object);
    }
}
