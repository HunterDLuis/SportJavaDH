import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static int menuInitial() throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n===========================================\n"+
                "1. Gets the data of the player Luis"+"\n"+
                "2. Adds and show list of players"+"\n"+
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

    private static void addPlayer(ListPlayer player) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean morePlayer = true;
        String name;
        String discipline;
        double height;
        double weight;

        while(morePlayer){
            System.out.println("Enter a name: ");
            name = bufferedReader.readLine();
            System.out.println("Enter dicipline: ");
            discipline = bufferedReader.readLine();
            System.out.println("Enter height: ");
            height = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter weight");
            weight = Double.parseDouble(bufferedReader.readLine());
            player.addPlayer(new Player(name, discipline, height, weight));
            System.out.println("Add more players");
            System.out.println("If your want to add more players enter 'true' otherwise enter 'false'");
            morePlayer = Boolean.parseBoolean(bufferedReader.readLine());
        }
    }

    public static void main(String[] arg){
        int option = 0;

        do{
            try{
               option = menuInitial();
               ListPlayer player = new ListPlayer();
               switch (option){
                   case 1:
                       Person person = new Person("Luis", 88774455, "15/08/1993",
                               74586226, "Calle Fader", 'M');
                       System.out.println(person.displayData());
                       person.calculateAge(person.getBirthDate());
                       break;
                   case 2:
                       addPlayer(player);
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
                       Cyclist cyclist = new Cyclist("Rocio", "Cyclist",  1.60, 56.0,true);
                       Bike bike = new Bike("Venzo", 29);
                       System.out.println("Cyclist");
                       System.out.println(cyclist.displayData());
                       System.out.println("Bicycle");
                       System.out.println(bike.displayBicycle());
                       break;
                   case 6:
                       Swimming swim = new Swimming("Juana", "Swimming", 1.66, 62.0, "Backstroke");
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
