
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Alerts {
    
    static public Alert get_sql_err(){
        Alert alert_box = new Alert (AlertType.WARNING);
        alert_box.setContentText("We apologize, there has been an error.\n\nMessage: DB exception");
        
        return alert_box;
        
    }
    
}
