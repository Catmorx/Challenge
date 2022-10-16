package com.example.reto3ciclo3.services;

import com.example.reto3ciclo3.Model.Costume;
import com.example.reto3ciclo3.Repository.DisfracesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Disfracesservices {

    @Autowired
    private DisfracesRepository disfracesRepository;

    public List<Costume> getAll() {
        return disfracesRepository.getAll();
    }

    public Optional<Costume> getDisfraces(int id) {
        return disfracesRepository.getDisfraces(id);
    }

    public Costume save(Costume p) {
        if (p.getId() == null) {
            return disfracesRepository.save(p);
        } else {
            Optional<Costume> e = disfracesRepository.getDisfraces(p.getId());
            if (e.isPresent()) {
                return p;
            } else {
                return disfracesRepository.save(p);
            }
        }
    }

    public Costume update(Costume costumeModel) {
        if (costumeModel.getId() != null) {
            Optional<Costume> boat = disfracesRepository.getDisfraces(costumeModel.getId());
            if (!boat.isEmpty()) {
                if (costumeModel.getName() != null) {
                    boat.get().setName(costumeModel.getName());
                }
                if (costumeModel.getBrand() != null) {
                    boat.get().setBrand(costumeModel.getBrand());
                }
                if (costumeModel.getYear() != null) {
                    boat.get().setYear(costumeModel.getYear());
                }
                if (costumeModel.getDescription() != null) {
                    boat.get().setDescription(costumeModel.getDescription());
                }
                if (costumeModel.getMessages() != null) {
                    boat.get().setMessages(costumeModel.getMessages());
                }
                if (costumeModel.getReservations() != null) {
                    boat.get().setReservations(costumeModel.getReservations());
                }
                disfracesRepository.save(boat.get());
                return boat.get();
            } else {
                return costumeModel;
            }
        } else {
            return costumeModel;
        }
    }

    public boolean delete(int id) {
        boolean flag = false;
        Optional<Costume> p = disfracesRepository.getDisfraces(id);
        if (p.isPresent()) {
            disfracesRepository.delete(p.get());
            flag = true;
        }
        return flag;

    }
}
