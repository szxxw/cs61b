package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesPlus() {
        IntList lst = IntList.of(1, 4, 6, 8);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1 -> 4 -> 6 -> 8", lst.toString());
        assertFalse(changed);

    }

    @Test
    public void testSquarePrimesTest1() {
        IntList lst = IntList.of(2, 3, 5, 7);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 25 -> 49", lst.toString());
        assertTrue(changed);


    }

    @Test
    public void testSquarePrimesTest2() {
        IntList lst = IntList.of(1);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("1", lst.toString());
        assertFalse(changed);
    }


    @Test
    public void testSquarePrimesEmpty() {
        IntList lst = null;
        boolean changed = IntListExercises.squarePrimes(lst);
        assertFalse(changed);
    }
}


