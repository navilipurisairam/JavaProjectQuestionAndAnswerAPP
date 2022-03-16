package org.app.units;

public class Answer extends AbstractEntity {

    public String getAnswerBody() {
        return answerBody;
    }

    public void setAnswerBody(String answerBody) {
        this.answerBody = answerBody;
    }

    private String answerBody;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    private Question question;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
int id=0;
    @Override
    public void autoGenerateId() {
        int id;
        super.getId();
    }
}
