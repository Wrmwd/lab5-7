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

import com.example.carsharing.entities.Violation;
import com.example.carsharing.exeptions.ViolationNotFoundException;
import com.example.carsharing.repositories.ViolationRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ViolationControllerTest {
    /**
     * Method under test: {@link ViolationController#all()}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        ArrayList<Violation> violationList = new ArrayList<>();
        when(repository.findAll()).thenReturn(violationList);
        List<Violation> actualAllResult = (new ViolationController(repository)).all();
        assertSame(violationList, actualAllResult);
        assertTrue(actualAllResult.isEmpty());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link ViolationController#all()}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.findAll()).thenThrow(new ViolationNotFoundException(1L));
        assertThrows(ViolationNotFoundException.class, () -> (new ViolationController(repository)).all());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link ViolationController#newViolation(Violation)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        Violation violation = new Violation("Violation name");
        when(repository.save(Mockito.<Violation>any())).thenReturn(violation);
        ViolationController violationController = new ViolationController(repository);
        assertSame(violation, violationController.newViolation(new Violation("Violation name")));
        verify(repository).save(Mockito.<Violation>any());
    }

    /**
     * Method under test: {@link ViolationController#newViolation(Violation)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.save(Mockito.<Violation>any())).thenThrow(new ViolationNotFoundException(1L));
        ViolationController violationController = new ViolationController(repository);
        assertThrows(ViolationNotFoundException.class,
                () -> violationController.newViolation(new Violation("Violation name")));
        verify(repository).save(Mockito.<Violation>any());
    }

    /**
     * Method under test: {@link ViolationController#one(Long)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        Violation violation = new Violation("Violation name");
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(violation));
        assertSame(violation, (new ViolationController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ViolationController#one(Long)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        assertThrows(ViolationNotFoundException.class, () -> (new ViolationController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ViolationController#one(Long)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenThrow(new ViolationNotFoundException(1L));
        assertThrows(ViolationNotFoundException.class, () -> (new ViolationController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    void testReplaceViolation() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ViolationRepository repository = mock(ViolationRepository.class);
        Violation violation = new Violation("Violation name");
        when(repository.save(Mockito.<Violation>any())).thenReturn(violation);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Violation("Violation name")));
        ViolationController violationController = new ViolationController(repository);
        assertSame(violation, violationController.replaceViolation(new Violation("Violation name"), 1L));
        verify(repository).save(Mockito.<Violation>any());
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    void testReplaceViolation2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.save(Mockito.<Violation>any())).thenReturn(null);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Violation("Violation name")));
        ViolationController violationController = new ViolationController(repository);
        Violation newViolation = new Violation("Violation name");
        assertNull(violationController.replaceViolation(newViolation, 1L));
        verify(repository, atLeast(1)).save(Mockito.<Violation>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newViolation.getId().longValue());
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    void testReplaceViolation3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Violation violation = mock(Violation.class);
        doThrow(new ViolationNotFoundException(1L)).when(violation).setViolation_name(Mockito.<String>any());
        Optional<Violation> ofResult = Optional.of(violation);
        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.save(Mockito.<Violation>any())).thenReturn(new Violation("Violation name"));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        ViolationController violationController = new ViolationController(repository);
        assertThrows(ViolationNotFoundException.class,
                () -> violationController.replaceViolation(new Violation("Violation name"), 1L));
        verify(repository).findById(Mockito.<Long>any());
        verify(violation).setViolation_name(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    void testReplaceViolation4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        new ViolationNotFoundException(1L);
        ViolationRepository repository = mock(ViolationRepository.class);
        Violation violation = new Violation("Violation name");
        when(repository.save(Mockito.<Violation>any())).thenReturn(violation);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        ViolationController violationController = new ViolationController(repository);
        Violation newViolation = new Violation("Violation name");
        assertSame(violation, violationController.replaceViolation(newViolation, 1L));
        verify(repository).save(Mockito.<Violation>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newViolation.getId().longValue());
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceViolation5() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Violation.getViolation_name()" because "newViolation" is null
        //       at com.example.carsharing.controllers.ViolationController.lambda$replaceViolation$1(ViolationController.java:45)
        //       at java.util.Optional.map(Optional.java:260)
        //       at com.example.carsharing.controllers.ViolationController.replaceViolation(ViolationController.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        Violation violation = mock(Violation.class);
        doThrow(new ViolationNotFoundException(1L)).when(violation).setViolation_name(Mockito.<String>any());
        Optional<Violation> ofResult = Optional.of(violation);
        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.save(Mockito.<Violation>any())).thenReturn(new Violation("Violation name"));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        (new ViolationController(repository)).replaceViolation(null, 1L);
    }

    /**
     * Method under test: {@link ViolationController#replaceViolation(Violation, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceViolation6() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Violation.setId(java.lang.Long)" because "newViolation" is null
        //       at com.example.carsharing.controllers.ViolationController.lambda$replaceViolation$2(ViolationController.java:49)
        //       at java.util.Optional.orElseGet(Optional.java:364)
        //       at com.example.carsharing.controllers.ViolationController.replaceViolation(ViolationController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        new ViolationNotFoundException(1L);
        ViolationRepository repository = mock(ViolationRepository.class);
        when(repository.save(Mockito.<Violation>any())).thenReturn(new Violation("Violation name"));
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new ViolationController(repository)).replaceViolation(null, 1L);
    }

    /**
     * Method under test: {@link ViolationController#deleteViolation(Long)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        doNothing().when(repository).deleteById(Mockito.<Long>any());
        (new ViolationController(repository)).deleteViolation(1L);
        verify(repository).deleteById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ViolationController#deleteViolation(Long)}
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

        ViolationRepository repository = mock(ViolationRepository.class);
        doThrow(new ViolationNotFoundException(1L)).when(repository).deleteById(Mockito.<Long>any());
        assertThrows(ViolationNotFoundException.class, () -> (new ViolationController(repository)).deleteViolation(1L));
        verify(repository).deleteById(Mockito.<Long>any());
    }
}

