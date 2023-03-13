package Day6;

public class Moto {
    private int year;
    private String model;
    private String color;

    public Moto(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDif (int inYear){
        return inYear - year;
    }
}
