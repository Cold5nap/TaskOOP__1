package chineseCheckers;

import javafx.scene.control.Label;

//Класс для установления последовательности ходов игроков
public class PlayerOrder {
    private int order;
    private int numberOfPlayers;
    private boolean isPrevOrderJUMPOVER = false;
    private Label pieceTypeLabel ;
    private Piece piece = null;

    public PlayerOrder(int order, int numberOfPlayers) {
        this.order = order;
        this.numberOfPlayers = numberOfPlayers - 1;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers + 1;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers-1;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setStringToLabel(String data) {
        pieceTypeLabel.setText(data);
    }

    public void setLabel(Label label) {
        this.pieceTypeLabel = label;
    }

    public String getStringOfLabel() {
        return pieceTypeLabel.getText();
    }

    public Label getPieceTypeLabel() {
        return pieceTypeLabel;
    }

    public int getOrder() {
        return order;
    }

    public boolean isPrevOrderJUMPOVER() {
        return isPrevOrderJUMPOVER;
    }

    public void setPrevOrderJUMPOVER(boolean prevOrderJUMPOVER) {
        isPrevOrderJUMPOVER = prevOrderJUMPOVER;
    }

    public PieceType getPieceType() {
        return PieceType.getPieceType(order);
    }

    public void nextOrder() {
        if (order == numberOfPlayers) {
            order = 0;
        } else {
            order++;
        }
        setPrevOrderJUMPOVER(false);
        setStringToLabel("" + getPieceType());

    }


}
