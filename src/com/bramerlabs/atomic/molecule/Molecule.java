package com.bramerlabs.atomic.molecule;

import java.util.ArrayList;

public class Molecule {

    // the amount of atoms in this atom
    private int numAtoms;

    // the atoms in this atom
    private ArrayList<Atom> atoms;

    // matrices containing the bonds and bond orders;
    private int[][] bonds;
    private int[][] bondOrders;

    /**
     * constructor for specified list of atoms
     * @param atoms - list of atoms
     */
    public Molecule(ArrayList<Atom> atoms) {
        this.numAtoms = atoms.size();
        this.atoms = atoms;
        this.bonds = new int[numAtoms][numAtoms];
    }

}
