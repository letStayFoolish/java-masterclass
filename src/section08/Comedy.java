package section08;

public class Comedy extends Movie {
    public Comedy(String movieName) {
        super(movieName);
    }

    public void watchComedy() {
        System.out.println("Watching the comedy!");
    };

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3),
                "Comedy Movie 1",
                "Comedy Movie 2",
                "Comedy Movie 3"
        );
    }
}
