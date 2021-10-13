import java.util.ArrayList;
import java.util.List;

public class ContributionUtility {
 private static List<Contribution> contributionsList = new ArrayList<Contribution>();
    public List<Contribution> getContributionsList()
    {
        return contributionsList;
    }
    public static void  addContribution(Contribution contribution)
    {
            if (contribution != null)
            {
                contributionsList.add(contribution);
            }

    }

    public void updateContribution (String date, Contribution contribution)
    {
            if(!contributionsList.isEmpty() && date != null )
            {
                for (Contribution contribution1 : contributionsList)
                {
                    contribution1.setContributionAmount(contribution.getContributionAmount());
                    contribution1.setContributionDate(contribution.getContributionDate());
                }
            }
    }

 public static void addTwoContribution(Contribution contribution)
 {

 }
}
