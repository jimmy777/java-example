package exception;

import org.junit.Test;

import com.x.base.exception.ExceptionDemo1;

public class ExceptionDemoTest {

	@Test
	public void test() {
		ExceptionDemo1 demo1 = new ExceptionDemo1();
		demo1.example(10, 0);
	}

}
