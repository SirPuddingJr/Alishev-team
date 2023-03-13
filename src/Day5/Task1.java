package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setYear(2007);
        car.setModel("Moskvich");

        System.out.println("Out car: " + car.getYear() + " year, " + car.getModel() + " model, " + car.getColor() + " color. ");


    }
}
