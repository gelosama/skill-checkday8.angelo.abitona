import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContributionUtilityTest {
        private ContributionUtility contributionUtility =   new ContributionUtility();
        @Test
        public void getContributionsList()
        {
            assertNotNull(contributionUtility.getContributionsList());
        }

        @Test
    public void addContribution()
        {
            Contribution contribution = new Contribution("10/10/2021", 500 );
            ContributionUtility.addContribution(contribution);

            assertEquals(1, contributionUtility.getContributionsList().size());
        }
        @Test
    public void addTwoContribution()
        {
            Contribution contribution1 = new Contribution("10/10/2021", 500 );
            Contribution contribution2 = new Contribution("10/12/2021", 500 );
            ContributionUtility.addContribution(contribution1);
            ContributionUtility.addContribution(contribution2);
            assertEquals(2, contributionUtility.getContributionsList().size());
        }

        @Test
    public void updateContribution()
        {
            Contribution contribution1 = new Contribution("10/10/2021", 500 );
            Contribution contribution2 = new Contribution("10/12/2021", 500 );
            ContributionUtility.addContribution(contribution1);
            ContributionUtility.addContribution(contribution2);

            contributionUtility.updateContribution("12/12/1212", contribution2);
            Contribution actualUpdatedContribution = contributionUtility.getContributionsList().get(1);
            assertEquals("10/12/2021", actualUpdatedContribution.getContributionDate());
        }

}