package com.example.finalmedieval;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

// Abstract base class for finalized scenes
abstract class FinalizedScene {

    public FinalizedScene() {

    }

    // Abstract method to be implemented by subclasses
    public abstract Scene createScene(Stage primaryStage);
}

// A specific finalized scene implementation
public class CharacterSummaryScene extends FinalizedScene {
    private final String characterName;
    private final ImageView characterImage;
    private final String stats;

    // Constructor to accept finalized character details
    public CharacterSummaryScene(String characterName, ImageView characterImage, String stats) {
        super();
        this.characterName = characterName;
        this.characterImage = characterImage;
        this.stats = stats;
    }

    @Override
    public Scene createScene(Stage primaryStage) {
        // Root layout with BorderPane for flexible positioning
        BorderPane layout = new BorderPane();

        // Character name label, styled
        Label nameLabel = new Label(characterName);
        nameLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");


        // Wrap the nameLabel in an HBox to align it to the top-left
        HBox topContainer = new HBox(nameLabel);
        topContainer.setAlignment(Pos.TOP_CENTER); // Align contents (label) to the top-center
        topContainer.setStyle("-fx-padding: 10px; -fx-background-color: rgba(0, 0, 0, 0.5);");


        // Add top container to the top region of the BorderPane
        layout.setTop(topContainer);

        // Set up the character image in the center (background)
        ImageView imageView = new ImageView(characterImage.getImage());
        imageView.setFitWidth(800);
        imageView.setFitHeight(800);
        imageView.setPreserveRatio(false);

        // Use a StackPane to layer the image and stats in the center
        StackPane centerPane = new StackPane();
        centerPane.getChildren().add(imageView); // Background image

        // Stats label, placed in the center of the image
        Label statsLabel = new Label(stats);
        statsLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: white;");

        // Add HBox for Stats Label
        HBox statsBox = new HBox(statsLabel);
        statsBox.setAlignment(Pos.BOTTOM_CENTER);
        statsBox.setStyle("-fx-padding: 0px; -fx-background-color: rgba(0, 0, 0, 0.5);");

        // Add statsLabel to layout
        layout.setBottom(statsBox);

        // Add center pane to the center region of the BorderPane
        layout.setCenter(centerPane);

        // Return the scene
        return new Scene(layout, 800, 935); // Customize the scene size
    }
}