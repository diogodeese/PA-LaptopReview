package pt.pa.gui;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import pt.pa.model.Laptop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amfs
 */
public class LaptopsGui extends BorderPane {

    private static final String DATA_PATH = "src/main/resources/laptop_reviews.json";

    private static final String BANNER_PATH = "src/main/resources/header_banner.png";

    List<Laptop> laptops;

    ListView<Laptop> listViewLaptops;

    private VBox mainContent;


    public LaptopsGui() throws Exception {
        try {
            this.laptops = loadData();
            initializeComponents();
        } catch (FileNotFoundException e) {
            throw new Exception("Unable to initialize Laptops GUI");
        }
    }

    public void initializeComponents() throws FileNotFoundException {
        ImageView image = loadThumbnailImage();

        listViewLaptops = new ListView<>();
        listViewLaptops.setCellFactory(param -> new LaptopListCell());
        listViewLaptops.getItems().addAll(laptops);
        listViewLaptops.maxWidth(200);

        mainContent = new VBox(5);
        mainContent.setStyle("-fx-background-color: white; -fx-padding: 10px");
        Label placeholderLabel = new Label("Select an item from the menu");
        mainContent.getChildren().add(placeholderLabel);

        listViewLaptops.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue ) -> updateListViewLaptops(placeholderLabel, newValue));

        setTop(image);
        setLeft(listViewLaptops);
        setCenter(mainContent);
    }

    private void updateListViewLaptops(Label placeholderLabel, Laptop newValue) {
        if(newValue != null) {
            mainContent.getChildren().clear();

            LaptopInfoPane laptopInfo = new LaptopInfoPane(newValue);
            Label labelReviews = new Label("Reviews:");
            labelReviews.setFont(Font.font("Arial", FontWeight.BOLD, 16));
            labelReviews.setAlignment(Pos.TOP_LEFT);
             ReviewListBox reviewList = new ReviewListBox(newValue.getReviews());

            mainContent.getChildren().addAll(laptopInfo, new Separator(), labelReviews, reviewList);
        } else {
            mainContent.getChildren().clear();
            mainContent.getChildren().add(placeholderLabel);
        }
    }

    /**
     * Load the data  contain on json file specified on DATA_PATH.
     * @return list of Laptop contained on the file
     * @throws FileNotFoundException in case of the file not exists
     */
    private List<Laptop> loadData() throws FileNotFoundException {

        Gson gson = new Gson();

        Type arrayListType = new TypeToken<ArrayList<Laptop>>() {
        }.getType();

        return gson.fromJson(new FileReader(DATA_PATH), arrayListType);
    }

    /**
     * create an Image View from the image file specified on BANNER_PATH
     * @return the Image View created from the file specified on BANNER_PATH
     * @throws FileNotFoundException in case the file not exists
     */
    ImageView loadThumbnailImage() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(BANNER_PATH);
        Image image = new Image(inputStream);
        return new ImageView(image);
    }

}