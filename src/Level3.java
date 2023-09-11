public class Level3 extends  Parents implements Printable{
    private String university;
    private String property;

    public void setProperty(String property) {
        this.property = property;
    }
    public Level3(String name, String job, int year,String university) {
        super(name, job, year);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nJob: " + getJob()+ "\nYear: "+ getYear()
                + "\nUniversity:  "+ getUniversity());

    }
}
