public class Swimming extends Player{
    String style;
    String lane;
    String nameClub;
    boolean startSwim;

    public Swimming(boolean startSwim){
        this.startSwim = startSwim;
    }

    public Swimming(String style){
        this.style = style;
    }

    public Swimming(String name, String athleticDiscipline, double height, double weight) {
        super(name, athleticDiscipline, height, weight);
    }

    public Swimming(String style, String lane, String nameClub, boolean startSwim) {
        this.style = style;
        this.lane = lane;
        this.nameClub = nameClub;
        this.startSwim = startSwim;
    }

    public String getStyle() {
        return style;
    }

    public boolean isStartSwim() {
        return startSwim;
    }

    String startSwim(){
        if(isStartSwim()){
            return "the swimming competition has already started";
        }else{
            return  "The competition has not started yet, the competitors are waiting";
        }
    }
}
