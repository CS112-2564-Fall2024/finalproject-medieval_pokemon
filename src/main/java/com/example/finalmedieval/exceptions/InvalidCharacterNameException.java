package com.example.finalmedieval.exceptions;


// Custom exception for handling invalid character names during character creation
public class InvalidCharacterNameException extends Exception {

    // Error code indicating the type of violation (e.g., empty, contains forbidden characters).
    private final int errorCode;

    // A suggested valid name (optional) to guide the user.
    private final String suggestion;

    // Constructor to create an exception with a specified error message and code.
    public InvalidCharacterNameException(String message, int errorCode, String suggestion) {
        super(message);
        this.errorCode = errorCode;
        this.suggestion = suggestion;
    }


    // Constructor for cases where a suggestion is not provided.

    public InvalidCharacterNameException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
        this.suggestion = null; // No suggestion provided in this case
    }


    // Retrieves the error code for the exception.

    public int getErrorCode() {
        return errorCode;
    }


    // Retrieves the suggestion for a valid character name.

    public String getSuggestion() {
        return suggestion;
    }


    // Provides a custom toString method to display full exception details.

    @Override
    public String toString() {
        String result = "InvalidCharacterNameException{" +
                "message='" + getMessage() + '\'' +
                ", errorCode=" + errorCode;

        if (suggestion != null) {
            result += ", suggestion='" + suggestion + '\'' ;
        }

        result += '}';
        return result;
    }
}