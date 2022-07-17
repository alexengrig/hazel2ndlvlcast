package dev.alexengrig.sample.hazel2ndlvlcast.schedule;

import dev.alexengrig.sample.hazel2ndlvlcast.entity.Thing;
import dev.alexengrig.sample.hazel2ndlvlcast.service.ThingService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@EnableScheduling
@Transactional
@RequiredArgsConstructor
public class ThingDemoScheduler {
    private final ThingService service;

    private Long id;

    @PostConstruct
    void doPost() {
        id = service.create("test").getId();
    }

    @Scheduled(fixedDelay = 3000L)
    public void doIt() {
        Thing thing = service.get(id);
        System.out.println(thing);
    }

}
