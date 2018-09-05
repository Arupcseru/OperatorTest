package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();

	@Test
	void OperatorTestUnitTest() {
		assertEquals(5,oT.addition(2,3),"");
		assertEquals(2,oT.subtraction(5,3),"");
		assertEquals(2,oT.divition(6,3),"");
		assertEquals(15,oT.multiplication(5,3),"");
		assertEquals(2,oT.modulus(5,3),"");
		
		assertEquals(-7,oT.bitNot(6),"");
		assertEquals(12,oT.bitAnd(12,15),"");
		assertEquals(14,oT.bitOr(12,14),"");
		assertEquals(1,oT.bitExOr(6,7),"");
		assertEquals(2,oT.bitShiftRight(4),"");
		assertEquals(8,oT.bitShiftRightZero(16),"");
		assertEquals(12,oT.bitShiftLeft(6),"");
		
		assertEquals(true,oT.equalTo(12,12),"");
		assertEquals(true,oT.notEqualTo(12,14),"");
		assertEquals(true,oT.greaterThan(14,12),"");
		assertEquals(true,oT.greaterThanOrEqual(16,12),"");
		assertEquals(true,oT.lessThan(12,14),"");
		assertEquals(true,oT.lessThanOrEqual(12,12),"");
		
		assertEquals(false,oT.logicalNot(true),"");
		assertEquals(false,oT.logicalAnd(false,true),"");
		assertEquals(false,oT.logicalOr(false,false),"");
		//assertEquals(false,oT.logicalExOr(true,true),"");
		//assertEquals(false,oT.shortCircuitAnd(true,false),"");
		//assertEquals(false,oT.shortCircuitOr(true),"");
		
		//fail("Not yet implemented");
	}

}
