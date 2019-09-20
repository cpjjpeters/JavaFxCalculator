package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    @FXML
    private TextField display;

    @FXML
    private Button zero, one, two,three, four, five, six,seven,eighth,nine, plus, mult,div, minus,clear;


    @FXML
    private void handleEqualsAction( ActiveEvent event){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
