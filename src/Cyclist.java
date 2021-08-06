public class Cyclist extends Player{

    Bike bike = new Bike("Venzo", 29);
    boolean state;

    public Cyclist(){}

    public Cyclist(String name, String athleticDiscipline, double height, double weight) {
        super(name, athleticDiscipline, height, weight);
        state = true;
    }

    public Cyclist(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    boolean fixBike(){
        if(state){
            return false;
        }else{
            return true;
        }
    }

    public String showDataBicycle(){
        return "Cyclist rides a bike with the following characteristics: "+bike.displayBycicle();
    }
}
