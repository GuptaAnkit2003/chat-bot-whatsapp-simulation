package com.chatbot.chatbot.Controller;

import com.chatbot.chatbot.Model.MessageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody MessageRequest request) {

        String incomingMessage = request.getMessage();

        // Logging message
        System.out.println("Received Message: " + incomingMessage);

        // Response logic
        if (incomingMessage.equalsIgnoreCase("hi")) {
            return "Hello";
        } else if (incomingMessage.equalsIgnoreCase("bye")) {
            return "Goodbye";
        } else {
            return "Try saying Hi or Bye";
        }
    }
}
