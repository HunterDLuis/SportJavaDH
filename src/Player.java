public class Player extends Person{
    float height;
    int playerNumber;
    String position;
    float weight;

    public Player(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender);
        this.height = height;
        this.playerNumber = playerNumber;
        this.position = position;
        this.weight = weight;
    }
}
