package com.dosonping.builder;

//Builder Pattern
/**
 * 不直接生成想要的对象，而是让客户端利用所有必要的参数调用构造器（或者静态工厂），得到一个builder对象。
 * 然后客户端在builder对象上调用类似于setter的方法，来设置每个相关的可选参数。
 * 最后，客户端调用无参的builder方法来生成不可变的对象。
 * @author 崔富平
 * @datetime 2019年1月23日 下午3:49:57
 */
public class NutritionFacts {//营养标示
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder {
		//必要参数
		private final int servingSize; 
		private final int servings;
		
		//可选参数 - 初始化成默认的指
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		//无参的builder方法
		public NutritionFacts builder() {
			return new NutritionFacts(this);
		}
	}
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		fat = builder.fat;
		carbohydrate = builder.carbohydrate;
		sodium = builder.sodium;
		calories = builder.calories;
	}
}
