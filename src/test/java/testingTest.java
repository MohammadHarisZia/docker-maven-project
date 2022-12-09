import static org.junit.jupiter.api.Assertions.*;

class testingTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(4, testing.add(2, 2));
    }
    
    @org.junit.jupiter.api.Test
    void mul() {
        assertAll(() -> assertEquals(4, testing.multiply(2, 2)),
                () -> assertEquals(-4, testing.multiply(2, -2)),
                () -> assertEquals(4, testing.multiply(-2, -2)),
                () -> assertEquals(0, testing.multiply(1, 0)),
                () -> assertEquals(0, testing.multiply(1, 0))

        );
    }
    
    @org.junit.jupiter.api.Test
    void div() {
        assertAll(() -> assertEquals(1, testing.divide(2, 2)),
                () -> assertEquals(-1, testing.divide(2, -2)),
                () -> assertEquals(1, testing.divide(-2, -2))
        );

    }
    

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(0, testing.minus(2, 2));
    }
}
