package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CalHelp {
    public static void help(Stage primaryStage){
        Pane root = new Pane();

        Label lblHome = new Label("Help");
        lblHome.setStyle("-fx-font-family: 'Comic Sans MS'; -fx-font-weight: bolder; -fx-text-fill: darkblue; " +
                "-fx-background-color: linear-gradient(red,orange,orangered); -fx-min-width: 190px; -fx-min-height: 140px; -fx-alignment: center");
        lblHome.setLayoutX(0);
        lblHome.setLayoutY(0);
        root.getChildren().add(lblHome);

        Button home = new Button();
        home.setText("Home");
        home.setLayoutX(0);
        home.setLayoutY(140);
        home.setId("btnHelpRow");
        root.getChildren().add(home);
        home.setOnAction(event -> { Stage stage = (Stage) home.getScene().getWindow(); stage.close(); Main.home(primaryStage);});

        Button close = new Button();
        close.setText("Close");
        close.setLayoutX(0);
        close.setLayoutY(860);
        close.setId("btnHelpRow");
        root.getChildren().add(close);
        close.setOnAction(event -> { Stage stage = (Stage) close.getScene().getWindow(); stage.close(); });

        Button fd = new Button();
        fd.setText("Compound Interest");
        fd.setLayoutX(0);
        fd.setLayoutY(260);
        fd.setId("btnHelpRow1");
        root.getChildren().add(fd);
        fd.setOnAction(event -> {Stage stage = (Stage) fd.getScene().getWindow(); stage.close(); CalCsiFD.csi(primaryStage);});

        Button savings = new Button();
        savings.setText("Compound Interest\nwith Contribution");
        savings.setLayoutX(0);
        savings.setLayoutY(380);
        savings.setId("btnHelpRow1");
        root.getChildren().add(savings);
        savings.setOnAction(event -> {Stage stage = (Stage) savings.getScene().getWindow(); stage.close(); CalCsiSavings.csi(primaryStage);});

        Button simpleInt = new Button();
        simpleInt.setText("Simple Interest Savings");
        simpleInt.setLayoutX(0);
        simpleInt.setLayoutY(500);
        simpleInt.setId("btnHelpRow1");
        root.getChildren().add(simpleInt);
        simpleInt.setOnAction(event -> {Stage stage = (Stage) simpleInt.getScene().getWindow(); stage.close(); CalSimpleInterest.savings(primaryStage);});

        Button loans = new Button();
        loans.setText("Loans");
        loans.setLayoutX(0);
        loans.setLayoutY(620);
        loans.setId("btnHelpRow1");
        root.getChildren().add(loans);
        loans.setOnAction(event -> {Stage stage = (Stage) loans.getScene().getWindow(); stage.close(); CalLoans.loans(primaryStage);});

        Button mortgage = new Button();
        mortgage.setText("Mortgage");
        mortgage.setLayoutX(0);
        mortgage.setLayoutY(740);
        mortgage.setId("btnHelpRow1");
        root.getChildren().add(mortgage);
        mortgage.setOnAction(event -> {Stage stage = (Stage) mortgage.getScene().getWindow(); stage.close(); CalMortgage.mortgage(primaryStage);});

//Setting up the content of the Help Window.
        Label lbl = new Label("How To Use The Financial Calculator");
        lbl.setLayoutX(750);
        lbl.setLayoutY(20);
        lbl.setId("lblHelpMain");
        root.getChildren().add(lbl);

        Label lbl1 = new Label("Compound Interest for Simple Savings.");
        lbl1.setLayoutX(220);
        lbl1.setLayoutY(80);
        lbl1.setId("lblHelp");
        root.getChildren().add(lbl1);

        Text txtCisFd = new Text("Compound interest is the addition of interest to the principal sum of a loan or deposit, " +
                "or in other words, interest on interest. It is the result of reinvesting interest, rather than paying it out, " +
                "so that interest in the next period is \nthen earned on the principal sum plus previously accumulated interest." +
                "In this we don't consider the monthly contribution. " +
                "\n\tInvested Amount = Initial investment of the Customer." +
                "\n\tNumber of years = Number of years the money is invested." +
                "\n\tInterest Rate = Interest Rate provided by the Financial Institution for a Year." +
                "\n\tAccumulated Amount = Invested amount plus the total interest." +
                "\t\t\t\t* YOU CAN ONLY KEEP ONE FIELD EMPTY!!");
        txtCisFd.setLayoutX(220);
        txtCisFd.setLayoutY(130);
        root.getChildren().add(txtCisFd);

        Label lbl2 = new Label("Compound Interest with Monthly Contribution.");
        lbl2.setLayoutX(220);
        lbl2.setLayoutY(270);
        lbl2.setId("lblHelp");
        root.getChildren().add(lbl2);

        Text txtCisSavings = new Text("Compound interest is the addition of interest to the principal sum of a loan or deposit, " +
                "or in other words, interest on interest. It is the result of reinvesting interest, rather than paying it out, " +
                "so that interest in the next period is \nthen earned on the principal sum plus previously accumulated interest." +
                "In this we consider the monthly contributions and we calculate the interest for them too. " +
                "\n\tInvested Amount = Initial investment of the Customer." +
                "\n\tNumber of years = Number of years the money is invested." +
                "\n\tInterest Rate = Interest Rate provided by the Financial Institution for a Year." +
                "\n\tAccumulated Amount = Invested amount plus the total interest." +
                "\n\tContribution = The monthly sum invested by the user." +
                "\t\t\t\t\t\t* YOU CAN ONLY KEEP ONE FIELD EMPTY!! INTEREST FIELD IS MANDATORY!!");
        txtCisSavings.setLayoutX(220);
        txtCisSavings.setLayoutY(320);
        root.getChildren().add(txtCisSavings);

        Label lbl3 = new Label("Simple Interest");
        lbl3.setLayoutX(220);
        lbl3.setLayoutY(480);
        lbl3.setId("lblHelp");
        root.getChildren().add(lbl3);

        Text txtSimpleInterest = new Text("Simple interest is used to calculate interest for the invested amount in a given time period." +
                "The interest is not added to the invested amount when calculating the interest for several years." +
                "\nThe invested amount stays the same for the given number of years." +
                "\n\tInvested Amount = Initial investment of the Customer." +
                "\n\tNumber of years = Number of years the money is invested." +
                "\n\tInterest Rate = Interest Rate provided by the Financial Institution for a Year." +
                "\n\tFinal Amount = Invested amount plus the total interest." +
                "\t\t\t\t\t* YOU CAN ONLY KEEP ONE FIELD EMPTY!! INTEREST FIELD IS MANDATORY!!");
        txtSimpleInterest.setLayoutX(220);
        txtSimpleInterest.setLayoutY(530);
        root.getChildren().add(txtSimpleInterest);

        Label lbl4 = new Label("Loans");
        lbl4.setLayoutX(220);
        lbl4.setLayoutY(660);
        lbl4.setId("lblHelp");
        root.getChildren().add(lbl4);

        Text txtLoans = new Text(" A loan is a type of debt. The borrower needs to repay the lender the sum of money " +
                "loaned part by part over time with interest in order to clear the debt." +
                "\n\tLoan Amount = Amount lent by the loan provider." +
                "\n\tNumber of years = Number of years the money is lent for the loan." +
                "\n\tInterest Rate = Interest Rate provided by the Financial Institution for a Year." +
                "\n\tMonthly Payment = Payment that should be paid monthly." +
                "\t\t\t\t\t* YOU CAN ONLY KEEP ONE FIELD EMPTY!! INTEREST FIELD IS MANDATORY!!");
        txtLoans.setLayoutX(220);
        txtLoans.setLayoutY(710);
        root.getChildren().add(txtLoans);

        Label lbl5 = new Label("Mortgage");
        lbl5.setLayoutX(220);
        lbl5.setLayoutY(830);
        lbl5.setId("lblHelp");
        root.getChildren().add(lbl5);

        Text txtMortgage = new Text("A mortgage is a loan in which property or real estate is used as collateral. " +
                "The borrower enters into an agreement with the lender (usually a bank) wherein the borrower receives \ncash upfront " +
                "then makes payments over a set time span until he pays back the lender in full." +
                "\n\tMortgage Amount = Loan received for the asset which is kept as collateral.." +
                "\n\tNumber of years = Number of years the money is lent for the loan." +
                "\n\tMonthly Payment = Payment that should be paid monthly." +
                "\t\t\t\t\t* YOU CAN ONLY KEEP ONE FIELD EMPTY!! INTEREST FIELD IS MANDATORY!!");
        txtMortgage.setLayoutX(220);
        txtMortgage.setLayoutY(880);
        root.getChildren().add(txtMortgage);

        primaryStage.setTitle("Financial Calculator Help");
        root.setId("HelpBgImage");
        Scene scene = new Scene(root,1900  ,990);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(CalSimpleInterest.class.getResource("styleGui.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
