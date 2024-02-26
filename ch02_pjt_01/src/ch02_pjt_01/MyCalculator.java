package ch02_pjt_01;

public class MyCalculator {

	public void calAdd(int firstNum , int secondNum) {
		ICalculator calculator = new CalAdd();
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}
	public void calSub(int firstNum , int secondNum) {
		ICalculator calculator = new CalSub();
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}
	public void calMul(int firstNum , int secondNum) {
		ICalculator calculator = new CalMul();
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}
	public void calDiv(int firstNum , int secondNum) {
		ICalculator calculator = new CalDiv();
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}

}
