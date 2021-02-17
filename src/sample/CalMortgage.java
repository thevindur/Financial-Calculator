package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class CalMortgage {

    public static void mortgage(Stage primaryStage) {
        Pane root = new Pane();

        Label lblHome = new Label("Mortgage");
        lblHome.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bolder; -fx-text-fill: darkblue; " +
                "-fx-background-color: linear-gradient(red,orange,orangered); -fx-min-width: 190px; -fx-min-height: 115px; -fx-alignment: center");
        lblHome.setLayoutX(0);
        lblHome.setLayoutY(0);
        root.getChildren().add(lblHome);

        Button home = new Button();
        home.setText("Home");
        home.setLayoutX(0);
        home.setLayoutY(115);
        home.setId("btnRow1");
        root.getChildren().add(home);
        home.setOnAction(event -> { Stage stage = (Stage) home.getScene().getWindow(); stage.close(); Main.home(primaryStage);});

        Button help = new Button();
        help.setText("Help");
        help.setLayoutX(0);
        help.setLayoutY(690);
        help.setId("btnRow1");
        root.getChildren().add(help);
        help.setOnAction(event -> { Stage stage = (Stage) help.getScene().getWindow(); stage.close();CalHelp.help(primaryStage); });

        Button close = new Button();
        close.setText("Close");
        close.setLayoutX(0);
        close.setLayoutY(805);
        close.setId("btnRow1");
        root.getChildren().add(close);
        close.setOnAction(event -> { Stage stage = (Stage) close.getScene().getWindow(); stage.close(); });

        Button fd = new Button();
        fd.setText("Compound Interest");
        fd.setLayoutX(0);
        fd.setLayoutY(230);
        fd.setId("btnRow2");
        root.getChildren().add(fd);
        fd.setOnAction(event -> {Stage stage = (Stage) fd.getScene().getWindow(); stage.close(); CalCsiFD.csi(primaryStage);});

        Button savings = new Button();
        savings.setText("Compound Interest\nWith Contribution");
        savings.setLayoutX(0);
        savings.setLayoutY(345);
        savings.setId("btnRow2");
        root.getChildren().add(savings);
        savings.setOnAction(event -> {Stage stage = (Stage) savings.getScene().getWindow(); stage.close(); CalCsiSavings.csi(primaryStage);});

        Button simpleInt = new Button();
        simpleInt.setText("Simple Interest");
        simpleInt.setLayoutX(0);
        simpleInt.setLayoutY(460);
        simpleInt.setId("btnRow2");
        root.getChildren().add(simpleInt);
        simpleInt.setOnAction(event -> {Stage stage = (Stage) simpleInt.getScene().getWindow(); stage.close(); CalSimpleInterest.savings(primaryStage);});

        Button loans = new Button();
        loans.setText("Loans");
        loans.setLayoutX(0);
        loans.setLayoutY(575);
        loans.setId("btnRow2");
        root.getChildren().add(loans);
        loans.setOnAction(event -> {Stage stage = (Stage) loans.getScene().getWindow(); stage.close(); CalLoans.loans(primaryStage);});

//Creating the Buttons and The Labels Required for the first grid pane.
        Label lbl = new Label( " Mortgage Amount");
        Label lbl1 = new Label(" Number of Years");
        Label lbl2 = new Label(" Interest Rate");
        Label lbl3 = new Label(" Monthly Payment");
        TextField txt = new TextField();
        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
        TextField txt3 = new TextField();
        txt.setId("txtForm");
        txt1.setId("txtForm");
        txt2.setId("txtForm");
        txt3.setId("txtForm");

        GridPane gridPane1 = new GridPane();
        gridPane1.setId("Form");
        gridPane1.setHgap(50);
        gridPane1.setVgap(40);

//Initialising the buttons and text fields to the first grid pane.
        gridPane1.add(lbl,0,1);
        gridPane1.add(txt,1,1);
        gridPane1.add(lbl1,0,2);
        gridPane1.add(txt1,1,2);
        gridPane1.add(lbl2,0,3);
        gridPane1.add(txt2,1,3);
        gridPane1.add(lbl3,0,4);
        gridPane1.add(txt3,1,4);


//Creating the buttons required for the keyboard.
        Button button1 = new Button("1");
            button1.setMinSize(130,100);
            button1.setFocusTraversable(false);
        Button button2 = new Button("2");
            button2.setMinSize(130,100);
            button2.setFocusTraversable(false);
        Button button3 = new Button("3");
            button3.setMinSize(130,100);
            button3.setFocusTraversable(false);
        Button button4 = new Button("4");
            button4.setMinSize(130,100);
            button4.setFocusTraversable(false);
        Button button5 = new Button("5");
            button5.setMinSize(130,100);
            button5.setFocusTraversable(false);
        Button button6 = new Button("6");
            button6.setMinSize(130,100);
            button6.setFocusTraversable(false);
        Button button7 = new Button("7");
            button7.setMinSize(130,100);
            button7.setFocusTraversable(false);
        Button button8 = new Button("8");
            button8.setMinSize(130,100);
            button8.setFocusTraversable(false);
        Button button9 = new Button("9");
            button9.setMinSize(130,100);
            button9.setFocusTraversable(false);
        Button button0 = new Button("0");
            button0.setMinSize(260,100);
            button0.setFocusTraversable(false);
        Button buttonPoint = new Button(".");
            buttonPoint.setMinSize(130,100);
            buttonPoint.setFocusTraversable(false);
        Button buttonClr = new Button("C");
            buttonClr.setMinSize(105,100);
            buttonClr.setFocusTraversable(false);
            buttonClr.setId("buttonClr");
        Button buttonClrAll = new Button("Clear All");
            buttonClrAll.setMinSize(105,100);
            buttonClrAll.setId("buttonClrAll");
        Button buttonCal = new Button("Calculate");
            buttonCal.setId("btnCal");
            buttonCal.setMinSize(105,200);

        GridPane gridPane2 = new GridPane();

//Initialising the buttons to the second grid pane.
        gridPane2.add(button1, 0, 2);
        gridPane2.add(button2, 1, 2);
        gridPane2.add(button3, 2, 2);
        gridPane2.add(button4, 0, 1);
        gridPane2.add(button5, 1, 1);
        gridPane2.add(button6, 2, 1);
        gridPane2.add(button7, 0, 0);
        gridPane2.add(button8, 1, 0);
        gridPane2.add(button9, 2, 0);
        gridPane2.add(button0, 0, 3,2,1);
        gridPane2.add(buttonPoint, 2, 3);
        gridPane2.add(buttonClr, 3, 0);
        gridPane2.add(buttonClrAll, 3, 1);
        gridPane2.add(buttonCal, 3, 2,1,2);

        HBox hbox = new HBox();
        hbox.setTranslateX(0);
        hbox.setTranslateY(65);

        SplitPane splitPane1 = new SplitPane();
        splitPane1.setOrientation(Orientation.HORIZONTAL);
        splitPane1.setPrefSize(1000, 200);
        splitPane1.setMinSize(1000,400);
        splitPane1.getItems().addAll(gridPane1 ,gridPane2);
        hbox.getChildren().add(splitPane1);

//Creating the labels and texts required for the third grid pane.
        Label lblMortgage = new Label(" Results of the Mortgage Calculator.");
        lblMortgage.setId("lblResult");
        Label lblInvested = new Label(" Mortgage Amount Received by the user : ");
        Label lblInt = new Label(" Interest Rate provide by the financial institution : ");
        Label lblYears = new Label(" Number of Years the amount is received : ");
        Label lblMonthlyPay = new Label(" Monthly Payment :  ");
        Label lblNoOfPayments = new Label("Number of monthly payments:");
        Text txtInvested = new Text();
        Text txtInt = new Text("");
        Text txtYears = new Text("");
        Text txtMonthlyPay = new Text("");
        Text txtNoOfPayments = new Text("");
        Text txtAlign = new Text(" ");
        Button btnSave = new Button("Save to History");
        btnSave.setId("btnSave");

        GridPane gridPane3 = new GridPane();
        gridPane3.setId("Result");
        gridPane3.setHgap(20);
        gridPane3.setVgap(40);

//Initialising the labels and the texts to the third grid pane.
        gridPane3.add(lblMortgage,0,1,2,1);
        gridPane3.add(lblInvested,0,2);
        gridPane3.add(txtInvested,1,2);
        gridPane3.add(lblInt,0,3);
        gridPane3.add(txtInt,1,3);
        gridPane3.add(lblYears,0,4);
        gridPane3.add(txtYears,1,4);
        gridPane3.add(lblMonthlyPay,0,5);
        gridPane3.add(txtMonthlyPay,1,5);
        gridPane3.add(lblNoOfPayments,0,6);
        gridPane3.add(txtNoOfPayments,1,6);
        gridPane3.add(btnSave,1,7);
        gridPane3.add(txtAlign,1,8);

        VBox vbox = new VBox();
        vbox.setTranslateX(0);
        vbox.setTranslateY(65);

        SplitPane splitPane2 = new SplitPane();
        splitPane2.setOrientation(Orientation.VERTICAL);
        splitPane2.getItems().addAll(splitPane1,gridPane3);
        vbox.getChildren().add(splitPane2);

        ListView<String> listView = new ListView<>();
        listView.setEditable(true);
        listView.setCellFactory(TextFieldListCell.forListView());
        String lblHistory = "History Pane";
        listView.getItems().add(lblHistory);
        Button editButton = new Button("Add & Edit");
        editButton.setOnAction((ActionEvent event) -> {
            listView.getItems().add("");
            listView.scrollTo(listView.getItems().size() - 1);
            listView.layout();
            listView.edit(listView.getItems().size() - 1);
        });

        HBox hbox1 = new HBox();
        hbox1.setTranslateX(190);
        hbox1.setTranslateY(0);

        SplitPane splitPane3 = new SplitPane();
        splitPane3.setOrientation(Orientation.HORIZONTAL);
        splitPane3.getItems().addAll(splitPane2,listView);
        hbox1.getChildren().add(splitPane3);

        Scene scene = new Scene(new Group(root,hbox,vbox,hbox1),1440 ,900);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(CalSimpleInterest.class.getResource("styleGui.css").toExternalForm());
        primaryStage.setTitle("Mortgage Calculator");
        primaryStage.show();

        buttonCal.setOnAction( e-> {
            String myString = txt.getText();
            String myString1 = txt1.getText();
            String myString2 = txt2.getText();
            String myString3 = txt3.getText();

            try{
                if(txt.getText().isEmpty()){
                    double noOfYrs = Double.parseDouble(myString1.trim());
                    double intRate = Double.parseDouble(myString2.trim());
                    double monthlyPay = Double.parseDouble(myString3.trim());
                    double noOfPayments = noOfYrs*12;

                    double principleAmt = (monthlyPay/(intRate/12/100))*(1-(1/Math.pow((1+(intRate/12/100)),noOfYrs*12)));
                    DecimalFormat df = new DecimalFormat("#.##");

                    txt.setText("Rs. "+(df.format(principleAmt)));
                    txtInvested.setText(df.format(principleAmt));
                    txtInt.setText(myString2+"%");
                    txtYears.setText(myString1);
                    txtMonthlyPay.setText(myString3);
                    txtNoOfPayments.setText(Double.toString(noOfPayments));
                }
                else if(txt1.getText().isEmpty()){
                    double principleAmt = Double.parseDouble(myString.trim()) ;
                    double intRate = Double.parseDouble(myString2.trim());
                    double monthlyPay = Double.parseDouble(myString3.trim());

                    double noOfYears = Math.log(12*monthlyPay/(12*monthlyPay-(principleAmt*intRate/100)))/(12*(Math.log(1+intRate/12/100)));
                    noOfYears = Math.round(noOfYears);
                    double noOfPayments = noOfYears*12;

                    txt1.setText(Double.toString(noOfYears));
                    txtInvested.setText("Rs. "+myString);
                    txtInt.setText(myString2+"%");
                    txtYears.setText(Double.toString(noOfYears));
                    txtMonthlyPay.setText(myString3);
                    txtNoOfPayments.setText(Double.toString(noOfPayments));
                }
                else if(txt2.getText().isEmpty()) {
                    txt2.setText("This field is Required!");
                    txt2.setStyle("-fx-text-fill: red; -fx-font-weight: bolder");

                }
                else if(txt3.getText().isEmpty()){
                    double principleAmt = Double.parseDouble(myString.trim()) ;
                    double noOfYrs = Double.parseDouble(myString1.trim());
                    double intRate = Double.parseDouble(myString2.trim());
                    double noOfPayments = noOfYrs*12;

                    double monthlyPay = (principleAmt*intRate/100)/(12*(1-(1/Math.pow((1+(intRate/100/12)),noOfYrs*12))));
                    DecimalFormat df = new DecimalFormat("#.##");

                    txt3.setText("Rs. "+(df.format(monthlyPay)));
                    txtInvested.setText("Rs. "+myString);
                    txtInt.setText(myString2+"%");
                    txtYears.setText(myString1);
                    txtMonthlyPay.setText("Rs. "+(df.format(monthlyPay)));
                    txtNoOfPayments.setText(Double.toString(noOfPayments));
                }



            }catch (NumberFormatException exception){
                Stage alert = new Stage();
                alert.setTitle("Warning !!");
                Pane root1 = new Pane();

                Label lblAlert = new Label("You Can Only Keep One Field Empty.\nInterest Rate is Mandatory.\nPlease Make Sure That All Inputs are Integers !!");
                lblAlert.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bolder; -fx-text-fill: red; -fx-font-size: 20px; -fx-alignment: center;");
                lblAlert.setLayoutX(50);
                lblAlert.setLayoutY(30);
                root1.getChildren().add(lblAlert);

                root1.setStyle("-fx-background-color: linear-gradient(black,darkslategrey)");
                Scene scene1 = new Scene(root1,580,150);
                alert.setScene(scene1);
                alert.show();
            }
        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "1";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "2";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "3";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "4";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "5";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "6";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "7";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "8";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "9";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "0";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        buttonPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = ".";
                if (txt.isFocused()){
                    txt.setText(txt.getText()+buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(txt1.getText()+buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(txt2.getText()+buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(txt3.getText()+buttonVal);
                }
            }
        });
        buttonClr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "";
                if (txt.isFocused()){
                    txt.setText(buttonVal);
                }else if (txt1.isFocused()){
                    txt1.setText(buttonVal);
                }else if (txt2.isFocused()){
                    txt2.setText(buttonVal);
                }else if (txt3.isFocused()){
                    txt3.setText(buttonVal);
                }
            }
        });
        buttonClrAll.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String buttonVal = "";
                txt.setText(buttonVal);
                txt1.setText(buttonVal);
                txt2.setText(buttonVal);
                txt3.setText(buttonVal);
                txtInvested.setText(buttonVal);
                txtInt.setText(buttonVal);
                txtYears.setText(buttonVal);
                txtMonthlyPay.setText(buttonVal);
                txtNoOfPayments.setText(buttonVal);

            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String save = txtInvested.getText();
                String save1 = txtInt.getText();
                String save2 = txtYears.getText();
                String save3 = txtMonthlyPay.getText();
                String save4 = txtNoOfPayments.getText();

                String result = "Mortgage Amount: Rs. "+save;
                String result1 = "Interest Rate is "+save1;
                String result2 = "Number of Years is "+save2;
                String result3 = "Monthly Payment is Rs. "+save3;
                String result4 = "No. of Payments are "+save4;

                listView.getItems().addAll(result,result1,result2,result3,result4,"\n");
                listView.scrollTo(listView.getItems().size()-1);
            }
        });
    }
}
