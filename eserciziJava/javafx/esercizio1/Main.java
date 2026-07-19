import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label messaggio = new Label("Inserisci il tuo nome:");

        TextField nome = new TextField();

        Button bottone = new Button("Saluta");

        Label risultato = new Label();


        bottone.setOnAction(e -> {

            risultato.setText("Ciao " + nome.getText() + "!");

        });


        VBox layout = new VBox();

        layout.getChildren().addAll(
                messaggio,
                nome,
                bottone,
                risultato
        );


        Scene scena = new Scene(layout, 300, 200);


        stage.setTitle("Primo programma JavaFX");
        stage.setScene(scena);
        stage.show();

    }


    public static void main(String[] args) {

        launch(args);

    }

}