import java.util.Vector;

public abstract class Task {
    private Long id;
    private String desc;
    public Task(Long id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public abstract void execute();

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }
}
