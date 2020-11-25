package chineseCheckers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static chineseCheckers.ChineseCheckersApp.PLAYER_ORDER;

public class MainController {

    @FXML
    private Label playerOrderLabel;
    @FXML
    private TextField numPlayersTextField;

    @FXML
    private void save() throws IOException {
ChineseCheckersApp.save();
    }

    @FXML
    private void load() throws IOException, ClassNotFoundException {
        ChineseCheckersApp.load();
    }

    @FXML
    private void nextPlayer() {
        PLAYER_ORDER.nextOrder();
        playerOrderLabel.setText(PLAYER_ORDER.getStringOfLabel());
    }

    @FXML
    private void setNumPlayers() {
        PLAYER_ORDER.setNumberOfPlayers(Integer.parseInt(numPlayersTextField.getText()));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Уведомление");
        alert.setHeaderText("Подтверждение");
        alert.setContentText("Вы определили " + PLAYER_ORDER.getNumberOfPlayers() + " игроков");
        alert.showAndWait();
    }
}
