import static org.junit.jupiter.api.Assertions.*;

class LaskinTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, Laskin.add(2, 3));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(2, Laskin.subtract(5, 3));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(6, Laskin.multiply(2, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, Laskin.divide(6, 3));
    }

    @org.junit.jupiter.api.Test
    void main() {
        // This test is not needed
    }
}