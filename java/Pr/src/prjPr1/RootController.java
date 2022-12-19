package prjPr1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	
	
	private Stage primaryStage;	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	 
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleTeamAction(ActionEvent e) throws Exception {
		FXMLLoader another = new FXMLLoader(getClass().getResource("Team.fxml"));
		try {
		   BorderPane anotherPage = (BorderPane) another.load();
		   Scene anotherScene = new Scene(anotherPage);
		   Stage stage = new  Stage();
		   stage.setScene(anotherScene);
		   stage.show();
		} catch (IOException e2) {
		   // TODO Auto-generated catch block
		   e2.printStackTrace();
		}
	}
	public void handlePlayerAction(ActionEvent e) throws Exception {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(primaryStage);
			dialog.setTitle("선수 등록");
			
			Parent parent = FXMLLoader.load(getClass().getResource("player.fxml"));
			Button exitPlayer = (Button) parent.lookup("#exitPlayer");
			exitPlayer.setOnAction(event->dialog.close());	
			Scene scene = new Scene(parent);
			
			dialog.setScene(scene);
			dialog.show();
		}
	public void handleMatchAction(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("경기 등록");
		
		Parent parent = FXMLLoader.load(getClass().getResource("match.fxml"));
		Button exitMatch = (Button) parent.lookup("#exitMatch");
		exitMatch.setOnAction(event->dialog.close());	
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
	
		dialog.show();
	}
	public void handleRecordsAction(ActionEvent e) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("선수 기록");
		
		Parent parent = FXMLLoader.load(getClass().getResource("record.fxml"));
		Button exitRecord = (Button) parent.lookup("#exitRecord");
		exitRecord.setOnAction(event->dialog.close());	
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);
		
		dialog.show();
	}
	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}
}
	