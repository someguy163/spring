package ch03_pjt_03;

public class CalAssembler {

	MyCalculator myCalculator;
	CalAdd calAdd;
	CalDiv calDiv;
	CalMul calMul;
	CalSub calSub;


	
	
public CalAssembler(MyCalculator myCalculator, CalAdd calAdd, CalDiv calDiv, CalMul calMul, CalSub calSub) {
		this.myCalculator = myCalculator;
		this.calAdd = calAdd;
		this.calDiv = calDiv;
		this.calMul = calMul;
		this.calSub = calSub;
	}




//	public CalAssembler() {
//		myCalculator =new MyCalculator();
//		calAdd = new CalAdd();
//		calDiv = new CalDiv();
//		calMul = new CalMul();
//		calSub = new CalSub();
//		
//		Assemble();
//	}
	public void Assemble() {
		myCalculator.calculate(10, 5, calAdd);
		myCalculator.calculate(10, 5, calDiv);
		myCalculator.calculate(10, 5, calMul);
		myCalculator.calculate(10, 5, calSub);
	}
}
