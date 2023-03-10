package br.com.pedro.unit.test.mapper.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.pedro.model.entity.Person;
import br.com.pedro.model.dto.v1.PersonV1DTO;

public class MockPerson {

    // General
    public Person mockEntity() {
        return mockEntity(0);
    }

    public PersonV1DTO mockDTO() {
        return mockDTO(0);
    }

    public List<Person> mockEntityList() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 5; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<PersonV1DTO> mockDTOList() {
        List<PersonV1DTO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockDTO(i));
        }
        return persons;
    }

    public Person mockEntity(Integer number) {
        Person person = new Person();
        person.setId(number.longValue());
        person.setFirstName("First Name Test" + number);
        person.setLastName("Last Name Test" + number);
        person.setAddress("Address Test" + number);
        person.setGender(((number % 2) == 0) ? "Male" : "Female");
        return person;
    }

    public PersonV1DTO mockDTO(Integer number) {
        PersonV1DTO person = new PersonV1DTO();
        person.setId(number.longValue());
        person.setFirstName("First Name Test" + number);
        person.setLastName("Last Name Test" + number);
        person.setAddress("Address Test" + number);
        person.setGender(((number % 2) == 0) ? "Male" : "Female");
        return person;
    }

}
