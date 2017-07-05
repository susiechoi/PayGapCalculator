import javax.swing.JOptionPane;

public class RacePayGap {

	public static final double Hisp_Lat = 0.54;
	public static final double AfAm = 0.62;
	public static final double White = 0.76;
	public static final double Asian = 0.90;
	public static final double Pac_Island = 0.60;
	public static final double Am_Ind = 0.58;

	public static double payGapCalculatorRace(String race, int salary){
		double payProportion = 0.0;
		if (race.equals("H")) payProportion = Hisp_Lat;
		if (race.equals("AA")) payProportion = AfAm;
		if (race.equals("W")) payProportion = White;
		if (race.equals("A")) payProportion = Asian;
		if (race.equals("P")) payProportion = Pac_Island;
		if (race.equals("I")) payProportion = Am_Ind;
		return payProportion*salary;
	}

	public static void main(String[] args){
		String raceInput = JOptionPane.showInputDialog
				("Select a race/ethnicity: H for Hispanic/Latina; AA for African-American; W for White; A for Asian; P for Pacific-Islander; I for American Indian/Alaskan Native", "H");
		int salaryInput = Integer.parseInt(JOptionPane.showInputDialog("Type in a salary, omitting commas.", "10"));
		double payGapCalculatedRace = payGapCalculatorRace(raceInput, salaryInput);
		System.out.println("A woman of the race/ethnicity you selected makes $"+payGapCalculatedRace+"0, given that a white male makes $"+salaryInput+".00.");
		System.out.println("This pay gap calculator draws from the U.S. Census Bureau's 2015 American Community Survey data.");
		System.out.println("For more information, check out http://www.aauw.org/research/the-simple-truth-about-the-gender-pay-gap/");
	}

}
