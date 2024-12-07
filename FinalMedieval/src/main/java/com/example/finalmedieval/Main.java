
package com.example.finalmedieval;
//IMPORTS
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    // Creation of Character Image Array
    Image[] characterImages;
    int currentCharacterIndex = 0;

    // Creates Variables for Each Image
    int humanStaffCloth = 0;
    int humanClothDaggers = 1;
    int humanClothSword = 2;
    int humanClothAxe = 3;
    int humanLeatherStaff = 4;
    int humanLeatherDaggers = 5;
    int humanLeatherSword = 6;
    int humanLeatherAxe = 7;
    int humanHeavyStaff = 8;
    int humanHeavyDaggers = 9;
    int humanHeavySword = 10;
    int humanHeavyAxe = 11;
    int elfClothStaff = 12;
    int elfClothDaggers = 13;
    int elfClothSword = 14;
    int elfClothAxe = 15;
    int elfLeatherStaff = 16;
    int elfLeatherDaggers = 17;
    int elfLeatherSword = 18;
    int elfLeatherAxe = 19;
    int elfHeavyStaff = 20;
    int elfHeavyDaggers = 21;
    int elfHeavySword = 22;
    int elfHeavyAxe = 23;
    int orcClothStaff = 24;
    int orcClothDaggers = 25;
    int orcClothSword = 26;
    int orcClothAxe = 27;
    int orcLeatherStaff = 28;
    int orcLeatherDaggers = 29;
    int orcLeatherSword = 30;
    int orcLeatherAxe = 31;
    int orcHeavyStaff = 32;
    int orcHeavyDaggers = 33;
    int orcHeavySword = 34;
    int orcHeavyAxe = 35;

    // Default Image
    ImageView characterImageView;

    @Override
    public void start(Stage primaryStage) {
        // nitialize Images
        loadImages();
        characterImageView = new ImageView(characterImages[currentCharacterIndex]);
        // Sets Properties For All ImageViews
        setImageViewProperties(characterImageView);

        // Create Buttons (Arrows for Race, Armor, and Weapon Selection)
        Button raceSelectionPrevious = new Button("Previous Race");
        Button raceSelectionNext = new Button("Next Race");
        Button weaponSelectionPrevious = new Button("Previous Weapon");
        Button weaponSelectionNext = new Button("Next Weapon");
        Button armorTypeSelectionPrevious = new Button("Previous Armor Type");
        Button armorTypeSelectionNext = new Button("Next Armor");

        // Creates the VBox for the 'Previous' Buttons
        VBox previousSelections = new VBox(200);
        previousSelections.getChildren().addAll(raceSelectionPrevious, weaponSelectionPrevious, armorTypeSelectionPrevious);

        // Creates the VBox for the 'Next' Buttons
        VBox nextSelections = new VBox(200);
        nextSelections.getChildren().addAll(raceSelectionNext, weaponSelectionNext, armorTypeSelectionNext);

        // Setup ImageView with initial image
        characterImageView = new ImageView(characterImages[currentCharacterIndex]);
        characterImageView.setFitWidth(500);
        characterImageView.setFitHeight(500);
        characterImageView.setPreserveRatio(true);

        // Button event handlers
            // Race Previous Handlers
        raceSelectionPrevious.setOnAction(e -> {
            if (currentCharacterIndex == humanStaffCloth) {
                currentCharacterIndex = orcClothStaff;
            } else if (currentCharacterIndex == orcClothStaff) {
                currentCharacterIndex = elfClothStaff;
            } else if (currentCharacterIndex == elfClothStaff) {
                currentCharacterIndex = humanStaffCloth;
            } else if (currentCharacterIndex == humanLeatherStaff) {
                currentCharacterIndex = orcLeatherStaff;
            } else if (currentCharacterIndex == orcLeatherStaff) {
                    currentCharacterIndex = elfLeatherStaff;
            } else if (currentCharacterIndex == elfLeatherStaff) {
                currentCharacterIndex = humanLeatherStaff;
            } else if (currentCharacterIndex == humanHeavyStaff) {
                currentCharacterIndex = orcHeavyStaff;
            } else if (currentCharacterIndex == orcHeavyStaff) {
                currentCharacterIndex = elfHeavyStaff;
            } else if (currentCharacterIndex == elfHeavyStaff) {
                currentCharacterIndex = humanHeavyStaff;
            } else if (currentCharacterIndex == humanClothDaggers) {
                currentCharacterIndex = orcClothDaggers;
            } else if (currentCharacterIndex == orcClothDaggers) {
                currentCharacterIndex = elfClothDaggers;
            } else if (currentCharacterIndex == elfClothDaggers) {
                currentCharacterIndex = humanClothDaggers;
            } else if (currentCharacterIndex == humanLeatherDaggers) {
                currentCharacterIndex = orcLeatherDaggers;
            } else if (currentCharacterIndex == orcLeatherDaggers) {
                currentCharacterIndex = elfLeatherDaggers;
            } else if (currentCharacterIndex == elfLeatherDaggers) {
                currentCharacterIndex = humanLeatherDaggers;
            } else if (currentCharacterIndex == humanHeavyDaggers) {
                currentCharacterIndex = orcHeavyDaggers;
            } else if (currentCharacterIndex == orcHeavyDaggers) {
                currentCharacterIndex = elfHeavyDaggers;
            } else if (currentCharacterIndex == elfHeavyDaggers) {
                currentCharacterIndex = humanHeavyDaggers;
            } else if (currentCharacterIndex == humanClothSword) {
                currentCharacterIndex = orcClothSword;
            } else if (currentCharacterIndex == orcClothSword) {
                currentCharacterIndex = elfClothSword;
            } else if (currentCharacterIndex == elfClothSword) {
                currentCharacterIndex = humanClothSword;
            } else if (currentCharacterIndex == humanLeatherSword) {
                currentCharacterIndex = orcLeatherSword;
            } else if (currentCharacterIndex == orcLeatherSword) {
                currentCharacterIndex = elfLeatherSword;
            } else if (currentCharacterIndex == elfLeatherSword) {
                currentCharacterIndex = humanLeatherSword;
            } else if (currentCharacterIndex == humanHeavySword) {
                currentCharacterIndex = orcHeavySword;
            } else if (currentCharacterIndex == orcHeavySword) {
                currentCharacterIndex = elfHeavySword;
            } else if (currentCharacterIndex == elfHeavySword) {
                currentCharacterIndex = humanHeavySword;
            } else if (currentCharacterIndex == humanClothAxe) {
                currentCharacterIndex = orcClothAxe;
            } else if (currentCharacterIndex == orcClothAxe) {
                currentCharacterIndex = elfClothAxe;
            } else if (currentCharacterIndex == elfClothAxe) {
                currentCharacterIndex = humanClothAxe;
            } else if (currentCharacterIndex == humanLeatherAxe) {
                currentCharacterIndex = orcLeatherAxe;
            } else if (currentCharacterIndex == orcLeatherAxe) {
                currentCharacterIndex = elfLeatherAxe;
            } else if (currentCharacterIndex == elfLeatherAxe) {
                currentCharacterIndex = humanLeatherAxe;
            } else if (currentCharacterIndex == humanHeavyAxe) {
                currentCharacterIndex = orcHeavyAxe;
            } else if (currentCharacterIndex == orcHeavyAxe) {
                currentCharacterIndex = elfHeavyAxe;
            } else if (currentCharacterIndex == elfHeavyAxe) {
                currentCharacterIndex = humanHeavyAxe;
            }
            characterImageView.setImage(characterImages[currentCharacterIndex]);
        });
            // Race Next Handlers
        raceSelectionNext.setOnAction(e -> {
        if (currentCharacterIndex == humanStaffCloth) {
            currentCharacterIndex = elfClothStaff;
        } else if (currentCharacterIndex == elfClothStaff) {
            currentCharacterIndex = orcClothStaff;
        } else if (currentCharacterIndex == orcClothStaff) {
            currentCharacterIndex = humanStaffCloth;
        } else if (currentCharacterIndex == humanLeatherStaff) {
            currentCharacterIndex = elfLeatherStaff;
        } else if (currentCharacterIndex == elfLeatherStaff) {
            currentCharacterIndex = orcLeatherStaff;
        } else if (currentCharacterIndex == orcLeatherStaff) {
            currentCharacterIndex = humanLeatherStaff;
        } else if (currentCharacterIndex == humanHeavyStaff) {
            currentCharacterIndex = elfHeavyStaff;
        } else if (currentCharacterIndex == elfHeavyStaff) {
            currentCharacterIndex = orcHeavyStaff;
        } else if (currentCharacterIndex == orcHeavyStaff) {
            currentCharacterIndex = humanHeavyStaff;
        } else if (currentCharacterIndex == humanClothDaggers) {
            currentCharacterIndex = elfClothDaggers;
        } else if (currentCharacterIndex == elfClothDaggers) {
            currentCharacterIndex = orcClothDaggers;
        } else if (currentCharacterIndex == orcClothDaggers) {
            currentCharacterIndex = humanClothDaggers;
        } else if (currentCharacterIndex == humanLeatherDaggers) {
            currentCharacterIndex = elfLeatherDaggers;
        } else if (currentCharacterIndex == elfLeatherDaggers) {
            currentCharacterIndex = orcLeatherDaggers;
        } else if (currentCharacterIndex == orcLeatherDaggers) {
            currentCharacterIndex = humanLeatherDaggers;
        } else if (currentCharacterIndex == humanHeavyDaggers) {
            currentCharacterIndex = elfHeavyDaggers;
        } else if (currentCharacterIndex == elfHeavyDaggers) {
            currentCharacterIndex = orcHeavyDaggers;
        } else if (currentCharacterIndex == orcHeavyDaggers) {
            currentCharacterIndex = humanHeavyDaggers;
        } else if (currentCharacterIndex == humanClothSword) {
            currentCharacterIndex = elfClothSword;
        } else if (currentCharacterIndex == elfClothSword) {
            currentCharacterIndex = orcClothSword;
        } else if (currentCharacterIndex == orcClothSword) {
            currentCharacterIndex = humanClothSword;
        } else if (currentCharacterIndex == humanLeatherSword) {
            currentCharacterIndex = elfLeatherSword;
        } else if (currentCharacterIndex == elfLeatherSword) {
            currentCharacterIndex = orcLeatherSword;
        } else if (currentCharacterIndex == orcLeatherSword) {
            currentCharacterIndex = humanLeatherSword;
        } else if (currentCharacterIndex == humanHeavySword) {
            currentCharacterIndex = elfHeavySword;
        } else if (currentCharacterIndex == elfHeavySword) {
            currentCharacterIndex = orcHeavySword;
        } else if (currentCharacterIndex == orcHeavySword) {
            currentCharacterIndex = humanHeavySword;
        } else if (currentCharacterIndex == humanClothAxe) {
            currentCharacterIndex = elfClothAxe;
        } else if (currentCharacterIndex == elfClothAxe) {
            currentCharacterIndex = orcClothAxe;
        } else if (currentCharacterIndex == orcClothAxe) {
            currentCharacterIndex = humanClothAxe;
        } else if (currentCharacterIndex == humanLeatherAxe) {
            currentCharacterIndex = elfLeatherAxe;
        } else if (currentCharacterIndex == elfLeatherAxe) {
            currentCharacterIndex = orcLeatherAxe;
        } else if (currentCharacterIndex == orcLeatherAxe) {
            currentCharacterIndex = humanLeatherAxe;
        } else if (currentCharacterIndex == humanHeavyAxe) {
            currentCharacterIndex = elfHeavyAxe;
        } else if (currentCharacterIndex == elfHeavyAxe) {
            currentCharacterIndex = orcHeavyAxe;
        } else if (currentCharacterIndex == orcHeavyAxe) {
            currentCharacterIndex = humanHeavyAxe;
        }
        ;
        characterImageView.setImage(characterImages[currentCharacterIndex]);
    });

            // Weapon Previous Handlers
        weaponSelectionPrevious.setOnAction(e -> {
            if (currentCharacterIndex == humanStaffCloth) {
            currentCharacterIndex = humanClothAxe;
        } else if (currentCharacterIndex == humanClothAxe) {
            currentCharacterIndex = humanClothSword;
        } else if (currentCharacterIndex == humanClothSword) {
            currentCharacterIndex = humanClothDaggers;
        } else if (currentCharacterIndex == humanClothDaggers) {
            currentCharacterIndex = humanStaffCloth;
        } else if (currentCharacterIndex == orcClothStaff) {
            currentCharacterIndex = orcClothAxe;
        } else if (currentCharacterIndex == orcClothAxe) {
                currentCharacterIndex = orcClothSword;
        } else if (currentCharacterIndex == orcClothSword) {
                currentCharacterIndex = orcClothDaggers;
            } else if (currentCharacterIndex == orcClothDaggers) {
                currentCharacterIndex = orcClothStaff;
            } else if (currentCharacterIndex == elfClothStaff) {
                currentCharacterIndex = elfClothAxe;
            } else if (currentCharacterIndex == elfClothAxe) {
            currentCharacterIndex = elfClothSword;
        } else if (currentCharacterIndex == elfClothSword) {
            currentCharacterIndex = elfClothDaggers;
        } else if (currentCharacterIndex == elfClothDaggers) {
            currentCharacterIndex = elfClothStaff;
        } else if (currentCharacterIndex == humanLeatherStaff) {
                currentCharacterIndex = humanLeatherAxe;
            } else if (currentCharacterIndex == humanLeatherAxe) {
                currentCharacterIndex = humanLeatherSword;
            } else if (currentCharacterIndex == humanLeatherSword) {
                currentCharacterIndex = humanLeatherDaggers;
            } else if (currentCharacterIndex == humanLeatherDaggers) {
                currentCharacterIndex = humanLeatherStaff;
            } else if (currentCharacterIndex == orcLeatherStaff){
                currentCharacterIndex = orcLeatherAxe;
            } else if (currentCharacterIndex == orcLeatherAxe) {
                currentCharacterIndex = orcLeatherSword;
            } else if (currentCharacterIndex == orcLeatherSword) {
                currentCharacterIndex = orcLeatherDaggers;
            } else if (currentCharacterIndex == orcLeatherDaggers) {
                currentCharacterIndex = orcLeatherStaff;
            } else if (currentCharacterIndex == elfLeatherStaff) {
                currentCharacterIndex = elfLeatherAxe;
            } else if (currentCharacterIndex == elfLeatherAxe) {
                currentCharacterIndex = elfLeatherSword;
            } else if (currentCharacterIndex == elfLeatherSword) {
                currentCharacterIndex = elfLeatherDaggers;
            } else if (currentCharacterIndex == elfLeatherDaggers) {
                currentCharacterIndex = elfLeatherStaff;
            } else if (currentCharacterIndex == humanHeavyStaff) {
                currentCharacterIndex = humanHeavyAxe;
            } else if (currentCharacterIndex == humanHeavyAxe) {
                currentCharacterIndex = humanHeavySword;
            } else if (currentCharacterIndex == humanHeavySword) {
                currentCharacterIndex = humanHeavyDaggers;
            } else if (currentCharacterIndex == humanHeavyDaggers) {
                currentCharacterIndex = humanHeavyStaff;
            } else if (currentCharacterIndex == orcHeavyStaff) {
                currentCharacterIndex = orcHeavyAxe;
            } else if (currentCharacterIndex == orcHeavyAxe) {
                currentCharacterIndex = orcHeavySword;
            } else if (currentCharacterIndex == orcHeavySword) {
                currentCharacterIndex = orcHeavyDaggers;
            } else if (currentCharacterIndex == orcHeavyDaggers) {
                currentCharacterIndex = orcHeavyStaff;
            } else if (currentCharacterIndex == elfHeavyStaff) {
                currentCharacterIndex = elfHeavyAxe;
            } else if (currentCharacterIndex == elfHeavyAxe) {
                currentCharacterIndex = elfHeavySword;
            } else if (currentCharacterIndex == elfHeavySword) {
                currentCharacterIndex = elfHeavyDaggers;
            } else if (currentCharacterIndex == elfHeavyDaggers) {
                currentCharacterIndex = elfHeavyStaff;
            }
            characterImageView.setImage(characterImages[currentCharacterIndex]);
        });
            // Weapon Next Handlers
            weaponSelectionNext.setOnAction(e -> {
               if (currentCharacterIndex == humanStaffCloth) {
                   currentCharacterIndex = humanClothDaggers;
               } else if (currentCharacterIndex == humanClothDaggers) {
                   currentCharacterIndex = humanClothSword;
               } else if (currentCharacterIndex == humanClothSword) {
                   currentCharacterIndex = humanClothAxe;
               } else if (currentCharacterIndex == humanClothAxe) {
                   currentCharacterIndex = humanStaffCloth;
               } else if (currentCharacterIndex == orcClothStaff) {
                   currentCharacterIndex = orcClothDaggers;
               } else if (currentCharacterIndex == orcClothDaggers) {
                   currentCharacterIndex = orcClothSword;
               } else if (currentCharacterIndex == orcClothSword) {
                   currentCharacterIndex = orcClothAxe;
               } else if (currentCharacterIndex == orcClothAxe) {
                   currentCharacterIndex = orcClothStaff;
               } else if (currentCharacterIndex == elfClothStaff) {
                   currentCharacterIndex = elfClothDaggers;
               } else if (currentCharacterIndex == elfClothDaggers) {
                   currentCharacterIndex = elfClothSword;
               } else if (currentCharacterIndex == elfClothSword) {
                   currentCharacterIndex = elfClothAxe;
               } else if (currentCharacterIndex == elfClothAxe) {
                   currentCharacterIndex = elfClothStaff;
               } else if (currentCharacterIndex == humanLeatherStaff) {
                   currentCharacterIndex = humanLeatherDaggers;
               } else if (currentCharacterIndex == humanLeatherDaggers) {
                   currentCharacterIndex = humanLeatherSword;
               } else if (currentCharacterIndex == humanLeatherSword) {
                   currentCharacterIndex = humanLeatherAxe;
               } else if (currentCharacterIndex == humanLeatherAxe) {
                   currentCharacterIndex = humanLeatherStaff;
               } else if (currentCharacterIndex == orcLeatherStaff) {
                   currentCharacterIndex = orcLeatherDaggers;
               } else if (currentCharacterIndex == orcLeatherDaggers) {
                   currentCharacterIndex = orcLeatherSword;
               } else if (currentCharacterIndex == orcLeatherSword) {
                   currentCharacterIndex = orcLeatherAxe;
               } else if (currentCharacterIndex == orcLeatherAxe) {
                   currentCharacterIndex = orcLeatherStaff;
               } else if (currentCharacterIndex == elfLeatherStaff) {
                   currentCharacterIndex = elfLeatherDaggers;
               } else if (currentCharacterIndex == elfLeatherDaggers) {
                   currentCharacterIndex = elfLeatherSword;
               } else if (currentCharacterIndex == elfLeatherSword) {
                   currentCharacterIndex = elfLeatherAxe;
               } else if (currentCharacterIndex == elfLeatherAxe) {
                   currentCharacterIndex = elfLeatherStaff;
               } else if (currentCharacterIndex == humanHeavyStaff) {
                   currentCharacterIndex = humanHeavyDaggers;
               } else if (currentCharacterIndex == humanHeavyDaggers) {
                   currentCharacterIndex = humanHeavySword;
               } else if (currentCharacterIndex == humanHeavySword) {
                   currentCharacterIndex = humanHeavyAxe;
               } else if (currentCharacterIndex == humanHeavyAxe) {
                   currentCharacterIndex = humanHeavyStaff;
               } else if (currentCharacterIndex == orcHeavyStaff) {
                   currentCharacterIndex = orcHeavyDaggers;
               } else if (currentCharacterIndex == orcHeavyDaggers) {
                   currentCharacterIndex = orcHeavySword;
               } else if (currentCharacterIndex == orcHeavySword) {
                   currentCharacterIndex = orcHeavyAxe;
               } else if (currentCharacterIndex == orcHeavyAxe) {
                   currentCharacterIndex = orcHeavyStaff;
               } else if (currentCharacterIndex == elfHeavyStaff) {
                   currentCharacterIndex = elfHeavyDaggers;
               } else if (currentCharacterIndex == elfHeavyDaggers) {
                   currentCharacterIndex = elfHeavySword;
               } else if (currentCharacterIndex == elfHeavySword) {
                   currentCharacterIndex = elfHeavyAxe;
               } else if (currentCharacterIndex == elfHeavyAxe) {
                   currentCharacterIndex = elfHeavyStaff;
               }
                characterImageView.setImage(characterImages[currentCharacterIndex]);
            });
            // Armor Previous Handlers
        armorTypeSelectionPrevious.setOnAction(e -> {
            if (currentCharacterIndex == humanStaffCloth) {
                currentCharacterIndex = humanHeavyStaff;
            } else if (currentCharacterIndex == humanHeavyStaff) {
                currentCharacterIndex = humanLeatherStaff;
            } else if (currentCharacterIndex == humanLeatherStaff) {
                currentCharacterIndex = humanStaffCloth;
            } else if (currentCharacterIndex == orcClothStaff) {
                currentCharacterIndex = orcHeavyStaff;
            } else if (currentCharacterIndex == orcHeavyStaff) {
                currentCharacterIndex = orcLeatherStaff;
            } else if (currentCharacterIndex == orcLeatherStaff) {
                currentCharacterIndex = orcClothStaff;
            } else if (currentCharacterIndex == elfClothStaff) {
                currentCharacterIndex = elfHeavyStaff;
            } else if (currentCharacterIndex == elfHeavyStaff) {
                currentCharacterIndex = elfLeatherStaff;
            } else if (currentCharacterIndex == elfLeatherStaff) {
                currentCharacterIndex = elfClothStaff;
            } else if (currentCharacterIndex == humanClothDaggers) {
                currentCharacterIndex = humanHeavyDaggers;
            } else if (currentCharacterIndex == humanHeavyDaggers) {
                currentCharacterIndex = humanLeatherDaggers;
            } else if (currentCharacterIndex == humanLeatherDaggers) {
                currentCharacterIndex = humanClothDaggers;
            } else if (currentCharacterIndex == orcClothDaggers) {
                currentCharacterIndex = orcHeavyDaggers;
            } else if (currentCharacterIndex == orcHeavyDaggers) {
                currentCharacterIndex = orcLeatherDaggers;
            } else if (currentCharacterIndex == orcLeatherDaggers) {
                currentCharacterIndex = orcClothDaggers;
            } else if (currentCharacterIndex == elfClothDaggers) {
                currentCharacterIndex = elfHeavyDaggers;
            } else if (currentCharacterIndex == elfHeavyDaggers) {
                currentCharacterIndex = elfLeatherDaggers;
            } else if (currentCharacterIndex == elfLeatherDaggers) {
                currentCharacterIndex = elfClothDaggers;
            } else if (currentCharacterIndex == humanClothSword) {
                currentCharacterIndex = humanHeavySword;
            } else if (currentCharacterIndex == humanHeavySword) {
                currentCharacterIndex = humanLeatherSword;
            } else if (currentCharacterIndex == humanLeatherSword) {
                currentCharacterIndex = humanClothSword;
            } else if (currentCharacterIndex == orcClothSword) {
                currentCharacterIndex = orcHeavySword;
            } else if (currentCharacterIndex == orcHeavySword) {
                currentCharacterIndex = orcLeatherSword;
            } else if (currentCharacterIndex == orcLeatherSword) {
                currentCharacterIndex = orcClothSword;
            } else if (currentCharacterIndex == elfClothSword) {
                currentCharacterIndex = elfHeavySword;
            } else if (currentCharacterIndex == elfHeavySword) {
                currentCharacterIndex = elfLeatherSword;
            } else if (currentCharacterIndex == elfLeatherSword) {
                currentCharacterIndex = elfClothSword;
            } else if (currentCharacterIndex == humanClothAxe) {
                currentCharacterIndex = humanHeavyAxe;
            } else if (currentCharacterIndex == humanHeavyAxe) {
                currentCharacterIndex = humanLeatherAxe;
            } else if (currentCharacterIndex == humanLeatherAxe) {
                currentCharacterIndex = humanClothAxe;
            } else if (currentCharacterIndex == orcClothAxe) {
                currentCharacterIndex = orcHeavyAxe;
            } else if (currentCharacterIndex == orcHeavyAxe) {
                currentCharacterIndex = orcLeatherAxe;
            } else if (currentCharacterIndex == orcLeatherAxe) {
                currentCharacterIndex = orcClothAxe;
            } else if (currentCharacterIndex == elfClothAxe) {
                currentCharacterIndex = elfHeavyAxe;
            } else if (currentCharacterIndex == elfHeavyAxe) {
                currentCharacterIndex = elfLeatherAxe;
            } else if (currentCharacterIndex == elfLeatherAxe) {
                currentCharacterIndex = elfClothAxe;
            }
            characterImageView.setImage(characterImages[currentCharacterIndex]);
        });
            // Armor Next Handlers
        armorTypeSelectionNext.setOnAction(e -> {
            if (currentCharacterIndex == humanStaffCloth) {
                currentCharacterIndex = humanLeatherStaff;
            } else if (currentCharacterIndex == humanLeatherStaff) {
                currentCharacterIndex = humanHeavyStaff;
            } else if (currentCharacterIndex == humanHeavyStaff) {
                currentCharacterIndex = humanStaffCloth;
            } else if (currentCharacterIndex == orcClothStaff) {
                currentCharacterIndex = orcLeatherStaff;
            } else if (currentCharacterIndex == orcLeatherStaff) {
                currentCharacterIndex = orcHeavyStaff;
            } else if (currentCharacterIndex == orcHeavyStaff) {
                currentCharacterIndex = orcClothStaff;
            } else if (currentCharacterIndex == elfClothStaff) {
                currentCharacterIndex = elfLeatherStaff;
            } else if (currentCharacterIndex == elfLeatherStaff) {
                currentCharacterIndex = elfHeavyStaff;
            } else if (currentCharacterIndex == elfHeavyStaff) {
                currentCharacterIndex = elfClothStaff;
            } else if (currentCharacterIndex == humanClothDaggers) {
                currentCharacterIndex = humanLeatherDaggers;
            } else if (currentCharacterIndex == humanLeatherDaggers) {
                currentCharacterIndex = humanHeavyDaggers;
            } else if (currentCharacterIndex == humanHeavyDaggers) {
                currentCharacterIndex = humanClothDaggers;
            } else if (currentCharacterIndex == orcClothDaggers) {
                currentCharacterIndex = orcLeatherDaggers;
            } else if (currentCharacterIndex == orcLeatherDaggers) {
                currentCharacterIndex = orcHeavyDaggers;
            } else if (currentCharacterIndex == orcHeavyDaggers) {
                currentCharacterIndex = orcClothDaggers;
            } else if (currentCharacterIndex == elfClothDaggers) {
                currentCharacterIndex = elfLeatherDaggers;
            } else if (currentCharacterIndex == elfLeatherDaggers) {
                currentCharacterIndex = elfHeavyDaggers;
            } else if (currentCharacterIndex == elfHeavyDaggers) {
                currentCharacterIndex = elfClothDaggers;
            } else if (currentCharacterIndex == humanClothSword) {
                currentCharacterIndex = humanLeatherSword;
            } else if (currentCharacterIndex == humanLeatherSword) {
                currentCharacterIndex = humanHeavySword;
            } else if (currentCharacterIndex == humanHeavySword) {
                currentCharacterIndex = humanClothSword;
            } else if (currentCharacterIndex == orcClothSword) {
                currentCharacterIndex = orcLeatherSword;
            } else if (currentCharacterIndex == orcLeatherSword) {
                currentCharacterIndex = orcHeavySword;
            } else if (currentCharacterIndex == orcHeavySword) {
                currentCharacterIndex = orcClothSword;
            } else if (currentCharacterIndex == elfClothSword) {
                currentCharacterIndex = elfLeatherSword;
            } else if (currentCharacterIndex == elfLeatherSword) {
                currentCharacterIndex = elfHeavySword;
            } else if (currentCharacterIndex == elfHeavySword) {
                currentCharacterIndex = elfClothSword;
            } else if (currentCharacterIndex == humanClothAxe) {
                currentCharacterIndex = humanLeatherAxe;
            } else if (currentCharacterIndex == humanLeatherAxe) {
                currentCharacterIndex = humanHeavyAxe;
            } else if (currentCharacterIndex == humanHeavyAxe) {
                currentCharacterIndex = humanClothAxe;
            } else if (currentCharacterIndex == orcClothAxe) {
                currentCharacterIndex = orcLeatherAxe;
            } else if (currentCharacterIndex == orcLeatherAxe) {
                currentCharacterIndex = orcHeavyAxe;
            } else if (currentCharacterIndex == orcHeavyAxe) {
                currentCharacterIndex = orcClothAxe;
            } else if (currentCharacterIndex == elfClothAxe) {
                currentCharacterIndex = elfLeatherAxe;
            } else if (currentCharacterIndex == elfLeatherAxe) {
                currentCharacterIndex = elfHeavyAxe;
            } else if (currentCharacterIndex == elfHeavyAxe) {
                currentCharacterIndex = elfClothAxe;
            }
            characterImageView.setImage(characterImages[currentCharacterIndex]);
        });


        //Creates VBox for Center Buttons (Stats, Name, Finalize)
        VBox centerBox = new VBox(10);

        // Adding the ImageView to the centerBox
        centerBox.getChildren().add(characterImageView);

        //Creates Label Displaying Character's Stats
        Label statsLabel = new Label("Stats:");
        statsLabel.setStyle("-fx-font-size: 20px");
        statsLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        centerBox.getChildren().addAll(statsLabel);


        //Creates a TextField for User to Input a Name for Their Character
        TextField nameInput = new TextField();
        nameInput.setPromptText("Enter Character Name");
        nameInput.setPrefSize(100, 50);
        centerBox.getChildren().addAll(nameInput);

        //Creates 'Finalize' Button for User to Finalize Their Character
        Button finalizeButton = new Button("Finalize Character");
        finalizeButton.setPrefSize(200, 50);
        centerBox.getChildren().addAll(finalizeButton);

        // Create a GridPane and Adds All UI Elements
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); //Horizontal gap between cells
        gridPane.setVgap(75); // Vertical gap between cells
        gridPane.add(previousSelections, 0, 0);
        gridPane.add(characterImageView, 4, 0);
        gridPane.add(nextSelections, 8, 0);
        gridPane.add(centerBox, 4, 1);

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 800, 800); // Adjust width and height as needed
        primaryStage.setTitle("Medieval Character Card Creation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void loadImages() {
        //Load the images from resources
        characterImages = new Image[] {
                //HUMAN
                new Image(getClass().getResource("/com/example/finalmedieval/HumanStaffCloth.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanClothDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanClothSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanClothAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanLeatherStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanLeatherDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanLeatherSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanLeatherAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanHeavyStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanHeavyDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanHeavySword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/HumanHeavyAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfClothStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfClothDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfClothSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfClothAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfLeatherStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfLeatherDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfLeatherSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfLeatherAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfHeavyStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfHeavyDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfHeavySword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/ElfHeavyAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcClothStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcClothDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcClothSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcClothAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcLeatherStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcLeatherDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcLeatherSword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcLeatherAxe.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcHeavyStaff.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcHeavyDaggers.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcHeavySword.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/finalmedieval/OrcHeavyAxe.png").toExternalForm()),
        };
    }

    private void setImageViewProperties(ImageView imageView){
        // Set consistent properties for all ImageViews
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);
        imageView.setPreserveRatio(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
