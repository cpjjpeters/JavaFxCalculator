package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.*;

public class CalculatorController implements Initializable {
    double data =0;
    Operation op;
    List<Button> buttonList = new ArrayList<Button>();
    @FXML
    private TextField display;

    @FXML
    private Button zero, one, two,three, four, five, six,seven,eighth,nine, plus, mult,div, minus,clear,isgelijk;

    @FXML
    private void handleNumberAction(ActionEvent event){
        if(event.getSource() ==zero){
            display.setText(display.getText() +"0");
        }else if(event.getSource() ==one){
            display.setText(display.getText() +"1");
        }else if(event.getSource() ==two){
            display.setText(display.getText() +"2");
        }else if(event.getSource() ==three){
            display.setText(display.getText() +"3");
        }else if(event.getSource() ==four){
            display.setText(display.getText() +"4");
        }else if(event.getSource() ==five){
            display.setText(display.getText() +"5");
        }else if(event.getSource() ==six){
            display.setText(display.getText() +"6");
        }else if(event.getSource() ==seven){
            display.setText(display.getText() +"7");
        }else if(event.getSource() ==eighth){
            display.setText(display.getText() +"8");
        }else if(event.getSource() ==nine){
            display.setText(display.getText() +"9");
        }
    }
    @FXML
    private void handleButtonAction(ActionEvent event){
        if(event.getSource() ==clear){
            display.setText("");
        }else if(event.getSource() ==plus){
            data = Double.parseDouble(display.getText());
            display.setText("");
            op=Operation.ADDITION;
        }else if(event.getSource() ==minus){
            data = Double.parseDouble(display.getText());
            display.setText("");
            op=Operation.SUBSTRACTION;
        }else if(event.getSource() ==div){
            data = Double.parseDouble(display.getText());
            display.setText("");
            op=Operation.DIVISION;
        }else if(event.getSource() ==mult){
            data = Double.parseDouble(display.getText());
            display.setText("");
            op=Operation.MULTIPLICATION;
        }else if(event.getSource() == isgelijk){
            double secondNumber = Double.parseDouble(display.getText());
            if (op == Operation.ADDITION) {
                double result = data + secondNumber;
                display.setText(String.valueOf(result));
                System.out.println(result);
            }else if (op == Operation.SUBSTRACTION) {
                double result = data - secondNumber;
                display.setText(String.valueOf(result));
            }else if (op == Operation.MULTIPLICATION) {
                double result = data * secondNumber;
                display.setText(String.valueOf(result));
            }else if (op == Operation.DIVISION) {
                try{
                    double result = data / secondNumber;
                    display.setText(String.valueOf(result));
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }

    @FXML
    private void enableClear(ActionEvent event){
        clear.setDisable(false);
    }
    @FXML
    private void disableClear(ActionEvent event){
        clear.setDisable(true);
    }
    @FXML
    private void applyDarkStyle(ActionEvent event){
        clear.setDisable(false);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        display.setEditable(false);
        buttonList.add(zero);
        buttonList.add(one);
        buttonList.add(two);
        buttonList.add(three);
        buttonList.add(four);
        buttonList.add(five);
        buttonList.add(six);
        buttonList.add(seven);
        buttonList.add(eighth);
        buttonList.add(nine);
        buttonList.add(mult);
        buttonList.add(div);
        buttonList.add(isgelijk);
        buttonList.add(minus);
        buttonList.add(plus);

    }
    enum Operation{
        ADDITION, MULTIPLICATION,DIVISION,SUBSTRACTION;
    }
}
