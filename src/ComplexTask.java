import java.util.ArrayList;
import java.util.List;
public class ComplexTask extends Task{
    private List<Task> subTasks;

    public ComplexTask(String title, String description, int priority, String status) {
        super(title, description, priority, status);
        this.subTasks = new ArrayList<>();
    }
        public void addSubTask(Task task) {
            subTasks.add(task);
        }

    public void SubTasksAsCompleted() {
        for (Task task : subTasks) {
            task.setStatus("Выполнено");
        }
    }
        @Override
        public String toString(){
            String subTasksInfo = "";
            for (Task subTask : subTasks) {
                subTasksInfo += "\n  " + subTask.toString();
            }

            return "ComplexTask{" +
                    "title='" + getTitle() + '\'' +
                    ", description='" + getDescription() + '\'' +
                    ", priority=" + getPriority() +
                    ", status='" + getStatus() + '\'' +
                    ", subTasks=[" + subTasksInfo +
                    "\n]}";
        }

    }
