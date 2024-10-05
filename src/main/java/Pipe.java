public class Pipe<T> {

    private Filter<T, ?> nextFilter;
    private Output output;

    public void pipe(T value){

        if (nextFilter != null){
            nextFilter.execute(value);
        }

        output.execute((String[][]) value);
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void setNextFilter(Filter<T, ?> nextFilter) {
        this.nextFilter = nextFilter;
    }
}
