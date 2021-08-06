public class Basketball extends Player{
    String nameLeague;
    int homeScore = 0, awayScore = 0, quarter = 1;
    String homeTeam, awayTeam;
    boolean gameStatus;

    public Basketball(){};

    public Basketball(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        gameStatus = true;
    }

    public Basketball(String name, int ci, String birthDate, int phone, String address, char gender, float height, int playerNumber, String position, float weight) {
        super(name, ci, birthDate, phone, address, gender, height, playerNumber, position, weight);
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore(){
        return homeScore;
    }

    public int getAwayScore(){
        return awayScore;
    }

    public void setHomeScore(int h){
        do{
           try{
               switch (h){
                   case 1:
                       homeScore++;
                       break;
                   case 2:
                       homeScore+=2;
                       break;
                   case 3:
                       homeScore+=3;
                       break;

               }
           } catch (Exception ex){
               System.out.println(ex.getMessage());
           }
        }while(h >= 1 & h <= 3);
    }

    public void setAwayScore(int a){
        do{
            try{
                switch (a){
                    case 4:
                        awayScore++;
                        break;
                    case 5:
                        awayScore+=2;
                        break;
                    case 6:
                        awayScore+=3;
                        break;

                }
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(a >= 4 & a <= 6);
    }

    /*
     * Ends the current quarter
     */
    public void setPeriod() {
        quarter++;

        if(quarter > 4){
            gameStatus = false;
        }
    }

    /*
     * Gets the current quarter
     */
    public int getPeriod() {
        return quarter;
    }

    /*
     * Returns true if game is still going
     */
    public boolean isGameStatus(){
        if(gameStatus){
            return true;
        }
        else{
            return false;
        }
    }

    /*
     * Gets the winner of the game
     */
    public String getWinner(){
        if(getHomeScore() > getAwayScore()){
            return getHomeTeam();
        }
        else {
            return getAwayTeam();
        }
    }
}
