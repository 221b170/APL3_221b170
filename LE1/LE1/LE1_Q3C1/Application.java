// File: Application.java
public class Application {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show(); // Outputs: Hello from Mother class (static methods are bound to class type)
    }
}
