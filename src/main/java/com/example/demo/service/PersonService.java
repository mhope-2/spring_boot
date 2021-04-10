package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


//@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class PersonService {

    @Qualifier("fakeDao")
    private final PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(@RequestBody Person person){
        return personDao.insertPerson(person);
    }

}
