package com.gfjalar.test_util.mockito

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest._

@RunWith(classOf[JUnitRunner])
class CustomMockitoSugarTest extends WordSpecLike with Matchers with CustomMockitoSugar {
  "CustomMockitoSugar" should {
    "be able to return a constant value with doReturn" in {
      val sample = mock[Sample]
      doReturn("foo").when(sample).method

      sample.method should equal ("foo")
      sample.method should equal ("foo")
      sample.method should equal ("foo")
    }
  }

  trait Sample {
    def method: String
  }
}
