package com.example.cheyenne.flashcardapp;

import com.example.cheyenne.flashcardapp.Topics;

public class FlashCard {
    private Topics topic;
    private String question;
    private String answer;

    public FlashCard()
    {
        topic = new Topics();
        question = "NA";
        answer = "NA";
    }

    public FlashCard(Topics t, String q, String a)
    {
        topic = t;
        question = q;
        answer = a;
    }

    public Topics getTopic()
    {
        return topic;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
        return answer;
    }

    public String toString()
    {
        return question + ": " + answer;
    }
}
