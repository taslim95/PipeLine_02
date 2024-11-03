package Org;

import org.testng.annotations.Test;

public class Organization {
      
		@Test (groups = "smoke")
		public void Mtest() {
		   System.out.println("Org Smoke Testing..");
		}
	
	   
		@Test (groups = "regression")
		public void Rtest() {
			System.out.println("Org Regression Testing..");
		}
} 
