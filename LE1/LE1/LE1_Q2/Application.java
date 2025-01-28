// File: Application.java
public class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // Outputs: Hello World from Mother

        Child ch = new Child();
        ch.show(); // Outputs: Hello JUET from Child
    }
}
