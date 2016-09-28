# Advance Class Design
## Review OCA Concepts

1. Access Modifiers

Access Scenarios | private | default | protected | public
---------------- | ------- | ------- | --------- | ------
Member in the same class | Y | Y | Y | Y
Member in another class but in the same package | N | Y | Y | Y
Member in a super class and in a different package | N | N | Y | Y
Method/Field in a class and in a different package | N | N | N | Y

* If a 'protected' member which is a variable or method, in order to get access to the member in another class but at
the same package. You have to first instantiate the class. (e.g. new Object())