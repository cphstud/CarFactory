import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoadFromStorage loader = new LoadFromTextFile("cars.txt"); // Or use LoadFromSQL
        List<String[]> carData = loader.loadData();

        for (String[] entry : carData) {
            Car car = CarFactory.createCar(entry[0], entry[1]);
            car.drive();
        }
    }
}