package pt.pa.gui;

import javafx.scene.control.ListCell;
import pt.pa.model.Laptop;
import pt.pa.model.Review;

import java.util.List;

public class LaptopListCell extends ListCell<Laptop> {

    @Override
    protected void updateItem(Laptop item, boolean empty) {
        super.updateItem(item, empty);

        if(empty || item == null){
            setText(null);
        } else {
            setText(item.getDisplayName());
        }
    }
}
