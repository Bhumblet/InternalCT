package application.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class authenticationController implements Initializable{
	
	@FXML
	private JFXButton btnSignIn, btnRegister;
	
	@FXML
	private JFXTextField inpUser, inpId, inpNewUser;
	
	@FXML
	private JFXPasswordField inpPassword, inpNewPassword, inpConfirmPassword;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void changeToRegisterScreen(ActionEvent event) throws IOException {
		Parent registerParent = FXMLLoader.load(getClass().getResource("../FXML/Register.fxml"));
		Scene registerScene = new Scene(registerParent);
		registerScene.setFill(Color.TRANSPARENT);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(registerScene);
		window.show();
	}
	
	public void changeToLoginScreen(ActionEvent event) throws IOException {
		Parent loginParent = FXMLLoader.load(getClass().getResource("../FXML/Login.fxml"));
		Scene loginScene = new Scene(loginParent);
		loginScene.setFill(Color.TRANSPARENT);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(loginScene);
		window.show();
	}
	
	public void btnRegisterToggle(ActionEvent event) {
		btnRegister.setDisable(!btnRegister.isDisabled());
	}
	
	public void signIn(ActionEvent event) {
		System.out.println(inpUser.getText());
		System.out.println(inpPassword.getText());
		
	}
	
	public void register(ActionEvent event) {
		System.out.println(inpId.getText());
		System.out.println(inpNewUser.getText());
		System.out.println(inpNewPassword.getText());
		System.out.println(inpConfirmPassword.getText());
	}
}
