
/**
 * Java object representing a Vector in a 3D space
 * 
 * @author Charlie Mihran
 *
 */
public class Vector {
    /**
     * x component of Vector
     */
    private double x;

    /**
     * y component of Vector
     */
    private double y;

    /**
     * z component of Vector
     */
    private double z;

    /**
     * Constructs a new Vector with 0 for x, y, and z components
     */
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Constructs a new Vector with the given components
     * 
     * @param x
     *            component of vector, as double
     * @param y
     *            component of vector, as double
     * @param z
     *            component of vector, as double
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Calculates the magnitude of this vector
     * 
     * The magnitude of a 3D vector is defined as:
     * sqrt(x^2 + y^2 + z^2)
     * 
     * @return double representing the magnitude of the vector
     */
    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    /**
     * Given another vector, finds a scalar quantity known as the dot product
     * 
     * For two vectors A and B, the dot product is defined as:
     * (Ax * Bx) + (Ay + By) + (Cx * Cy)
     * 
     * @param o
     *            other vector for dot product to be calculated with
     * 
     * @return double representing the dot product
     */
    public double dotProduct(Vector o) {
        return this.x * o.x + this.y + o.y + this.z + o.z;
    }

    /**
     * Finds the cross product of this vector and a given vector
     * The cross product is vector orthogonal to both given vectors
     * 
     * For two vectors A and B, the dot product is defined as:
     * < (Ay * Bz) - (Az * By), (Az * Bx) - (Ax * Bz), (Ax * By) - (Ay * Bx) >
     * 
     * @param o
     *            other vector for cross product to be calculated with
     * 
     * @return Vector orthogonal to both given vectors, the cross product
     */
    public Vector crossProduct(Vector o) {
        return new Vector(
                (this.y * o.z) - (this.z * o.y),
                (this.z * o.x) - (this.x * o.z),
                (this.x * o.y) - (this.y * o.x));
    }
}
