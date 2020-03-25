package MoleculeKit;

import java.util.Random;

public class Nucleus {

    /*
     * Most important variable of the Atom. Gives the amount of protons in the atom
     * which gives all the properties. Most of the other variables depends on this one variable
     */
    int AtomicNumber;

    /*
     * The Name variable holds the name of the element and the symbol will hold the atomic symbol
     * for the given element
     */
    String symbol, name;

    /*
     * Both variables holds the mass of the atom. The difference is in the units.
     * The atomicWeight variable holds the value with the units of AMU
     * The mass variable holds the value with the units of KG
     * The mass variable depends on the atomicWeight variable and a conversion factor
     */
    double AtomicWeight, mass;

    //These two variables holds the count of the subatomic particles inside of the nucleus
    int numberOfProtons, numberOfNeutrons;

    //Radius Variable that holds the size of the atom. The distance from the nucleus to the valance shell
    double radius;

    //These variables holds the value for how likely the atom is going to take/give away an electron
    double electronegativity, firstIonizationEnergy;

    //Oxidation states are how many electrons will be lost or given
    int[] oxidationStates;

    //Array that holds the RGB value of an atom
    int[] RGB;



    public Nucleus(int AtomicNumber) {

        RGB = new int[]{255, 0, 0};

        //Hydrogen
        if (AtomicNumber == 1) {
            this.AtomicNumber = AtomicNumber;
            symbol = "H";
            name = "Hydrogen";
            AtomicWeight = 1.008;
            numberOfProtons = AtomicNumber;
            radius = 32;
            electronegativity = 2.2;
            firstIonizationEnergy = 1312;
            oxidationStates = new int[]{-1, 1};
            RGB = new int[]{255, 0, 0};
        }
        //Helium
        else if (AtomicNumber == 2) {
            this.AtomicNumber = AtomicNumber;
            symbol = "He";
            name = "Helium";
            AtomicWeight = 4.00;
            numberOfProtons = AtomicNumber;
            radius = 37;
            electronegativity = 0;
            firstIonizationEnergy = 2372;
            oxidationStates = new int[]{0};
        }
        //Lithium
        else if (AtomicNumber == 3) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Li";
            name = "Lithium";
            AtomicWeight = 6.941;
            numberOfProtons = AtomicNumber;
            radius = 130;
            electronegativity = 1.0;
            firstIonizationEnergy = 520;
            oxidationStates = new int[]{1};
        }
        //Beryllium
        else if (AtomicNumber == 4) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Be";
            name = "Beryllium";
            AtomicWeight = 9.01218;
            numberOfProtons = AtomicNumber;
            radius = 99;
            electronegativity = 1.6;
            firstIonizationEnergy = 900;
            oxidationStates = new int[]{2};
        }
        //Boron
        else if (AtomicNumber == 5) {
            this.AtomicNumber = AtomicNumber;
            symbol = "B";
            name = "Boron";
            AtomicWeight = 10.81;
            numberOfProtons = AtomicNumber;
            radius = 84;
            electronegativity = 2.0;
            firstIonizationEnergy = 801;
            oxidationStates = new int[]{3};
        }
        //Carbon
        else if (AtomicNumber == 6) {
            this.AtomicNumber = AtomicNumber;
            symbol = "C";
            name = "Carbon";
            AtomicWeight = 12.0107;
            numberOfProtons = AtomicNumber;
            radius = 75;
            electronegativity = 2.6;
            firstIonizationEnergy = 1086;
            oxidationStates = new int[]{-4, 2, 4};
        }
        //Nitrogen
        else if (AtomicNumber == 7) {
            this.AtomicNumber = AtomicNumber;
            symbol = "N";
            name = "Nitrogen";
            AtomicWeight = 14.0067;
            numberOfProtons = AtomicNumber;
            radius = 71;
            electronegativity = 3.0;
            firstIonizationEnergy = 1402;
            oxidationStates = new int[]{-3, -2, -1, 1, 2, 3, 4, 5};
        }
        //Oxygen
        else if (AtomicNumber == 8) {
            this.AtomicNumber = AtomicNumber;
            symbol = "O";
            name = "Oxygen";
            AtomicWeight = 15.9994;
            numberOfProtons = AtomicNumber;
            radius = 64;
            electronegativity = 3.4;
            firstIonizationEnergy = 1314;
            oxidationStates = new int[]{-2};
        }
        //Fluorine
        else if (AtomicNumber == 9) {
            this.AtomicNumber = AtomicNumber;
            symbol = "F";
            name = "Fluorine";
            AtomicWeight = 18.9984;
            numberOfProtons = AtomicNumber;
            radius = 60;
            electronegativity = 4.0;
            firstIonizationEnergy = 1681;
            oxidationStates = new int[]{-1};
        }
        //Neon
        else if (AtomicNumber == 10) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ne";
            name = "Neon";
            AtomicWeight = 20.180;
            numberOfProtons = AtomicNumber;
            radius = 62;
            electronegativity = 0;
            firstIonizationEnergy = 2081;
            oxidationStates = new int[]{0};
        }
        //Sodium
        else if (AtomicNumber == 11) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Na";
            name = "Sodium";
            AtomicWeight = 22.99;
            numberOfProtons = AtomicNumber;
            radius = 160;
            electronegativity = 0.9;
            firstIonizationEnergy = 496;
            oxidationStates = new int[]{1};
        }
        //Magnesium
        else if (AtomicNumber == 12) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Mg";
            name = "Magnesium";
            AtomicWeight = 24.305;
            numberOfProtons = AtomicNumber;
            radius = 140;
            electronegativity = 1.3;
            firstIonizationEnergy = 738;
            oxidationStates = new int[]{2};
        }
        //Aluminum
        else if (AtomicNumber == 13) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Al";
            name = "Aluminum";
            AtomicWeight = 26.98154;
            numberOfProtons = AtomicNumber;
            radius = 124;
            electronegativity = 1.6;
            firstIonizationEnergy = 578;
            oxidationStates = new int[]{3};
        }
        //Silicon
        else if (AtomicNumber == 14) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Si";
            name = "Silicon";
            AtomicWeight = 32.065;
            numberOfProtons = AtomicNumber;
            radius = 114;
            electronegativity = 1.9;
            firstIonizationEnergy = 787;
            oxidationStates = new int[]{-4, 2, 4};
        }
        //Phosphorus
        else if (AtomicNumber == 15) {
            this.AtomicNumber = AtomicNumber;
            symbol = "P";
            name = "Phosphorus";
            AtomicWeight = 30.97376;
            numberOfProtons = AtomicNumber;
            radius = 109;
            electronegativity = 2.2;
            firstIonizationEnergy = 1012;
            oxidationStates = new int[]{-3, 3, 5};
        }
        //Sulfur
        else if (AtomicNumber == 16) {
            this.AtomicNumber = AtomicNumber;
            symbol = "S";
            name = "Sulfur";
            AtomicWeight = 32.065;
            numberOfProtons = AtomicNumber;
            radius = 104;
            electronegativity = 2.6;
            firstIonizationEnergy = 1000;
            oxidationStates = new int[]{-2, 4, 6};
        }
        //Chlorine
        else if (AtomicNumber == 17) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Cl";
            name = "Chlorine";
            AtomicWeight = 35.45;
            numberOfProtons = AtomicNumber;
            radius = 100;
            electronegativity = 3.2;
            firstIonizationEnergy = 1251;
            oxidationStates = new int[]{-1, 1, 5, 7};
        }
        //Argon
        else if (AtomicNumber == 18) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ar";
            name = "Argon";
            AtomicWeight = 39.948;
            numberOfProtons = AtomicNumber;
            radius = 101;
            electronegativity = 0;
            firstIonizationEnergy = 1521;
            oxidationStates = new int[]{0};
        }
        //Potassium
        else if (AtomicNumber == 19) {
            this.AtomicNumber = AtomicNumber;
            symbol = "K";
            name = "Potassium";
            AtomicWeight = 39.0983;
            numberOfProtons = AtomicNumber;
            radius = 200;
            electronegativity = 0.8;
            firstIonizationEnergy = 419;
            oxidationStates = new int[]{1};
        }
        //Calcium
        else if (AtomicNumber == 20) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ca";
            name = "Calcium";
            AtomicWeight = 40.08;
            numberOfProtons = AtomicNumber;
            radius = 174;
            electronegativity = 1.0;
            firstIonizationEnergy = 590;
            oxidationStates = new int[]{2};
        }
        //Scandium
        else if (AtomicNumber == 21) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Sc";
            name = "Scandium";
            AtomicWeight = 44.9559;
            numberOfProtons = AtomicNumber;
            radius = 159;
            electronegativity = 1.4;
            firstIonizationEnergy = 633;
            oxidationStates = new int[]{3};
        }
        //Titanium
        else if (AtomicNumber == 22) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ti";
            name = "Titanium";
            AtomicWeight = 47.867;
            numberOfProtons = AtomicNumber;
            radius = 148;
            electronegativity = 1.5;
            firstIonizationEnergy = 659;
            oxidationStates = new int[]{2, 3, 4};
        }
        //Vanadium
        else if (AtomicNumber == 23) {
            this.AtomicNumber = AtomicNumber;
            symbol = "V";
            name = "Vanadium";
            AtomicWeight = 50.9415;
            numberOfProtons = AtomicNumber;
            radius = 144;
            electronegativity = 1.6;
            firstIonizationEnergy = 651;
            oxidationStates = new int[]{2, 3, 4, 5};
        }
        //Chromium
        else if (AtomicNumber == 24) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Cr";
            name = "Chromium";
            AtomicWeight = 51.996;
            numberOfProtons = AtomicNumber;
            radius = 130;
            electronegativity = 1.7;
            firstIonizationEnergy = 563;
            oxidationStates = new int[]{2, 3, 6};
        }
        //Manganese
        else if (AtomicNumber == 25) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Mn";
            name = "Manganese";
            AtomicWeight = 54.9380;
            numberOfProtons = AtomicNumber;
            radius = 129;
            electronegativity = 1.6;
            firstIonizationEnergy = 717;
            oxidationStates = new int[]{2, 3, 4, 7};
        }
        //Iron
        else if (AtomicNumber == 26) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Fe";
            name = "Iron";
            AtomicWeight = 55.845;
            numberOfProtons = AtomicNumber;
            radius = 124;
            electronegativity = 1.6;
            firstIonizationEnergy = 717;
            oxidationStates = new int[]{2, 3};
        }
        //Cobalt
        else if (AtomicNumber == 27) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Co";
            name = "Cobalt";
            AtomicWeight = 58.9332;
            numberOfProtons = AtomicNumber;
            radius = 118;
            electronegativity = 1.9;
            firstIonizationEnergy = 760;
            oxidationStates = new int[]{2, 3};
        }

        //Nickel
        else if (AtomicNumber == 28) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ni";
            name = "Nickel";
            AtomicWeight = 58.693;
            numberOfProtons = AtomicNumber;
            radius = 117;
            electronegativity = 1.9;
            firstIonizationEnergy = 737;
            oxidationStates = new int[]{2, 3};
        }
        //Copper
        else if (AtomicNumber == 29) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Cu";
            name = "Copper";
            AtomicWeight = 63.546;
            numberOfProtons = AtomicNumber;
            radius = 122;
            electronegativity = 1.9;
            firstIonizationEnergy = 745;
            oxidationStates = new int[]{1, 2};
        }
        //Zinc
        else if (AtomicNumber == 30) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Zn";
            name = "Zinc";
            AtomicWeight = 65.409;
            numberOfProtons = AtomicNumber;
            radius = 120;
            electronegativity = 1.7;
            firstIonizationEnergy = 906;
            oxidationStates = new int[]{2};
        }
        //Gallium
        else if (AtomicNumber == 31) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ga";
            name = "Gallium";
            AtomicWeight = 69.723;
            numberOfProtons = AtomicNumber;
            radius = 123;
            electronegativity = 1.8;
            firstIonizationEnergy = 579;
            oxidationStates = new int[]{3};
        }
        //Germanium
        else if (AtomicNumber == 32) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Ge";
            name = "Germanium";
            AtomicWeight = 72.64;
            numberOfProtons = AtomicNumber;
            radius = 120;
            electronegativity = 2.0;
            firstIonizationEnergy = 762;
            oxidationStates = new int[]{2, 4};
        }
        //Arsenic
        else if (AtomicNumber == 33) {
            this.AtomicNumber = AtomicNumber;
            symbol = "As";
            name = "Arsenic";
            AtomicWeight = 74.9216;
            numberOfProtons = AtomicNumber;
            radius = 120;
            electronegativity = 2.2;
            firstIonizationEnergy = 944;
            oxidationStates = new int[]{-3, 3, 5};
        }
        //Selenium
        else if (AtomicNumber == 34) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Se";
            name = "Selenium";
            AtomicWeight = 78.96;
            numberOfProtons = AtomicNumber;
            radius = 118;
            electronegativity = 2.6;
            firstIonizationEnergy = 941;
            oxidationStates = new int[]{-2, 4, 6};
        }
        //Bromine
        else if (AtomicNumber == 35) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Br";
            name = "Bromine";
            AtomicWeight = 79.904;
            numberOfProtons = AtomicNumber;
            radius = 117;
            electronegativity = 3.0;
            firstIonizationEnergy = 1140;
            oxidationStates = new int[]{-1, 1, 5};
        }
        //Krypton
        else if (AtomicNumber == 36) {
            this.AtomicNumber = AtomicNumber;
            symbol = "Kr";
            name = "Krypton";
            AtomicWeight = 83.798;
            numberOfProtons = AtomicNumber;
            radius = 116;
            electronegativity = 0;
            firstIonizationEnergy = 1351;
            oxidationStates = new int[]{0, 2};
        }



        mass = AtomicWeight * 1.66e-27;

    }

}
