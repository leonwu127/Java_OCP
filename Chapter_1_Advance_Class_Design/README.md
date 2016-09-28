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
 2. Return type must be the same or a more restrictive type, also known 'covariant' types. (e.g. Number -> Long , Long
 is Number's covariant type)
 3. If checked exceptions are thrown, only the same exceptions or subclasses of those exceptions are allowed to be thrown.
 4. Method can not be static or the method will be hidden and not overridden.

