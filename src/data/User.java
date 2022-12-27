package data;

public abstract class User {
    //implevents DataService не пишется, это связано с Solid
    // !!!NB!!! Читать что такое Солид и почему так не пишется
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private int YearOfBirth;
    private  int passport;

    public User(String firstName, String lastName, int id, int age, int yearOfBirth, int passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        YearOfBirth = yearOfBirth;
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
}

