package dayone

import org.junit.Assert.*
import org.junit.Test

class DayOneTest {
    private val dayOne = DayOne()

    @Test
    fun testPartOne() {
        assertEquals(3, dayOne.partOne("1122"))
        assertEquals(4, dayOne.partOne("1111"))
        assertEquals(0, dayOne.partOne("1234"))
        assertEquals(9, dayOne.partOne("91212129"))
    }

    @Test
    fun testPartTwo() {
        assertEquals(6, dayOne.partTwo("1212"))
        assertEquals(0, dayOne.partTwo("1221"))
        assertEquals(4, dayOne.partTwo("123425"))
        assertEquals(12, dayOne.partTwo("123123"))
        assertEquals(4, dayOne.partTwo("12131415"))
    }
}