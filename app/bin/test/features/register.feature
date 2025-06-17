Feature: Register Account

  Scenario: Register dengan berbagai macam variasi input
    Given saya berada pada page register
    When saya mengisi field firstname dengan "<firstname>"
    And saya mengisi field lastname dengan "<lastname>"
    And saya mengisi field email dengan "<email>"
    And saya mengisi field password dengan "<password>"
    And saya mengisi field confirm password dengan "<confirmPassword>"
    And saya menekan tombol create
    Then sistem menampilkan pesan "<message>"
    Examples:
      | firstname | lastname  | email                | password     | confirmPassword | message                  |
      |           |           |                      |              |                 | This is a required field.|
      |           | Doe       | fimotest@gmail.com   | Password1@   | Password1@      | This is a required field.|
      |fimo       |           | fimotest@gmail.com   | Password1@   | Password1@      | This is a required field.|
      |fimo       | Doe       |                      | Password1@   | Password1@      | This is a required field.|
      |fimo       | Doe       | fimotest@gmail.com   |              | Password1@      | This is a required field.|
      |fimo       | Doe       | fimotest@gmail.com   | Password1@   |                 | This is a required field.|
      |fimo       | Doe       | fimotest@gmail.com   | Passwor      | Password1@      | Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.|
      |fimo       | Doe       | fimotestgmail.com    | Password1@   | Password1@      | Please enter a valid email address (Ex: johndoe@domain.com). |
      