package com.bramerlabs.atomic.math;

public class Vector3f {

    // the x, y, z components of the vector - defaulted to (0, 0, 0) in constructor
    private float x, y, z;

    /**
     * constructor for 3 specified floats
     * @param x - x component of vector
     * @param y - y component of vector
     * @param z - z component of vector
     */
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * constructor for array of floats
     * @param p - an array of floats representing the position as [x, y, z]. Constructor will automatically set
     *          default value if no value is present.
     */
    public Vector3f(float[] p) {
        this.x = p.length > 0 ? p[0] : 0;
        this.y = p.length > 1 ? p[1] : 0;
        this.z = p.length > 2 ? p[2] : 0;
    }

    /**
     * getter method
     * @return - x component of this vector
     */
    public float x() {
        return this.x;
    }

    /**
     * getter method
     * @return - y component of this vector
     */
    public float y() {
        return this.y;
    }

    /**
     * getter method
     * @return - z component of this vector
     */
    public float z() {
        return this.z;
    }

}
