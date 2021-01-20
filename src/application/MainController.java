package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainController implements Initializable{

	public void changeToRegisterScreen(ActionEvent event) throws IOException {
		Parent registerParent = FXMLLoader.load(getClass().getResource("Register.fxml"));
		Scene registerScene = new Scene(registerParent);
		registerScene.setFill(Color.TRANSPARENT);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(registerScene);
		window.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
