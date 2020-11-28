public class Developer extends Employee{
    private int wage;

    public Developer(int id, String name, String surname, int rate, int procentage) {
        super(id, name, surname, rate, procentage);
        this.wage = rate * procentage / 100;
    }

    public int getWage(){
        return wage;
    }
}
