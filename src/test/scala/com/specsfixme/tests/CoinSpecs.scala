package com.specsfixme.tests

import org.specs2._
import com.specsfixme.Coins

class CoinSpecs extends Specification { def is = s2"""

  Find the minimum number of coins for a value X given a list of denominations.

  Denominations: [1], Value: 12, Expected: 12             ${coins(List(1), 12, 12).find}
  Denominations: [1, 2, 3], Value: 6, Expected: 2         ${coins(List(1, 2, 3), 6, 2).find}
  Denominations: [1, 3, 4], Value: 6, Expected: 2         ${coins(List(1, 3, 4), 6, 2).find}
  Denominations: [4, 3, 1], Value: 6, Expected: 2         ${coins(List(4, 3, 1), 6, 2).find}
  Denominations: [1, 5, 10, 25], Value: 41, Expected: 4   ${coins(List(1, 5, 10, 25), 41, 4).find}
  Denominations: [1, 4, 5, 15], Value: 8, Expected: 2     ${coins(List(1, 4, 5, 15), 8, 2).find}
  Denominations: [15, 1, 5, 4], Value: 8, Expected: 2     ${coins(List(15, 1, 5, 4), 8, 2).find}
"""
  
  case class coins(override val denominations: List[Int],
                   override val value: Int,
                   override val expected: Int) extends context
  
  trait context  {
    def denominations: List[Int]
    def value: Int
    def expected: Int
    def find = Coins.findMin(denominations, value) must beEqualTo(expected)
  }

}
