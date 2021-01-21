package com.gfjalar.test_util;

import org.mockito.Mockito;
import org.mockito.stubbing.Stubber;

public class MockitoShim {
  public static Stubber doReturnSingleObject(Object toBeReturned) {
    return Mockito.doReturn(toBeReturned);
  }
}
