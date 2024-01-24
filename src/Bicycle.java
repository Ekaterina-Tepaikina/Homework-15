public class Bicycle extends Vehicle {

    public Bicycle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
    }
}
