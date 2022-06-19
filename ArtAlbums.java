package Homework3;

public class ArtAlbums extends Books{
    private int paperQuality;

    public ArtAlbums(String name, int numberOfPages, int paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }


}
