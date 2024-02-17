package ch11_컬렉션.queue;

public class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
