package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;
    
public class Main extends Application {

    public void start(Stage primaryStage){
        home(primaryStage);
    }

    public static void home(Stage primaryStage){
            Pane root = new Pane();

//Setting up the buttons in the Primary Stage.
            Button fd = new Button();
            fd.setText("Compound Interest Savings");
            fd.setId("Button");
            fd.setLayoutX(100);
            fd.setLayoutY(75);
            root.getChildren().add(fd);

            Button savings = new Button();
            savings.setText("Compound Interest Savings with Contribution");
            savings.setId("Button");
            savings.setLayoutX(100);
            savings.setLayoutY(175);
            root.getChildren().add(savings);

            Button simpleInt = new Button();
            simpleInt.setText("Simple Interest Savings");
            simpleInt.setId("Button");
            simpleInt.setLayoutX(100);
            simpleInt.setLayoutY(275);
            root.getChildren().add(simpleInt);

            Button loans = new Button();
            loans.setText("Loans");
            loans.setId("Button");
            loans.setLayoutX(100);
            loans.setLayoutY(375);
            root.getChildren().add(loans);

            Button mortgage = new Button();
            mortgage.setText("Mortgage");
            mortgage.setId("Button");
            mortgage.setLayoutX(100);
            mortgage.setLayoutY(475);
            root.getChildren().add(mortgage);

            Button help = new Button();
            help.setText("How to Use");
            help.setId("ButtonHelp");
            help.setLayoutX(1050);
            help.setLayoutY(225);
            root.getChildren().add(help);

            Button quit = new Button();
            quit.setText("Quit");
            quit.setId("ButtonQuit");
            quit.setLayoutX(1050);
            quit.setLayoutY(325);
            root.getChildren().add(quit);

            primaryStage.setTitle("Financial Calculator");
            root.setId("pane");
            Scene scene = new Scene(root, 1200, 650);
            scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);

//Setting up the actions for each and every button created.
        fd.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalCsiFD.csi(primaryStage);
        });

        savings.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalCsiSavings.csi(primaryStage);
        });

        simpleInt.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalSimpleInterest.savings(primaryStage);
        });

        loans.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalLoans.loans(primaryStage);
        });

        mortgage.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalMortgage.mortgage(primaryStage);
        });

        help.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
            CalHelp.help(primaryStage);
        });

        quit.setOnAction(event -> {
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();

        });
    }

    public static void main(String[] args) {

        launch(args);
    }
}