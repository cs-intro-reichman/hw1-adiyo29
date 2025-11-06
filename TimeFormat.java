// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		boolean t = true;
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
			if (hours > 12){
				hours = hours - 12;
				t = false; // this hold for me if the hour needs to be AM / PM, for PM hold false;
				}
			System.out.print(hours);
			System.out.print(":");
	
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
				if(minutes<10){
					System.out.print("0");
				}
				System.out.print(minutes);

				if (hours == 12){
					t = false;
				}
			
				if (t == true) {
					System.out.println(" AM");
				}
					else {
						System.out.println(" PM");

					}
 }
	

}