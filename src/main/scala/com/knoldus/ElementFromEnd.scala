package com.knoldus

class ElementFromEnd {
  def getElementKFromEnd[A](list: List[A], endIndex: Int): A = {
    val sizeOfList = list.size
    endIndex match {
      case index => if (index >= 0 && index < sizeOfList) list(sizeOfList - endIndex)
      else throw new IllegalArgumentException("Invalid Index!")
    }
  }
}
