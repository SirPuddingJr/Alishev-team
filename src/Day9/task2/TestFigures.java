package Day9.task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 4, 6, "Black"),
                new Triangle(5, 6, 5, "Red"),
                new Triangle(7, 9, 5, "Blue"),
                new Rectangle(34, 25, "Black"),
                new Rectangle(23, 32, "Red"),
                new Circle(6, "Black"),
                new Circle(9, "Red")

        };

        System.out.println(calRedPer(figures));
        System.out.println(calRedPerArea(figures));

    }
    public static double calRedPer (Figure[]figures){
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();

        }
        return sum;
    }


    public static double calRedPerArea (Figure[]figures){
            double sum = 0;
            for (Figure figure : figures) {
                if (figure.getColor().equals("Red"))
                    sum += figure.area();
            }
            return sum;

        }

}
