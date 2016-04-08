
public class VectorTest {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 0, 0);
        Vector v2 = new Vector(0, 1, 0);
        testVectors(v1, v2);

        Vector v3 = new Vector(5, 4, -1);
        Vector v4 = new Vector(2, 7, 9);
        testVectors(v3, v4);
    }

    public static void testVectors(Vector v1, Vector v2) {
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("v1 plus v2: " + v1.add(v2));
        System.out.println("v1 minus v2: " + v1.subtract(v2));
        System.out.println("v2 mult by 2: " + v2.multiply(2));
        System.out.println("Dot Product: " + v1.dotProduct(v2));
        System.out.println("Cross Product: " + v1.crossProduct(v2));
        System.out.println("Angle Between: " + v1.angleBetween(v2));
        System.out.println();
    }
}
