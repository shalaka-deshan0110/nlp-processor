package com.shalaka;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NLProcessor {

    private static Properties properties;
    private static String actionName = "tokenize, ssplit, pos, lemma, ner";

    private static StanfordCoreNLP stanfordCoreNLP;

    public NLProcessor() {

    }

    static {
        properties = new Properties();
        properties.setProperty("annotators", actionName);
        stanfordCoreNLP = new StanfordCoreNLP(properties);
    }

    public static StanfordCoreNLP getActionLine() {
        if (stanfordCoreNLP == null) {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }

        return stanfordCoreNLP;
    }

}
