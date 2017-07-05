import javax.swing.JOptionPane;

public class EducationPayGap {

	public static final double Less_HS = 0.77;
	public static final double HS = 0.78;
	public static final double SomeCollege = 0.77;
	public static final double Assoc = 0.77;
	public static final double Bach = 0.74;
	public static final double PostGrad = 0.74;

	public static double payGapCalculatorEdu(String race, int salary){
		double payProportion = 0.0;
		if (race.equals("L")) payProportion = Less_HS;
		if (race.equals("H")) payProportion = HS;
		if (race.equals("S")) payProportion = SomeCollege;
		if (race.equals("A")) payProportion = Assoc;
		if (race.equals("B")) payProportion = Bach;
		if (race.equals("P")) payProportion = PostGrad;
		return payProportion*salary;
	}

	public static void main(String[] args){
		String eduInput = JOptionPane.showInputDialog
				("Select an education level: L for less than HS; H for HS; S for some college; A for Associate degree; B for Bachelor's degree; P for Post-Graduate degree", "L");
		int salaryInput = Integer.parseInt(JOptionPane.showInputDialog("Type in a salary, omitting commas.", "10"));
		double payGapCalculatedEdu = payGapCalculatorEdu(eduInput, salaryInput);
		System.out.println
			("A woman of the educational background you selected makes $"+payGapCalculatedEdu+"0, given that a white male of the same educational background makes $"+salaryInput+".00.");
		System.out.println("What does this mean? Disparities in educational background are not the reason the pay gap persists.");
		System.out.println("This pay gap calculator draws from the U.S. Census Bureau's 2016 Current Population Survey data.");
		System.out.println("For more information, check out http://www.aauw.org/research/the-simple-truth-about-the-gender-pay-gap/");
	}

}
