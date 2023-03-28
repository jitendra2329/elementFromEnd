package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class ElementFromEndTest extends AnyFlatSpec {
  val elementFromEnd = new ElementFromEnd

  it should "return the 2nd element from the end of the list " in {
    val actualResult = elementFromEnd.getElementKFromEnd[Int](List(2, 3, 5, 8, 9, 2, 12, 10, 54), 2)
    val expectedResult = 10
    assert(actualResult == expectedResult)
  }

  it should "return the 3rd element from the end of the list " in {
    val actualResult = elementFromEnd.getElementKFromEnd[String](List("Jitendra", "Manish", "Himanshu", "Ravi", "Naman"), 3)
    val expectedResult = "Himanshu"
    assert(actualResult == expectedResult)
  }

  it should "return the 5th element from the end of the list " in {
    val actualResult = elementFromEnd.getElementKFromEnd[Double](List(3.5, 9343.1, 34.23, 49.54, 232.393, 4098.340), 5)
    val expectedResult = 9343.1
    assert(actualResult == expectedResult)
  }

  it should "throw an IllegalArgumentException, as index is less than 0" in {
    an[IllegalArgumentException] should be thrownBy {
      elementFromEnd.getElementKFromEnd[Double](List(3.5, 9343.1, 34.23, 49.54, 232.393, 4098.340), -1)
    }
  }

  it should "throw an IllegalArgumentException, as index is greater than the size of list" in {
    an[IllegalArgumentException] should be thrownBy {
      elementFromEnd.getElementKFromEnd[Double](List(3.5, 9343.1, 34.23, 49.54, 232.393, 4098.340), 6)
    }
  }
}
