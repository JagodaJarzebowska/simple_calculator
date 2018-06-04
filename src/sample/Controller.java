package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    Float data = 0f;
    int opperation = -1;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button six;

    @FXML
    private Button plus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button multiply;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button backspace;

    @FXML
    private Button division;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == backspace) {
            display.setText("");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            opperation = 1; // addition
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            opperation = 2; // substraction
            display.setText("");
        } else if (event.getSource() == multiply) {
            data = Float.parseFloat(display.getText());
            opperation = 3; // multiply
            display.setText("");
        } else if (event.getSource() == division) {
            data = Float.parseFloat(display.getText());
            opperation = 4; // division
            display.setText("");
        } else if (event.getSource() == equals) {
            Float second = Float.parseFloat(display.getText());
            switch (opperation) {
                case 1: //addition
                    Float result = data + second;
                    display.setText(String.valueOf(result));
                    break;
                case 2: // substraction
                    result = data - second;
                    display.setText(String.valueOf(result));
                    break;
                case 3: // multiply
                    result = data * second;
                    display.setText(String.valueOf(result));
                    break;
                case 4: // division
                    result = 0f;
                    try {
                        result = data / second;
                    }catch (Exception e){display.setText("Error");}
                    display.setText(String.valueOf(result));
                    break;
            }
        }
    }
}
