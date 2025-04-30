package section08;

public class AdventureMovie extends Movie {

    public AdventureMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
        );
    }
}
