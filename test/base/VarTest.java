package base;

import org.junit.Test;

public class VarTest {

	@Test
	public void test1() {
		short s1 = 1;
//		s1 = (short) (s1 + 1);
		System.out.println(s1);
	}

	@Test
	public void test2() {
		String path = "c:\\tmp\\a.txt";
		System.out.println(path);
	}

	@Test
	public void test3() {

		int i, k;
		i = -10;
		k = i < 0 ? -i : i;  // get absolute value of i
		System.out.println(k);

	}
	
	@Test
	public void test4() {
		int i = 10;
//		System.out.println(i + " : " + (i++));
//		System.out.println(i + " : " + (++i));
//		System.out.println(i + " : " + (i--));
		System.out.println(i + " : " + (--i));
	}
	
	@Test
	public void test5() {
		int k =3; // 011
		int b = 6; // 110
		
		int c = k | b; // 111=7
		int d = k & b; // 010=2
		
		System.out.println(c);
		System.out.println(~c); // -8
		System.out.println(d);
		System.out.println(~d); // -3
		System.out.println(c << 1); // 1110=14
		System.out.println(d >> 1); // 0001=2 
		
	}
	
	@Test
	public void test6() {
//		if ((2>3) & doThing()) { // doThing 一定被执行
		if ((2>3) && doThing()) { // doThing 不会被执行
			System.out.println("ok");
		}
	}

	private boolean doThing() {
		System.out.println("in doThing.");
		return true;
	}
}


