import dayone.DayOne

object AdventOfCode {
    @JvmStatic
    fun main(args: Array<String>) {
        dayOne()
    }

    private fun dayOne() {
        val dayOne = DayOne()

        println(dayOne.partOne())
        println(dayOne.partTwo())
    }
}
