package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Titulo Tela
			primaryStage.setTitle("TELA HOME");
			//Definir se a tela pode crescer
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			//Carregar a tela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/TelaHome.fxml"));
			Parent arquivoFxml = loader.load();
			
			//Carregar a cena
			Scene home = new Scene(arquivoFxml);
			primaryStage.setScene(home);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
