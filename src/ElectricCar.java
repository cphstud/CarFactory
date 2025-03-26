public class ElectricCar implements Car {
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }

    @Override
    public String getType() {
        return "Electric";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println("Driving electric car: " + model);
    }
}
