<h1 align ='center'>UML</h1>

United Modeling Language **(UML)** is a graphical object oriented language which provides a way to visualize application/software architecture as a design of a system.


You can make **UML**:
- By drawing on a piece of paper.
- Using Graphic Tools like _**draw.io**_.
- Using graphic languages like **Mermaid**:
- **Mermaid** basically provides a coding way to graphically represent systems e.g., Markdown but for software design.

> [!important]
> Mermaid works in Markdown of Github as well.




```mermaid
classDiagram
  class Animal {
String color
int age
    run()
speak()
  }
  class Dog {
String color
int age
    run()
speak()
  }
  class Cat {
String color
int age
    run()
    speak()
  }
  Animal <-- Dog
  Animal <-- Cat

  ```
---

<br>
<h2 align ='center'>Basic Rules of UML</h2>


They are as following,
#### Modifiers
`-` represents a **private** modifier.
`+` represents a **public** modifier.
`#` represents a **protected** modifier.


For _Abstract methods_ you italicize them, like for _`run()`_.

#### DataTypes
- You write only datatypes or variables in methods,
i.e., `int age`, int `calculateSpeed()`
Inside of methods in arguments or parameter variables, you only write its datatype not variable name e.g., `speed(int)`;
Adding semicolons is not necessary.









