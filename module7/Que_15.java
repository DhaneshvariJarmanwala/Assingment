package module7;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


	@RunWith(Parameterized.class)
	public class Que_15 {
	String username,password;
	AddDemo1 ad;
	@Before
	public void before() {
		ad=new AddDemo1();
		}
	public Que_15(String username,String password) {
		this.username=username;
		this.password=password;
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"test123@gmail.com","123"},{"tes@gmail.com","123"}});
	}
	@Test
	public void test() throws InterruptedException {
		ad.login(username, password);
	}
}
