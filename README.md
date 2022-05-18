# mvc

MVC pattern increases the code testability and makes it easier to implement new features as it highly supports the separation of concerns.
Unit testing of Model and Controller is possible as they do not extend or use any Android class.
Functionalities of the View can be checked through UI tests if the View respect the single responsibility principle
(update controller and display data from the model without implementing domain logic)
