package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1760MinimumLimitOfBallsInABagTest : AbstractSolutionTest() {

    override val solution = No1760MinimumLimitOfBallsInABag.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.minimumSize(nums = intArrayOf(9), maxOperations = 2)
        )
        Assertions.assertEquals(
            2,
            solution.minimumSize(nums = intArrayOf(2, 4, 8, 2), maxOperations = 4)
        )
        Assertions.assertEquals(
            129,
            solution.minimumSize(
                nums = intArrayOf(
                    431, 922, 158, 60, 192, 14, 788, 146, 788, 775, 772, 792, 68,
                    143, 376, 375, 877, 516, 595, 82, 56, 704, 160, 403, 713, 504, 67, 332, 26
                ),
                maxOperations = 80
            )
        )
        Assertions.assertEquals(
            499,
            solution.minimumSize(
                nums = intArrayOf(
                    988,
                    289,
                    805,
                    241,
                    930,
                    954,
                    202,
                    399,
                    179,
                    248,
                    651,
                    898,
                    914,
                    656,
                    213,
                    716,
                    44,
                    541,
                    366,
                    963,
                    12,
                    258,
                    631,
                    26,
                    210,
                    286,
                    984,
                    10,
                    585,
                    173,
                    582,
                    700,
                    322,
                    539,
                    181,
                    260,
                    7,
                    265,
                    594,
                    593,
                    56,
                    113,
                    351,
                    363,
                    761,
                    503,
                    504,
                    321,
                    983,
                    253,
                    205,
                    327,
                    869,
                    408,
                    301,
                    1000,
                    608,
                    723,
                    277,
                    240,
                    367,
                    19,
                    15,
                    517,
                    190,
                    782,
                    397,
                    150,
                    9,
                    341,
                    362,
                    359,
                    806,
                    794,
                    741,
                    360,
                    505,
                    506,
                    383,
                    523,
                    951,
                    583,
                    621,
                    828,
                    857,
                    869,
                    251,
                    196,
                    481,
                    675,
                    295,
                    957,
                    844,
                    648,
                    129,
                    455,
                    73,
                    997,
                    458,
                    142,
                    423,
                    668,
                    584,
                    746,
                    284,
                    900,
                    594,
                    635,
                    793,
                    120,
                    477,
                    883,
                    678,
                    683,
                    318,
                    678,
                    762,
                    899,
                    224,
                    506,
                    37,
                    832,
                    467,
                    673,
                    298,
                    60,
                    726,
                    177,
                    39,
                    633,
                    405,
                    156,
                    596,
                    55,
                    226,
                    296,
                    195,
                    944,
                    807,
                    441,
                    545,
                    166,
                    505,
                    665,
                    215,
                    285,
                    772,
                    981,
                    677,
                    112,
                    886,
                    404,
                    913,
                    855,
                    401,
                    641,
                    166,
                    788,
                    827,
                    840,
                    250,
                    894,
                    253,
                    99,
                    448,
                    661,
                    358,
                    975,
                    681,
                    448,
                    868,
                    641,
                    495,
                    87,
                    510,
                    804,
                    651,
                    168,
                    611,
                    422,
                    794,
                    396,
                    311,
                    754,
                    950,
                    156,
                    626,
                    32
                ),
                maxOperations = 95
            )
        )
    }
}