public class CanBo {
    private int Hard;
    private int Bonus;
    private int Fine;
    private int Salary;
    private Officer officer;

    public CanBo(int hard, int bonus, int fine, Officer officer) {
        Hard = hard;
        Bonus = bonus;
        Fine = fine;
        this.officer = officer;
    }
    public CanBo(){

    }

    public int getHard() {
        return Hard;
    }

    public void setHard(int hard) {
        Hard = hard;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getFine() {
        return Fine;
    }

    public void setFine(int fine) {
        Fine = fine;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    @Override
    public String toString() {
        return "CanBo{" + officer+ "salary"+ Salary+"$"+'}';
    }
}
