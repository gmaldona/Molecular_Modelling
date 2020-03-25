package MoleculeKit;

import javax.swing.*;
import processing.core.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.Character;

//Class that holds the properties of the graphical user interface and calls other classes -> The startup class transitions into the environment class
//When the user builds the molecule
public class Startup {

    //Variable that holds the boolean value to know when to close the program and stop it running
    private static boolean kill = false;

    //Holds the environment object
    private static Environment environment;

    //Variable that holds the boolean value of the window status
    private static boolean windowOpen = false;

    //Main function that starts up the graphical user interface to interact with the molecule
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //calls the windows
        startupWindow();

    }

    //This is the first window that is opened. This is where a new molecule can be created
    private static void startupWindow() throws FileNotFoundException, UnsupportedEncodingException {
        //While loop continues to open the first window
        while (!windowOpen) {
            //If statement checks to see if the user wants to terminate the program
            if (kill) { break; }
            //Creates a input box for user to enter a set of commands
            String command = JOptionPane.showInputDialog(null,"Enter a molecular formula or type HELP for more Options");
            if ( command == null ) { command = "exit"; }
            //if the user enters end then the program will end
            if (command.equalsIgnoreCase("END")) { kill = true; }
            //if the user enters help a list of commands will pop up
            else if (command.equalsIgnoreCase("HELP")) { windowCommands(1); }
            //anything else will be considered a molecule and will run the molecule function
            else { moleculeWindow(command); }

        }
    }

    //This function controls the molecule command window. Interaction between the molecule that the user created
    private static void moleculeWindow(String moleculeString) throws FileNotFoundException, UnsupportedEncodingException {

        Molecule molecule = new Molecule(moleculeString);
        //Creates a new molecule instance
        //while loop continues to open the molecule window
        while (!windowOpen) {
            //if statement checks to see if the user wants to terminate the program
            if (kill) { break; }
            //creates an input box for the user to enter commands
            String command = JOptionPane.showInputDialog(null, "Type HELP for commands to interact with the molecule.");
            if (command == null) {command = "exit"; }
            //If the user enters NEW then it will break the user back to the previous window and they can enter a new molecule
            if (command.equalsIgnoreCase("NEW")) { break; }
            //If the user eneters HElp then a list of commands to interact with the molecule will pop up
            else if (command.equalsIgnoreCase("HELP")) { windowCommands(2);}
            //If the user enters END then the program will end
            else if (command.equalsIgnoreCase("END")) { kill = true; }
            //If the user enters MOLECULE then a window with the entered molecule will pop up
            else if (command.equalsIgnoreCase("MOLECULE")) { JOptionPane.showMessageDialog(null, moleculeString);}
            //If the user enters LIST then it will pop up a list of the atoms in the molecule
            else if (command.equalsIgnoreCase("LIST")) {JOptionPane.showMessageDialog(null, molecule.getAtoms()); }
            //If the user enters create then the molecule will be 3d rendered
            else if (command.equalsIgnoreCase("CREATE")) {

                //creates a writer class to create and write to a text file
                PrintWriter writer = new PrintWriter("Molecule.txt", "UTF-8");
                //writes the users input to the text file
                writer.println(moleculeString);
                //closes the text file
                writer.close();
                //Creates an new environment with the given molecule
                environment = new Environment();
                //Calls the processing 3D files
                PApplet.main(new String[]{"MoleculeKit.Environment"});
                windowOpen = true;

            }
//*********
//*********
//*********
//*********
            //This is a test command that prints to the command line
            else if (command.equalsIgnoreCase("shells")) {System.out.println(molecule.atoms.get(0).getValanceElectrons()); }
//*********s
//*********
//*********
//*********

            //If the user enters anything else then it will be considered an interaction between molecule
            else {
                //creates a string to hold the atom index
                String atomIndex = "";
                //loops through the users input
                for (int i = 1; i < command.length(); i++) {
                    //attaches the numbers together to concatenate one big number
                    atomIndex = atomIndex + String.valueOf(command.charAt(i));
                }
                //creates another window for the interaction of atoms in the molecule
                atomWindow(molecule.atoms.get(Integer.parseInt(atomIndex) - 1));
            }

        }

    }

    //This function controls the molecule command window. Interaction between the molecule that the user created
    private static void atomWindow(Atom atom) {
        JOptionPane.showMessageDialog(null, atom.returnProperties());
    }


    //This method controls the help windows
    private static void windowCommands(int window) {
        //If the window is the first one then the help box that will pop up will deal with window 1 help
        /*
        MOLECULE - See the entered molecular formula
        HELP - List of commands
        END - Ends the current window
        LIST - A list of the atoms in the molecule
         */
        if (window == 1) {
            JOptionPane.showMessageDialog(null, "Type in a molecular formula to generate a molecule." +
                    "\nType HELP for a list of commands." +
                    "\nType END to end the program.");
        }
        //If the window is the second one then the help box that will pop up will deal with window 2 help
        else if (window == 2) {
            JOptionPane.showMessageDialog(null, "Type NEW to create a new molecule." +
                    "\nType LIST to list the atoms.\nType MOLECULE to see the entered molecular formula." +
                    "\n Type CREATE to create the molecule.");
        }

    }

}
