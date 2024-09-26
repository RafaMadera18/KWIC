public abstract class Layer {

    public Layer nextLayer;

    public void setNextLayer(Layer nextLayer){
        this.nextLayer = nextLayer;
    }

    public Object execute(Object object){
        Object result = run(object);

        if (nextLayer != null){
            return nextLayer.execute(result);
        }

        return null;
    }

    public abstract Object run(Object object);
}
