package com.example.carsharing.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.carsharing.entities.Travel;
import com.example.carsharing.exeptions.TravelNotFoundException;
import com.example.carsharing.repositories.TravelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TravelControllerTest {
    /**
     * Method under test: {@link TravelController#all()}
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

        TravelRepository repository = mock(TravelRepository.class);
        ArrayList<Travel> travelList = new ArrayList<>();
        when(repository.findAll()).thenReturn(travelList);
        List<Travel> actualAllResult = (new TravelController(repository)).all();
        assertSame(travelList, actualAllResult);
        assertTrue(actualAllResult.isEmpty());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link TravelController#all()}
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

        TravelRepository repository = mock(TravelRepository.class);
        when(repository.findAll()).thenThrow(new TravelNotFoundException(1L));
        assertThrows(TravelNotFoundException.class, () -> (new TravelController(repository)).all());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link TravelController#newViolation(Travel)}
     */
    @Test
    void testNewViolation() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        Travel travel = new Travel();
        when(repository.save(Mockito.<Travel>any())).thenReturn(travel);
        TravelController travelController = new TravelController(repository);
        assertSame(travel, travelController.newViolation(new Travel()));
        verify(repository).save(Mockito.<Travel>any());
    }

    /**
     * Method under test: {@link TravelController#newViolation(Travel)}
     */
    @Test
    void testNewViolation2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        when(repository.save(Mockito.<Travel>any())).thenThrow(new TravelNotFoundException(1L));
        TravelController travelController = new TravelController(repository);
        assertThrows(TravelNotFoundException.class, () -> travelController.newViolation(new Travel()));
        verify(repository).save(Mockito.<Travel>any());
    }

    /**
     * Method under test: {@link TravelController#one(Long)}
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

        TravelRepository repository = mock(TravelRepository.class);
        Travel travel = new Travel();
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(travel));
        assertSame(travel, (new TravelController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link TravelController#one(Long)}
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

        TravelRepository repository = mock(TravelRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        assertThrows(TravelNotFoundException.class, () -> (new TravelController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link TravelController#one(Long)}
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

        TravelRepository repository = mock(TravelRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenThrow(new TravelNotFoundException(1L));
        assertThrows(TravelNotFoundException.class, () -> (new TravelController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    void testReplaceTravel() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        Travel travel = new Travel();
        when(repository.save(Mockito.<Travel>any())).thenReturn(travel);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Travel()));
        TravelController travelController = new TravelController(repository);
        assertSame(travel, travelController.replaceTravel(new Travel(), 1L));
        verify(repository).save(Mockito.<Travel>any());
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    void testReplaceTravel2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        when(repository.save(Mockito.<Travel>any())).thenReturn(null);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Travel()));
        TravelController travelController = new TravelController(repository);
        Travel newTravel = new Travel();
        assertNull(travelController.replaceTravel(newTravel, 1L));
        verify(repository, atLeast(1)).save(Mockito.<Travel>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newTravel.getId().longValue());
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    void testReplaceTravel3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Travel travel = mock(Travel.class);
        doThrow(new TravelNotFoundException(1L)).when(travel).setTravel_cost(Mockito.<String>any());
        Optional<Travel> ofResult = Optional.of(travel);
        TravelRepository repository = mock(TravelRepository.class);
        when(repository.save(Mockito.<Travel>any())).thenReturn(new Travel());
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        TravelController travelController = new TravelController(repository);
        assertThrows(TravelNotFoundException.class, () -> travelController.replaceTravel(new Travel(), 1L));
        verify(repository).findById(Mockito.<Long>any());
        verify(travel).setTravel_cost(Mockito.<String>any());
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    void testReplaceTravel4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        new TravelNotFoundException(1L);
        TravelRepository repository = mock(TravelRepository.class);
        Travel travel = new Travel();
        when(repository.save(Mockito.<Travel>any())).thenReturn(travel);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        TravelController travelController = new TravelController(repository);
        Travel newTravel = new Travel();
        assertSame(travel, travelController.replaceTravel(newTravel, 1L));
        verify(repository).save(Mockito.<Travel>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newTravel.getId().longValue());
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceTravel5() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Travel.getTravel_cost()" because "newTravel" is null
        //       at com.example.carsharing.controllers.TravelController.lambda$replaceTravel$1(TravelController.java:39)
        //       at java.util.Optional.map(Optional.java:260)
        //       at com.example.carsharing.controllers.TravelController.replaceTravel(TravelController.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        Travel travel = mock(Travel.class);
        doThrow(new TravelNotFoundException(1L)).when(travel).setTravel_cost(Mockito.<String>any());
        Optional<Travel> ofResult = Optional.of(travel);
        TravelRepository repository = mock(TravelRepository.class);
        when(repository.save(Mockito.<Travel>any())).thenReturn(new Travel());
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        (new TravelController(repository)).replaceTravel(null, 1L);
    }

    /**
     * Method under test: {@link TravelController#replaceTravel(Travel, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceTravel6() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Travel.setId(java.lang.Long)" because "newTravel" is null
        //       at com.example.carsharing.controllers.TravelController.lambda$replaceTravel$2(TravelController.java:43)
        //       at java.util.Optional.orElseGet(Optional.java:364)
        //       at com.example.carsharing.controllers.TravelController.replaceTravel(TravelController.java:42)
        //   See https://diff.blue/R013 to resolve this issue.

        new TravelNotFoundException(1L);
        TravelRepository repository = mock(TravelRepository.class);
        when(repository.save(Mockito.<Travel>any())).thenReturn(new Travel());
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new TravelController(repository)).replaceTravel(null, 1L);
    }

    /**
     * Method under test: {@link TravelController#deleteViolation(Long)}
     */
    @Test
    void testDeleteViolation() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        doNothing().when(repository).deleteById(Mockito.<Long>any());
        (new TravelController(repository)).deleteViolation(1L);
        verify(repository).deleteById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link TravelController#deleteViolation(Long)}
     */
    @Test
    void testDeleteViolation2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        TravelRepository repository = mock(TravelRepository.class);
        doThrow(new TravelNotFoundException(1L)).when(repository).deleteById(Mockito.<Long>any());
        assertThrows(TravelNotFoundException.class, () -> (new TravelController(repository)).deleteViolation(1L));
        verify(repository).deleteById(Mockito.<Long>any());
    }
}

