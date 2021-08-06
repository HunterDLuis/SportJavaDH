public class Swimming extends Player{
    String style;
    String lane;

    public Swimming(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    void drop(){}

    boolean toWarm(){
        return true;
    }

    void toSwim(){}

    boolean enjure(){
        return false;
    }
}
