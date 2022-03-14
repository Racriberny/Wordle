package com.cristobalbernal.Wordle;

import com.cristobalbernal.Wordle.Dicionario.DictionaryManager;
import com.cristobalbernal.Wordle.Dicionario.Language;

public class Main {
    public static void main(String[] args) {
        String[] words = DictionaryManager.loadDictionary(Language.ES);

    }
}
