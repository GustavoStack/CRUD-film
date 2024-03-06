import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilmManager filmManager = new FilmManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a film");
            System.out.println("2. Print films");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter film ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter film title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter film director: ");
                    String director = scanner.nextLine();

                    System.out.print("Enter film genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Enter film release year: ");
                    int releaseYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    filmManager.createFilm(id, title, director, genre, releaseYear);
                    break;
                case 2:
                    filmManager.printFilms();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }


/*
        // Add films
        filmManager.createFilm(1, "The Shawshank Redemption", "Frank Darabont", "Drama", 1994);
        filmManager.createFilm(2, "The Godfather", "Francis Ford Coppola", "Crime", 1972);

        // Print films
        filmManager.printFilms();

        // Update a film
        filmManager.updateFilm(1, "The Shawshank Redemption (Updated)", "Frank Darabont", "Drama", 1994);

        // Print films
        filmManager.printFilms();

        // Delete a film
        filmManager.deleteFilm(2);

        // Print films
        filmManager.printFilms();

 */
        }
    }

