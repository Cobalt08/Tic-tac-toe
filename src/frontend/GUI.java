package frontend;

import backend.iController;
import backend.Grid;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

	private iController backend;
	private int currentPlayer;
	private Stage stage;
	private int turnCounter;
	private Button quit;
	private Button retry;
	private Label label;
	private Scene scene;

	@Override
	public void start(Stage stage) throws Exception {

		this.stage = stage;
		this.backend = new Grid();
		this.currentPlayer = 1;
		this.turnCounter = 0;

		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(20.0);
		gridPane.setVgap(20.0);

		stage.setTitle("Tic-Tac-Toe");

		int buttonSize = 80;

		Button button1 = new Button();
		button1.setPrefHeight(buttonSize);
		button1.setPrefWidth(buttonSize);
		Button button2 = new Button();
		button2.setPrefHeight(buttonSize);
		button2.setPrefWidth(buttonSize);
		Button button3 = new Button();
		button3.setPrefHeight(buttonSize);
		button3.setPrefWidth(buttonSize);
		Button button4 = new Button();
		button4.setPrefHeight(buttonSize);
		button4.setPrefWidth(buttonSize);
		Button button5 = new Button();
		button5.setPrefHeight(buttonSize);
		button5.setPrefWidth(buttonSize);
		Button button6 = new Button();
		button6.setPrefHeight(buttonSize);
		button6.setPrefWidth(buttonSize);
		Button button7 = new Button();
		button7.setPrefHeight(buttonSize);
		button7.setPrefWidth(buttonSize);
		Button button8 = new Button();
		button8.setPrefHeight(buttonSize);
		button8.setPrefWidth(buttonSize);
		Button button9 = new Button();
		button9.setPrefHeight(buttonSize);
		button9.setPrefWidth(buttonSize);

		Button quit = new Button();
		this.quit = quit;
		quit.setText("Quit");
		quit.setPadding(new Insets(5, 10, 5, 10));

		Button retry = new Button();
		retry.setPadding(new Insets(5, 10, 5, 10));
		retry.setText("Try again");
		this.retry = retry;

		Label label = new Label();
		label.setPrefHeight(20);
		label.setPrefHeight(30);
		label.setPadding(new Insets(60, 60, 20, 60));
		this.label = label;

		button1.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(0, 0)) {
					button1.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(0, 0)) {
					button1.setText("O");
					this.endTurn();
				}
			}
		});

		button2.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(0, 1)) {
					button2.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(0, 1)) {
					button2.setText("O");
					this.endTurn();
				}
			}
		});

		button3.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(0, 2)) {
					button3.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(0, 2)) {
					button3.setText("O");
					this.endTurn();
				}
			}
		});

		button4.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(1, 0)) {
					button4.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(1, 0)) {
					button4.setText("O");
					this.endTurn();
				}
			}
		});

		button5.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(1, 1)) {
					button5.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(1, 1)) {
					button5.setText("O");
					this.endTurn();
				}
			}
		});

		button6.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(1, 2)) {
					button6.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(1, 2)) {
					button6.setText("O");
					this.endTurn();
				}
			}
		});

		button7.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(2, 0)) {
					button7.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(2, 0)) {
					button7.setText("O");
					this.endTurn();
				}
			}
		});

		button8.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(2, 1)) {
					button8.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(2, 1)) {
					button8.setText("O");
					this.endTurn();
				}
			}
		});

		button9.setOnAction(e -> {
			if (this.currentPlayer == 1) {
				if (backend.XTurn(2, 2)) {
					button9.setText("X");
					this.endTurn();
				}
			} else {
				if (backend.YTurn(2, 2)) {
					button9.setText("O");
					this.endTurn();
				}
			}
		});

		this.quit.setOnAction(e -> {
			this.stage.close();
		});

		this.retry.setOnAction(e -> {
			this.turnCounter = 0;
			this.backend.clear();
			button1.setText(null);
			button2.setText(null);
			button3.setText(null);
			button4.setText(null);
			button5.setText(null);
			button6.setText(null);
			button7.setText(null);
			button8.setText(null);
			button9.setText(null);
			stage.setScene(this.scene);

		});

		gridPane.add(button1, 0, 0);
		gridPane.add(button2, 1, 0);
		gridPane.add(button3, 2, 0);
		gridPane.add(button4, 0, 1);
		gridPane.add(button5, 1, 1);
		gridPane.add(button6, 2, 1);
		gridPane.add(button7, 0, 2);
		gridPane.add(button8, 1, 2);
		gridPane.add(button9, 2, 2);
		// gridPane.setPrefHeight(300);
		// gridPane.setPrefWidth(300);
		gridPane.setGridLinesVisible(true);
		Scene scene = new Scene(gridPane);
		this.scene = scene;
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		// GUI gui = new GUI();
		Application.launch(args);
	}

	private void switchPlayer() {
		if (this.currentPlayer == 1) {
			this.currentPlayer = 2;
		} else {
			this.currentPlayer = 1;
		}
	}

	private void win(int player) {
		String winner;
		if (this.currentPlayer == 1) {
			winner = "X";
		} else {
			winner = "0";
		}
		this.label.setText("Player " + winner + " has won!");
		this.label.setTranslateY(-60);
		this.quit.setTranslateY(-50);

		VBox vBox = new VBox();
		vBox.setSpacing(5.0);
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().addAll(label, this.quit);
		Image image = new Image("file:./img/pokal.png");
		ImageView imgView = new ImageView(image);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(imgView, vBox);
		stack.setPadding(new Insets(10, 10, 10, 10));
		Scene scene = new Scene(stack);
		stage.setScene(scene);

	}

	private void draw() {
		this.label.setText("Draw");
		this.label.setTranslateY(-30);
		this.quit.setTranslateY(-20);
		this.retry.setTranslateY(-30);
		VBox vBox = new VBox();
		vBox.setPadding(new Insets(10, 10, 10, 10));
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().addAll(label, retry, this.quit);
		Scene scene = new Scene(vBox);
		stage.setScene(scene);
	}

	private void endTurn() {
		if (backend.hasWon(this.currentPlayer)) {
			this.win(this.currentPlayer);
		} else {
			this.turnCounter++;
			if (this.turnCounter == 9) {
				this.draw();
			}
			this.switchPlayer();
		}
	}

}
