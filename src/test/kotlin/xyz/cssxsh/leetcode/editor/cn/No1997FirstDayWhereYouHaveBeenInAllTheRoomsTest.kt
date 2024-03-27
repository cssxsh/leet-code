package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1997FirstDayWhereYouHaveBeenInAllTheRoomsTest : AbstractSolutionTest() {

    override val solution = No1997FirstDayWhereYouHaveBeenInAllTheRooms.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.firstDayBeenInAllRooms(nextVisit = intArrayOf(0, 0))
        )
        Assertions.assertEquals(
            6,
            solution.firstDayBeenInAllRooms(nextVisit = intArrayOf(0, 0, 2))
        )
        Assertions.assertEquals(
            6,
            solution.firstDayBeenInAllRooms(nextVisit = intArrayOf(0, 1, 2, 0))
        )
        Assertions.assertEquals(
            409272772,
            solution.firstDayBeenInAllRooms(
                nextVisit = intArrayOf(
                    0,
                    0,
                    1,
                    2,
                    4,
                    0,
                    1,
                    6,
                    0,
                    0,
                    2,
                    3,
                    4,
                    3,
                    4,
                    11,
                    6,
                    0,
                    16,
                    14,
                    20,
                    16,
                    9,
                    9,
                    1,
                    8,
                    8,
                    4,
                    14,
                    13,
                    5,
                    12,
                    8,
                    18,
                    27,
                    34,
                    36,
                    13,
                    10,
                    35,
                    13,
                    31,
                    13,
                    29,
                    2,
                    45,
                    17,
                    30,
                    10,
                    18,
                    41,
                    14,
                    41,
                    22,
                    2,
                    4,
                    1,
                    15,
                    27,
                    35,
                    12,
                    10,
                    46,
                    25,
                    61,
                    8,
                    65,
                    57,
                    48,
                    61,
                    8,
                    35,
                    2,
                    66,
                    47,
                    5,
                    54,
                    76,
                    73,
                    51,
                    13,
                    64,
                    15,
                    2
                )
            )
        )
    }
}