package com.moodanalyser;

public class MoodAnalyser  {
    private String  message;

    public MoodAnalyser (String message) {
        this.message = message;
    }
    public String analyseMood(String message) throws Exception {
        this.message = message;
        return analyseMood();
    }
    public String analyseMood() throws Exception {
        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Please Enter Proper Message");

        }
    }

}
