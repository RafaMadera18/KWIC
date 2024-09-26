import java.util.Scanner;

public class Reader extends Layer {

    private String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public Object run(Object object) {
        return readString();
    }
}
