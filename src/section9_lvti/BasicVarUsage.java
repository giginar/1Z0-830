package section9_lvti;

public class BasicVarUsage {
    public static void main(String[] args) {
        var name = "Alice"; // String
        var age = 30;       // int
        var salary = 5000.50; // double

        System.out.println(name + " is " + age + " years old and earns $" + salary);
    }
    // 🔹 var is not dynamic typing — the type is still determined at compile-time.
    // ❗ You can’t reassign var variables to different types.
}




