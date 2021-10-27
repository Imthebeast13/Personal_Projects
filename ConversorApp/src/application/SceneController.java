package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController implements Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;
	private Controller controller = new Controller();
	private String css = this.getClass().getResource("application.css").toExternalForm();



	@FXML
	private ComboBox<String> opt1 = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2 = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_Area = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_Area = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_Distancia = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_Distancia = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_DS = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_DS = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_P = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_P = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_T = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_T = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_Veloc = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_Veloc = new ComboBox<>();
	@FXML
	private ComboBox<String> opt1_Vol = new ComboBox<>();
	@FXML
	private ComboBox<String> opt2_Vol = new ComboBox<>();

	private String[] massa = {"kg", "lbs", "ounce"};
	private String[] area = {"m2", "ha", "ac", "yard2"};
	private String[] distancia = {"km", "mi", "ft", "yd"};
	private String[] ds = {"byte", "bit"};
	private String[] pressao = {"bar", "psi", "pascal"};
	private String[] temp = {"Cº", "Fº", "Kº"};
	private String[] veloc = {"km/h", "mi/h", "knot/h"};
	private String[] vol = {"L", "Gal"};

	@FXML
	private TextField textfield;
	@FXML
	private TextField textfieldArea;
	@FXML
	private TextField textfieldDist;
	@FXML
	private TextField textfieldDS;
	@FXML
	private TextField textfieldPressao;
	@FXML
	private TextField textfieldTemp;
	@FXML
	private TextField textfieldVeloc;
	@FXML
	private TextField textfieldVol;
	@FXML
	private Button submit;
	
	@FXML
	private Label resultLabel;
	@FXML
	private Label resultLabelArea;
	@FXML
	private Label resultLabelDist;

	private double valor;



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		//Massa
		ObservableList<String> massaList1 = FXCollections.observableArrayList(massa);
		ObservableList<String> massaList2 = FXCollections.observableArrayList(massa);
		opt1.setItems(massaList1);
		opt2.setItems(massaList2);
		
		//Area
		ObservableList<String> areaList1 = FXCollections.observableArrayList(area);
		ObservableList<String> areaList2 = FXCollections.observableArrayList(area);
		opt1_Area.setItems(areaList1);
		opt2_Area.setItems(areaList2);
		
		//Distancia
		ObservableList<String> distList1 = FXCollections.observableArrayList(distancia);
		ObservableList<String> distList2 = FXCollections.observableArrayList(distancia);
		opt1_Distancia.setItems(distList1);
		opt2_Distancia.setItems(distList2);
		
		//DStorage
		ObservableList<String> dsList1 = FXCollections.observableArrayList(ds);
		ObservableList<String> dsList2 = FXCollections.observableArrayList(ds);
		opt1_DS.setItems(dsList1);
		opt2_DS.setItems(dsList2);
		
		//Pressao
		ObservableList<String> pList1 = FXCollections.observableArrayList(pressao);
		ObservableList<String> pList2 = FXCollections.observableArrayList(pressao);
		opt1_P.setItems(pList1);
		opt2_P.setItems(pList2);
		
		//Temperatura
		ObservableList<String> tList1 = FXCollections.observableArrayList(temp);
		ObservableList<String> tList2 = FXCollections.observableArrayList(temp);
		opt1_T.setItems(tList1);
		opt2_T.setItems(tList2);
		
		//Velocidade
		ObservableList<String> velocList1 = FXCollections.observableArrayList(veloc);
		ObservableList<String> velocList2 = FXCollections.observableArrayList(veloc);
		opt1_Veloc.setItems(velocList1);
		opt2_Veloc.setItems(velocList2);
		
		//Volume
		ObservableList<String> volumeList1 = FXCollections.observableArrayList(vol);
		ObservableList<String> volumeList2 = FXCollections.observableArrayList(vol);
		opt1_Vol.setItems(volumeList1);
		opt2_Vol.setItems(volumeList2);
	}

	public void switchToMain(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToMassa(ActionEvent event) {

		try {

			root = FXMLLoader.load(getClass().getResource("Massa.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();					
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToArea(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Area.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDistancia(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Distancia.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToDigitalStorage(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("DigitalStorage.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToPressao(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Pressao.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToTemperatura(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Temperatura.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToVelocidade(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Velocidade.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void switchToVolume(ActionEvent event) {
		try {

			root = FXMLLoader.load(getClass().getResource("Volume.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void calculateMassa(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfield.getText());
			String result;

			String[] params = {opt1.getSelectionModel().getSelectedItem(),
					opt2.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.massaEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
		
	}

	public void calculateArea(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldArea.getText());
			String result;

			String[] params = {opt1_Area.getSelectionModel().getSelectedItem(),
					opt2_Area.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.areaEvent(params));
			
		
			resultLabelArea.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculateDistancia(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldDist.getText());
			String result;

			String[] params = {opt1_Distancia.getSelectionModel().getSelectedItem(),
					opt2_Distancia.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.distanciaEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculateDStorage(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldDS.getText());
			String result;

			String[] params = {opt1_DS.getSelectionModel().getSelectedItem(),
					opt2_DS.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.digitalStorageEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculatePressao(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldPressao.getText());
			String result;

			String[] params = {opt1_P.getSelectionModel().getSelectedItem(),
					opt2_P.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.pressaoEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculateTemp(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldTemp.getText());
			String result;

			String[] params = {opt1_T.getSelectionModel().getSelectedItem(),
					opt2_T.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.temperaturaEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculateVeloc(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldVeloc.getText());
			String result;

			String[] params = {opt1_Veloc.getSelectionModel().getSelectedItem(),
					opt2_Veloc.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.velocidadeEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	public void calculateVolume(ActionEvent event) {
		
		try {
			//double
			valor = Double.parseDouble(textfieldVol.getText());
			String result;

			String[] params = {opt1_Vol.getSelectionModel().getSelectedItem(),
					opt2_Vol.getSelectionModel().getSelectedItem(),
					Double.toString(valor)};
			
			for (String s : params)
				System.out.println(s);
			
			result = Double.toString(controller.volumeEvent(params));
			
		
			resultLabel.setText(result + " " + params[1]);
			
		} catch (NumberFormatException e) {
			resultLabel.setText("Insira um número");
		} catch (Exception e) {
			e.printStackTrace();
			resultLabel.setText("Erro");
		}
	}
	
	

}
