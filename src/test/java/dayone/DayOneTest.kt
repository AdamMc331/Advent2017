package dayone

import org.junit.Assert.*
import org.junit.Test

class DayOneTest {
    private val dayOne = DayOne()

    @Test
    fun testPartOneTwoMatches() {
        assertEquals(3, dayOne.partOne("1122"))
    }

    @Test
    fun testPartOneAllMatchWithWrap() {
        assertEquals(4, dayOne.partOne("1111"))
    }

    @Test
    fun testPartOneNoMatches() {
        assertEquals(0, dayOne.partOne("1234"))
    }

    @Test
    fun testPartOneWithWrap() {
        assertEquals(9, dayOne.partOne("91212129"))
    }

    @Test
    fun testPartTwoAllMatches() {
        assertEquals(6, dayOne.partTwo("1212"))
        assertEquals(12, dayOne.partTwo("123123"))
    }

    @Test
    fun testPartTwoNoMatches() {
        assertEquals(0, dayOne.partTwo("1221"))
    }

    @Test
    fun testPartTwoOneMatch() {
        assertEquals(4, dayOne.partTwo("123425"))
    }

    @Test
    fun testPartTwoAlternatingMatches() {
        assertEquals(4, dayOne.partTwo("12131415"))
    }
}