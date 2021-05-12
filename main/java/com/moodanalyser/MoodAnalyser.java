package com.moodanalyser;

public class MoodAnalyser {
    private String  message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
