package pattern4.two_pointers

object TwoPointers {
    /**
     * Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once.
     *
     * @param arr
     * @return
     */
    @JvmStatic
    fun remove(arr: IntArray): Int {
        // [2, 3, 3, 3, 6, 9, 9]
        var nextNonDuplicate = 0 // index of the next non-duplicate element
        for (i in arr.indices) {
            val key = arr[nextNonDuplicate]
            nextNonDuplicate = getNextNonDuplicate(arr, nextNonDuplicate, i, key)
        }
        return nextNonDuplicate
    }

    /**
     * Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array
     *
     * @param arr
     * @param key
     * @return
     */
    @JvmStatic
    fun remove(arr: IntArray, key: Int): Int {
        var nextElement = 0 // index of the next element which is not 'key'
        for (i in arr.indices) {
            nextElement = getNextNonDuplicate(arr, nextElement, i, key)
        }
        return nextElement
    }

    /**
     *  Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
     */
    @JvmStatic
    fun makeSquares(arr: IntArray): IntArray {

        var negativeIndex = 0
        var positiveIndex = arr.size - 1
        var highestSquareIndex = arr.size - 1
        val squares = IntArray(arr.size);

        while (negativeIndex < positiveIndex) {

            val leftSquare = arr[negativeIndex] * arr[negativeIndex]
            val rightSquare = arr[positiveIndex] * arr[positiveIndex]

            if (leftSquare > rightSquare) {
                squares[highestSquareIndex--] = leftSquare;
                negativeIndex++
            } else {
                squares[highestSquareIndex--] = rightSquare;
                positiveIndex--
            }
        }
        return squares;
    }

    private fun getNextNonDuplicate(arr: IntArray, nextNonDuplicate: Int, i: Int, key: Int): Int {
        var nextNonDuplicate = nextNonDuplicate
        if (arr[i] != key) {
            arr[nextNonDuplicate] = arr[i]
            nextNonDuplicate++
        }
        return nextNonDuplicate
    }


}