package ch02_pjt_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calculator = new MyCalculator(); 
//		calculator.calAdd(10, 5 , new CalAdd());
//		calculator.calDiv(10, 5 , new CalDiv());
//		calculator.calMul(10, 5 , new CalMul());
//		calculator.calSub(10, 5 , new CalSub());
		calculator.calculator(10, 5, new CalAdd());
	}

}
