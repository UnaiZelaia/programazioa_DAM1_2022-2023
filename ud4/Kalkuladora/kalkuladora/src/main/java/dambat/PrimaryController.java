package dambat;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.collections.FXCollections;

public class PrimaryController {
    @FXML ChoiceBox<String> operator;
    @FXML Label result;
    @FXML TextField val1;
    @FXML TextField val2;


    @FXML
    private char getOperador() throws IOException{
        String selectedChoice = operator.getSelectionModel().getSelectedItem();
        return selectedChoice.toCharArray()[0];
    }

    @FXML
    private void setResult() throws IOException{
        char operador = getOperador();
        float resultado = getResultado(operador);
        result.setText(Float.toString(resultado));
    }


    
    private float getResultado(char operador){
        float val1f;
        float val2f;
        float result = 0;
        switch(operador){
            case '+':
                val1f = Float.parseFloat(val1.getText());
                val2f = Float.parseFloat(val2.getText());

                result = val1f + val2f;
                break;

            case '-':
                val1f = Float.parseFloat(val1.getText());
                val2f = Float.parseFloat(val2.getText());

                result = val1f - val2f;
                break;

            case '/':
                val1f = Float.parseFloat(val1.getText());
                val2f = Float.parseFloat(val2.getText());

                result = val1f / val2f;
                break;

            case '*':
                val1f = Float.parseFloat(val1.getText());
                val2f = Float.parseFloat(val2.getText());

                result = val1f * val2f;
                break;
        }

        return result;
            
        }
    }

