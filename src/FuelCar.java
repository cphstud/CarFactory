public class FuelCar implements Car {
    private String model;

    public FuelCar(String model) {
        this.model = model;
    }

    @Override
    public String getType() {
        return "Fuel";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println("Driving fuel car: " + model);
    }
}