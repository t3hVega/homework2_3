abstract public class Vehicle {
    private String modelName;
    private int wheelsCount;
    public Vehicle (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++)
        System.out.println("Меняем " + (i+1) + "-ю покрышку");
    }
}
