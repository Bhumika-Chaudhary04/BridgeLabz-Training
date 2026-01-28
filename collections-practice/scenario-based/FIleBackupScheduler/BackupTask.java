package FIleBackupScheduler;
class BackupTask implements Comparable<BackupTask> {

    private String path;
    private int priority;   // Higher value = higher priority
    private String time;

    public BackupTask(String path, int priority, String time) {
        this.path = path;
        this.priority = priority;
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        // Higher priority executed first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "BackupTask [Path=" + path +
               ", Priority=" + priority +
               ", Time=" + time + "]";
    }
}
