package section08;

public class AdventureMovie extends Movie {

    public AdventureMovie(String title) {
        super(title);
    }


    public void watchAdventure() {
        System.out.println("Watching the adventure!");
    };

    // uses parent's method plus additional logic added specifically for this subclass
    @Override
    public void watchMovie() {
        super.watchMovie();

        // %s: replaces any string.
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
        );
    }
}
