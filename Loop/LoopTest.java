
public class LoopTest {
    /*
    * Afua Ankomah
    * 4 October 2017
    * This is an application to show different types of loops. Once you understand how they work, they're easy!!
    * */
    public static void main(String args[])
    {
        //Display message to the user to indicate you are in the main method
        System.out.println("You are in the main method");

        //Display message to the user to indicate you are calling a method
        System.out.println("Calling the 'do while' method\n");
        showDoWhile();


        //Display message to the user to indicate you are calling a method
        System.out.println("Calling the 'show while' method\n");
        showWhile();

        //Display message to the user to indicate you are calling a method
        System.out.println("Calling the 'do while' method\n");
        showFor();

    }

    public static void showWhile()
    {

        int counter=0;

        //Display message to the user to indicate you are in the method
        System.out.println("You are in the 'show while' loop method\n");
        while(counter<50)
        {
            System.out.println(counter);
            counter ++;
        }

    }

    public static void showDoWhile()
    {
        int counter=0;

        //Display message to the user to indicate you are in the method
        System.out.println("You are in the 'do while' loop method\n");
        do
        {
            System.out.println(counter);
            counter ++;
        }while(counter<11);


    }

    public static void showFor()
    {
        for(int counter=0; counter<10; counter++)
        {
            System.out.println("Going through a for loop. The counter is at: "+counter+"\n");
        }
    }

}