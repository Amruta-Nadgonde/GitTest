package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import demo.App;

public class AppTest {
  @Test
  public void addtest() {
	  int a =10;
	  int b=10;
	  int exp =20;
	  App ap =  new App();
	  int act = ap.add(a, b);
	  Assert.assertEquals(act, exp);
	  
  }
}
