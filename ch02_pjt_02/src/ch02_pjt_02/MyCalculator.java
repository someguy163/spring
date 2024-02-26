package ch02_pjt_02;

public class MyCalculator {
	
	
	public void calculator(int firstNum , int secondNum , ICalculator calculator) {
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}

//	public void calAdd(int firstNum , int secondNum , CalAdd calAdd) {
////		ICalculator calculator = new CalAdd();
////		int value = calculator.doOperation(firstNum, secondNum);
//		int value = calAdd.doOperation(firstNum, secondNum);
//		System.out.println("result : " + value);
//	}
//	public void calSub(int firstNum , int secondNum , CalSub calSub) {
////		ICalculator calculator = new CalSub();
////		int value = calculator.doOperation(firstNum, secondNum);
//		int value = calSub.doOperation(firstNum, secondNum);
//		System.out.println("result : " + value);
//	}
//	public void calMul(int firstNum , int secondNum , CalMul calMul) {
////		ICalculator calculator = new CalMul();
////		int value = calculator.doOperation(firstNum, secondNum);
//		int value = calMul.doOperation(firstNum, secondNum);
//		System.out.println("result : " + value);
//	}
//	public void calDiv(int firstNum , int secondNum , CalDiv calDiv) {
////		ICalculator calculator = new CalDiv();
////		int value = calculator.doOperation(firstNum, secondNum);
//		int value = calDiv.doOperation(firstNum, secondNum);
//		System.out.println("result : " + value);
//	}

}
