package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

// HW_3
// Задание №5
// Примените подход TDD для создания нового класса MoodAnalyser, который оценивает настроение выраженное во фразах.


public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    @Test
    public void testAnalyseMood_Refactor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "Refactor";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Refactor", mood);
    }

    @Test
    public void testAnalyseMood_FallingTest() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "Red";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Write a falling test", mood);
    }

    @Test
    public void testAnalyseMood_TestPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = "Green";
        String mood = moodAnalyser.analyseMood(message);
        Assertions.assertEquals("Make the test pass", mood);
    }
}