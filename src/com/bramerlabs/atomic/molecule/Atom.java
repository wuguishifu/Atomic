package com.bramerlabs.atomic.molecule;

public class Atom {

    // the cartesian coordinate of this atom - default (0, 0, 0)
    private float x, y, z;

    // data regarding the identity of the atom - default Hydrogen atom
    private int atomicNumber = 1;
    private int charge = 0;
    private int neutrons = 0;

    /**
     * default constructor for some position (x, y, z)
     * @param x - the x position
     * @param y - the y position
     * @param z - the z position
     */
    public Atom(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * constructor for float array of position and float array of identity
     * @param position - a float array containing the position as [x, y, z] - constructor will automatically
     *                 take the first 3 or fewer data points and assign them accordingly
     * @param identity - an int array containing the identity of the atom as [atomicNumber, charge, neutrons] -
     *                 must have at least 3 values, all values after that will be ignored
     */
    public Atom(float[] position, int[] identity) {
        x = position.length > 1 ? position[0] : 0.0f;
        y = position.length > 2 ? position[1] : 0.0f;
        z = position.length > 3 ? position[2] : 0.0f;
        this.atomicNumber = identity[0];
        this.charge = identity[1];
        this.neutrons = identity[2];
    }

    /**
     * constructor for specified position and identity
     * @param x - the x position
     * @param y - the y position
     * @param z - the z position
     * @param atomicNumber - the atomic number of the atom
     * @param charge - the charge of the atom
     * @param neutrons - the amount of neutrons the atom has
     */
    public Atom(float x, float y, float z, int atomicNumber, int charge, int neutrons) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.atomicNumber = atomicNumber;
        this.charge = charge;
        this.neutrons = neutrons;
    }

    /**
     * constructor for specified position and identity excluding isotope
     * @param x - the x position
     * @param y - the y position
     * @param z - the z position
     * @param atomicNumber - the atomic number of the atom
     * @param charge - the charge of the atom
     */
    public Atom(float x, float y, float z, int atomicNumber, int charge) {
        this(x, y, z, atomicNumber, charge, 0 /* get neutron number from AtomicData here - temp value 0*/);

    }
}
