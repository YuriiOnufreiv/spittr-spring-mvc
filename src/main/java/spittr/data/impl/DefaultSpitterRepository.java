package spittr.data.impl;

import org.springframework.stereotype.Component;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import java.util.ArrayList;
import java.util.List;

@Component(value = "spitterRepository")
public class DefaultSpitterRepository implements SpitterRepository {

    private List<Spitter> spitterList = new ArrayList<>();

    public Spitter save(Spitter unsaved) {
        Spitter saved = new Spitter();

        saved.setId((long) spitterList.size());
        saved.setUsername(unsaved.getUsername());
        saved.setPassword(unsaved.getPassword());
        saved.setEmail(unsaved.getEmail());
        saved.setFirstName(unsaved.getFirstName());
        saved.setLastName(unsaved.getLastName());

        spitterList.add(saved);

        return saved;
    }

    public Spitter findByUsername(final String username) {
        return spitterList.stream().filter((spitter) ->
                spitter.getUsername().equals(username)).iterator().next();
    }
}
