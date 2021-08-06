public class Main {
    public static void main(String[] arg){
        Person person = new Person("Luis", 88774455, "15/08/1993",
                74586226, "Calle Fader", 'M');
        System.out.println(person.displayData());
        person.calculateAge(person.getBirthDate());
    }
}
