package PRAKTIKUM6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();

        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("NIM");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolomNim);
        tabel.getColumns().add(kolomNama);
        tabel.getItems().add(new Mahasiswa(1, "2210817210010", "Aeron"));
        tabel.getItems().add(new Mahasiswa(2, "2210817310011", "Tjitradi"));
        tabel.getItems().add(new Mahasiswa(3, "2210817110001", "Joe"));
        tabel.getItems().add(new Mahasiswa(4, "2210817210005", "Biden"));
        tabel.getItems().add(new Mahasiswa(5, "2210817310020", "Donald"));
        tabel.getItems().add(new Mahasiswa(6, "2210817210015", "Trump"));
        tabel.getItems().add(new Mahasiswa(7, "2210817310013", "Barack"));
        tabel.getItems().add(new Mahasiswa(8, "2210817110007", "Obama"));
        tabel.getItems().add(new Mahasiswa(9, "2210817110009", "Steve"));
        tabel.getItems().add(new Mahasiswa(10, "2210817210010", "Jobs"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
