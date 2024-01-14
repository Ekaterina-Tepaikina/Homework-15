public class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
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
}
