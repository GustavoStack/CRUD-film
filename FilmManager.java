import java.util.ArrayList;
import java.util.List;
public class FilmManager {
    private List<Film> films;

    public FilmManager() {
        films  = new ArrayList<>();
    }

    public void createFilm(int id, String title, String director, String genre, int releaseYear) {
        films.add(new Film(id, title, director, genre, releaseYear));
    }

    public Film readFilm(int id) {
        for (Film film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public void updateFilm(int id, String newTitle, String newDirector, String newGenre, int newReleaseYear) {
        Film filmToUpdate = readFilm(id);

        if (filmToUpdate != null) {
            filmToUpdate.setTitle(newTitle);
            filmToUpdate.setDirector(newDirector);
            filmToUpdate.setGenre(newGenre);
            filmToUpdate.setReleaseYear(newReleaseYear);
        } else {
            System.out.println("Film not found.");
        }
    }

    public void deleteFilm(int id) {
        Film filmToDelete = readFilm(id);

        if (filmToDelete != null) {
            films.remove(filmToDelete);
        } else {
            System.out.println("Film not found.");
        }
    }

    public void printFilms() {
        System.out.println("\nFilms:");
        for (Film film : films) {
            System.out.println(film);
        }
    }
}
