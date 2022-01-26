package com.example.radiobuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ToggleGroup animal;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private Button getanimal;

    @FXML
    private Text txtOut;

    @FXML
    void getAnilmal() {

        if (animal.getSelectedToggle().equals(cat)) {
            txtOut.setText("You picked a cat");
        } else
            txtOut.setText("You picked a dog");

    }

}
