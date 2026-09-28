import java.util.Scanner;
public class MovieDriverTask2 {


	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		do {
			Movie m1 = new Movie();
			System.out.println("Enter title of movie: ");
			m1.setTitle(key.nextLine());
			System.out.println("Enter movie rating: ");
			m1.setRating(key.nextLine());
			System.out.println("Enter amount of tickets sold: ");
			m1.setSoldTickets(key.nextInt());
			key.nextLine();
			System.out.println(m1.toString());
			System.out.println("Do you want to enter another? (y or n)");
		} while (key.nextLine().equalsIgnoreCase("y"));

		System.out.println("Goodbye");
		key.close();
	}

}
