import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.RED;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Appetizers  {

    static Scene scene;
    static int quan1;
    static int quan2;
    static int quan3;
    static int quan4;
    static int quan5;
    
    static Label L_1;
    static Label L_2;
    static Label L_3 ;
    static Label L_4;
    static Label L_5;
    
     static Label EL0 = new Label();
     static Label EL1 = new Label();
     static Label EL2 = new Label();
     static Label EL3 = new Label();
     static Label EL4 = new Label();
     static Label EL5 = new Label();
     static Label EL6 = new Label();
     static Label EL7 = new Label();
     
     
   
    public static Label label_factory(String id, String pr,int q){
        
        StringBuilder sb = new StringBuilder();
        sb .append(id).append("  (x").append(q).append(")         $ ").append(pr);
        //System.out.println(sb);
        
        Label label = new Label(sb.toString());
        label.setFont(new Font("Arial", 20));
        
        return label;
    }
    
      public static String label_text(String nm, String pr,int q){
        
        StringBuilder sb = new StringBuilder();
        sb .append(nm).append("  (x").append(q).append(")         $ ").append(pr);
        //System.out.println(sb);
       ;
        
        return sb.toString();
    }
   
      

    

   
   
    public static Scene menu() throws SQLException{
        
         ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb.getSelectionModel().selectFirst();
        
        ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb2.getSelectionModel().selectFirst();
        
        ChoiceBox cb3 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb3.getSelectionModel().selectFirst();
        
        ChoiceBox cb4 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb4.getSelectionModel().selectFirst();
        
        ChoiceBox cb5 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb5.getSelectionModel().selectFirst();
        
        double baba_gh = Connecting.get_cost(Connecting.conn,59);
        double hummus = Connecting.get_cost(Connecting.conn,60);
        double chicken_wings = Connecting.get_cost(Connecting.conn,61);
        double fried_shrimp = Connecting.get_cost(Connecting.conn,62);
        double chichen_strips = Connecting.get_cost(Connecting.conn,63);
        Button tb1 = new Button();
        
        tb1.setText("Baba Ghanoush  بابا غنوج"+"   $ "+ Double.toString(baba_gh));
        tb1.setFont(new Font("Arial", 14));
        Button tb2 = new Button();
        
        tb2.setText("Hummus  حمص بطحينة"+"   $ "+ Double.toString(hummus));
        tb2.setFont(new Font("Arial", 14));
        Button tb3 = new Button();
        tb3.setText("Crispy Fried Chicken Wings  اجنحة دجاج مقرمش"+"   $ "+ Double.toString(chicken_wings));
        tb2.setFont(new Font("Arial", 14));
        Button tb4 = new Button();
        tb4.setText("Crispy Fried Shrimp  روبيان مقرمش"+"   $ "+ Double.toString(fried_shrimp));
        tb4.setFont(new Font("Arial", 14));
        Button tb5 = new Button();
        tb5.setText("Crispy Chicken Strips   شرائح دجاج مقرمش"+"   $ "+ Double.toString(chichen_strips));
        tb5.setFont(new Font("Arial", 14));
        Button cancel_1 = new Button("Remove From Order");
        
        Button cancel_2 = new Button("Remove From Order");
        Button cancel_3 = new Button("Remove From Order");
        Button cancel_4 = new Button("Remove From Order");
        Button cancel_5 = new Button("Remove From Order");
        cancel_1.setTextFill(RED);
        cancel_2.setTextFill(RED);
        cancel_3.setTextFill(RED);
        cancel_4.setTextFill(RED);
        cancel_5.setTextFill(RED);
        
        cancel_1.setOnAction(e -> cb.setValue(0));
        cancel_2.setOnAction(e -> cb2.setValue(0));
        cancel_3.setOnAction(e -> cb3.setValue(0));
        cancel_4.setOnAction(e -> cb4.setValue(0));
        cancel_5.setOnAction(e -> cb5.setValue(0));
        //back.setOnAction(e -> Main_Frame.Win_primary_pass.setScene(Main_Frame.scene_2));
        tb1.setMinSize(320, 90);
        tb2.setMinSize(320, 90);
        tb3.setMinSize(320, 90);
        tb4.setMinSize(320, 90);
        tb5.setMinSize(320, 90);
       
        int tb1_ctr =0;
        quan1 = (int) cb.getValue();
        quan2= (int) cb2.getValue();
        quan3= (int) cb3.getValue();
        quan4= (int) cb4.getValue();
        quan5= (int) cb5.getValue();
        
        //primary actions
        
       tb1.setOnAction(e -> {
           
           cb.setValue(1);
           cancel_1.setVisible(true);
            try {
                EL0.setText(label_text("Baba Ghanoush",Calculate.cal(59,(int)cb.getValue()),(int)cb.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL0.setFont(new Font("Arial", 20));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb.setOnAction(e -> {
            try {
                EL0.setText(label_text("Baba Ghanoush",Calculate.cal(59,(int)cb.getValue()),(int)cb.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL0.setFont(new Font("Arial", 20));
            cancel_1.setVisible(true);
            if ((int)cb.getValue()==0){
                EL0.setText("");
                cancel_1.setVisible(false);
            }
       });
       
        tb2.setOnAction(e -> {
           
           cb2.setValue(1);
           cancel_2.setVisible(true); //here last
            try {
                EL1.setText(label_text("Hummus Tahin ",Calculate.cal(60,(int)cb2.getValue()),(int)cb2.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL1.setFont(new Font("Arial", 20));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb2.setOnAction(e -> {
            try {
                EL1.setText(label_text("Hummus Tahin ",Calculate.cal(60,(int)cb2.getValue()),(int)cb2.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL1.setFont(new Font("Arial", 20));
            cancel_2.setVisible(true);
            if ((int)cb2.getValue()==0){
                EL1.setText("");
                cancel_2.setVisible(false);
            }
       });
       
         tb3.setOnAction(e -> {
           
           cb3.setValue(1);
           cancel_3.setVisible(true); //here last
            try {
                EL2.setText(label_text("Chicken Wings ",Calculate.cal(61,(int)cb3.getValue()),(int)cb3.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL2.setFont(new Font("Arial", 20));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb3.setOnAction(e -> {
            try {
                EL2.setText(label_text("Chicken Wings ",Calculate.cal(61,(int)cb3.getValue()),(int)cb3.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL2.setFont(new Font("Arial", 20));
            cancel_3.setVisible(true);
            if ((int)cb3.getValue()==0){
                EL2.setText("");
                cancel_3.setVisible(false);
            }
       });
       
           tb4.setOnAction(e -> {
           
           cb4.setValue(1);
           cancel_4.setVisible(true); //here last
            try {
                EL3.setText(label_text("Fried Shrimp   ",Calculate.cal(62,(int)cb4.getValue()),(int)cb4.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
                Main_Frame.Win_primary_pass.setScene(scene);
            }
            EL3.setFont(new Font("Arial", 20));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb4.setOnAction(e -> {
            try {
                EL3.setText(label_text("Fried Shrimp   ",Calculate.cal(62,(int)cb4.getValue()),(int)cb4.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL3.setFont(new Font("Arial", 20));
            cancel_4.setVisible(true);
            if ((int)cb4.getValue()==0){
                EL3.setText("");
                cancel_4.setVisible(false);
            }
       });
       
       
            tb5.setOnAction(e -> {
           
           cb5.setValue(1);
           cancel_5.setVisible(true); //here last
            try {
                EL4.setText(label_text("Chicken Strips   ",Calculate.cal(63,(int)cb5.getValue()),(int)cb5.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL4.setFont(new Font("Arial", 20));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb5.setOnAction(e -> {
            try {
                EL4.setText(label_text("Chicken Strips   ",Calculate.cal(63,(int)cb5.getValue()),(int)cb5.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL4.setFont(new Font("Arial", 20));
            cancel_5.setVisible(true);
            if ((int)cb5.getValue()==0){
                EL4.setText("");
                cancel_5.setVisible(false);
            }
       });
      
        //Label EL0 = new Label();
        
       
        Separator sep1 = new Separator();
        Separator sep2 = new Separator();
        Separator sep3 = new Separator();
        Separator sep4 = new Separator();
        //StackPane layout = new StackPane();
        //layout.getChildren().addAll(tb1,tb2,tb3,tb4,tb5);
        //layout.setAlignment(Pos.CENTER);
        
        L_1 = label_factory("BG",Calculate.cal(59,quan1),quan1);
        Label L_2 = label_factory("HM",Calculate.cal(60,quan2),quan2);
        Label L_3 = label_factory("CW",Calculate.cal(61,quan3),quan3);
        Label L_4 = label_factory("SP",Calculate.cal(62,quan4),quan4);
        Label L_5 = label_factory("CS",Calculate.cal(63,quan5),quan5);
        FlowPane BPane = new FlowPane();
       // HBox top= new HBox (back,cancel);
        //top.setSpacing(20);
        //top.setAlignment(Pos.TOP_LEFT);
        //top.setPadding(new Insets(40));
        VBox left = new VBox(tb1,tb2,tb3,tb4,tb5);
        VBox right = new VBox();
        VBox right_2 = new VBox(cancel_1,cancel_2,cancel_3,cancel_4,cancel_5);
        cancel_1.setVisible(false);
        cancel_2.setVisible(false);
        cancel_3.setVisible(false);
        cancel_4.setVisible(false);
        cancel_5.setVisible(false);
        right_2.setAlignment(Pos.CENTER_RIGHT);
        right_2.setPadding(new Insets(57));
        right_2.setSpacing(90);
        right.getChildren().addAll( EL0,cb,sep1,EL1,cb2,sep2,EL2
        ,cb3,sep3,EL3,cb4,sep4,EL4,cb5);
        right.setSpacing(20);
        right.setPadding(new Insets(50));
        //right.getChildren().add(label_factory("Item",3.21,2));
        left.setSpacing(15);
        left.setPadding(new Insets(50));
        BPane.getChildren().addAll(left,right,right_2);
        
        //left.getChildren().addAll(tb1,tb2,tb3,tb4,tb5,cb);
        //BPane.setLeft(left);
        //BPane.setRight(right);
        
        scene = new Scene(BPane, 350, 300,Color.BLACK);
        
        return scene;
    }

    

}