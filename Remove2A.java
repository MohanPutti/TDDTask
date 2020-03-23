package EPAM.TDDProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove2A {
	/*
	 * Todo 
	 * 1.No A-->BCDS==>BCDS--success
	 * 2.2 A-->AABC==>BC--success
	 * 3.first A-->ABCD==>BCD--success
	 * 4.second A-->BACD==>BCD--success
	 * 5.AABCAA-->BCAA--success
	 * 6.A-->""--success
	 * 7.AA-->""--success*/
	
	@Test
	void testNoAPresent() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("BCDS");
		assertEquals("BCDS",actual);
	}
	@Test
	void test2APresent() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("AABC");
		assertEquals("BC",actual);
		
	}
	@Test
	void firstAPresent() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("ABCD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void secondAPresent() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("BACD");
		assertEquals("BCD",actual);
		
	}
	@Test
	void aPresent() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("AABCDAA");
		assertEquals("BCDAA",actual);
	}
	@Test
	void length2String() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("AA");
		assertEquals("",actual);
		
	}
	@Test
	void length1String() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("A");
		assertEquals("",actual);
		
	}
	@Test
	void emptyString() {

				RemoveA removea=new RemoveA();
				String actual=removea.remove("");
				assertEquals("",actual);
	}
	@Test
	void length2StringNoA() {
		RemoveA removea=new RemoveA();
		String actual=removea.remove("BC");
		assertEquals("BC",actual);}
		
	
	
	
	

}
