import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JingleWriterGui extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Hello World");
		
		VBox root = new VBox();

		Label hello = new Label("hello");
		Label world = new Label("world");

		root.getChildren().addAll(hello, world);

		primaryStage.setScene(new Scene(root));

		primaryStage.show();
	}
}
