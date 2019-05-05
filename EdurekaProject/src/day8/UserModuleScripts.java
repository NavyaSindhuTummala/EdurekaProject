package day8;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModuleScripts 
{

	 @Test(priority=1)
	 
	 public void createUser()
	 {
		 Reporter.log("User created successfully", true);
		// Assert.fail();
	 }
	 
	 @Test(dependsOnMethods={"editUser"})
	 
	 public void deleteUser()
	 {
		 Reporter.log("User has been deleted", true);
	 }
	 
	 @Test(dependsOnMethods={"createUser"})
	 
	 public void editUser()
	 {
		 Reporter.log("User details has been edited", true);
	 }
}
