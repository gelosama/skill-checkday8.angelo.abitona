public class Contribution {
    private String ContributionDate;
    private double ContributionAmount;

    public Contribution(String contributionDate, double contributionAmount) {
        ContributionDate = contributionDate;
        ContributionAmount = contributionAmount;
    }


    public String getContributionDate() {
        return ContributionDate;
    }

    public void setContributionDate(String contributionDate) {
        ContributionDate = contributionDate;
    }

    public double getContributionAmount() {
        return ContributionAmount;
    }

    public void setContributionAmount(double contributionAmount) {
        ContributionAmount = contributionAmount;
    }
}
