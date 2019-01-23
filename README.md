# Java Cinema Booking
 ### Simple project for creating a cinema booking system in Java and exploring the JOption Pane as a user interface
 
## OOP Principles 
### Task 1

#### Encapsulation 

The practice of keeping variables within a class private (within a capsule) – hiding them from other classes.  They can only be viewed or modified by mutators and accessors (getter and setter methods) as an additional security barrier. 

//A variable:   

private int quantity; 

//can only be accessed by 
getQuantity()  //– a getter


### Abstraction 

Abstraction is the process of selecting important data sets for an Object in your software and leaving out the insignificant ones.
Once you have modelled your object using Abstraction, the same set of data could be used in different applications.

Java, abstraction is accomplished using Abstract classes and interfaces to hide the implementation / complexity of the underlying code and design. 
In this example only the signature is defined without any code:

abstract public void subtract();


### Polymorphism

Lets programmers use the same word to mean different things in different contexts. 
A good example (I found online): The aim of a mobile phone is communication, but to communicate you can do it via messages, emails or calls which all have different approaches. 

Achieved in 2 ways :
- method overriding – assigning a super class to a sub class, signifying your intention to override a method from the base class. 
- method overloading – where different methods have the same name but different variable signatures

```java
void sum (float a, double b);
void sum (int a , int b, int c);
```

### Inheritance

Where one class get the methods and fields from another. Making hierarchy more manageable and enables reusability of fields.

class A extends class B  
Class A inherits the methods and fields of class B for a calculation. 

