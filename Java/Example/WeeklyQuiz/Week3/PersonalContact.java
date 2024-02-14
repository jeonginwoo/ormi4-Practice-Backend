package WeeklyQuiz.Week3;

public class PersonalContact extends Contact {
    private String relationship;

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public String toString() {
        return String.format("%s, 관계: %s", super.toString(), relationship);
    }
}
