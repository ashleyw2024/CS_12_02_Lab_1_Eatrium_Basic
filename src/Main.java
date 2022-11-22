import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<Lunch> arList = new ArrayList<>();
        ArrayList<Breakfast> brList = new ArrayList<>();
        ArrayList<Snack> snList = new ArrayList<>();
        System.out.println(Colors.ANSI_GREEN + "Welcome to the Eatrium pre-orderding system." + Colors.ANSI_RESET);


        while(!input.toLowerCase().equals("exit"))
        {
            System.out.println(Colors.ANSI_YELLOW + "What would you like to order?" + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_BLUE + "Breakfast" + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_BLUE + "Lunch" + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_BLUE + "Snack" + Colors.ANSI_RESET);

            input = sc.next();
            if(input.equals("lunch"))
            {
                input = sc.next();
                //do stuff for lunches
                Lunch currLunch = new Lunch(input);
                arList.add(currLunch);
            }
            if(input.equals("breakfast"))
            {
                input = sc.next();
                //do stuff for lunches
                Breakfast currBreak = new Breakfast(input);
                brList.add(currBreak);
            }
            if(input.equals("snack"))
            {
                input = sc.next();
                //do stuff for lunches
                Snack currSnack = new Snack(input);
                snList.add(currSnack);
            }
        }

        System.out.println("bye!");
    }
}