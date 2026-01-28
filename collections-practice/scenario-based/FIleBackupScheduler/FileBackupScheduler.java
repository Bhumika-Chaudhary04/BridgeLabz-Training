package FIleBackupScheduler;
public class FileBackupScheduler {
    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.scheduleBackup(
                new BackupTask("C:/System", 5, "09:00 AM")  // critical
            );
            scheduler.scheduleBackup(
                new BackupTask("C:/Projects", 3, "10:00 AM")
            );
            scheduler.scheduleBackup(
                new BackupTask("D:/Movies", 1, "11:00 AM")
            );

            // Invalid path example
            scheduler.scheduleBackup(
                new BackupTask("", 4, "12:00 PM")
            );

        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}
