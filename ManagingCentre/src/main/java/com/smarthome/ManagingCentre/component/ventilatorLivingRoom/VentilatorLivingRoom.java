package com.smarthome.ManagingCentre.component.ventilatorLivingRoom;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@Component
public class VentilatorLivingRoom {

    private final RestTemplate restTemplate;

    public VentilatorLivingRoom(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void turnOnVentilatorLivingRoom() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http").host("192.168.1.195")
                .path("/cm").query("cmnd={keyword}").buildAndExpand("Power off");
        String responseString = restTemplate.getForObject(uriComponents.toUri(), String.class);
        System.out.println(responseString);
    }

    public void turnOffVentilatorLivingRoom() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http").host("192.168.1.195")
                .path("/cm").query("cmnd={keyword}").buildAndExpand("Power off");
        String responseString = restTemplate.getForObject(uriComponents.toUri(), String.class);
        System.out.println(responseString);
    }

    public String toggleVentilatorLivingRoom() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http").host("192.168.1.195")
                .path("/cm").query("cmnd={keyword}").buildAndExpand("Power TOGGLE");
        return restTemplate.getForObject(uriComponents.toUri(), String.class);
    }
}
