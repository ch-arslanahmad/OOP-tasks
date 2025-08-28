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
