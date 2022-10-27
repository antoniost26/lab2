import java.awt.desktop.SystemSleepEvent;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Task task = new Task(12l,"Sem Map");
//        System.out.println(task.toString());
        MessageTask messageTask = new MessageTask(12L,"Sem Map", "Marcel","Onel","Sal ba", LocalDateTime.now());
        messageTask.execute();

        int[] test = {1,6,2,5,4,12,3,55,7,123,8,23132,9};

        SortingTask test2 = new SortingTask(test);

        test2.execute();
//        System.out.println(Arrays.toString(test2.getIntegers()));

        QueueContainer queueContainer = new QueueContainer();
        queueContainer.add(messageTask);

        System.out.println(queueContainer.size());
        System.out.println(queueContainer.remove());
        System.out.println(queueContainer.size());
    }
}