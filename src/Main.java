import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int menuInitial() throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n===========================================\n"+
                "1. Gets the datas of the player Luis"+"\n"+
                "2. Gets list of player"+"\n"+
                "3. VIew that team going to play"+"\n"+
                "4. Gets winner team of the play of basketball"+"\n"+
                "5. Gets the characteristics of the Bicycle of the cyclist"+"\n"+
                "6. Gets the data a swim participant"+"\n"+
                "7. Gets the swimming style "+"\n"+
                "8. Show if the swimming competition started "+"\n"+
                "9. Finish\n"+
                "====================================================\n");
        return(Integer.parseInt(in.readLine()));
    }
    public static void main(String[] arg){
        int option = 0;

        do{
            try{
               option = menuInitial();

               switch (option){
                   case 1:
                       Person person = new Person("Luis", 88774455, "15/08/1993",
                               74586226, "Calle Fader", 'M');
                       System.out.println(person.displayData());
                       person.calculateAge(person.getBirthDate());
                       break;
                   case 2:
                       ListPlayer player = new ListPlayer();
                       player.addPlayer(new Player("Juan", "Basketball", 1.70, 86.0));
                       player.addPlayer(new Player("Rocio", "Cyclist",  1.60, 56.0));
                       player.addPlayer(new Player("Juana", "Swimming", 1.66, 62.0));
                       player.displayPlayer();
                       break;
                   case 3:
                       Basketball basketball = new Basketball("Team Dragon", "Team SiquiMira", 5,8);
                       System.out.println(basketball.getHomeTeam()+" vs "+basketball.getAwayTeam());
                       break;
                   case 4:
                       Basketball basketballResult = new Basketball("Team Dragon", "Team SiquiMira", 5,8);
                       System.out.println("Team winner is: "+basketballResult.getWinner());
                       break;
                   case 5:
                       Cyclist cyclist = new Cyclist("Rocio", "Cyclist",  1.60, 56.0);
                       Bike bike = new Bike("Venzo", 29);
                       System.out.println("Cyclist");
                       System.out.println(cyclist.displayData());
                       System.out.println("Bicycle");
                       System.out.println(bike.displayBycicle());
                       break;
                   case 6:
                       Swimming swim = new Swimming("Juana", "Swimming", 1.66, 62.0);
                       System.out.println(swim.displayData());
                       break;
                   case 7:
                       Swimming swimStyle = new Swimming("Backstroke");
                       System.out.println("The type of swimming style is: "+swimStyle.getStyle());
                       break;
                   case 8:
                       Swimming swimBegin = new Swimming(false);
                       System.out.println(swimBegin.startSwim());
                       break;
               }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(option != 0);
    }
}
