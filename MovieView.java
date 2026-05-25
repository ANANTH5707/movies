
    import java.util.Scanner;

class MovieView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n--- Movie Menu ---");

        System.out.println("1. Display Movies");
        System.out.println("2. Search Movie");
        System.out.println("3. Book Ticket");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Exit");
    }

    int getChoice() {

        System.out.print("Enter choice: ");

        return sc.nextInt();
    }

    String getMovie(String msg) {

        sc.nextLine();

        System.out.print(msg);

        return sc.nextLine();
    }

    void displayMovies(Movie[] movies, int count) {

        System.out.println("\nMovies List:");

        for (int i = 0; i < count; i++) {

            System.out.println(
                movies[i].id + " - " +
                movies[i].name + " - " +
                (movies[i].booked ? "Booked" : "Available")
            );
        }
    }

    void showMessage(String msg) {

        System.out.println(msg);
    }
}
