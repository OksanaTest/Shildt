package com.exerciseFromJLS;

public class CountWordsInString {
    private int count(String string){
        String trimString = string.trim();
        if(!trimString.equals("")){
            String[] array = trimString.split("\\s++");
            return array.length;
        }else
        return 0;
    }

    public static void main(String[] args) {
        CountWordsInString countWordsInString = new CountWordsInString();
        System.out.println("SIZE IS: " + countWordsInString.count(" Hello, Word "));
    }
}