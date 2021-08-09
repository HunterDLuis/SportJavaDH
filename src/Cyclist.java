public class Cyclist extends Player{

    Bike bike = new Bike("Venzo", 29);
    boolean state;

    public Cyclist(){}

    public Cyclist(String name, String athleticDiscipline, double height, double weight, boolean state) {
        super(name, athleticDiscipline, height, weight);
        state = state;
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

    public boolean isState() {
        return state;
    }

    @Override
    public String displayData(){
        return "Name is: "+getName()+" this in the discipline: "+getAthleticDiscipline()+" has a height of: "+getHeight()+" and a weight of:"+getWeight()+
                " and state of bike is: "+isState();
    }
}
