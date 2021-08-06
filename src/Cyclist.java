public class Cyclist extends Player{
    public Cyclist(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    void pedal(){
    }

    void brake(){}

    void changeBox(){}

    boolean fixBike(){
        return false;
    }
}
