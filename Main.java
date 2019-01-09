package application;
	
import javafx.application.Application;
import javafx.application.Platform; //fuer EXIT Button
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;





public class Main extends Application {
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage stage) throws Exception{
		
		//Komponenten und Buttons erste Scene
		Label lb1 = new Label();
		lb1.setText("1. Scene");
		stage.setTitle("Menu");
		Button btnl = new Button();
		btnl.setText("Show");
		Button btnr = new Button();
		btnr.setText("Manual");
		
		//Layout erste Scene
		FlowPane fp1 = new FlowPane();
		fp1.setHgap(50);
	    fp1.setVgap(50);
	    fp1.setPadding(new Insets(60,15,15,60));
		Scene scene = new Scene(fp1, 370, 150);
		
		fp1.getChildren().addAll(btnl, lb1, btnr);
		
/*---------------------------------------------------------------------*/
		
		//Komponenten fuer zweiten Scene
		final Label lb2 = new Label();
		lb2.setText("2. Scene");
		Button anima = new Button();
		anima.setText("Animation");
		Button back2 = new Button();
		back2.setText("Back");
		
		//Layout fuer zweite Scene
		final FlowPane fp2 = new FlowPane();
		final Scene secondScene = new Scene(fp2, 370, 150);
		fp2.setHgap(50);
		fp2.setVgap(50);
		fp2.setPadding(new Insets(60,15,15,60));
	
		fp2.getChildren().addAll(back2, lb2, anima);
		
		stage.setScene(scene);
		stage.show();
		
/*---------------------------------------------------------------------*/
		
		//Komponenten fuer dritte Scene
	    Label lb3 = new Label();
	    lb3.setText("3. Scene");
	    Button back3 = new Button();
		back3.setText("Back");
		
		//Layout fuer dritte Scene
		final FlowPane fp3 = new FlowPane();
		final Scene thirdScene = new Scene(fp3, 370, 150);
		fp3.setHgap(50);
		fp3.setVgap(50);
		fp3.setPadding(new Insets(60,15,15,60));
	    
		fp3.getChildren().addAll(back3, lb3);
	    stage.setScene(scene);
	    stage.show();
	    
/*---------------------------------------------------------------------*/	    
	    
	    //Elemente fuer vierte Scene (manuel, noch leer)
	    Label lb4 = new Label();
	    lb4.setText("4.Scene");
	    Button back4 = new Button();
	    back4.setText("Back");
	    
	    //Layout vierte Scene
	    final FlowPane fp4 = new FlowPane();
		final Scene fourthScene = new Scene(fp4, 370, 150);
		fp4.setHgap(50);
		fp4.setVgap(50);
	    fp4.setPadding(new Insets(60,15,15,60));
	    
	    fp4.getChildren().addAll(back4, lb4);
	    stage.setScene(scene);
	    stage.show();
	    
/*---------------------------------------------------------------------*/	    
	    
		//Handler
	    //Manual Button
	    btnr.setOnAction(e -> {
	    	stage.setScene(fourthScene);
	    	stage.setTitle("Manual");
	    });
	    //Show Button
		btnl.setOnAction(e ->{
			stage.setScene(secondScene);
			stage.setTitle("init Show");
		});
		//Animation Button
		anima.setOnAction(e -> {
			stage.setScene(thirdScene);
			stage.setTitle("Animation");
		});
		//Back Button in Scene 2
		back2.setOnAction(e -> {
			stage.setScene(scene);
			stage.setTitle("Menu");
		});
		//Back Button in Scene 3
		back3.setOnAction(e -> {
			stage.setScene(secondScene);
			stage.setTitle("Init Show");
			
		});
		//Back Button in Scene 4
		back4.setOnAction(e -> {
			stage.setScene(scene);
			stage.setTitle("Menu");
		});
	}


}
