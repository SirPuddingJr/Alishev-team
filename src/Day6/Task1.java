package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setYear(2007);
        car.setModel("Moskvich");

        Moto moto = new Moto(1985, "Yava", "Red");

        car.info();
        moto.info();

        System.out.println(car.yearDif(2023));
        System.out.println(moto.yearDif(2023));






    }
}
