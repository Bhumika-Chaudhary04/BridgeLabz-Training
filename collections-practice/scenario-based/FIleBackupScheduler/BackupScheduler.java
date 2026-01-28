package FIleBackupScheduler;
import java.util.PriorityQueue;

class BackupScheduler {

    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void scheduleBackup(BackupTask task)
            throws InvalidBackupPathException {

        if (task.getPath() == null || task.getPath().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }

        queue.add(task);
        System.out.println("Backup scheduled successfully");
    }

    public void executeBackups() {

        if (queue.isEmpty()) {
            System.out.println("No backup tasks available");
            return;
        }

        System.out.println("\nExecuting backups in priority order:");

        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            System.out.println("Executing: " + task);
        }
    }
}
