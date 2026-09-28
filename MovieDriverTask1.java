import java.util.Scanner;
public class MovieDriverTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Movie m1 = new Movie();
		System.out.println("Enter title of move: ");
		m1.setTitle(key.nextLine());
		System.out.println("Enter movie rating: ");
		m1.setRating(key.nextLine());
		System.out.println("Enter amount of tickets sold: ");
		m1.setSoldTickets(key.nextInt());
		System.out.println(m1.toString());
	}

}
