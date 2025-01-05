package com.shalaka;

import java.util.List;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


public class Tokenizer {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Instantiate the StanfordCoreNLP object with the required properties
        StanfordCoreNLP stanfordCoreNLP = NLProcessor.getActionLine();

        // Text for tokenization
        String text = "NLP is a subfield of computer science and artificial intelligence concerned with interactions between computers and human (natural) languages.";

        // Instantiate CoreDocument with the input text
        CoreDocument coreDocument = new CoreDocument(text);

        // Perform tokenization on the CoreDocument
        stanfordCoreNLP.annotate(coreDocument);

        // Get the list of tokenized labels from the CoreDocument
        List<CoreLabel> coreLabelList = coreDocument.tokens();

        // Print the tokenized labels iteratively
        for(CoreLabel coreLabel : coreLabelList) {
            System.out.println(coreLabel.originalText());
        }
    }
}
