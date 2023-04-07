package Day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier (warehouse);

        businessProcess(picker);

        System.out.println(picker);
        System.out.println(warehouse);

        businessProcess(courier);

        System.out.println(courier);
        System.out.println(warehouse);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse);
        Courier courier2 = new Courier (warehouse);

        picker2.doWork();
        courier2.doWork();

        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse);

    }

    public static void businessProcess (Worker worker){
    for (int i = 1; i <= 10000; i++) {
        worker.doWork();
    }

    }
}
