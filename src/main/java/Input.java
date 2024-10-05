import java.util.Scanner;

public class Input {

    private Pipe<String> pipe;

    private String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void execute() {
        pipe.pipe(readString());
    }

    public void setPipe(Pipe<String> pipe) {
        this.pipe = pipe;
    }
}
