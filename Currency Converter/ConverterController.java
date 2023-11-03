import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConverterController implements Initializable{

    @FXML
    private ChoiceBox<String> base_choice;

    @FXML
    private TextField base_input;

    @FXML
    private Button btn;

    @FXML
    private Label message;

    @FXML
    private ChoiceBox<String> target_choice;

    private String[] base = {"Australian Dollar","Euro EUR","Indian Rupee","UAE Dirham","US Dollar"};

    private String[] target = {"Australian Dollar","Euro EUR","Indian Rupee","UAE Dirham","US Dollar"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        base_choice.getItems().addAll(base);
        target_choice.getItems().addAll(target);
    }

    @FXML
    void converter(ActionEvent event) throws IOException{
        try {
            String mybase = base_choice.getValue();
            String mytarget = target_choice.getValue();

            String baseStr = base_input.getText();
            double baseCurr = Double.parseDouble(baseStr);

            if(mybase == mytarget){
                JOptionPane.showMessageDialog(null, "You select base currency and target currency same!!");
            }
            else if(mybase == "Australian Dollar" && mytarget == "Euro EUR"){
                double ans = (baseCurr * 0.6007);
                message.setText(baseStr+" Australian Dollar = "+ans+" Euro");
            }
            else if(mybase == "Australian Dollar" && mytarget == "Indian Rupee"){
                double ans = (baseCurr * 52.77);
                message.setText(baseStr+" Australian Dollar = "+ans+" Indian Rupee");
            }
            else if(mybase == "Australian Dollar" && mytarget == "UAE Dirham"){
                double ans = (baseCurr * 2.3284);
                message.setText(baseStr+" Australian Dollar = "+ans+" UAE Dirham");
            }
            else if(mybase == "Australian Dollar" && mytarget == "US Dollar"){
                double ans = (baseCurr * 0.6338);
                message.setText(baseStr+" Australian Dollar = "+ans+" US Dollar");
            }
            else if(mybase == "Euro EUR" && mytarget == "Australian Dollar"){
                double ans = (baseCurr * 1.6664);
                message.setText(baseStr+" Euro EUR = "+ans+" Australian Dollar");
            }
            else if(mybase == "Euro EUR" && mytarget == "Indian Rupee"){
                double ans = (baseCurr * 87.8766);
                message.setText(baseStr+" Euro EUR = "+ans+" Indian Rupee");
            }
            else if(mybase == "Euro EUR" && mytarget == "UAE Dirham"){
                double ans = (baseCurr * 3.8781);
                message.setText(baseStr+" Euro EUR = "+ans+" UAE Dirham");
            }
            else if(mybase == "Euro EUR" && mytarget == "US Dollar"){
                double ans = (baseCurr * 1.0557);
                message.setText(baseStr+" Euro EUR = "+ans+" US Dollar");
            }
            else if(mybase == "Indian Rupee" && mytarget == "Australian Dollar"){
                double ans = (baseCurr * 0.019);
                message.setText(baseStr+" Indian Rupee = "+ans+" Australian Dollar");
            }
            else if(mybase == "Indian Rupee" && mytarget == "Euro EUR"){
                double ans = (baseCurr * 0.0114);
                message.setText(baseStr+" Indian Rupee = "+ans+" Euro EUR");
            }
            else if(mybase == "Indian Rupee" && mytarget == "UAE Dirham"){
                double ans = (baseCurr * 0.0);
                message.setText(baseStr+" Indian Rupee = "+ans+" UAE Dirham");
            }
            else if(mybase == "Indian Rupee" && mytarget == "US Dollar"){
                double ans = (baseCurr * 0.012);
                message.setText(baseStr+" Indian Rupee = "+ans+" US Dollar");
            }
            else if(mybase == "UAE Dirham" && mytarget == "Australian Dollar"){
                double ans = (baseCurr * 0.4298);
                message.setText(baseStr+" UAE Dirham = "+ans+" Australian Dollar");
            }
            else if(mybase == "UAE Dirham" && mytarget == "Euro EUR"){
                double ans = (baseCurr * 0.2579);
                message.setText(baseStr+" UAE Dirham = "+ans+" Euro EUR");
            }
            else if(mybase == "UAE Dirham" && mytarget == "Indian Rupee"){
                double ans = (baseCurr * 22.6629);
                message.setText(baseStr+" UAE Dirham = "+ans+" Indian Rupee");
            }
            else if(mybase == "UAE Dirham" && mytarget == "US Dollar"){
                double ans = (baseCurr * 0.2723);
                message.setText(baseStr+" UAE Dirham = "+ans+" US Dollar");
            }
            else if(mybase == "US Dollar" && mytarget == "Australian Dollar"){
                double ans = (baseCurr * 1.5781);
                message.setText(baseStr+" US Dollar = "+ans+" Australian Dollar");
            }
            else if(mybase == "US Dollar" && mytarget == "Euro EUR"){
                double ans = (baseCurr * 0.9471);
                message.setText(baseStr+" US Dollar = "+ans+" Euro EUR");
            }
            else if(mybase == "US Dollar" && mytarget == "Indian Rupee"){
                double ans = (baseCurr * 83.2435);
                message.setText(baseStr+" US Dollar = "+ans+" Indian Rupee");
            }
            else if(mybase == "US Dollar" && mytarget == "UAE Dirham"){
                double ans = (baseCurr * 3.6731);
                message.setText(baseStr+" US Dollar = "+ans+" UAE Dirham");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

