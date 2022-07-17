package dev.alexengrig.sample.hazel2ndlvlcast.repository;

import dev.alexengrig.sample.hazel2ndlvlcast.entity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {
}
