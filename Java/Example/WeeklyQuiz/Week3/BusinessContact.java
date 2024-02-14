package WeeklyQuiz.Week3;

public class BusinessContact extends Contact {
    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return String.format("%s, 회사명: %s", super.toString(), company);
    }
}
