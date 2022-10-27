import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class MessageTask extends Task {
    private String from;
    private String to;
    private String message;
    private LocalDateTime date;
    public MessageTask(Long id, String desc, String from, String to, String message, LocalDateTime date) {
        super(id, desc);
        this.from = from;
        this.to = to;
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MessageTask{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date.format(Utils.formatter) +
                '}';
    }

    @Override
    public void execute() {
        System.out.println(this);
    }
}
