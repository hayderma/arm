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


public class BBQ  {

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
     static Label EL8 = new Label();
     
     
     
   
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
          ChoiceBox cb6 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb6.getSelectionModel().selectFirst();
        
        ChoiceBox cb7 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb7.getSelectionModel().selectFirst();
        
        ChoiceBox cb8 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb8.getSelectionModel().selectFirst();
        
        ChoiceBox cb9 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb9.getSelectionModel().selectFirst();
        
      
        
        
        
        
        
        double holl_chi = Connecting.get_cost(Connecting.conn,45);
        double iqi_kab = Connecting.get_cost(Connecting.conn,46);
        double iqi_chi_kab = Connecting.get_cost(Connecting.conn,47);
        double kuft = Connecting.get_cost(Connecting.conn,48);
        double chalo = Connecting.get_cost(Connecting.conn,49);
        double half_chi = Connecting.get_cost(Connecting.conn,50);
        double chi_shaw = Connecting.get_cost(Connecting.conn,51);
        double meat_shaw = Connecting.get_cost(Connecting.conn,52);
        double lam = Connecting.get_cost(Connecting.conn,53);
       
        
        Button tb1 = new Button();
        tb1.setText("Special Stuffed Chicked with Rice دجاج محشي"+"   $ "+ Double.toString(holl_chi));
        tb1.setFont(new Font("Arial", 14));
        Button tb2 = new Button();
        
        tb2.setText("Iraqi Kaboob Meat كباب عراقي"+"   $ "+ Double.toString(iqi_kab));
        tb2.setFont(new Font("Arial", 14));
        Button tb3 = new Button();
        tb3.setText("Iraqi Kaboob Chicken كباب دجاج عراقي"+"   $ "+ Double.toString(iqi_chi_kab));
        tb2.setFont(new Font("Arial", 14));
        Button tb4 = new Button();
        tb4.setText("Kufta Meat كفتة لحم لبنانية"+"   $ "+ Double.toString(kuft));
        tb4.setFont(new Font("Arial", 14));
        Button tb5 = new Button();
        tb5.setText("Chalo Kaboob Meat كباب مع رز ايراني"+"   $ "+ Double.toString(chalo));
        tb5.setFont(new Font("Arial", 14));
        
        Button tb6 = new Button();
        tb6.setText("Half Chicken with Rice نصف دجاجة مع رز"+"   $ "+ Double.toString(half_chi));
        tb6.setFont(new Font("Arial", 14));
        Button tb7 = new Button();
        
        tb7.setText("Chicken Shawarma with Rice شاورمة دجاج مع رز"+"   $ "+ Double.toString(chi_shaw));
        tb7.setFont(new Font("Arial", 14));
        Button tb8 = new Button();
        tb8.setText("Meat Shawarma with Rice شاورمة لحم مع رز"+"   $ "+ Double.toString(meat_shaw));
        tb8.setFont(new Font("Arial", 14));
        Button tb9 = new Button();
        tb9.setText("Lamb with Rice خروف مع رز"+"   $ "+ Double.toString(lam));
        tb9.setFont(new Font("Arial", 14));
      
        
        
        Button cancel_1 = new Button("Remove From Order");
        Button cancel_2 = new Button("Remove From Order");
        Button cancel_3 = new Button("Remove From Order");
        Button cancel_4 = new Button("Remove From Order");
        Button cancel_5 = new Button("Remove From Order");
        Button cancel_6 = new Button("Remove From Order");
        Button cancel_7 = new Button("Remove From Order");
        Button cancel_8 = new Button("Remove From Order");
        Button cancel_9 = new Button("Remove From Order");
        
        cancel_1.setTextFill(RED);
        cancel_2.setTextFill(RED);
        cancel_3.setTextFill(RED);
        cancel_4.setTextFill(RED);
        cancel_5.setTextFill(RED);
        cancel_6.setTextFill(RED);
        cancel_7.setTextFill(RED);
        cancel_8.setTextFill(RED);
        cancel_9.setTextFill(RED);
        
        
        cancel_1.setOnAction(e -> cb.setValue(0));
        cancel_2.setOnAction(e -> cb2.setValue(0));
        cancel_3.setOnAction(e -> cb3.setValue(0));
        cancel_4.setOnAction(e -> cb4.setValue(0));
        cancel_5.setOnAction(e -> cb5.setValue(0));
        cancel_6.setOnAction(e -> cb6.setValue(0));
        cancel_7.setOnAction(e -> cb7.setValue(0));
        cancel_8.setOnAction(e -> cb8.setValue(0));
        cancel_9.setOnAction(e -> cb9.setValue(0));
        
        //back.setOnAction(e -> Main_Frame.Win_primary_pass.setScene(Main_Frame.scene_2));
        tb1.setMinSize(350, 43);
        tb2.setMinSize(350, 43);
        tb3.setMinSize(350, 43);
        tb4.setMinSize(350, 43);
        tb5.setMinSize(350, 43);
        tb6.setMinSize(350, 43);
        tb7.setMinSize(350, 43);
        tb8.setMinSize(350, 43);
        tb9.setMinSize(350, 43);
        
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
                EL0.setText(label_text("Special Stuffed Chicked with Rice ",Calculate.cal(45,(int)cb.getValue()),(int)cb.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL0.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb.setOnAction(e -> {
            try {
                EL0.setText(label_text("Special Stuffed Chicked with Rice ",Calculate.cal(45,(int)cb.getValue()),(int)cb.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL0.setFont(new Font("Arial", 13));
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
                EL1.setText(label_text("Iraqi Kaboob Meat ",Calculate.cal(46,(int)cb2.getValue()),(int)cb2.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL1.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb2.setOnAction(e -> {
            try {
                EL1.setText(label_text("Iraqi Kaboob Meat ",Calculate.cal(46,(int)cb2.getValue()),(int)cb2.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL1.setFont(new Font("Arial", 13));
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
                EL2.setText(label_text("Iraqi Kaboob Chicken ",Calculate.cal(47,(int)cb3.getValue()),(int)cb3.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL2.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb3.setOnAction(e -> {
            try {
                EL2.setText(label_text("Iraqi Kaboob Chicken ",Calculate.cal(47,(int)cb3.getValue()),(int)cb3.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL2.setFont(new Font("Arial", 13));
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
                EL3.setText(label_text("Kufta Meat  ",Calculate.cal(48,(int)cb4.getValue()),(int)cb4.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL3.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb4.setOnAction(e -> {
            try {
                EL3.setText(label_text("Kufta Meat  ",Calculate.cal(48,(int)cb4.getValue()),(int)cb4.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL3.setFont(new Font("Arial", 13));
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
                EL4.setText(label_text("Chalo Kaboob Meat ",Calculate.cal(49,(int)cb5.getValue()),(int)cb5.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL4.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb5.setOnAction(e -> {
            try {
                EL4.setText(label_text("Chalo Kaboob Meat ",Calculate.cal(49,(int)cb5.getValue()),(int)cb5.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL4.setFont(new Font("Arial", 13));
            cancel_5.setVisible(true);
            if ((int)cb5.getValue()==0){
                EL4.setText("");
                cancel_5.setVisible(false);
            }
       });
       
              tb6.setOnAction(e -> {
           
           cb6.setValue(1);
           cancel_6.setVisible(true); //here last
            try {
                EL5.setText(label_text("Half Chicken with Rice ",Calculate.cal(50,(int)cb6.getValue()),(int)cb6.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL5.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb6.setOnAction(e -> {
            try {
                EL5.setText(label_text("Half Chicken with Rice ",Calculate.cal(50,(int)cb6.getValue()),(int)cb6.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL5.setFont(new Font("Arial", 13));
            cancel_6.setVisible(true);
            if ((int)cb6.getValue()==0){
                EL5.setText("");
                cancel_6.setVisible(false);
            }
       });
       
            tb7.setOnAction(e -> {
           
           cb7.setValue(1);
           cancel_7.setVisible(true); //here last
            try {
                EL6.setText(label_text("Chicken Shawarma with Rice ",Calculate.cal(51,(int)cb7.getValue()),(int)cb7.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL6.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb7.setOnAction(e -> {
            try {
                EL6.setText(label_text("Chicken Shawarma with Rice ",Calculate.cal(51,(int)cb7.getValue()),(int)cb7.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL6.setFont(new Font("Arial", 13));
            cancel_7.setVisible(true);
            if ((int)cb7.getValue()==0){
                EL6.setText("");
                cancel_7.setVisible(false);
            }
       });
       
          tb8.setOnAction(e -> {
           
           cb8.setValue(1);
           cancel_8.setVisible(true); //here last
            try {
                EL7.setText(label_text("Meat Shawarma with Rice ",Calculate.cal(52,(int)cb8.getValue()),(int)cb8.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL7.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb8.setOnAction(e -> {
            try {
                EL7.setText(label_text("Meat Shawarma with Rice ",Calculate.cal(52,(int)cb8.getValue()),(int)cb8.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL7.setFont(new Font("Arial", 13));
            cancel_8.setVisible(true);
            if ((int)cb8.getValue()==0){
                EL7.setText("");
                cancel_8.setVisible(false);
            }
       });
       
        tb9.setOnAction(e -> {
           
           cb9.setValue(1);
           cancel_9.setVisible(true); //here last
            try {
                EL8.setText(label_text("Lamb with Rice ",Calculate.cal(53,(int)cb9.getValue()),(int)cb9.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL8.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb9.setOnAction(e -> {
            try {
                EL8.setText(label_text("Lamb with Rice ",Calculate.cal(53,(int)cb9.getValue()),(int)cb9.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL8.setFont(new Font("Arial", 13));
            cancel_9.setVisible(true);
            if ((int)cb9.getValue()==0){
                EL8.setText("");
                cancel_9.setVisible(false);
            }
       });
       
      
        //Label EL0 = new Label();
        
       
        Separator sep1 = new Separator();
        Separator sep2 = new Separator();
        Separator sep3 = new Separator();
        Separator sep4 = new Separator();
        Separator sep5 = new Separator();
        Separator sep6 = new Separator();
        Separator sep7 = new Separator();
        Separator sep8 = new Separator();
      
        
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
        VBox left = new VBox(tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9);
        VBox right = new VBox();
        VBox right_2 = new VBox(cancel_1,cancel_2,cancel_3,cancel_4,cancel_5
                ,cancel_6,cancel_7,cancel_8,cancel_9);
        cancel_1.setVisible(false);
        cancel_2.setVisible(false);
        cancel_3.setVisible(false);
        cancel_4.setVisible(false);
        cancel_5.setVisible(false);
        cancel_6.setVisible(false);
        cancel_7.setVisible(false);
        cancel_8.setVisible(false);
        cancel_9.setVisible(false);
        
        right_2.setAlignment(Pos.CENTER_RIGHT);
        right_2.setPadding(new Insets(57));
        right_2.setSpacing(30);//was 90
        right.getChildren().addAll( EL0,cb,sep1,EL1,cb2,sep2,EL2
        ,cb3,sep3,EL3,cb4,sep4,EL4,cb5,sep5,EL5,cb6,sep6,EL6,cb7,sep7,EL7,cb8,sep8,EL8,cb9);
        right.setSpacing(4);
        right.setPadding(new Insets(50));
        //right.getChildren().add(label_factory("Item",3.21,2));
        left.setSpacing(14);
        left.setPadding(new Insets(50));
        BPane.getChildren().addAll(left,right,right_2);
        
        //left.getChildren().addAll(tb1,tb2,tb3,tb4,tb5,cb);
        //BPane.setLeft(left);
        //BPane.setRight(right);
        
        scene = new Scene(BPane, 350, 300,Color.BLACK);
        
        return scene;
    }

    

}