# MVC (Model View Controller) Architecture Pattern

 <img src="https://m7madmagdy.github.io/pages/MVCSchema.png" width="350">
 
 ## MVP App Images
 <img src="https://m7madmagdy.github.io/pages/MVC.png" width="200" align="left">
 
## MVC Advantages
###### 1- MVC pattern increases the code testability and makes it easier to implement new features as it highly supports the separation of concerns.
###### 2- Unit testing of Model and Controller is possible as they do not extend or use any Android class.
###### 3- Functionalities of the View can be checked through UI tests if the View respect the single responsibility principle
###### (update controller and display data from the model without implementing domain logic)

## Disadvantages
###### 1- Code layers depend on each other even if MVC is applied correctly.
###### 2- No parameter to handle UI logic i.e., how to display the data.
