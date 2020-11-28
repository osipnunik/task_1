public abstract class Employee {
    private int id;
    private String name;
    private String surname;

    private int rate;
    protected int percentage;

    public Employee(int id, String name, String surname, int rate, int percentage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.rate = rate;
        this.percentage = percentage;
    }

    public int getRate(){
        return rate;
    }
    public int workProcentage(){
        return percentage;
    }

}
