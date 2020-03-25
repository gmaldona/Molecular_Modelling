package MoleculeKit;

public class Electron {

    //Principal, Angular Momentum, Magnetic, spin
    int n, l, m, s;
    String key;

    public Electron(int energyLevel, String subshell) {

        n = energyLevel;

        if (subshell == "s") { l = 0; }
        else if (subshell == "p") { l = 1; }
        else if (subshell == "d") { l = 2; }
        else if (subshell == "f") { l = 3; }


        //s = spin;

    }

    public void returnQuantumNumbers() {

        System.out.println("Principal Quantum Number: " + n);
        System.out.println("Angular Momentum: " + l);
        System.out.println("Magnetic Quantum Number: " + m);
        System.out.print("Spin: ");
        if (s == 1) { System.out.println("+" + s); }
        else { System.out.println(s); }

    }

}
