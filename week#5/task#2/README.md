<h1 align="center"> Abstract Classes & Interfaces </h1>

## Abstraction:
Abstraction is a core concept of OOP, where you hide details and only show important/essential details, simplifying the 'interface' for the user, hiding all the complexities. Abstraction is closely used alongside Inheritance or polymorphism for practical use.

The following mechanisms are core of Abstraction however also are essential mechanisms for Polymorphism:
- Abstract Classes
- Interface
### Abstract Classes
Abstract Classes are incomplete classes that can have abstract methods; methods that strictly need to be overridden in the derived classes but can also have non-abstract methods.
_Example., Animal abstract speak method in abstract class is overridden by Cat speak() method._

Code example is in [abstract_Animal.java](abstract_Animal.java)

**Practical Use Case:** An _Animal_ can speak but we don’t know what it will **speak()** until we know what type of animal he is, like _"Meow"_ output for _Cat_.
### Interfaces
Interfaces are simply class level contracts that its derived classes have to fulfill, every method is abstract by default and you cannot use non-abstract methods and every variable is public static final. Methods can only be declared. Their initialization of that method is mandatory by overridden classes.

_Example., Animal speak method in interface is declared & defined/initilized by Cat speak(). method._
Code example is in [interface_Animal.java](interface_Animal.java)


> [!NOTE]
> Abstract classes and Interfaces cause confusion, as they seem somewhat similar even though they are not.


<h2 align="center"> Difference between Abstract Classes & Interface! </h2>

| Abstract Classes                                                               | Interface                                                                     |
|--------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| Uses, `extends` keyword for inheritance                                         | Uses, `implements` keyword for inheritance,                                     |
| Cannot instantiate objects, abstract methods directly                          | Cannot instantiate objects, abstract methods directly                         |
| A variable can and cannot be initialized.                                      | A variable in the interface must be initialized.                              |
| A class can only extend one abstract class                                     | A class can have multiple interfaces                                          |
| Abstract classes can have either abstract & non-abstract methods.              | All methods are abstract by default however can be static or public           |
| The abstract methods declared must be initialized in its child/derived classes | As every method is abstract hence must be initialized in its derived classes. |
| The abstract methods must be overridden by derived classes                     | The abstract methods must be overridden by derived classes                    |
| Can have constructors                                                          | Cannot have constructors                                                      |
| Variables can be `static`, non-static, `final` and non-final etc               | Variables can be `static`, `public`, `final`                                        |


