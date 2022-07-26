package pattern4.two_pointers

import org.junit.Test

import org.junit.Assert.*

class RemoveDuplicatesTest {

    @Test
    fun remove() {
        val arr = intArrayOf(2, 3, 3, 3, 6, 9, 9)
        assertEquals(4, RemoveDuplicates.remove(arr).toLong())
    }

    @Test
    fun removeElement() {
        val arr = intArrayOf(3, 2, 3, 6, 3, 10, 9, 3)
        assertEquals(4, RemoveDuplicates.remove(arr, 3).toLong())
    }

}