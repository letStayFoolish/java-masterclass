package section08;

public class ScienceFiction extends Movie {

    public ScienceFiction(String movieName) {
        super(movieName);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf(".. %s%n".repeat(3),
                "ScienceFiction Movie 1",
                "ScienceFiction Movie 2",
                "ScienceFiction Movie 3"
        );
    }
}
