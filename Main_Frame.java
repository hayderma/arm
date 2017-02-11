//import java.awt.Label;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;
import javafx.scene.layout.HBox;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.GREEN;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

public class Main_Frame extends Application {
    

    static Scene scene,scene_2;
    //Stage Win_primary;
    static Stage Win_primary_pass;
    
    @Override

    public void start(Stage Win_primary) throws Exception {

        Win_primary.setTitle("AN-0");
        Win_primary_pass = Win_primary;
        HBox hb_downside = new HBox();

        Button start,exit_pro,back_to_start;

        start= new Button();

        start.setText("Start");

        Image exit_door = new Image("file:C:\\Users\\Aero\\Pictures\\FX\\vector-icons_05-128 (2).png");
        Image en_logo = new Image ("file:C:\\Users\\Aero\\Pictures\\FX\\logoa.png");
        Label logo = new Label ();
        logo.setGraphic(new ImageView(en_logo));
        

        exit_pro= new Button ();
        exit_pro.setGraphic(new ImageView(exit_door));
        
        
        
       // hb_downside.getChildren().add(exit_pro);

          start.setStyle(

                "-fx-background-radius: 100em; " +

                "-fx-min-width: 200px; " +

                "-fx-min-height: 200px; " +

                "-fx-max-width: 200px; " +

                "-fx-max-height: 170px;" +

                "-fx-font-size: 20px"

        );
          
          //Text top_text = new Text("Welcome to MEEDO");
           exit_pro.setMaxSize(50, 50);
           exit_pro.setOnAction(e -> {
            try {
                Connecting.conn.close();
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();   
            }
             finally {
               Win_primary.close();
   
                }
               
                   });
        
        StackPane layout = new StackPane();
        layout.setStyle("-fx-background-color: #FFFFFF ;");
        layout.getChildren().add(start);
        layout.setAlignment(exit_pro, Pos.BOTTOM_CENTER);
         layout.getChildren().addAll(exit_pro,logo);
         layout.setAlignment(logo, Pos.TOP_CENTER);
         
         //layout.setAlignment(top_text, Pos.TOP_CENTER);
         //layout.getChildren().add(top_text);
         

         
        start.setOnAction(e -> {
            Win_primary.setScene(scene_2);
            Win_primary.setMinHeight(1200);
            Win_primary.setMinWidth(1200);
            //Win_primary.setMaximized(true);
        
            //Win_primary.setFullScreen(true);
                });
        scene = new Scene(layout, 300, 250);
        
        
        
        //scene 2
        BorderPane BPane = new BorderPane();
        
        //top area hbox
        
        HBox top = new HBox(5);
        //Text top_text = new Text("Welcome to MEEDO");
        
        //top_text.setFill(Color.BLUE);
        //top_text.setFont(Font.font("Berlin Sans FB",22));
        back_to_start = new Button("Cancel\n Order");
         back_to_start.setStyle(

                "-fx-background-radius: 100em; " +

                "-fx-min-width: 100px; " +

                "-fx-min-height: 100px; " +

                "-fx-max-width: 100px; " +

                "-fx-max-height: 170px;" +

                "-fx-font-size: 13px"

        );
        top.getChildren().addAll(back_to_start);
        
        //right area Vbox
        
        VBox right = new VBox();
        right.setSpacing(15);
        right.setPadding(new Insets(25));
        Button cat1 = new Button ("Appetizers");
        Button cat2 = new Button ("Burger");
        Button cat3 = new Button ("Sandwiches");
        Button cat4 = new Button ("Salads");
        Button cat5 = new Button ("Subs");
        Button cat6 = new Button ("BreakFast");
        Button cat7 = new Button ("SeaFood");
        Button cat8 = new Button ("B.B.Q");
        Button cat9 = new Button ("Iraqi Meals");
        Button cat10 = new Button ("CAT 10");
        
        cat1.setMinSize(200, 80);
        cat2.setMinSize(200, 80);
        cat3.setMinSize(200, 80);
        cat4.setMinSize(200, 80);
        cat5.setMinSize(200, 80);
        cat1.setOnAction(e -> {
            try {
                Win_primary.setScene(Appetizers.menu());
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
           
                });
        
         cat2.setOnAction(e -> {
            try {
                Win_primary.setScene(Burgers.menu());
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
           
                });
         
         cat8.setOnAction(e -> {
            try {
                Win_primary.setScene(BBQ.menu());
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
           
                });
       
        //cat1.setStyle("-fx-font-size: 30pt;");
        //cat2.setStyle("-fx-font-size: 30pt;");
        //cat3.setStyle("-fx-font-size: 30pt;");
        //cat4.setStyle("-fx-font-size: 30pt;");
        //cat5.setStyle("-fx-font-size: 30pt;");
        right.getChildren().addAll(cat1,cat2,cat3,cat4,cat5);
        
        //left Vbox
        VBox left = new VBox();
        left.setPadding(new Insets(25));
        left.setSpacing(15);
        
        
         
        cat6.setMinSize(200, 80);
        cat7.setMinSize(200, 80);
        cat8.setMinSize(200, 80);
        cat9.setMinSize(200, 80);
        cat10.setMinSize(200, 80);
        left.getChildren().addAll(cat6,cat7,cat8,cat9,cat10);
        
        BPane.setTop(top);
        BPane.setRight(right);
        BPane.setLeft(left);
        //BPane.setAlignment(top_text, Pos.TOP_CENTER);
        
        
        //StackPane layout2 = new StackPane();
        
        //layout2.setStyle("-fx-background-color: #FFFFFF ;");
        //layout2.getChildren().add(back_to_start);
        //layout.setAlignment(back_to_start, Pos.BOTTOM_CENTER);
        scene_2 = new Scene (BPane,300,250);   
        back_to_start.setOnAction(e -> {
            Win_primary.setScene(scene);
            Win_primary.setMinHeight(700);
            Win_primary.setMinWidth(700);
            Win_primary.setFullScreen(true);
                });
         
       
        Win_primary.setScene(scene);
        Win_primary.setMinHeight(700);
        Win_primary.setMinWidth(700);
       // Win_primary.setMaximized(true);
        
       // Win_primary.setFullScreen(true);
        //Win_primary.initStyle(StageStyle.UNDECORATED);

        Win_primary.show();

    }
    
    
    
    


    public static void main(String[] args) {

      
        launch(args);

    }

    

}