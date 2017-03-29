package com.githubauto.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
  @Test
  public void testListSizeEmpty() {
    List<String> names = new ArrayList<>();
    
    Assert.assertEquals(0, names.size());
  } 
   @Test
   public void testListSize() {
     List<String> names = new ArrayList<>();
     names.add("james");
     Assert.assertEquals(1, names.size());
  }
}
