package ch02_pjt_03;

public class CalAssembler {

	MyCalculator myCalculator;
	CalAdd calAdd;
	CalDiv calDiv;
	CalMul calMul;
	CalSub calSub;

//	d
	public CalAssembler() {
		myCalculator =new MyCalculator();
		calAdd = new CalAdd();
		calDiv = new CalDiv();
		calMul = new CalMul();
		calSub = new CalSub();
		
		Assembler();
	}
	public void Assembler() {
		myCalculator.calculate(10, 5, calAdd);
		myCalculator.calculate(10, 5, calDiv);
		myCalculator.calculate(10, 5, calMul);
		myCalculator.calculate(10, 5, calSub);
	}
}
