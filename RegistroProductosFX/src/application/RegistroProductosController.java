package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class RegistroProductosController implements Initializable{
	@FXML private ComboBox<String> cboMarca;
	@FXML private ComboBox<String> cboLote;
	@FXML private ComboBox<String> cboCategoria;
	@FXML private ComboBox<String> cboUnidadMedida;
	@FXML private ComboBox<String> cboProveedor;
	
	private ObservableList<String> listaMarcas;
	private ObservableList<String> listaLotes;
	private ObservableList<String> listaCategorias;
	private ObservableList<String> listaUnidadesMedidas;
	private ObservableList<String> listaProveedores;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listaMarcas = FXCollections.observableArrayList();
		listaLotes = FXCollections.observableArrayList();
		listaCategorias = FXCollections.observableArrayList();
		listaUnidadesMedidas = FXCollections.observableArrayList();
		listaProveedores = FXCollections.observableArrayList();
		
		llenarListas();
		cboMarca.setItems(listaMarcas);
		cboLote.setItems(listaLotes);
		cboCategoria.setItems(listaCategorias);
		cboUnidadMedida.setItems(listaUnidadesMedidas);
		cboProveedor.setItems(listaProveedores);
	}
	
	public void llenarListas(){
		listaMarcas.add("Marca 1");
		listaMarcas.add("Marca 2");
		listaMarcas.add("Marca 3");
		
		listaLotes.add("Lote 1");
		listaLotes.add("Lote 2");
		listaLotes.add("Lote 3");
		
		listaCategorias.add("Categoria 1");
		listaCategorias.add("Categoria 2");
		listaCategorias.add("Categoria 3");

		listaUnidadesMedidas.add("Unidad medida 1");
		listaUnidadesMedidas.add("Unidad medida 2");
		listaUnidadesMedidas.add("Unidad medida 3");
		
		listaProveedores.add("Proveedor 1");
		listaProveedores.add("Proveedor 2");
		listaProveedores.add("Proveedor 3");
	}
	
}