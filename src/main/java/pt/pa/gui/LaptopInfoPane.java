package pt.pa.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import pt.pa.model.Laptop;

public class LaptopInfoPane extends VBox {
    public LaptopInfoPane(Laptop laptop) {
        Label informationLabel = new Label("Laptop Information");
        informationLabel.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 24));

        Label displayNameLabel = new Label("Display Name: " + laptop.getDisplayName());
        Label releaseDateLabel = new Label("Release Date: " + laptop.getReleaseDate());
        Label cpuLabel = new Label("CPU: " + laptop.getCpu());
        Label ramLabel = new Label("RAM: " + laptop.getRam());
        Label ssdLabel = new Label("SSD: " + laptop.getSsd());

        FlowPane laptopInfoPane = new FlowPane(displayNameLabel, releaseDateLabel, cpuLabel, ramLabel, ssdLabel);
        laptopInfoPane.setHgap(10);
        laptopInfoPane.setVgap(5);

        getChildren().addAll(informationLabel, laptopInfoPane);
        setSpacing(10);
        setAlignment(Pos.CENTER);
    }
}