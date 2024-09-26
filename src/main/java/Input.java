import java.util.Scanner;

public class Input extends Layer {

    private String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public Object run(Object object) {
        return readString();
    }
}
