package pattern4.two_pointers

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class TwoPointersTest {

    @Test
    fun remove() {
        val arr = intArrayOf(2, 3, 3, 3, 6, 9, 9)
        assertEquals(4, TwoPointers.remove(arr).toLong())
    }

    @Test
    fun removeElement() {
        val arr = intArrayOf(3, 2, 3, 6, 3, 10, 9, 3)
        assertEquals(4, TwoPointers.remove(arr, 3).toLong())
    }

    @Test
    fun makeSquares() {
        val arr = intArrayOf(-2, -1, 0, 2, 3)
        assertTrue(intArrayOf(0, 1, 4, 4, 9).contentEquals(TwoPointers.makeSquares(arr)));
    }

}