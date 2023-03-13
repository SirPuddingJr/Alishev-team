package Day6;

public class Task2 {
    public static void main(String[] args) {

    Airplane airplane = new Airplane(" Boing", 2010, 30, 40000 );
    airplane.setYear(2011);
    airplane.setLength(35);
    airplane.fillup(1000);
    airplane.fillup(5000);
    airplane.info();

    }
}
