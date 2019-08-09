import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExceptionWindow extends Application{

	Stage stage;
	Scene scene;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		stage.setTitle("Ventana de excepciones");
		
		Label label = new Label("Ingrese dos números a dividir");
		GridPane.setConstraints(label,0,0);
		
		TextField num1Input = new TextField();
		GridPane.setConstraints(num1Input,0,1);
		
		TextField num2Input = new TextField();
		GridPane.setConstraints(num2Input,1,1);
		
		Button cargar = new Button("Cargar");
		cargar.setOnAction(e -> dividir(num1Input,num2Input));
		GridPane.setConstraints(cargar,0,2);
		
		GridPane stack = new GridPane();
		stack.getChildren().addAll(label,cargar, num1Input, num2Input);
		
		Scene scene = new Scene(stack, 600,200);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void dividir(TextField text1, TextField text2) {
		
		String msg = "";
		
		try {
			float num1 = Integer.parseInt(text1.getText());
			float num2 = Integer.parseInt(text2.getText());
			
			if(num2 == 0) {
				throw new DenominatorCeroException("Error, denominador es 0");
			}
			
			float res = num1/num2;
			
			msg = "El resultado de la división es: " + res + ".";
		
		}catch (java.lang.NumberFormatException e) {
			msg = "Los datos ingresados son inválidos.";
		}catch(DenominatorCeroException e) {
			msg = "El denominador no puede ser cero.";
		}finally {
			JOptionPane.showMessageDialog(null,msg,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
