// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double rateCal = rate/100 + 1;
		int years = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(rateCal, years);

		System.out.println("After " + years + " years, $" + currentValue +
		" saved at " + rate + "% will yield $" + (int) futureValue);
		
	}
}