Feature: Example Feature

  Scenario: Login with a name
    Given User login with name="Charlie" userName
    Given User login with name="בתיה" userName
    Then User login with string="היי" userName
    Then User goes to "Alice" page
    Then User goes to "bbb" page
    Then User "אביטל" develops "fff" page
    Given User goes to "ַfff" page
    Then User goes to "עמוד ציות משהוא---" page
    Then User login with name="שם כלשהוא" userName