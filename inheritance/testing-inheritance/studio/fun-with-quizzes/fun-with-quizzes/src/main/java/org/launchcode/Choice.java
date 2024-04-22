package org.launchcode;

public class Choice {

    private final String content;
    private final boolean correct;

    public Choice(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
