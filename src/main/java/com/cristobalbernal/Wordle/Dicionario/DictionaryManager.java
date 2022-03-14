package com.cristobalbernal.Wordle.Dicionario;

public class DictionaryManager {
    public static String[] loadDictionary(Language language){
        switch (language){
            case ES:
                return WordleEs.palabras;
            case EN:
                return WordleEN.words;
            default:
                return null;
        }
    }
}
