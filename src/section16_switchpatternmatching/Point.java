package section16_switchpatternmatching;

record Point(int x, int y) {}

class Test{
    Object obj = new Point(2, 3);

    String result = switch (obj) {
        case Point(int x, int y) -> "Point with x=" + x + ", y=" + y;
        default -> "Unknown";
    };
    // 🔥 This is called a record pattern — it destructures the object into components.
}
