module chineseCheckers {
    requires javafx.controls;
    requires javafx.fxml;

    opens chineseCheckers to javafx.fxml;
    exports chineseCheckers;
}