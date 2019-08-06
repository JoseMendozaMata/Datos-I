import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;

//clase ventana, debe tener un main que contenga launch(args) además de tener un método start el cual se encarga
// de la utilidad de la ventana, se usa implements EventHandler para interactuar con el usuario

public class window extends Application{
	
	Stage window;
	Scene scene;
	ArrayList<String> data = new ArrayList<String>();
	GridPane grid = new GridPane();
	
	int filas;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		window.setTitle("Obtener valores del input");
		
		Label label = new Label("Nombre del CSV: ");
		GridPane.setConstraints(label, 0,0);
		
		TextField csvInput = new TextField();
		csvInput.setPromptText("nombre del archivo");
		GridPane.setConstraints(csvInput, 1, 0);
		
		Button abrir = new Button("Cargar archivo");
		abrir.setOnAction(e -> readArchive(csvInput));
		GridPane.setConstraints(abrir, 0, 1);
		
		Button build = new Button("Display Grid");
		build.setOnAction(e -> buildGrid());
		GridPane.setConstraints(build, 1, 1);
		
		this.grid.getChildren().addAll(label, csvInput, abrir, build);
		
		scene = new Scene(this.grid, 800, 500);
		
		window.setScene(scene);
		window.show();
	}

	private void readArchive(TextField data) {
		
		String fileName = data.getText() + ".csv"; 
		File file = new File(fileName);
		String state;
		
		try {
			Scanner archivo = new Scanner(file);
			System.out.println("Leyendo archivo");

			// Se cuentan las lineas para hacer un arreglo de ese tamaño
			if(!archivo.hasNext()) {
				state = "Archivo vacío";
			}else {
				while(archivo.hasNext()) {
					String linea = archivo.next();
					this.data.add(linea);
				}
			}
			archivo.close();
			state="Cargado con éxito";
		} catch (FileNotFoundException e) {
			System.out.println("Error, archivo no existe");
			state = "Error";
		}
		
		Label estado = new Label(state);
		GridPane.setConstraints(estado, 0, 2);
		this.grid.getChildren().add(estado);
		
	}
	private void buildGrid () {

		int fila = 2;
		int columna = 0;
		
		for(int i = 0; i < this.data.size();i++) {
			columna++;
			String Infofila  = this.data.get(i);
			String[] arreglo = Infofila.split(",");
			for(int j = 0; j < arreglo.length;j++) {
				System.out.println(arreglo[j]);
				Label label = new Label(arreglo[j]);
				label.setPadding(new Insets(10,10,10,10));		//Top, right, bottom, left
				GridPane.setConstraints(label, fila, columna);
				this.grid.getChildren().add(label);
				fila++;
			}
			fila = 2;
		}
		
	
		
	}
}