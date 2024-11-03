import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fenster extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Standard Fenster");


        // Button erstellen und Ereignis hinzufügen
        Button eins = new Button("1");
        Button zwei = new Button("2");
        Button drei = new Button("3");
        Button vier = new Button("4");
        Button fuenf = new Button("5");
        Button sechs = new Button("6");
        Button sieben = new Button("7");
        Button acht = new Button("8");
        Button neun = new Button("9");
        Button nulll = new Button("0");


        Button plus = new Button("+");
        Button minus = new Button("-");
        Button mal = new Button("*");
        Button geteilt = new Button("/");
        Button gleich = new Button("=");
        Label ausgabe = new Label();
        String[] rechnung1 = new String[1];
        String[] rechnung = new String[2];
        rechnung[0] = "0";
        rechnung[1] = "+";

        int[] ergebnis = {0};
        TextField textField = new TextField();

        eins.setOnAction(event -> {

            String text = "1";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        zwei.setOnAction(event -> {

            String text = "2";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        drei.setOnAction(event -> {

            String text = "3";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        vier.setOnAction(event -> {

            String text = "4";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        fuenf.setOnAction(event -> {

            String text = "5";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        sechs.setOnAction(event -> {

            String text = "6";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        sieben.setOnAction(event -> {

            String text = "7";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        acht.setOnAction(event -> {

            String text = "8";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        neun.setOnAction(event -> {

            String text = "9";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        nulll.setOnAction(event -> {

            String text = "0";
            String currentText = textField.getText();
            textField.setText(currentText + text);

            rechnung[0] = textField.getText();

        });
        plus.setOnAction(event -> {

            textField.clear();
            rechnung1[0] = rechnung[0];
            rechnung[1] = "+";

        });
        minus.setOnAction(event -> {

            textField.clear();
            rechnung1[0] = rechnung[0];
            rechnung[1] = "-";

        });
        mal.setOnAction(event -> {

            textField.clear();
            rechnung1[0] = rechnung[0];
            rechnung[1] = "*";

        });
        geteilt.setOnAction(event -> {

            textField.clear();
            rechnung1[0] = rechnung[0];
            rechnung[1] = "/";

        });
        gleich.setOnAction(event -> {


            rechnung[0] = textField.getText();
            textField.clear();
            int zahl1 = Integer.parseInt(rechnung1[0]);
            String operator = rechnung[1];
            int zahl2 = Integer.parseInt(rechnung[0]);
            if (operator.equals("+")) {
                ergebnis[0] = zahl1 + zahl2;
                ausgabe.setText(String.valueOf(ergebnis[0]));
            }
            if (operator.equals("-")) {
                ergebnis[0] = zahl1 - zahl2;
                ausgabe.setText(String.valueOf(ergebnis[0]));
            }
            if (operator.equals("*")) {
                ergebnis[0] = zahl1 * zahl2;
                ausgabe.setText(String.valueOf(ergebnis[0]));
            }
            if (operator.equals("/")) {
                ergebnis[0] = zahl1 / zahl2;
                ausgabe.setText(String.valueOf(ergebnis[0]));
            }
        });
        textField.setLayoutX(20);
        textField.setLayoutY(20);
        ausgabe.setLayoutX(200);
        ausgabe.setLayoutY(25);

        gleich.setLayoutX(175);
        gleich.setLayoutY(20);


        plus.setLayoutX(125);
        plus.setLayoutY(50);
        minus.setLayoutX(125);
        minus.setLayoutY(75);
        mal.setLayoutX(125);
        mal.setLayoutY(100);
        geteilt.setLayoutX(125);
        geteilt.setLayoutY(125);

        eins.setLayoutX(50);
        eins.setLayoutY(50);
        zwei.setLayoutX(75);
        zwei.setLayoutY(50);
        drei.setLayoutX(100);
        drei.setLayoutY(50);

        vier.setLayoutX(50);
        vier.setLayoutY(75);
        fuenf.setLayoutX(75);
        fuenf.setLayoutY(75);
        sechs.setLayoutX(100);
        sechs.setLayoutY(75);

        sieben.setLayoutX(50);
        sieben.setLayoutY(100);
        acht.setLayoutX(75);
        acht.setLayoutY(100);
        neun.setLayoutX(100);
        neun.setLayoutY(100);

        nulll.setLayoutX(75);
        nulll.setLayoutY(125);

        // Layout festlegen
        Pane root = new Pane();

        root.getChildren().addAll(textField, eins, zwei, drei, vier, fuenf, sechs, sieben, acht, neun, nulll, plus, minus, mal, geteilt, gleich, ausgabe);


        // Szene und Größe des Fensters festlegen
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        // Fenster anzeigen
        primaryStage.show();
    }
}
