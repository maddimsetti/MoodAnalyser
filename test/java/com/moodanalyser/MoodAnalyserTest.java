package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = moodAnalyser.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessageNull_ShouldReturnException() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("", mood);
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenMessageEmpty_ShouldReturnException() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            String mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("Happy",mood);
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.type);
        }

    }
}
