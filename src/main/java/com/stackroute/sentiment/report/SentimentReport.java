package com.stackroute.sentiment.report;

import com.stackroute.sentiment.classifier.SentimentClassifier;

public class SentimentReport {
    double sentimentScore;
    String sentimentType;
    SentimentClassifier sentimentClassifier;

    public double getSentimentScore() {
        return sentimentScore;
    }

    public void setSentimentScore(double sentimentScore) {
        this.sentimentScore = sentimentScore;
    }

    public String getSentimentType() {
        return sentimentType;
    }

    public SentimentClassifier getSentimentClassifier() {
        return sentimentClassifier;
    }

    public void setSentimentClassifier(SentimentClassifier sentimentClassifier) {
        this.sentimentClassifier = sentimentClassifier;
    }


}
