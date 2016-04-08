
/**
 * Java object representing a Vector in a 3D space
 * Created for my Math 126 Online class
 * 
 * @author Charlie Mihran
 *
 */
public class Vector {

    /**
     * x component of Vector
     */
    private int x;

    /**
     * y component of Vector
     */
    private int y;

    /**
     * z component of Vector
     */
    private int z;

    /* ----- CONSTRUCTORS ----- */

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
     *            component of vector, as int
     * @param y
     *            component of vector, as int
     * @param z
     *            component of vector, as int
     */
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets the x component of this Vector
     * 
     * @return int value for x component
     */
    public int getX() {
        return x;
    }

    /* ----- GETTERS ----- */

    /**
     * Gets the y component of this Vector
     * 
     * @return int value for y component
     */
    public int getY() {
        return y;
    }

    /**
     * Gets the z component of this Vector
     * 
     * @return int value for z component
     */
    public int getZ() {
        return z;
    }

    /* ----- METHODS ----- */

    /**
     * Calculates the magnitude of this vector
     * 
     * The magnitude of a 3D vector is defined as:
     * sqrt(x^2 + y^2 + z^2)
     * 
     * @return int representing the magnitude of the vector
     */
    public double magnitude() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)
                + Math.pow(this.z, 2));
    }

    /**
     * Creates a new Vector by adding this Vector and a given Vector
     * 
     * For two vectors A and B, A+B is defined as:
     * < Ax + Bx, Ay + By, Az + Bz >
     * 
     * @param o
     *            other vector to add with
     * @return new vector that is the sum of the given two vectors
     */
    public Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y, this.z + o.z);
    }

    /**
     * Creates a new Vector by subtracting the given vector from this vector
     * 
     * For two vectors A and B, A-B is defined as:
     * < Ax - Bx, Ay - By, Az - Bz >
     * 
     * @param o
     *            other vector to be subtracted
     * @return new vector the is the difference of the two given vectors
     */
    public Vector subtract(Vector o) {
        return this.add(o.multiply(-1));
    }

    /**
     * Create a new Vector that is multiplied by a given scalar
     * 
     * For a vector A and a scalar s, s*A is defined as:
     * < s*Ax, s*Ay, s*Az >
     * 
     * @param scalar
     *            int to multiply this vector by
     * @return new Vector with components multiplied by the given scalar
     */
    public Vector multiply(int scalar) {
        return new Vector(scalar * this.x, scalar * this.y, scalar * this.z);
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
     * @return int representing the dot product
     */
    public int dotProduct(Vector o) {
        return (this.x * o.x) + (this.y * o.y) + (this.z * o.z);
    }

    /**
     * Finds the cross product of this vector and a given vector
     * The cross product is vector orthogonal to both given vectors
     * 
     * For two vectors A and B, the dot product is defined as:
     * < (Ay * Bz) - (Az * By), -[(Az * Bx) - (Ax * Bz)], (Ax * By) - (Ay * Bx)
     * >
     * 
     * @param o
     *            other vector for cross product to be calculated with
     * 
     * @return Vector orthogonal to both given vectors, the cross product
     */
    public Vector crossProduct(Vector o) {
        return new Vector(
                (this.y * o.z) - (this.z * o.y),
                (-1) * ((this.x * o.z) - (this.z * o.x)),
                (this.x * o.y) - (this.y * o.x));
    }

    /**
     * Finds the angle, in degrees, between this Vector and another one
     * 
     * @param o
     *            other vector to find the angle between
     * 
     * @return double representing the angle between this Vector and the given
     *         one, in degrees
     */
    public double angleBetween(Vector o) {
        double angle = this.dotProduct(o) / (this.magnitude() * o.magnitude());
        return Math.toDegrees(Math.acos(angle));
    }

    /**
     * Gets the String representation of the Vector, in the form of:
     * < x, y, z >
     * where x, y, and z are the int components of this vector
     * 
     * @return String representing Vector < x, y, z >
     */
    public String toString() {
        return "< " + this.x + ", " + this.y + ", " + this.z + " >";
    }
}
