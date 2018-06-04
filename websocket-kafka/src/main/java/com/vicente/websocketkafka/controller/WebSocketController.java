package com.vicente.websocketkafka.controller;

import com.vicente.websocketkafka.dto.Message;
import com.vicente.websocketkafka.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * @author shiweisen
 * @since 2018-02-07
 */
@Controller
public class WebSocketController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Response greeting(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Response("Hello, " + message.getName() + "!");
    }
}
