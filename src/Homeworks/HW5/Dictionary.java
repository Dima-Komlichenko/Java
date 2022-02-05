package Homeworks.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Dictionary {

    private ArrayList<String> words;
    private ArrayList<String> translate;
    private ArrayList<Integer> indexOfTenMostPopularWords;
    private ArrayList<Integer> indexOfTenLeastPopularWords;

    public Dictionary() {
        words = new ArrayList<String>();
        translate = new ArrayList<String>();
        indexOfTenMostPopularWords = new ArrayList<>(10);
        indexOfTenLeastPopularWords = new ArrayList<>(10);
    }

    public void fillDictionary() throws IOException {
        boolean more = true;
        do {
            addWord();

            System.out.println("Enter '-' if you want to finish input words or any key to continue:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            if(Objects.equals(reader.readLine(), "-")) more = false;
        }while (more);
    }

    public void addWord() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input english word: ");
        String word = reader.readLine();

        System.out.println("Input english word: ");
        String translate = reader.readLine();

        words.add(word);
        this.translate.add(translate);
    }

    public void replaceWord() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input word what you want to replace: ");
        String targetWord = reader.readLine();

        System.out.println("Input new word instead: ");
        String replacedWord = reader.readLine();

        if(words.contains(targetWord)) {
            words.set(words.indexOf(targetWord), replacedWord);
        }
        else if(translate.contains(targetWord)) {
            translate.set(translate.indexOf(targetWord), replacedWord);
        }
    }

    public void removeWord(int index) {
        words.remove(index);
        translate.remove(index);
    }

    public void removeWord(String word) {
        words.remove(word);
        translate.remove(word);
    }

    public void show(String word) {
        int index = 0;
        if(words.contains(word)) {
            index = words.indexOf(word);
        }
        else if(translate.contains(word)) {
            index = translate.indexOf(word);
        }
        System.out.println(words.get(index) + " - " + translate.get(index));
        indexOfTenMostPopularWords.add(index);
    }
    public void showAll() {
        for (int i = 0; i < words.size(); i++) {
            System.out.println("[" + words.get(i) + ", " + translate.get(i) + "]");
        }
    }


}
