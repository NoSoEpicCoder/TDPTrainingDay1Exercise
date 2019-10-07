import static org.junit.jupiter.api.Assertions.*;

class StringExerciseTest {

    @org.junit.jupiter.api.Test
    void testCount() {
        assertEquals(3, StringExercise.count('l', "Hello world"));
        assertEquals(0, StringExercise.count('a', "Testing testing"));
        assertEquals(2, StringExercise.count('e', "Gre@t exampl3"));
    }

    @org.junit.jupiter.api.Test
    void testReplace() {
        assertEquals("b0nj0ur", StringExercise.replace("bonjour", 'o', '0'));
        assertEquals("aaaa - tvtvt - ssss", StringExercise.replace("aaaa - twtwt - ssss", 'w', 'v'));
        assertEquals("John_Doe", StringExercise.replace("John Doe", ' ', '_'));
    }

    @org.junit.jupiter.api.Test
    void testIsHeteroPair() {
        assertTrue(StringExercise.isHeteroPair("TERRY", "FOX"));
        assertTrue(StringExercise.isHeteroPair("ROB", "KYLE"));
        assertFalse(StringExercise.isHeteroPair("JACKSON", "BALL"));
        assertFalse(StringExercise.isHeteroPair("WAYNE", "GRETZKY"));
    }
}