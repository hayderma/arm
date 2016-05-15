import java.sql.Connection;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Appetizers  {

    static Scene scene;
    static int quan1;
    static int quan2;
    static int quan3;
    static int quan4;
    static int quan5;
   
    public static Label label_factory(String id, double pr,int q){
        
        StringBuilder sb = new StringBuilder();
        sb .append(id).append("  (x").append(q).append(")         $ ").append(pr);
        //System.out.println(sb);
        
        Label label = new Label(sb.toString());
        label.setFont(new Font("Arial", 20));
        
        return label;
    }
   

    

   
   
    public static Scene menu() throws SQLException{
        
        
        double baba_gh = Connecting.get_cost(Connecting.conn,59);
        double hummus = Connecting.get_cost(Connecting.conn,60);
        double chicken_wings = Connecting.get_cost(Connecting.conn,61);
        double fried_shrimp = Connecting.get_cost(Connecting.conn,62);
        double chichen_strips = Connecting.get_cost(Connecting.conn,63);
        Button tb1 = new Button();
        
        tb1.setText("Baba Ghanoush  بابا غنوج"+"   $ "+ Double.toString(baba_gh));
        
        Button tb2 = new Button();
        
        tb2.setText("Hummus - حمص بطحينة...."+"   $ "+ Double.toString(hummus));
        Button tb3 = new Button();
        tb3.setText("Crispy Fried Chicken Wings  اجنحة دجاج مقرمش"+"   $ "+ Double.toString(chicken_wings));
        Button tb4 = new Button();
        tb4.setText("Crispy Fried Shrimp  روبيان مقرمش"+"   $ "+ Double.toString(fried_shrimp));
        Button tb5 = new Button();
        tb5.setText("Crispy Chicken Strips   شرائح دجاج مقرمش"+"   $ "+ Double.toString(chichen_strips));
        Button cancel = new Button("Cancel Order");
        Button back = new Button("Back");
        cancel.setOnAction(e -> Main_Frame.Win_primary_pass.setScene(Main_Frame.scene));
        back.setOnAction(e -> Main_Frame.Win_primary_pass.setScene(Main_Frame.scene_2));
        tb1.setMinSize(320, 90);
        tb2.setMinSize(320, 90);
        tb3.setMinSize(320, 90);
        tb4.setMinSize(320, 90);
        tb5.setMinSize(320, 90);
        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5));
        cb.getSelectionModel().selectFirst();
        
        ChoiceBox cb2 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5));
        cb2.getSelectionModel().selectFirst();
        
        ChoiceBox cb3 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5));
        cb3.getSelectionModel().selectFirst();
        
        ChoiceBox cb4 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5));
        cb4.getSelectionModel().selectFirst();
        
        ChoiceBox cb5 = new ChoiceBox(FXCollections.observableArrayList(
        0,1, 2,3,4,5));
        cb5.getSelectionModel().selectFirst();
        int tb1_ctr =0;
       tb1.setOnAction(e -> {
           
           cb.setValue(1);
           Calculate.add_to_keys(59);
           
               });
      
        /*Label EL0 = new Label();
        Label EL1 = new Label();
        Label EL2 = new Label();
        Label EL3 = new Label();
        Label EL4 = new Label();
        Label EL5 = new Label();
        Label EL6 = new Label();
        Label EL7 = new Label();*/
       
        Separator sep1 = new Separator();
        Separator sep2 = new Separator();
        Separator sep3 = new Separator();
        Separator sep4 = new Separator();
        //StackPane layout = new StackPane();
        //layout.getChildren().addAll(tb1,tb2,tb3,tb4,tb5);
        //layout.setAlignment(Pos.CENTER);
        quan1 = (int) cb.getValue();
        quan2= (int) cb.getValue();
        Label L_1 = label_factory("Baba Ghanoush",Calculate.cal(59,quan1),quan1);
        Label L_2 = label_factory("Hummus",Calculate.cal(60,quan2),quan2);
        FlowPane BPane = new FlowPane();
        HBox top= new HBox (back,cancel);
        top.setSpacing(20);
        top.setAlignment(Pos.TOP_LEFT);
        top.setPadding(new Insets(40));
        VBox left = new VBox(tb1,tb2,tb3,tb4,tb5);
        VBox right = new VBox(L_1,cb,sep1,label_factory("item",
        4.6,2),cb2,sep2,label_factory("Item",3.21,2)
        ,cb3,sep3,label_factory("Item",3.21,2),cb4,sep4,label_factory("Item",3.21,2),cb5);
        right.setSpacing(20);
        right.setPadding(new Insets(50));
        //right.getChildren().add(label_factory("Item",3.21,2));
        left.setSpacing(15);
        left.setPadding(new Insets(50));
        BPane.getChildren().addAll(left,right,top);
        
        //left.getChildren().addAll(tb1,tb2,tb3,tb4,tb5,cb);
        //BPane.setLeft(left);
        //BPane.setRight(right);
        
        scene = new Scene(BPane, 350, 300);
        
        return scene;
    }

    

}