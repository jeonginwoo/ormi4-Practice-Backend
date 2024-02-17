package ch11_컬렉션.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSms", "고길동"));
        messageQueue.offer(new Message("sendKakaoTalk", "마이콜"));

        for (Message message : messageQueue) {
            System.out.println(message);
        }

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendMail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSms":
                    System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
