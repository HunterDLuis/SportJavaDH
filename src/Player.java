public class Player extends Person{
    double height;
    String athleticDiscipline;
    int playerNumber;
    String position;
    double weight;

    public Player(){}

    public Player(String name, String athleticDiscipline, double height, double weight){
        super(name);
        this.height = height;
        this.athleticDiscipline = athleticDiscipline;
        this.weight = weight;
    }

    public Player(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender);
        this.height = height;
        this.playerNumber = playerNumber;
        this.position = position;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public String getAthleticDiscipline() {
        return athleticDiscipline;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String displayData(){
        return "Name is: "+getName()+" this in the discipline: "+getAthleticDiscipline()+" has a height of: "+getHeight()+" and a weight of:"+getWeight();
    }
}
