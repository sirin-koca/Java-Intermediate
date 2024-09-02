# Java Fundamentals + Intermediate


### [Java programs](https://github.com/sirin-koca/Java-Basics/tree/master/src) and concepts to deep dive into the World of Java

<img src= "img/java-logo-bw.png" alt="An illustration of The javac tool" width="25" align="center"> You might need some coffee! 

---
<table>
<tr>
<th>oop_principles.Main features of Java</th><th>Input</th><th>Output</th>
</tr>

<tr>
<td> 

- Object-Oriented Programming (OOP)
- Platform independent 
- Multi-thread Concurrency
- Functional programming 
- High performance
- Portable - The WORA </br>(Write Once Run Anywhere)
- Easy syntax
- Secure
- Robust
</td>
<td>
<pre>
public class AsciiArt {
public static void main(String[] args) {
System.out.println(" /\_/\ ");
System.out.println("( o.o ) ");
System.out.println(" > ^ <  ");
}
}
</pre>
</td>
<td>    
<pre>
 /\_/\ 
( o.o ) 
 > ^ < 
</pre>      
</td>
</tr>
</table>

---
## Java Language:

* Origin: Developed by Sun Microsystems in 1995.
* Type: Object-oriented, high-level, and general-purpose programming language.
* Platform: Java is platform-independent due to its bytecode execution on the Java Virtual Machine (JVM).
* Usage: Widely used for web applications, Android apps, and enterprise software.

## Object-Oriented Programming (OOP) Principles:

#### Encapsulation: 
Bundling of data and methods that operate on that data into a single unit (class). Restricts direct access to some of an object's components for safety, achieved using private, protected, and public modifiers.

#### Abstraction: 
Hiding the complex reality while exposing only the necessary parts. Achieved through abstract classes and interfaces in Java.

#### Inheritance: 
The mechanism by which a new class can inherit properties and behaviours (methods) from a parent class. Promotes reusability and establishes a relationship between the parent and child classes.

#### Polymorphism:
Ability to present the same interface for different data types. In Java, polymorphism is achieved through method overloading and method overriding.

#### Association:
Relationship between two classes where one class contains a reference to another. For instance, a "Car" class might have an "Engine" reference indicating a relationship.

By leveraging these principles, Java offers a structured approach to programming that enhances the readability, reusability, and maintainability of code.

---

#### Platform-independent vs Portable:
After compiling our Java program, a separate file will be created for the compiled program known as the byte code of Java. This byte code will not be in the executable stage. The main purpose of generating byte code for a program is to achieve platform independence which means this byte code generated in one platform can be executed in another. *Eg*: The one which makes the byte code generated in Windows OS to be executed in the UNIX OS is the JVM of the UNIX platform. As you understand the JVM is platform-dependent but the byte code generated by the Java program is platform-independent. The generated byte code can run on any JVM regardless of which platform the JVM belongs to. Whatever the JVM in which the byte code runs the output remains the same. So, JVM is a portable but platform-dependent component which enables the platform independence of the byte code. 

Thanks to, [James Gosling](https://en.wikipedia.org/wiki/James_Gosling) :)

---

<img src= "img/java-oops.png" alt="Features of object-oriented programming paradigm">
<!-- image curtosy: www.javatpoint.com -->

---

### > Java Compared to Python 
• Syntax: Java has a more verbose syntax, meaning that it requires more lines of code to accomplish the same task as Python. Python has a more intuitive, easy-to-read syntax that is often described as "readable code."

• Performance: Java is generally considered to be faster than Python because it is a compiled language, while Python is an interpreted language. This means that Java code is compiled into machine-readable bytecode before it is executed, while Python code is interpreted at runtime. However, Python has libraries like NumPy and Pandas which makes it great for data science and machine learning.

• Functionality: Both Java and Python have a large number of libraries and frameworks available, so they can be used for a wide range of tasks. However, Java is often used for enterprise-level applications and building Android apps, while Python is more commonly used for scientific computing, data analysis, and artificial intelligence.

• Learning curve: Because of its simpler syntax, many people find that Python is easier to learn than Java. However, some argue that the simplicity of Python can make it more difficult to write complex, efficient code. Java, on the other hand, can take longer to learn but can make it easier to write complex, efficient code.

• Community: Both Java and Python have large and active communities, with many resources available for learning and troubleshooting. Java is used by many big companies, so there are many job opportunities for Java developers. Python is also popular, especially in scientific and data science communities.

### > Java Compared to C and C#

#### Platform Independence: 
Java: Targets the Java Virtual Machine (JVM), making it platform-independent.
C: Platform-dependent; compiled directly for specific hardware architecture.
C#: Primarily targets the .NET runtime (though there are cross-platform versions like .NET Core and .NET 5+).

#### Programming Paradigm:
Java: Object-oriented.
C: Procedural (but can be used in an object-oriented way with proper structuring).
C#: Object-oriented with support for procedural and functional programming.

#### Memory Management:
Java: Uses garbage collection for automatic memory management.
C: Manual memory management with pointers.
C#: Uses garbage collection, but also supports pointers in 'unsafe' blocks.

#### Performance:
Java: Typically slower than native C due to JVM overhead, but optimizations are possible.
C: High performance due to direct compilation to machine code.
C#: Generally faster than Java (because of Just-In-Time compilation and other optimizations) but slightly slower than native C.

#### Standard Library and Features:
Java: Rich standard library; supports multithreading, networking, etc.
C: Limited standard library but has a vast ecosystem of libraries available.
C#: Extensive standard library in the .NET framework, including features like Language Integrated Query (LINQ) and asynchronous programming (async/await).

#### Interoperability:
Java: Limited native interop capabilities.
C: Can interoperate with nearly any system; can be called by or call any language.
C#: Can interop with native libraries easily using Platform Invocation Services (P/Invoke).

#### Graphics and UI:
Java: AWT, Swing, and JavaFX for GUI development.
C: Typically uses platform-specific libraries or third-party options like GTK or Qt.
C#: Windows Forms, WPF, and UWP for GUI on Windows. Cross-platform GUI options available with libraries like Avalonia or MAUI.

#### Development and Ecosystem:
Java: Supported by a variety of IDEs like Eclipse, IntelliJ IDEA; has a vast ecosystem of tools and libraries.
C: Supported by many IDEs and compilers; foundational for many operating systems and applications.
C#: Primarily developed in Visual Studio; integration with Microsoft tools and services, but also expanding cross-platform support.

### > Java Compared to C++
• Java has a simplified object model compared to C++. </br>
• Java’s dispatch is virtual by default. </br>
• Java is always pass-by-value (object references). </br>
• Java does not support full multiple inheritance. </br>
• Java’s generics are less powerful (but also less dangerous) than C++ templates. </br>
• Java has no operator overloading. </br>

### > Java Compared to PHP
• Java is statically typed; PHP is dynamically typed. </br>
• Java has a JIT; PHP does not (but might in version 6). </br>
• Java is a general-purpose language; PHP is rarely found outside of websites. </br>
• Java is multithreaded; PHP is not. </br>

### > Java Compared to JavaScript
• Java is statically typed; JavaScript is dynamically typed. </br>
• Java is a compiling language whereas JavaScript is an interpreted scripting language.</br> 
• Java uses class-based objects; JavaScript is prototype-based. </br>
• Java provides good object encapsulation; Javascript does not. </br>
• Java has namespaces; JavaScript does not. </br>
• Java is multithreaded; JavaScript is not. </br>

---

 ### Documentation
 
 In this example, the @param annotation is used to document the a and b parameters of the add method. The @return annotation is used to document the return value of the method. The documentation comments are enclosed by /** and */. This allows the documentation to be easily read by other developers, or by automated tools that extract documentation from code.
 
 ```
  /**
 * Returns the sum of two numbers
 * 
 * @param a the first number
 * @param b the second number
 * @return the sum of a and b
 */
 public int add(int a, int b) {
    return a + b;
 }
 ```
 
---

### A simple class and its members
```
// Only one public class 
public class programs.oop_principles.Circle { 

// A class field  
public static final double PI= 3.14159; 

// A class method:
public static double radiansToDegrees(double rads) {
return rads * 180 / PI; 
} 

// An instance field:
public double r; 

// Two instance methods: they operate on the instance fields of an object 
public double area() { 
return PI * r * r; 
} 

// Compute the circumference of the circle
public double circumference() {  
return 2 * PI * r; 
} 
} 
 
```

Sources:
* [Java Docs by Oracle](https://docs.oracle.com/en/java/)
* [Java Tutorials](https://www.javatpoint.com/java-oops-concepts)
* [Dev Java](https://dev.java/)
---

**[⬆ back to top](#)**



[sirin-koca](https://github.com/sirin-koca) | OsloMet 2021
