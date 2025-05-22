package section15_records;

public record Book(String title, int pages) {
    public Book(String title, int pages) {
        if (pages <= 0) throw new IllegalArgumentException("Page count must be positive");
        this.title = title;
        this.pages = pages;
    }
    // 🔹 Needed if you want to override constructor parameters or change field assignment.
}

