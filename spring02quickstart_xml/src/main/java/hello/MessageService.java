package hello;


public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService...");
    }

    /**
     * 执行打印功能
     * @return
     */

    public String getMessage(){
        return "Hello World!";
    }
}
