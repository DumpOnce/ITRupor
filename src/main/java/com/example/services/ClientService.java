package com.example.services;

import com.example.repositories.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final PersonRepository personRepo;


    public ClientService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
