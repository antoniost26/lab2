import java.util.Arrays;
import java.util.Queue;

public class QueueContainer implements Container {
    Task[] queue;

    @Override
    public Task remove() {
        Task task = queue[queue.length-1];

        this.removeLast();
        return task;
    }



    @Override
    public void add(Task task) {
        if (this.size() == 0){
            queue = new Task[]{task};
            return;
        }
        this.shift();
        queue[0] = task;
    }

    @Override
    public int size() {
        if (queue == null) {
            return 0;
        }
        return queue.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    private void shift() {
        Task[] extendQueue = new Task[queue.length+1];

        System.arraycopy(queue, 0, extendQueue, 1, queue.length);

        System.arraycopy(extendQueue,0,queue,0,extendQueue.length);
    }

    private void removeLast() {
        queue = Arrays.copyOf(queue, queue.length-1);
    }
}
