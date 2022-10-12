
public class IncorrectMessage {

	public static void main(String[] args) {
		int a = 2, b = 8, c = 6;
		System.out.println("Finding the argets number \n");
		
		if (a > b && a > c)
			System.out.println(a + " is the largest Number");
		else if (b > a && b > c)
			System.out.println(a + "is the smallest Number"); //Change "smallest" to "Largest
		else
			System.out.println(c + "is the largest Number");

	}

}
