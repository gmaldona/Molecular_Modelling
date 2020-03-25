package MoleculeKit;

public class Bond {

    Atom atom1, atom2;
    int numberOfBonds;

    public Bond(Atom atom1, Atom atom2) {

        numberOfBonds = 1;
        this.atom1 = atom1;
        this.atom2 = atom2;

    }

    public void addBond() { numberOfBonds++; }

    private double getBondPolarity() { return Math.abs(atom1.electronegativity - atom2.electronegativity); }

}
