# Solution Description

A C++ function is developed that takes as input an array of integers and calculates its arithmetic mean. Then, a Java program is implemented that reads a list of integers from the command line, invokes the C++ function and finally displays the arithmetic mean of the integer array.

#### The following versions are used for this purpose:
-  g++ (Ubuntu 11.3.0-1ubuntu1~22.04) 11.3.0
- Openjdk 18.0.2-ea 2022-07-19


------------

- The HelloWorld folder contains the java and c++ files to print by console a "Hello World" using interoperability.

- The AddNumbers folder contains the java and c++ files to add two numbers using interoperability.

- The Array folder contains the solution described in the first part.


------------
To use a folder you must clone the repository and use the following commands. In this case an Ubuntu machine is used:

```bash
javac -h . [clasName.java] 
```
```bash
g++ -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux [file.cc] -o [fileName.o]
```
```bash
g++ -shared -fPIC -o [libnative.so] [fileName.o] -lc
```
```bash
java -cp . -Djava.library.path=. Lab1 [arrayofNumbers. Ej : 1 2 3]  
```


------------

Developed by Samuel Ariza, EAFIT University student.