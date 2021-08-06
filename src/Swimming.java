public class Swimming extends Player{
    String style;
    String lane;
    String nameClud;
    boolean startSwim;

    public Swimming(){}

    public Swimming(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight, String style, String lane, String nameClud, boolean startSwim) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
        this.style = style;
        this.lane = lane;
        this.nameClud = nameClud;
        this.startSwim = startSwim;
    }

    public Swimming(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    public String getNameClud(){
        return nameClud;
    }

    boolean drop(){
        return false;
    }

    boolean toWarm(){
        return true;
    }

    void startSwim(boolean flag){
        System.out.print(flag);
    }

    boolean enjure(){
        return false;
    }
}
