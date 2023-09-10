package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("call", "성춘향"));
        queue.offer(new Message("curse", "사또"));

        while (!queue.isEmpty()) {
            Message message = queue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + " 님에게 메일을 보내드립니다.");
                    break;
                case "call":
                    System.out.println(message.to + " 님에게 전화를 드립니다.");
                    break;
                case "curse":
                    System.out.println(message.to + " 님에게 욕설을 합니다.");
                    break;
            }
        }

    }
}
