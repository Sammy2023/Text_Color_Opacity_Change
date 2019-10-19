

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.text.Text;
import java.awt.*;
import javafx.scene.paint.Color;
public class Text_Change_Color extends Application {
    @Override
    public void start(Stage primaryStage){

        BorderPane mainPane = new BorderPane();
        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        Text text = new Text("Programming");
        text.setFont(Font.font(20));
        ScrollBar redcon = new ScrollBar();
        redcon.setMaxWidth(200);
        ScrollBar bluecon = new ScrollBar();
        bluecon.setMaxWidth(200);
        ScrollBar greencon = new ScrollBar() ;
        greencon.setMaxWidth(200);
        ScrollBar opacitycon = new ScrollBar();
        opacitycon.setMaxWidth(200);


        redcon.setOrientation(Orientation.HORIZONTAL);
        bluecon.setOrientation(Orientation.HORIZONTAL);
        greencon.setOrientation(Orientation.HORIZONTAL);
        opacitycon.setOrientation(Orientation.HORIZONTAL);

        pane1.add(redcon, 1, 0);
        pane1.add(new Text("Red"), 0 , 0);
        pane1.add(bluecon, 1, 1 );
        pane1.add(new Text("Green"), 0, 1);
        pane1.add(greencon, 1, 2 );
        pane1.add(new Text("Blue"), 0, 2 );
        pane1.add(opacitycon, 1, 3);
        pane1.add(new Text ("Opacity"), 0 ,3);

        pane1.setAlignment(Pos.CENTER);
        pane1.setHgap(5);
        mainPane.setBottom(pane1);
        mainPane.setCenter(text);

        redcon.valueProperty().addListener( ov->{
            Color color = new Color((redcon.getValue()/100), (bluecon.getValue()/100), (greencon.getValue()/100), (opacitycon.getValue()/100));
            text.setFill(color);
        });

        bluecon.valueProperty().addListener( ov->{
            Color color = new Color((redcon.getValue()/100), (bluecon.getValue()/100), (greencon.getValue()/100), (opacitycon.getValue()/100));
            text.setFill(color);
        });

        greencon.valueProperty().addListener( ov->{
            Color color = new Color((redcon.getValue()/100), (bluecon.getValue()/100), (greencon.getValue()/100), (opacitycon.getValue()/100));
            text.setFill(color);
        });

        opacitycon.valueProperty().setValue(100);

        opacitycon.valueProperty().addListener( ov->{
            Color color = new Color((redcon.getValue()/100), (bluecon.getValue()/100), (greencon.getValue()/100), (opacitycon.getValue()/100));
            text.setFill(color);
        });


        Scene scene = new Scene(mainPane, 300 , 200);
        primaryStage.setTitle("Ch_6_17");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
