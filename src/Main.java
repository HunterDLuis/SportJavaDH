import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int menuInicial() throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n===========================================\n"+
                "1. Gets the datas of the player Luis"+"\n"+
                "2. Gets list of player"+"\n"+
                "3. VIew that team going to play"+"\n"+
                "4. Gets winner team of the play of basketball"+"\n"+
                "0. Terminar\n"+
                "====================================================\n");
        return(Integer.parseInt(in.readLine()));
    }
    public static void main(String[] arg){
        int option = 0;

        do{
            try{
               option = menuInicial();

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
               }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }while(option != 0);
    }
}
