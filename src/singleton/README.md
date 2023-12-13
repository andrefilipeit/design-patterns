## Purpose

Singleton is a **creational design pattern**, which ensures that only one object of this type exists and provides a single point of access to it for any other code.

Singleton has almost the same pros and cons as global variables. Although they are super useful, they break the modularity of your code.

You can use classes that depend on singletons in some other situations. You will also have to take the singleton class. Most of the time, these limitations arise when creating unit tests.