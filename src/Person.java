import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    String name;
    int ci;
    String birthDate;
    int phone;
    String address;
    char gender;
    int age;

    public Person(){};

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int ci, String birthDate, int phone, String address, char gender) {
        this.name = name;
        this.ci = ci;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    String displayData(){
        return "Name is: "+getName()+" and my address is: "+address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    void calculateAge(String birthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDate nowAge = LocalDate.now();

        Period period = Period.between(birth, nowAge);
        System.out.printf("You age is: %s years, %s months and %s days",
                period.getYears(),
                period.getMonths(),
                period.getDays());
    }
}
