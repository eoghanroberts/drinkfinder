package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Observable;

public class Controller {
    ObservableList<String> drinkTypeList = FXCollections.observableArrayList("RTD", "Spirits", "Beer", "Wine");

    @FXML
    private ChoiceBox drinkType;

    @FXML
    private TextField maxPriceBox;

    @FXML
    private TextField SearchQueryBox;

    @FXML
    private void initialize() {
        drinkType.setItems(drinkTypeList);
    }
    public void pressButton(ActionEvent event) {
        String drinkTypeString = drinkType.getValue().toString();
        String maxPriceString = maxPriceBox.getText();
        String SearchQuery = SearchQueryBox.getText();
        System.out.println(drinkTypeString + "\n" + maxPriceString  + "\n"  + SearchQuery);
    }

    public void searchRequest(String drinkType, String maxPrice, String searchQuery) {
        //Probably want a database of drinks and prices that this queries with params
    }


}
