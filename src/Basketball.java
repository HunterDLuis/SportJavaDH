public class Basketball extends Player{

    public Basketball(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    void passBall(){
    }

    void throwBall(){
    }

    void bounce(){
    }

    boolean infringeOpponent(){
        return false;
    }
}
