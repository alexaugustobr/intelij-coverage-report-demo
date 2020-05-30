package com.example.unit.demo;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
	public void analyseMood() throws Exception {
	
		Mood actual = MoodAnalyser.analyseMood("Im happy now");
		
		Assert.assertEquals(Mood.HAPPY, actual);
	}
	
	@Test
	public void analyseMoodUpper() throws Exception {
		
		Mood actual = MoodAnalyser.analyseMood("Im HAPPY now");
		
		Assert.assertEquals(Mood.HAPPY, actual);
	}
}