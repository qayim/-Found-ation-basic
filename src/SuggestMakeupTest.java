import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuggestMakeupTest {

	@Test
	void test1() {
		Foundation f = new Foundation();
		String expected_output = "Set 1 \nBrand: Mac \nFoundation: Soft line \nLipstick: Soft pink";
		String actual_output = f.determineMakeup("Pale", "Pastel");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test2() {
		Foundation f = new Foundation();
		String expected_output = "Set 2 \nBrand: Maybelline \nFoundation: Bold line \nLipstick: Dark pink";
		String actual_output = f.determineMakeup("Pale", "Dark");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test3() {
		Foundation f = new Foundation();
		String expected_output = "Set 3 \nBrand: Rimmel \nFoundation: Glam line \nLipstick: Shiny pink";
		String actual_output = f.determineMakeup("Pale", "Shiny");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test4() {
		Foundation f = new Foundation();
		String expected_output = "Set 4 \nBrand: Channel \nFoundation: Soft-soft line \nLipstick: Soft violet";
		String actual_output = f.determineMakeup("Medium", "Pastel");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test5() {
		Foundation f = new Foundation();
		String expected_output = "Set 5 \nBrand: Revlon \nFoundation: Bold-bold line \nLipstick: Dark violet";
		String actual_output = f.determineMakeup("Medium", "Dark");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test6() {
		Foundation f = new Foundation();
		String expected_output = "Set 6 \nBrand: Etude \nFoundation: Glam-glam line \nLipstick: Shiny violet";
		String actual_output = f.determineMakeup("Medium", "Shiny");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test7() {
		Foundation f = new Foundation();
		String expected_output = "Set 7 \nBrand: Rimmel \nFoundation: Lollipop line \nLipstick: Soft red";
		String actual_output = f.determineMakeup("Dark", "Pastel");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test8() {
		Foundation f = new Foundation();
		String expected_output = "Set 8 \nBrand: Revlon \nFoundation: Blackcurrant line \nLipstick: Dark red";
		String actual_output = f.determineMakeup("Dark", "Dark");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test9() {
		Foundation f = new Foundation();
		String expected_output = "Set 9 \nBrand: Maybelline \nFoundation: Gold line \nLipstick: Shiny red";
		String actual_output = f.determineMakeup("Dark", "Shiny");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test10() {
		Foundation f = new Foundation();
		String expected_output = "Invalid input";
		String actual_output = f.determineMakeup("Pale", "Bling");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test11() {
		Foundation f = new Foundation();
		String expected_output = "Invalid input";
		String actual_output = f.determineMakeup("White", "Shiny");
		assertEquals(expected_output, actual_output);
	}
	@Test
	void test12() {
		Foundation f = new Foundation();
		String expected_output = "Invalid input";
		String actual_output = f.determineMakeup("White", "Bling");
		assertEquals(expected_output, actual_output);
	}

}
