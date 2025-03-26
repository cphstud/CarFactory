public class CarFactory {
    public static Car createCar(String type, String model) {
        switch (type.toLowerCase()) {
            case "electric":
                return new ElectricCar(model);
            case "fuel":
                return new FuelCar(model);
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
