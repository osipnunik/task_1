public class Manager extends Employee {
    private int wage;

    public Manager(int id, String name, String surname, int rate, int percentage) {
        super(id, name, surname, rate, percentage);
        this.wage = percentage > 100 ? rate : rate-(100-percentage);
    }

    public int getWage(){
        return wage;
    }
}
