<h1 style="text-align: center;">Difference between instance and static variables? </h1>

| Instance Variables                                                                 | Static Variables                                                                                      |
|------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| Instance variables are variables that only work with the objects as they are instances (variables) of the object itself. | Static variables are variables, also known as class variables, accessible anywhere in the class and hence can be used by any object or class. |
| It generates a copy of the variable for each object.                              | We will only have one static variable for the whole class, no matter how many objects there are. Hence, it is more memory optimized. |
| It is declared normally and without `static` keyword.                             | It must be declared with the `static` keyword.                                                        |
| It works with non-static methods only.                                            | It works with all types of methods.                                                                   |
| **Syntax:** `data_type variable_name = value;`                                    | **Syntax:** `static data_type variable_name = value;`                                                 |
