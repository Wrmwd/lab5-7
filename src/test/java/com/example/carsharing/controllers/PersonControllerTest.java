package com.example.carsharing.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.carsharing.entities.Person;
import com.example.carsharing.exeptions.PersonNotFoundException;
import com.example.carsharing.repositories.PersonRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

class PersonControllerTest {
    /**
     * Method under test: {@link PersonController#all(Model)}
     */
    @Test
    void testAll() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findAll()).thenReturn(new ArrayList<>());
        PersonController personController = new PersonController(repository);
        assertEquals("persons", personController.all(new ConcurrentModel()));
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link PersonController#all(Model)}
     */
    @Test
    void testAll2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findAll()).thenThrow(new PersonNotFoundException(1L));
        PersonController personController = new PersonController(repository);
        assertThrows(PersonNotFoundException.class, () -> personController.all(new ConcurrentModel()));
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link PersonController#newPerson(Person)}
     */
    @Test
    void testNewPerson() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        Person person = new Person("Name", 1, 1);

        when(repository.save(Mockito.<Person>any())).thenReturn(person);
        PersonController personController = new PersonController(repository);
        assertSame(person, personController.newPerson(new Person("Name", 1, 1)));
        verify(repository).save(Mockito.<Person>any());
    }

    /**
     * Method under test: {@link PersonController#newPerson(Person)}
     */
    @Test
    void testNewPerson2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.save(Mockito.<Person>any())).thenThrow(new PersonNotFoundException(1L));
        PersonController personController = new PersonController(repository);
        assertThrows(PersonNotFoundException.class, () -> personController.newPerson(new Person("Name", 1, 1)));
        verify(repository).save(Mockito.<Person>any());
    }

    /**
     * Method under test: {@link PersonController#one(Long)}
     */
    @Test
    void testOne() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        Person person = new Person("Name", 1, 1);

        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(person));
        assertSame(person, (new PersonController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link PersonController#one(Long)}
     */
    @Test
    void testOne2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        assertThrows(PersonNotFoundException.class, () -> (new PersonController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link PersonController#one(Long)}
     */
    @Test
    void testOne3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenThrow(new PersonNotFoundException(1L));
        assertThrows(PersonNotFoundException.class, () -> (new PersonController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    void testReplaceEmployee() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        Person person = new Person("Name", 1, 1);

        when(repository.save(Mockito.<Person>any())).thenReturn(person);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Person("Name", 1, 1)));
        PersonController personController = new PersonController(repository);
        assertSame(person, personController.replaceEmployee(new Person("Name", 1, 1), 1L));
        verify(repository).save(Mockito.<Person>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals("Name", personController.one(1L).getName());
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    void testReplaceEmployee2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        when(repository.save(Mockito.<Person>any())).thenReturn(null);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Person("Name", 1, 1)));
        PersonController personController = new PersonController(repository);
        Person newPerson = new Person("Name", 1, 1);

        assertNull(personController.replaceEmployee(newPerson, 1L));
        verify(repository, atLeast(1)).save(Mockito.<Person>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newPerson.getId().longValue());
        assertEquals("Name", personController.one(1L).getName());
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    void testReplaceEmployee3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Person person = mock(Person.class);
        doThrow(new PersonNotFoundException(1L)).when(person).setName(Mockito.<String>any());
        Optional<Person> ofResult = Optional.of(person);
        PersonRepository repository = mock(PersonRepository.class);
        when(repository.save(Mockito.<Person>any())).thenReturn(new Person("Name", 1, 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        PersonController personController = new PersonController(repository);
        assertThrows(PersonNotFoundException.class, () -> personController.replaceEmployee(new Person("Name", 1, 1), 1L));
        verify(repository).findById(Mockito.<Long>any());
        verify(person).setName(Mockito.<String>any());
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    void testReplaceEmployee4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        new PersonNotFoundException(1L);
        PersonRepository repository = mock(PersonRepository.class);
        Person person = new Person("Name", 1, 1);

        when(repository.save(Mockito.<Person>any())).thenReturn(person);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        PersonController personController = new PersonController(repository);
        Person newPerson = new Person("Name", 1, 1);

        assertSame(person, personController.replaceEmployee(newPerson, 1L));
        verify(repository).save(Mockito.<Person>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newPerson.getId().longValue());
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceEmployee5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Person.getName()" because "newPerson" is null
        //       at com.example.carsharing.controllers.PersonController.lambda$replaceEmployee$1(PersonController.java:42)
        //       at java.util.Optional.map(Optional.java:260)
        //       at com.example.carsharing.controllers.PersonController.replaceEmployee(PersonController.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        Person person = mock(Person.class);
        doThrow(new PersonNotFoundException(1L)).when(person).setName(Mockito.<String>any());
        Optional<Person> ofResult = Optional.of(person);
        PersonRepository repository = mock(PersonRepository.class);
        when(repository.save(Mockito.<Person>any())).thenReturn(new Person("Name", 1, 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        (new PersonController(repository)).replaceEmployee(null, 1L);
    }

    /**
     * Method under test: {@link PersonController#replaceEmployee(Person, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceEmployee6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Person.setId(java.lang.Long)" because "newPerson" is null
        //       at com.example.carsharing.controllers.PersonController.lambda$replaceEmployee$2(PersonController.java:46)
        //       at java.util.Optional.orElseGet(Optional.java:364)
        //       at com.example.carsharing.controllers.PersonController.replaceEmployee(PersonController.java:45)
        //   See https://diff.blue/R013 to resolve this issue.

        new PersonNotFoundException(1L);
        PersonRepository repository = mock(PersonRepository.class);
        when(repository.save(Mockito.<Person>any())).thenReturn(new Person("Name", 1, 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new PersonController(repository)).replaceEmployee(null, 1L);
    }

    /**
     * Method under test: {@link PersonController#deleteEmployee(Long)}
     */
    @Test
    void testDeleteEmployee() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        doNothing().when(repository).deleteById(Mockito.<Long>any());
        (new PersonController(repository)).deleteEmployee(1L);
        verify(repository).deleteById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link PersonController#deleteEmployee(Long)}
     */
    @Test
    void testDeleteEmployee2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        PersonRepository repository = mock(PersonRepository.class);
        doThrow(new PersonNotFoundException(1L)).when(repository).deleteById(Mockito.<Long>any());
        assertThrows(PersonNotFoundException.class, () -> (new PersonController(repository)).deleteEmployee(1L));
        verify(repository).deleteById(Mockito.<Long>any());
    }
}

