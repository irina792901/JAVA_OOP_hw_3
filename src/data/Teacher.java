package data;

public class Teacher extends User{
    private String kafedra;
    private String rang;

    public Teacher(String firstName, String lastName, int id, int age, int yearOfBirth, int passport, String kafedra, String rang) {
        super(firstName, lastName, id, age, yearOfBirth, passport);
        this.kafedra = kafedra;
        this.rang = rang;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
