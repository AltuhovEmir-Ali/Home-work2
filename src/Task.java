public class Task {
    private String title;
    private String description;
    private int priority;
    private String status;
    private static int taskCounter = 0;


    public static int getTaskCount() {
        return taskCounter;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }

    public Task(String title, String description, int priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        taskCounter++;
    }


    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
