package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import demo.App;

public class AppTest {
  @Test
  public void addtest() {
	  int a =20;
	  int b=20;
	  int exp =40;
	  App ap =  new App();
	  int act = ap.add(a, b);
	  Assert.assertEquals(act, exp);
	  
  }
}
