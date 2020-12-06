package com.bramerlabs.atomic.molecule;

import java.util.ArrayList;

public class Molecule {

    // the amount of atoms in this atom
    private int numAtoms;

    // the atoms in this atom
    private ArrayList<Atom> atoms;

    // a matrix representing the bond and bond orders
    // 0's represent no bond present, 1s represent presence of bonds
    // 1, 2, 3, represent single, double, and triple bonds, respectively
    private int[][] bonds;

    // an ArrayList containing the positions of the
    private ArrayList<float[]> positions;

    /**
     * constructor for specified list of atoms and bonds
     * @param atoms - list of atoms
     * @param bonds - a matrix representing the bonds in the molecule
     */
    public Molecule(ArrayList<Atom> atoms, int[][] bonds) {
        this.atoms = atoms;
        this.numAtoms = atoms.size();
        this.bonds = bonds;
    }

    /**
     * constructor for specified list of atoms
     * @param atoms - list of atoms
     */
    public Molecule(ArrayList<Atom> atoms) {
        this.atoms = atoms;
        this.numAtoms = atoms.size();
        bonds = new int[numAtoms][numAtoms];

        // fill the bonds matrix with 0's
        for (int i = 0; i < numAtoms; i++) {
            for (int j = 0; j < numAtoms; j++) {
                bonds[i][j] = 0;
            }
        }
    }


}
