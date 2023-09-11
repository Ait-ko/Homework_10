public class Level1 extends Parents implements  Printable{
    private String hobby;
    private String property;

    public void setProperty(String property) {
        this.property = property;
    }

    public Level1(String name, String job, int year,String hobby) {
        super(name, job, year);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nJob: " + getJob()+ "\nYear: "+ getYear()
        + "\nHobby: "+ getHobby());
    }
}
