package com.app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

/**
 * Main class for the JavaFX application.
 */
public final class HelloFX extends Application {

    /** The default width of the application window. */
    private static final int WINDOW_WIDTH = 640;

    /** The default height of the application window. */
    private static final int WINDOW_HEIGHT = 480;

    /**
     * Starts the JavaFX application.
     *
     * @param primaryStage the primary stage for this application
     */
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(new Scene(new Label("Welcome!"),
                WINDOW_WIDTH, WINDOW_HEIGHT));
        primaryStage.show();
    }

    /**
     * Main method to launch JavaFX.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        launch(args);
    }
}
