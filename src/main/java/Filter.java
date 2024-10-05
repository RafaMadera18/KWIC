public abstract class Filter<TInput, TOutput> {

    private Pipe<TOutput> outputPipe;

    public void execute(TInput input){
        TOutput result = run(input);
        outputPipe.pipe(result);
    }
    protected abstract TOutput run(TInput input);

    public void setOutputPipe(Pipe<TOutput> outputPipe) {
        this.outputPipe = outputPipe;
    }
}
