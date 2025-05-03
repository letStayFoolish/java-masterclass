package section08;

public class Movie {
    private String title;

    public Movie(String movieName) {
        this.title = movieName;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName(); // this.getClass() - returns class type information of runtime instance, on which this method is executed.
        System.out.println(this.title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new AdventureMovie(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
