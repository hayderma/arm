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


public class Burgers  {

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
     static Label EL9 = new Label();
     static Label EL10 = new Label();
     
     
   
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
        
        ChoiceBox cb10 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb10.getSelectionModel().selectFirst();
        ChoiceBox cb11 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5,7,8,9,10));
        cb11.getSelectionModel().selectFirst();
        
        
        
        
        
        double cheese_bur = Connecting.get_cost(Connecting.conn,28);
        double meedo_bur = Connecting.get_cost(Connecting.conn,29);
        double chicken_bur = Connecting.get_cost(Connecting.conn,30);
        double egg_bur = Connecting.get_cost(Connecting.conn,31);
        double mash_bur = Connecting.get_cost(Connecting.conn,32);
        double ford_bur = Connecting.get_cost(Connecting.conn,33);
        double fish_bur = Connecting.get_cost(Connecting.conn,34);
        double fri_ch_bur = Connecting.get_cost(Connecting.conn,35);
        double fri_fish_bur = Connecting.get_cost(Connecting.conn,36);
        double fri_shrimp_bur = Connecting.get_cost(Connecting.conn,37);
        double ameri_bur = Connecting.get_cost(Connecting.conn,38);
        
        Button tb1 = new Button();
        tb1.setText("Cheese Burger"+"   $ "+ Double.toString(cheese_bur));
        tb1.setFont(new Font("Arial", 14));
        Button tb2 = new Button();
        
        tb2.setText("Meedo Burger"+"   $ "+ Double.toString(meedo_bur));
        tb2.setFont(new Font("Arial", 14));
        Button tb3 = new Button();
        tb3.setText("Chicken Burger"+"   $ "+ Double.toString(chicken_bur));
        tb2.setFont(new Font("Arial", 14));
        Button tb4 = new Button();
        tb4.setText("Egg Burger"+"   $ "+ Double.toString(egg_bur));
        tb4.setFont(new Font("Arial", 14));
        Button tb5 = new Button();
        tb5.setText("Mashroom Burger"+"   $ "+ Double.toString(mash_bur));
        tb5.setFont(new Font("Arial", 14));
        
        Button tb6 = new Button();
        tb6.setText("Fordsun Burger"+"   $ "+ Double.toString(ford_bur));
        tb6.setFont(new Font("Arial", 14));
        Button tb7 = new Button();
        
        tb7.setText("Fish Burger"+"   $ "+ Double.toString(fish_bur));
        tb7.setFont(new Font("Arial", 14));
        Button tb8 = new Button();
        tb8.setText("Fried Crispy Chicken Burger"+"   $ "+ Double.toString(fri_ch_bur));
        tb8.setFont(new Font("Arial", 14));
        Button tb9 = new Button();
        tb9.setText("Fried Crispy Fish Burger"+"   $ "+ Double.toString(fri_fish_bur));
        tb9.setFont(new Font("Arial", 14));
        Button tb10 = new Button();
        tb10.setText("Fried Crispy Shrimp Burger "+"   $ "+ Double.toString(fri_shrimp_bur));
        tb10.setFont(new Font("Arial", 14));
        
        Button tb11 = new Button();
        tb11.setText("American Burger"+"   $ "+ Double.toString(ameri_bur));
        tb11.setFont(new Font("Arial", 14));
        
        
        Button cancel_1 = new Button("Remove From Order");
        Button cancel_2 = new Button("Remove From Order");
        Button cancel_3 = new Button("Remove From Order");
        Button cancel_4 = new Button("Remove From Order");
        Button cancel_5 = new Button("Remove From Order");
        Button cancel_6 = new Button("Remove From Order");
        Button cancel_7 = new Button("Remove From Order");
        Button cancel_8 = new Button("Remove From Order");
        Button cancel_9 = new Button("Remove From Order");
        Button cancel_10 = new Button("Remove From Order");
        Button cancel_11 = new Button("Remove From Order");
        cancel_1.setTextFill(RED);
        cancel_2.setTextFill(RED);
        cancel_3.setTextFill(RED);
        cancel_4.setTextFill(RED);
        cancel_5.setTextFill(RED);
        cancel_6.setTextFill(RED);
        cancel_7.setTextFill(RED);
        cancel_8.setTextFill(RED);
        cancel_9.setTextFill(RED);
        cancel_10.setTextFill(RED);
        cancel_11.setTextFill(RED);
        
        cancel_1.setOnAction(e -> cb.setValue(0));
        cancel_2.setOnAction(e -> cb2.setValue(0));
        cancel_3.setOnAction(e -> cb3.setValue(0));
        cancel_4.setOnAction(e -> cb4.setValue(0));
        cancel_5.setOnAction(e -> cb5.setValue(0));
        cancel_6.setOnAction(e -> cb6.setValue(0));
        cancel_7.setOnAction(e -> cb7.setValue(0));
        cancel_8.setOnAction(e -> cb8.setValue(0));
        cancel_9.setOnAction(e -> cb9.setValue(0));
        cancel_10.setOnAction(e -> cb10.setValue(0));
        cancel_11.setOnAction(e -> cb11.setValue(0));
        //back.setOnAction(e -> Main_Frame.Win_primary_pass.setScene(Main_Frame.scene_2));
        tb1.setMinSize(320, 43);
        tb2.setMinSize(320, 43);
        tb3.setMinSize(320, 43);
        tb4.setMinSize(320, 43);
        tb5.setMinSize(320, 43);
        tb6.setMinSize(320, 43);
        tb7.setMinSize(320, 43);
        tb8.setMinSize(320, 43);
        tb9.setMinSize(320, 43);
        tb10.setMinSize(320,43);
        tb11.setMinSize(320,43);
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
                EL0.setText(label_text("Cheese Burger",Calculate.cal(28,(int)cb.getValue()),(int)cb.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL0.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb.setOnAction(e -> {
            try {
                EL0.setText(label_text("Cheese Burger ",Calculate.cal(28,(int)cb.getValue()),(int)cb.getValue()));
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
                EL1.setText(label_text("Meedo Burger ",Calculate.cal(29,(int)cb2.getValue()),(int)cb2.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL1.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb2.setOnAction(e -> {
            try {
                EL1.setText(label_text("Meedo Burger ",Calculate.cal(29,(int)cb2.getValue()),(int)cb2.getValue()));
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
                EL2.setText(label_text("Chicken Burger ",Calculate.cal(30,(int)cb3.getValue()),(int)cb3.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL2.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb3.setOnAction(e -> {
            try {
                EL2.setText(label_text("Chicken Burger ",Calculate.cal(30,(int)cb3.getValue()),(int)cb3.getValue()));
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
                EL3.setText(label_text("Egg Burger ",Calculate.cal(31,(int)cb4.getValue()),(int)cb4.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL3.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb4.setOnAction(e -> {
            try {
                EL3.setText(label_text("Egg Burger ",Calculate.cal(31,(int)cb4.getValue()),(int)cb4.getValue()));
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
                EL4.setText(label_text("Mashroom Burger ",Calculate.cal(32,(int)cb5.getValue()),(int)cb5.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL4.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb5.setOnAction(e -> {
            try {
                EL4.setText(label_text("Mashroom Burger ",Calculate.cal(32,(int)cb5.getValue()),(int)cb5.getValue()));
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
                EL5.setText(label_text("Fordsun Burger ",Calculate.cal(33,(int)cb6.getValue()),(int)cb6.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL5.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb6.setOnAction(e -> {
            try {
                EL5.setText(label_text("Fordsun Burger ",Calculate.cal(33,(int)cb6.getValue()),(int)cb6.getValue()));
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
                EL6.setText(label_text("Fish Burger ",Calculate.cal(34,(int)cb7.getValue()),(int)cb7.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL6.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb7.setOnAction(e -> {
            try {
                EL6.setText(label_text("Fish Burger ",Calculate.cal(34,(int)cb7.getValue()),(int)cb7.getValue()));
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
                EL7.setText(label_text("Fried Chicken Burger ",Calculate.cal(35,(int)cb8.getValue()),(int)cb8.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL7.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb8.setOnAction(e -> {
            try {
                EL7.setText(label_text("Fried Chicken Burger ",Calculate.cal(35,(int)cb8.getValue()),(int)cb8.getValue()));
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
                EL8.setText(label_text("Fried Fish Burger ",Calculate.cal(36,(int)cb9.getValue()),(int)cb9.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL8.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb9.setOnAction(e -> {
            try {
                EL8.setText(label_text("Fried Fish Burger ",Calculate.cal(36,(int)cb9.getValue()),(int)cb9.getValue()));
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
       
        tb10.setOnAction(e -> {
           
           cb10.setValue(1);
           cancel_10.setVisible(true); //here last
            try {
                EL9.setText(label_text("Fried Shrimp Burger ",Calculate.cal(37,(int)cb10.getValue()),(int)cb10.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL9.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb10.setOnAction(e -> {
            try {
                EL9.setText(label_text("Fried Shrimp Burger ",Calculate.cal(37,(int)cb10.getValue()),(int)cb10.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL9.setFont(new Font("Arial", 13));
            cancel_10.setVisible(true);
            if ((int)cb10.getValue()==0){
                EL9.setText("");
                cancel_10.setVisible(false);
            }
       });
       
          tb11.setOnAction(e -> {
           
           cb11.setValue(1);
           cancel_11.setVisible(true); //here last
            try {
                EL10.setText(label_text("American Burger ",Calculate.cal(38,(int)cb11.getValue()),(int)cb11.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL10.setFont(new Font("Arial", 13));
            
           //Calculate.add_to_keys(59);
            //System.out.println(EL0.getText());
           
               });
       cb11.setOnAction(e -> {
            try {
                EL10.setText(label_text("American Burger ",Calculate.cal(38,(int)cb11.getValue()),(int)cb11.getValue()));
            } catch (SQLException ex) {
                Alerts.get_sql_err().showAndWait();
            }
            EL10.setFont(new Font("Arial", 13));
            cancel_11.setVisible(true);
            if ((int)cb11.getValue()==0){
                EL10.setText("");
                cancel_11.setVisible(false);
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
        Separator sep9 = new Separator();
        Separator sep10 = new Separator();
        
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
        VBox left = new VBox(tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9,tb10,tb11);
        VBox right = new VBox();
        VBox right_2 = new VBox(cancel_1,cancel_2,cancel_3,cancel_4,cancel_5
                ,cancel_6,cancel_7,cancel_8,cancel_9,cancel_10,cancel_11);
        cancel_1.setVisible(false);
        cancel_2.setVisible(false);
        cancel_3.setVisible(false);
        cancel_4.setVisible(false);
        cancel_5.setVisible(false);
        cancel_6.setVisible(false);
        cancel_7.setVisible(false);
        cancel_8.setVisible(false);
        cancel_9.setVisible(false);
        cancel_10.setVisible(false);
        cancel_11.setVisible(false);
        
        right_2.setAlignment(Pos.CENTER_RIGHT);
        right_2.setPadding(new Insets(57));
        right_2.setSpacing(30);//was 90
        right.getChildren().addAll( EL0,cb,sep1,EL1,cb2,sep2,EL2
        ,cb3,sep3,EL3,cb4,sep4,EL4,cb5,sep5,EL5,cb6,sep6,EL6,cb7,sep7,EL7,cb8,sep8,EL8,cb9,sep9,EL9,cb10,sep10,EL10,cb11);
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