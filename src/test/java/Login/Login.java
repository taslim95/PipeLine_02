package Login;

import org.testng.annotations.Test;

public class Login {
      
		@Test (groups = "smoke")
		public void Mtest() {
		   System.out.println("Login Smoke Testing..");
		}
	
	   
		@Test (groups = "regression")
		public void Rtest() {
			System.out.println("Login Regression Testing..");
		}
} 
