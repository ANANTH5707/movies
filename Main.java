public class Main {

    public static void main(String[] args) {

        MovieController controller =
            new MovieController(10);

        MovieView view =
            new MovieView();

        controller.addMovie(1, "Leo");
        controller.addMovie(2, "GOAT");
        controller.addMovie(3, "Jailer");

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    view.displayMovies(
                        controller.getMovies(),
                        controller.getCount()
                    );

                    break;

                case 2:

                    String search =
                        view.getMovie("Enter movie name: ");

                    if (controller.findMovie(search) != null)

                        view.showMessage("Movie Found");

                    else

                        view.showMessage("Movie Not Found");

                    break;

                case 3:

                    String book =
                        view.getMovie("Enter movie name: ");

                    view.showMessage(
                        controller.bookTicket(book)
                    );

                    break;

                case 4:

                    String cancel =
                        view.getMovie("Enter movie name: ");

                    view.showMessage(
                        controller.cancelTicket(cancel)
                    );

                    break;

                case 5:

                    System.out.println("Exiting...");

                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}