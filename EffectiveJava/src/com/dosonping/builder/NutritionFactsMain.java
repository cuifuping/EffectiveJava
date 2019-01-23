package com.dosonping.builder;

public class NutritionFactsMain {
	public static void main(String[] args) {
		//builder模式的使用
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(8).carbohydrate(8).fat(8).sodium(8).builder();
	}
}
