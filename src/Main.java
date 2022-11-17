import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> employeeName = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        final String menu = "A - Add D - Delete P - Print Q - Quit";
        boolean done = false;
        String cmd = "";
        boolean resp;

        do
        {
            //display the list
            // display the menu
            // get a menu choice
            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();
            // execute the choice
            switch(cmd)
            {
                case "A" :
                    break;
                case "D" :
                    break;
                case "P" :
                    break;
                case "Q" : {
                    resp = SafeInput.getYNConfirm(console, "Are you sure?");
                    System.exit(0);
                    break;
                }

            }
            System.out.println("cdm is " + cmd);

        }while(!done);
    }
}