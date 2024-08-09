//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask = new SimpleTask("Task1", "Description 1", 1, "Не выполнено");
        SimpleTask simpleTask1 = new SimpleTask("Task2", "Description 2", 2, "Не выполнено");
        ComplexTask complexTask = new ComplexTask("Complex Task", "Complex Description", 3, "Не выполнено");
        complexTask.addSubTask(simpleTask);
        complexTask.addSubTask(simpleTask);
        System.out.println(complexTask);
        complexTask.SubTasksAsCompleted();
        System.out.println(simpleTask);
        System.out.println(simpleTask);
        System.out.println("После выполнения подзадач:");
        System.out.println(complexTask);
        System.out.println("Общее количество задач: " + Task.getTaskCount());
    }
    }
