Goals for today:
-review and cement the basic OOP principles
-become a little more comfortable with "big" applications
-our thought process when we need to start designing an applications

Car Dealership
-Which to design first? The public interfce or the inner details - "top down" or "bottom up" design concept - depends on a lot of factors and most teams will use both when delivering software

- Top Down:
  -identify "top level" objects first then find objects that represent smaller portions of the system.
  -We cotinually refine those definitions until the system is complete
  -In our Dealership application this may look like this, designing objects in this order:
  -Dealership
  -Departments
  -Staff
  -Vehicles

- Bottom Up:
  -the lowest level of objects would be designed first and then those objects would be combined into bigger modules until the overall system is complete
  - In our Dealership this would be designed in this order:
    -Vehicles
    -Departments
    -Dealership
    -Staff

Starting w/ Vehicles
-Object Hierarchy
-"Gen-Spec" (Generalized-Specialized) / "is-a" relationship - Find common abstractions and model those in our base class the having specialized classes

Things we learned today

1. Enumerations
2. instanceof Keyword
3. How to work with a mulitfile Java program in VS Code
4. Brief into to annotations, mainly @Override
