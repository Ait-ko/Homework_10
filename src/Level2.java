public class Level2 extends Parents implements  Printable{
    private String school;
    private String property;

    public void setProperty(String property) {
        this.property = property;
    }
    public Level2(String name, String job, int year,String school) {
        super(name, job, year);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nJob: " + getJob()+ "\nYear: "+ getYear()
                + "\nSchool: "+ getSchool());

    }
}
