Feature:Is the book called Harry Potter?

  Scenario: Verity is not called Harry Potter
    Given The book is called Verity
    When I ask if the book is called Harry Potter
    Then I should be told "No"

  Scenario: Harry Potter is called Harry Potter
    Given The book is called Harry Potter
    When I ask if the book is called Harry Potter
    Then I should be told "Yes"


