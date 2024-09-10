package pt.pa.model;

/**
 *
 * @author amfs
 */
public class Review {
    private String userName;
    private String comment;
    private Integer rating;
    public Review(String userName, String comment, Integer rating) {
        this.userName = userName;
        this.comment = comment;
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "userName='" + userName + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
