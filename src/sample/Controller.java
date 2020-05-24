package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> ComboBoxPrint;

    @FXML
    private TextArea TextAreaResult;

    @FXML
    void initialize() {


        ComboBoxPrint.setOnAction(event -> {

            if(ComboBoxPrint.getValue() == null)
            {

                TextAreaResult.setText("Pls, set value in ComboBox!");

            }
            else
            {

                StringBuilder result = new StringBuilder();

                for(int i = 0; i < Integer.parseInt(ComboBoxPrint.getValue().toString()); i++)
                {

                    for(int j = 0; j <= i; j++)
                    {

                        result.append(ComboBoxPrint.getValue().toString());

                    }

                    result.append("\n");

                }

                TextAreaResult.setText(result.toString());

            }

        });


    }
}
