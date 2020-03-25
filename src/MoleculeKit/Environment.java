package MoleculeKit;

import peasy.PeasyCam;
import processing.core.*;
import java.io.BufferedReader;
import java.io.IOException;

//Class that creates the 3D environment
public class Environment extends PApplet {

    private PeasyCam cam;
    private float angle = 0;
    private boolean rotate = true;
    Molecule molecule;
    String moleculeStr;

    //Creates the window size and 3D renderer
    public void settings() { size(600, 600, P3D); }

    //Sets up the necessary functions to run the program
    public void setup() {
        //creates the camera motion for 3D
        cam = new PeasyCam(this, 500);
        //Reads the text file from the users input
        parseFile();
        //creates a molecule from the users input
        molecule = new Molecule(moleculeStr);
    }

    //Function that reads the text file from the users input
    private void parseFile() {
        //Creates a reader class
        BufferedReader reader = createReader("Molecule.txt");
        //variable to hold the text in the file - sets initial to nothing
        String line = null;
        //Tries to read the file but if there is nothing in the file then will switch to the catch statement
        try {
            //Runs until line does not read null anymore
            while ((line = reader.readLine()) != null) {
                //sets the text file to the molecule Str - which is the users input
                moleculeStr = line;
            }
        }
        //If there is nothing in the text file then the catch statement will run - there should never be nothing in the
        //text file
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Function that draws the atoms in Space - 60 HZ
    public void draw() {
        //Function that creates the lighting in the environment
        lights();
        background(0);
        drawAxes();
        noStroke();

        //Creates the atoms for the environment
        drawAtom(new Atom(1, 0, 0, 0), new Atom(1, 0, 0, 0));

    }

    //Function that creates the atoms for the environment - NEEDS IMPROVEMENT
    public void drawAtom(Atom atom1, Atom atom2) {
        noStroke();

        atom1.x = (int) (100 * cos(angle));
        atom1.y = (int) (100 * sin(angle));

        atom2.x = (int) (-100 * cos(angle));
        atom2.y = (int) (-100 * sin(angle));

        noStroke();

        translate(atom1.x, atom1.y);
        fill(atom1.RGB[0], atom1.RGB[1], atom1.RGB[2]);
        sphere((float) atom1.radius);
        translate(-atom1.x, -atom1.y);

        translate(atom2.x, atom2.y);
        fill(atom2.RGB[0], atom2.RGB[1], atom2.RGB[2]);
        sphere((float) atom2.radius);
        translate(-atom2.x, -atom2.y);

        if (rotate == true) {
            angle += 0.01;
            //System.out.print("Atom A x, y: " + atom1.x + ", ");
            //System.out.println(atom1.y);

            //System.out.print("Atom B x, y: " + atom2.x + ", ");
            //System.out.println(atom2.y);
        }
    }

    //Draws the axes in the environment
    public void drawAxes() {
        strokeWeight(5);
        /*
        Sets up the x, y, z axis
        Line 1: X - AXIS (COLOR_BLUE)
        Line 2: Y - AXIS (COLOR_GREEN)
        Line 3: Z - AXIS (COLOR_WHITE)
         */
        stroke(0, 0, 255);
        line(-500, 0, 0, 500, 0, 0); // Line 1
        stroke(0, 255, 0);
        line(0, -500, 0, 0, 500, 0); // Line 2
        stroke(255);
        line(0, 0, -500, 0, 0, 500); // Line 3

    }
}
