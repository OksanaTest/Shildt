package com.patternsBloch.builder;
/*
41
 */
public class NutritionFacts {
    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public static class Builder{
        private final int servingSize;
        private final int serving;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        public Builder(int servingSize, int serving){
            this.servingSize = servingSize;
            this.serving = serving;
        }
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        public Builder sodium(int val){
            sodium = val;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        serving = builder.serving;
        fat = builder.fat;
        sodium = builder.sodium;
        calories = builder.calories;
        carbohydrate = builder.carbohydrate;
    }
    @Override
    public String toString(){
        return  " fat: " + Integer.toString(this.fat) + '\n' +
                " carbohydrate: " + Integer.toString(this.carbohydrate) + '\n' +
                " sodium: " + Integer.toString(this.sodium) + '\n' +
                " calories: " + Integer.toString(this.calories) + '\n' +
                " serving: " + Integer.toString(this.serving) + '\n' +
                " servingSize: " + Integer.toString(this.servingSize);
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(122,42).calories(23).carbohydrate(34).fat(67).build();
        System.out.println(cocaCola.toString());
    }
}
