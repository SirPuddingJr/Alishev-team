package Day11.Task1;

public class Picker implements Worker {

    private int salary;
    private static final int TASK_SALARY = 80;
    private Warehouse w;

    private boolean isPayed;


    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
    salary += TASK_SALARY;
    w.incrementPickedOrders();
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void bonus() {
     if (w.getCountPickedOrders() < 10000){
         System.out.println("Бонус пока недоступен");
         return;
     }

        if (isPayed){
            System.out.println("Бонус уже выплачен");
            return;
        }


     salary += 70000;
     isPayed = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
