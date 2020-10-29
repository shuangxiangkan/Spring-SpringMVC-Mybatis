package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    /**
     * 建立和MessageService的关联关系
     */
    private MessageService service;

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter...");
    }

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
