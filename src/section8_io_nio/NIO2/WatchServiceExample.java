package section8_io_nio.NIO2;

import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class WatchServiceExample {
    public static void main(String[] args) throws Exception {
        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path dir = Path.of(".");
        dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        System.out.println("Watching directory...");
        WatchKey key = watcher.take(); // blocks until event occurs

        for (WatchEvent<?> event : key.pollEvents()) {
            System.out.println("Event: " + event.kind() + " → " + event.context());
        }
    }
    // 🔹 OCP loves to test WatchService — know the constants like ENTRY_CREATE, ENTRY_DELETE.
}

