# Advance Class Design
## Review OCA Concepts

### 1. Access Modifiers

Access Scenarios | private | default | protected | public
---------------- | ------- | ------- | --------- | ------
Member in the same class | Y | Y | Y | Y
Member in another class but in the same package | N | Y | Y | Y
Member in a super class and in a different package | N | N | Y | Y
Method/Field in a class and in a different package | N | N | N | Y

* If a 'protected' member which is a variable or method, in order to get access to the member in another class but at
the same package. You have to first instantiate the class. (e.g. new Object())

### 2. Overloading & Overriding

**Overloading :**
In the sub class or same class, a new method shares the same name with an old method but method parameters are vary by
type or number.

**Overriding :**
In sub class, a new method shares the same signature(name and parameters) with the old method in the parent class.

* For overloading, when multiple overloading happens, Java looks for the closest match first, it follows the following
rules :

 1. Exact matching by type.
 2. Matching a parent class type.
 3. Converting to a larger primitive type.
 4. Converting to an autobox type.
 5. Varages (e.g. args[])

* For overriding, the new overriding method needs to follow the following rules:

 1. Access modifiers must be the same or more accessible.
 2. Return type must be the same or a more restrictive type, also known 'covariant' types. (e.g. Number -> Long, Long
 is Number's covariant type)
 3. If checked exceptions are thrown, only the same exceptions or subclasses of those exceptions are allowed to be thrown.
 4. Method can not be static or the method will be hidden and not overridden.

### 3. Abstract Classes

* An abstract class is a class that contains any number of methods including zero. The methods can be:

 1. Abstract method
 2. Concrete method

* An abstract method have to be put into an abstract class.

* The first concrete class that inherent from the abstract class has to implement all abstract methods in the abstract class.

### 4. Static and Final

* **final** prevent a variable or method from changing or overriding.
* **static** makes a variable shared at the class level and uses the class name to refer to a method.

* Final and static key words can be insert on the class level.
 * static class - nested classes.
 * final class - cannot be subclassed.
 
### 5. Import

* static method need to be import with static
* Frequently used methods and packages:

 1. java.util.Collections.sort;
 2. java.util.Collections.*;
 3. java.util.*;
 
## Using instanceof

* *A instanceof B* will return **true** if A is the instance of B, a subclass of B(directly or indirectly), or a class
that implements the B interface(directly or indirectly).
 * Directly and indirectly means if there are multiple inheritance between the two classes.
 * **NOTICE :** Compiler will be able to check *object instanceof class*, however, *object instanceof interface* will be checked during the runtime.
 The reason is that the subclass could implement an interface without compiler noticed. => Java compiler always check the reference type first.
 If the reference type is the parent class or the same class of the *instanseof* class, then it checks the object that the reference pointed to.
 If the reference type is not parent class nor the same class then the compiling will not pass. As a class can only extend single parent once but interface
 can be implemented multiple times, the subclass has the portential to implement the interface while it is also extend its parent class. 
 * **Common Usages :** *instanceof* has been widely used to determine whether an instance is a subclass of a particular object before applying an explicit cast.
 
## Understanding Virtual Method Invocation

* Java has the preference to look for an overridden method rather than necessarily using the one in the class that the compiler says we have.

## Annotating Overridden Method

* Java use *@* symbol, which is called annotation, to represent extra information about the program. It is also a type of metadata.

* The *@override* annotation is used to express that the programmer is intent to:
    1. Implementing a method from an interface
    2. Overriding a superclass method of a class
    3. Overriding a method declared in *Object*, such as *hashCode*, *equals*, or *toString*
    
## Coding equals, hashCode, and toString

* toString(), equals() and hashCode() are three most commonly used method in *object* class

### toString
    * Java automatically calls the toString() method if you try to print out an object.
    * Some classes supply a human readable implementation of *toString()* and others do not. (e.g. *ArrayList* produces *toString()* method, however, *String* dose not. If using *toString()* on both of 
    two objects only *ArrayList* will print the content with *String* only displaying its object id)
    * A superclass of *ArrayList* implemented *toString()* and *ArrayList* inherited that one instead of *Object*. <= Not in the scope
    * Overriding the *toString()* method with annotation will give the subclass the ability to customize print output.
    * *Reflection* is a technique used in Java to look at information about the class at runtime. (e.g. *toString.hippo@12da89a7[name = Hurry]* )
    
    
    