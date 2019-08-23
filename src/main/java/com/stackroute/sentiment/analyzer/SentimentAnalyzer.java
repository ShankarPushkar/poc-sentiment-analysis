package com.stackroute.sentiment.analyzer;

import com.stackroute.sentiment.classifier.SentimentClassifier;
import com.stackroute.sentiment.report.SentimentReport;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

import java.util.Properties;

public class SentimentAnalyzer {
    static Properties properties;
    static StanfordCoreNLP pipeline;

    public void setPipeline() {
        properties = new Properties();
        properties.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        pipeline = new StanfordCoreNLP(properties);
    }

    public SentimentReport getSentimentReport(String review) {
        SentimentReport sentimentReport = new SentimentReport();
        SentimentClassifier sentimentClassifier = new SentimentClassifier();
        if (review != null && review.length() > 0) {
            Annotation annotation = pipeline.process(review);
            for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)
            ) {

            }
        }

    }
}
