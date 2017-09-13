package spittr.data.impl;

import org.springframework.stereotype.Component;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

@Component(value = "spittleRepository")
public class DefaultSpittleRepository implements SpittleRepository {

    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    public Spittle findOne(long id) {
        return null;
    }
}
