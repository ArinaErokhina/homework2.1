public class TransportInformation implements CheckTrailer,CheckEngine,UpdateTyre,Service {

    private String modelName;
    private int wheelsCount;

    public TransportInformation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName() {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void setWheelsCount() {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void checkTrailer() {

    }

    @Override
    public void check() {

    }

    @Override
    public void updateTyre() {

    }

    @Override
    public void checkEngine() {

    }
}
