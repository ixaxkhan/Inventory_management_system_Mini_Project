/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author tanzeem
 */
public class InventoryMainController implements Initializable {
    
    private Label label;
    @FXML
    private BorderPane rootLayout;
    @FXML
    private ToggleGroup g1;
    @FXML
    private ToggleGroup g11;
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         changeScene("SaleScene.fxml");
        // TODO
    }    

    @FXML
    private void SetSaleScene(ActionEvent event) {
        changeScene("SaleScene.fxml");
    }

    @FXML
    private void SetPurchaseScene(ActionEvent event) {
        changeScene("PurchaseScene.fxml");
    }

    @FXML
    private void SetCoustomerScene(ActionEvent event) {
        changeScene("CustomerScene.fxml");
        
    }

    @FXML
    private void SetSellerScene(ActionEvent event) {
        changeScene("SellerScene.fxml");
    }
     
    public  void changeScene(String scenePath){

        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource(scenePath));
        AnchorPane pane = new AnchorPane();

    try{
            pane = (AnchorPane) loader.load();
            rootLayout.setCenter(pane);
        }
        catch(Exception e){
        }

     }

    @FXML
    private void SetInventoryScene(ActionEvent event) {
         changeScene("InventoryScene.fxml");
    }
}