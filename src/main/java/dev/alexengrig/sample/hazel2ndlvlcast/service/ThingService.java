package dev.alexengrig.sample.hazel2ndlvlcast.service;

import dev.alexengrig.sample.hazel2ndlvlcast.entity.Thing;
import dev.alexengrig.sample.hazel2ndlvlcast.repository.ThingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ThingService {
    private final ThingRepository repository;

    public Thing create(String name) {
        return repository.save(Thing.builder()
                .name(name)
                .build());
    }

    public Thing get(long id) {
        return repository.getReferenceById(id);
    }
}
