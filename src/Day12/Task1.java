package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main (String[]args){
        List<String> list = new ArrayList<>();

        list.add("Moskvich");
        list.add("Kosmich");
        list.add("Maz");
        list.add("gaz");
        list.add("Uaz");

        System.out.println(list);

        list.add(2,"Tesla");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);


    }


}
