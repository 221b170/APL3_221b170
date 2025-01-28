// File: Two.java
public class Two extends One {
    Two() {
        // Must call the parent constructor explicitly
        super(10); // Calling the parameterized constructor of One
        System.out.println("Two's constructor");
    }
}
