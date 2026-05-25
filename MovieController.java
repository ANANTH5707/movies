class MovieController {

    Movie[] movies;

    int count;

    MovieController(int size) {

        movies = new Movie[size];
        count = 0;
    }

    void addMovie(int id, String name) {

        movies[count++] = new Movie(id, name);
    }

    Movie[] getMovies() {

        return movies;
    }

    int getCount() {

        return count;
    }

    Movie findMovie(String name) {

        for (int i = 0; i < count; i++) {

            if (movies[i].name.equalsIgnoreCase(name)) {

                return movies[i];
            }
        }

        return null;
    }

    String bookTicket(String name) {

        Movie m = findMovie(name);

        if (m == null)
            return "Movie Not Found";

        if (!m.booked) {

            m.booked = true;

            return "Ticket Booked Successfully";
        }

        return "Ticket Already Booked";
    }

    String cancelTicket(String name) {

        Movie m = findMovie(name);

        if (m == null)
            return "Movie Not Found";

        if (m.booked) {

            m.booked = false;

            return "Ticket Cancelled Successfully";
        }

        return "Ticket was not booked";
    }
}