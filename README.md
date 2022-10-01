# Java-Basics 🤖

## Basic Java Programs to deep dive into the World of Java. 💫 

_PS_. You might need coffeee...

---

## Main features of Java:
* Object oriented 
  1. Encapsulation
  2. Abstraction   
  3. Inheritance
  4. Polymorphism
* High level language 
* Platform independent 
* Portable - The WORA (Write Once Run Anywhere)
* Easy syntax
* Multithreaded
* Secure
* Robust
---

### Java Compared to C
• Java is object oriented; C is procedural. </br>
• Java is portable as class files; C needs to be recompiled. </br>
• Java provides extensive instrumentation as part of the runtime. </br>
• Java has no pointers and no equivalent of pointer arithmetic. </br>
• Java provides automatic memory management via garbage collection. </br>
• Java has no ability to lay out memory at a low level (no structs). </br>
• Java has no preprocessor.

### Java Compared to C++
• Java has a simplified object model compared to C++. </br>
• Java’s dispatch is virtual by default. </br>
• Java is always pass-by-value (but one of the possibilities for Java’s values are
object references). </br>
• Java does not support full multiple inheritance. </br>
• Java’s generics are less powerful (but also less dangerous) than C++ templates. </br>
• Java has no operator overloading. </br>

### Java Compared to PHP
• Java is statically typed; PHP is dynamically typed. </br>
• Java has a JIT; PHP does not (but might in version 6). </br>
• Java is a general-purpose language; PHP is rarely found outside of websites. </br>
• Java is multithreaded; PHP is not. </br>

### Java Compared to JavaScript
• Java is statically typed; JavaScript is dynamically typed. </br>
• Java is a compiling language whereas JavaScript is an interpreted scripting language. 
• Java uses class-based objects; JavaScript is prototype based. </br>
• Java provides good object encapsulation; Javascript does not. </br>
• Java has namespaces; JavaScript does not. </br>
• Java is multithreaded; JavaScript is not. </br>

---

### A simple class and its members
```
public class Circle { 
// A class field  
public static final double PI= 3.14159; // A useful constant 
// A class method: just compute a value based on the arguments 
public static double radiansToDegrees(double rads) {
return rads * 180 / PI; 
} 
// An instance field 
public double r; // The radius of the circle 
// Two instance methods: they operate on the instance fields of an object 
public double area() { // Compute the area of the circle 
return PI * r * r; 
} 
public double circumference() { // Compute the circumference of the circle 
return 2 * PI * r; 
} 
} 
```

---

**[⬆ back to top](#)**
