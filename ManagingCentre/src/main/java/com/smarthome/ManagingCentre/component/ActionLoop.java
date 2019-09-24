package com.smarthome.ManagingCentre.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActionLoop {

    private static final Logger log = LoggerFactory.getLogger(ActionLoop.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        System.out.println("Get temp from sensor in living room");
        System.out.println("Get temp from sensor in middle room");
        System.out.println("Get temp from sensor in bath room");
        System.out.println("Get temp from sensor in bed room");


    }
}
