import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateProductTest {

	@Test
	void test1() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(0,1);
		assertEquals(expected_output, actual_output);
		
		double expected_output1 = 12.5;
		double actual_output1 = f.calculateProductPrice(1,1);
		assertEquals(expected_output1, actual_output1);
		
		double expected_output2 = 23.4;
		double actual_output2 = f.calculateProductPrice(2,1);
		assertEquals(expected_output2, actual_output2);
		
		double expected_output3 = 62.2;
		double actual_output3 = f.calculateProductPrice(8,1);
		assertEquals(expected_output3, actual_output3);
		
		double expected_output4 = 96.1;
		double actual_output4 = f.calculateProductPrice(9,1);
		assertEquals(expected_output4, actual_output4);
		
		double expected_output5 = 0;
		double actual_output5 = f.calculateProductPrice(10,1);
		assertEquals(expected_output5, actual_output5);

		double expected_output6 = 0;
		double actual_output6 = f.calculateProductPrice(1,0);
		assertEquals(expected_output6, actual_output6);

		double expected_output7 = 12.5;
		double actual_output7 = f.calculateProductPrice(1,1);
		assertEquals(expected_output7, actual_output7);
		
		double expected_output8 = 25;
		double actual_output8 = f.calculateProductPrice(1,2);
		assertEquals(expected_output8, actual_output8);
		
		double expected_output9 = 237.5;
		double actual_output9 = f.calculateProductPrice(1,19);
		assertEquals(expected_output9, actual_output9);
		
		double expected_output10 = 250;
		double actual_output10 = f.calculateProductPrice(1,20);
		assertEquals(expected_output10, actual_output10);
		
		double expected_output11 = 0;
		double actual_output11 = f.calculateProductPrice(1,21);
		assertEquals(expected_output11, actual_output11);
	}
	@Test
	void test2() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(-1,-1);
		assertEquals(expected_output, actual_output);
		System.out.println(actual_output);
	}
	@Test
	void test3() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(-1,2);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test4() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(-1,22);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test5() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(4,-10);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test6() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(4,30);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test7() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(14,-22);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test8() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(16,17);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test9() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(16,47);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test10() {
		Foundation f = new Foundation();
		double expected_output = 237.5;
		double actual_output = f.calculateProductPrice(1,19);
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test11() {
		Foundation f = new Foundation();
		double expected_output = 0;
		double actual_output = f.calculateProductPrice(-3,119);
		assertEquals(expected_output, actual_output);
	}

}
