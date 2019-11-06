package Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class MainApplication extends Application {

    private VBox vBox; // bao ngoài cả 3 phần header, body, footer.
    private HBox titleBox; // header chứa logo - text.
    private HBox btnBox; // footer chứa các button.

    private Label lblTitle;
    private Label lblLogin;
    private Label lblRegister;
    private Label lblWithdraw;
    private Label lblDeposit;


    private Scene scene;
    private Stage mainStage;
    private MainApplication mainApplication;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.mainApplication = this;
        this.mainStage = primaryStage;
        initComponent();
    }

    private void initComponent() {
        this.vBox = new VBox(); // layout

        // xử lý phần header, logo.
        this.titleBox = new HBox();
        this.lblTitle = new Label("Spring Hero Bank");
        this.lblTitle.setFont(Font.font(17));
        this.lblTitle.setTextFill(Color.web("#f9e70b"));
        this.titleBox.getChildren().add(lblTitle);
        this.titleBox.setAlignment(Pos.TOP_LEFT);
        this.titleBox.setSpacing(10);

        // xử lý phần body content.
        this.gridPaneContent = new GridPane();
        this.lblLogin = new Label("Login");
        this.lblRegister = new Label("Register");
        this.lblWithdraw = new Label("Withdraw");
        this.lblDeposit = new Label("Deposit");
        this.gridPaneContent.getChildren().add(lblLogin,lblRegister);


        this.gridPaneContent.setAlignment(Pos.CENTER);
        this.gridPaneContent.setPadding(new Insets(10, 10, 10, 10));
        this.gridPaneContent.setVgap(10);
        this.gridPaneContent.setHgap(10);

        // xử lý phần footer button.
        this.btnBox = new HBox();

        this.btnBox.setAlignment(Pos.CENTER);
        this.btnBox.setSpacing(10);

        // ghép các phần với nhau, đưa tất cả và vbox.
        this.vBox.getChildren().addAll(this.titleBox, this.gridPaneContent, this.btnBox);
        this.vBox.setAlignment(Pos.CENTER);
        this.vBox.setSpacing(30);
        this.vBox.setPadding(new Insets(10, 10, 10, 10));

        // nhồi vbox và scene.
        this.scene = new Scene(this.vBox, 300, 200);
        // nhồi scene vào stage.
        this.mainStage.setScene(this.scene);
    }

    public static void main(String[] args) {
        launch(args);
    }


}
