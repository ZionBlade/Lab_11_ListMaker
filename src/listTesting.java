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

//
//        list.add("Oreo");
//        list.add("cookie");

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
                    if(list.size() != 0)
                    {
                        item = SafeInput.getRangedInt(console, "Enter where you want to insert the item", 1, (list.size() +1));
                        item--;
                        cmd = SafeInput.getNonZeroLenString(console, "enter what you want to add");
                        list.add(item, cmd);
                    }
                    else
                    {
                        cmd = SafeInput.getNonZeroLenString(console, "enter what you want to add");
                        list.add(cmd);
                    }
                    break;
                case "D" :
                    item = SafeInput.getRangedInt(console, "enter the list number that you want to delete", 1, (list.size() + 1));
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
        System.out.println("\n**********************************************************");
        if(list.size() != 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                System.out.printf("\n%3d%35s", i+1, list.get(i));
            }
        }
        else {
            System.out.println("\n***                    list is empty                   ***");
        }
        System.out.print("\n**********************************************************");

    }
}
