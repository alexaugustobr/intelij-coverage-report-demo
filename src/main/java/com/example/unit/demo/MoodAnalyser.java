package com.example.unit.demo;

import java.util.*;

public class MoodAnalyser {
	
	private static final Map<String, Mood> WORD_TO_MOOD = new HashMap<>();
	
	static {
		WORD_TO_MOOD.put("happy", Mood.HAPPY);
		WORD_TO_MOOD.put("sad", Mood.SAD);
		WORD_TO_MOOD.put("angry", Mood.ANGRY);
	}
	
	private MoodAnalyser(){}
	
	public static Mood analyseMood(String sentence) {
		
		if (sentence == null || sentence.isEmpty()) {
			return null;
		}
		
		String[] words = sentence.toLowerCase().split("\\s");
		
		Optional<Mood> searchResult = Arrays
				.stream(words)
				.map(WORD_TO_MOOD::get)
				.filter(Objects::nonNull)
				.findFirst();
		
		return searchResult.get();
	}
	
}

