## Week#5 - Polymorphism
Polymorphism, simply meaning, **'many forms'** is the process in which same method/functions names can have different output depending upon the object calling it.
There are two types of Polymorphism:
- Run-time Polymorphism - in which the method to be executed is decided on runtime.
- Compile-time Polymorphism - 

1. Run-Time (Dynamic) Polymorphism
## Virtual Methods:
Virtual Methods are methods that can be overridden. These are the ___default methods in Java___ while you need to use `virtual` keyword in C++.

## Dynamic Dispatch:
Dynamic dispatch is the mechnanism/technique on how you use virtual methods and apply run-time polymorphism.
This is achieved by creating a reference of object in a base class pointing to the child class. Enabling overriding via Java built-in virtual methods, that allows it to execute method not based on reference type rather where the object is i.e., child class, this is done during runtime, This is called runtime polymorphism.
  - **C++ uses vTables & vPointers:**
Vtables in C++ are tables created by compiler to enable dynamic polymorphism. They make a table of virtual functions pointers that point to each virtual function in a class, hence every class has vTable if it uses virtual method (even derived classes).
The process of overriding goes from `object -> vptr -> vtable -> correct method`.

To do this:
- Declare a base class reference of object in child class.
- You use Inheritance.
- The specific base class method/function should be virtual.
Java methods are virtual by default.
```
// java
public class Animal {
  public static void main(String[] args) {
    Animal dog = new Dog();

}
}
class Dog extends Animal {// code}

```

Mandatory to use `virtual` for C++ functions.

```
// cpp
class Animal {
  virtual void Function() {}
}
class Dog: public Animal {
  // overriding function
  void Function() {}
}

int main() {
  Animal* dog = new Dog();
}

```




