Feature: test

  @XTP-20693 @XTP-20691 @Maps-AEM @Maps-AEM-Author @Maps_AEM_FR57 @RedRoute @Regression @Automation
  Scenario: An individual store page is updated based on the changes in API
    Given I am on Coverage Checker homepage
    When I provide location or postcode
    Then I see the location is displaying in the header field