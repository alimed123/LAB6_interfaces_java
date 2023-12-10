# Java Interfaces and Abstract Classes Lab Report

## Introduction
In Java, interfaces provide a blueprint for classes to implement specific behaviors, while abstract classes serve as partial blueprints, allowing both abstract and concrete methods to be defined within them.

### Note
- You can check the casting tests in the file. There are multiple ways to accomplish this task; this is one of them.
- Details for each file are included as comments in the code; please refer to them for the lab report.

## Objectives
- Utilize abstract classes in Java
- Utilize interfaces in Java
- Design a system with interfaces and/or abstract classes

## Part I: Hierarchy of Animals
In this part, a hierarchy of animals is created with three animals: spider, cat, and fish. An interface 'pet' is implemented for the Cat and the Fish only.

After declaring all classes, abstract classes, and interfaces, the output of TestAnimals is:
- We can call all methods on [Fish](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part1/Fish.java) and [Cat](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part1/cat.java). However, for Animal as spider and Animal as fish, we can't call the Hunt() method as it's undefined in the animal class (only on the subclasses).
- Upcasting pet to animal using `Animal anim = p;` is not possible. Downcasting `Animal a_P = (Animal) p;` is required as they don't share a direct superclass-subclass relationship. Also, Fish, Cat, or Spider cannot be converted to Animal (polymorphism) same for Fish and Cat with the pet interface.

Refer to the [TestAnimal.java](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part1/TestAnimal.java) file for method calls and casting.

## Part II: Borrowing Books
1. ### Designing Interfaces/Abstract Classes and Classes
   - [Book](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part2/Book.java) is chosen as an interface with the `getTitle()` method, ensuring each book must have a title.
   - [Libbook](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part2/Libbook.java) is an abstract class chosen because not all books have an author(). It includes abstract methods such as `getBorrowDuration()` and `computeFine()` that must be implemented.
   - Different book types can be declared as normal classes.

2. ### Testbook Class
   - The ['Testbook'](https://github.com/alimed123/LAB6_interfaces_java/blob/main/Part2/TestBook.java) class is created to perform tests. The main test for the reference book is.
    ![image](https://github.com/alimed123/LAB6_interfaces_java/assets/92314175/ac942f90-9126-4802-a65e-ed446942509c)

## Conclusion
This lab experiment taught us how and when to use interfaces and abstract classes, their differences, and how casting works with them.
