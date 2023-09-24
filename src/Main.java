import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()){
            car.meth();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ABC");
        }
    }
}