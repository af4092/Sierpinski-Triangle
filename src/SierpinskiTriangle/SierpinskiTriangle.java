package com.special.effect.javafxprojects.SierpinskiTriangle;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class SierpinskiTriangle extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
        TextField tfOrder = new TextField();
        tfOrder.setOnAction(
                e->trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
                tfOrder.setPrefColumnCount(4);
                tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(trianglePane);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setTitle("Sierpinski Triangle");
        stage.setScene(scene);
        stage.show();

        scene.widthProperty().addListener(ov->trianglePane.paint());
        scene.heightProperty().addListener(ov->trianglePane.paint());
    }
}
