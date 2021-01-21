package com.gfjalar.test_util.mockito

import com.gfjalar.test_util.MockitoShim

import org.mockito.stubbing.Stubber
import org.scalatestplus.mockito.MockitoSugar

trait CustomMockitoSugar extends MockitoSugar {
  def doReturn(toBeReturned: Any): Stubber = {
    MockitoShim.doReturnSingleObject(toBeReturned)
  }
}
