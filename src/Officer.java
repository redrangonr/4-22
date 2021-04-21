public class Officer {
    private String Name;
    private String Date;
    private String Town;

    public Officer(String name, String date, String town) {
        Name = name;
        Date = date;
        Town = town;
    }
    public Officer(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "Name='" + Name + '\'' +
                ", Date='" + Date + '\'' +
                ", Town='" + Town + '\'' +
                '}';
    }
}
