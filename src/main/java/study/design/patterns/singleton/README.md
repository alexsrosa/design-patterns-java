# Singleton

The Singleton pattern solves two problems at the same time:
- Ensure that a class has just a single instance;
- Provide a global access point to that instance;

All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the **new** operator with the Singleton class.
- Create a static creation method that acts as a constructor. 
- Under the hood, this method calls the private constructor to create an 
object and saves it in a static field. 
- All following calls to this method return the cached object.
- If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that method is called, the same object is always returned.