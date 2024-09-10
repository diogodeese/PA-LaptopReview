package pt.pa.model;

import java.util.List;

/**
 *
 * @author amfs
 */
public class Laptop {

    private String displayName;
    private String releaseDate;

    private String cpu;

    private String ram;

    private String ssd;

    private List<Review> reviews;

    public Laptop(String displayName, String releaseDate, String cpu, String ram, String ssd, List<Review> reviews) {
        this.displayName = displayName;
        this.releaseDate = releaseDate;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.reviews = reviews;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displayName='" + displayName + '\'' +
                "releaseDate='" + releaseDate + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
