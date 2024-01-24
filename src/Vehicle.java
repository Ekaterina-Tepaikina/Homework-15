public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount < 0) {
            System.out.println("количество колёс не может быть отрицательным");
        } else {
            this.wheelsCount = wheelsCount;
        }
    }

    public abstract void service();
}
