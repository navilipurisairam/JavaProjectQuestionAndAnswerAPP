package org.app.units;

public class Question extends AbstractEntity {

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String questionBody;

    private User user;

    @Override
    public void autoGenerateId() {
        int id;
        super.getId();
    }
}
