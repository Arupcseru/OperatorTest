package main;

public class OperatorTestClass {
	public int addition(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 + operand2;
	}

	public int subtraction(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 - operand2 ;
	}

	public int divition(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 / operand2;
	}

	public Object multiplication(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 * operand2;
	}

	public Object modulus(int operand1, int operand2) {
		// TODO Auto-generated method stub
		return operand1 % operand2;
	}

	public int bitNot(int operand1) {
		// TODO Auto-generated method stub
		return ~operand1;
	}

	public int bitAnd(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 & Operand2;
	}

	public int bitOr(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 | Operand2;
	}

	public int bitExOr(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 ^ Operand2 ;
	}

	public int bitShiftRight(int Operand1) {
		// TODO Auto-generated method stub
		return Operand1>>1;
	}

	public int bitShiftRightZero(int Operand1) {
		// TODO Auto-generated method stub
		return Operand1>>>1;
	}

	public int bitShiftLeft(int Operand1) {
		// TODO Auto-generated method stub
		return Operand1<<1;
	}

	public boolean equalTo(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		
		return Operand1 == Operand2;
	}

	public boolean notEqualTo(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 != Operand2;
	}

	public boolean greaterThan(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 > Operand2;
	}

	public boolean greaterThanOrEqual(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 >= Operand2;
	}

	public boolean lessThan(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 < Operand2;
	}

	public boolean lessThanOrEqual(int Operand1, int Operand2) {
		// TODO Auto-generated method stub
		return Operand1 <= Operand2;
	}

	public boolean logicalNot(boolean Operand1) {
		// TODO Auto-generated method stub
		return !Operand1;
	}

	public boolean logicalAnd(boolean Operand1, boolean Operand2) {
		// TODO Auto-generated method stub
		return Operand1 && Operand2;
	}

	public boolean logicalOr(boolean Operand1, boolean Operand2) {
		// TODO Auto-generated method stub
		return Operand1 || Operand2;
	}
/*
	public boolean logicalExOr(boolean Operand1, boolean Operand2) {
		// TODO Auto-generated method stub
		return Operand1 ;
	}
*/
	

}
