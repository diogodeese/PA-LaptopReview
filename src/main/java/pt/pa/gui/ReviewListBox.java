package pt.pa.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import pt.pa.model.Review;
import java.util.List;

public class ReviewListBox extends VBox {

    public ReviewListBox(List<Review> reviews) {
        for(Review review: reviews) {
            Label userNameLabel = new Label("Username: " + review.getUserName());
            Label commentLabel = new Label("Comment: " + review.getComment());
            Label ratingLabel = new Label("Rating: " + review.getRating());

            VBox reviewInfoPane = new VBox(userNameLabel, commentLabel, ratingLabel);
            reviewInfoPane.setSpacing(5);

            getChildren().add(reviewInfoPane);
        }

        setSpacing(20);
    }
}