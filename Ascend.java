
public class Ascend {
	public static void main(String[] args) {
		double limNum = Double.parseDouble(args[0]);
		int a = (int)(Math.random() * limNum);
		int b = (int)(Math.random() * limNum);
		int c = (int)(Math.random() * limNum);
		int min = Math.min (Math.min(a, b), c);
		int	max = Math.max (Math.max(a,b), c);
		int middle = (a + b + c) - min - max;

		System.out.println(a + " " + b + " " + c + " ");
		System.out.println(min + " " + middle + " " + max + " ");

	}
}
