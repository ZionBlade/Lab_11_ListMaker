import java.util.ArrayList;
import java.util.Scanner;

public class listTesting {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final String menu = "A - Add D - Delete P - Print Q - Quit";
        boolean done = false;
        String cmd = "";
        boolean resp;
        int item = 0;


        list.add("Oreo");
        list.add("cookie");

        displayList();

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
                    cmd = SafeInput.getNonZeroLenString(console, "enter what you want to add: ");
                    list.add(cmd);
                    break;
                case "D" :
                    item = SafeInput.getInt(console, "Enter the list number that you want to delete");
                    item--;
                    list.remove(item);
                    break;
                case "P" :
                    displayList();
                    break;
                case "Q" : {
                    resp = SafeInput.getYNConfirm(console, "Are you sure?");
                    if (resp = true)
                    {
                        System.exit(0);
                    }
                    break;
                }

            }
            //System.out.println("cdm is " + cmd);

        }while(!done);
    }

    private static void displayList()
    {
        System.out.print("\n**********************************************************");
        if(list.size() != 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                System.out.printf("\n%3d%35s", i+1, list.get(i));
            }
        }
        else {
            System.out.println("***                    list is empty                   ***");
        }
        System.out.print("\n**********************************************************");

    }
}
