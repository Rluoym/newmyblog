package com.utils;

import java.util.UUID;

public class GenerateRandomID {
	public static String generateRandomID(){
		return UUID.randomUUID().toString().substring(0, 31);  //36位取前面32位
	}
}
