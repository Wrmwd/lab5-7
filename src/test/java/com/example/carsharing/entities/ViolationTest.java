package com.example.carsharing.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ViolationTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#Violation()}
     *   <li>{@link Violation#setId(Long)}
     *   <li>{@link Violation#setPerson(Person)}
     *   <li>{@link Violation#setViolation_date(Date)}
     *   <li>{@link Violation#setViolation_name(String)}
     *   <li>{@link Violation#toString()}
     *   <li>{@link Violation#getId()}
     *   <li>{@link Violation#getPerson()}
     *   <li>{@link Violation#getViolation_date()}
     *   <li>{@link Violation#getViolation_name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Violation actualViolation = new Violation();
        actualViolation.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualViolation.setPerson(person);
        Date violation_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualViolation.setViolation_date(violation_date);
        actualViolation.setViolation_name("Violation name");
        actualViolation.toString();
        assertEquals(1L, actualViolation.getId().longValue());
        assertSame(person, actualViolation.getPerson());
        assertSame(violation_date, actualViolation.getViolation_date());
        assertEquals("Violation name", actualViolation.getViolation_name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#Violation(String)}
     *   <li>{@link Violation#setId(Long)}
     *   <li>{@link Violation#setPerson(Person)}
     *   <li>{@link Violation#setViolation_date(Date)}
     *   <li>{@link Violation#setViolation_name(String)}
     *   <li>{@link Violation#toString()}
     *   <li>{@link Violation#getId()}
     *   <li>{@link Violation#getPerson()}
     *   <li>{@link Violation#getViolation_date()}
     *   <li>{@link Violation#getViolation_name()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Violation actualViolation = new Violation("Violation name");
        actualViolation.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualViolation.setPerson(person);
        Date violation_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualViolation.setViolation_date(violation_date);
        actualViolation.setViolation_name("Violation name");
        actualViolation.toString();
        assertEquals(1L, actualViolation.getId().longValue());
        assertSame(person, actualViolation.getPerson());
        assertSame(violation_date, actualViolation.getViolation_date());
        assertEquals("Violation name", actualViolation.getViolation_name());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#Violation(String, Date)}
     *   <li>{@link Violation#setId(Long)}
     *   <li>{@link Violation#setPerson(Person)}
     *   <li>{@link Violation#setViolation_date(Date)}
     *   <li>{@link Violation#setViolation_name(String)}
     *   <li>{@link Violation#toString()}
     *   <li>{@link Violation#getId()}
     *   <li>{@link Violation#getPerson()}
     *   <li>{@link Violation#getViolation_date()}
     *   <li>{@link Violation#getViolation_name()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        Violation actualViolation = new Violation("Violation description",
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        actualViolation.setId(1L);
        Person person = new Person("Name", 1, 1);

        actualViolation.setPerson(person);
        Date violation_date = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualViolation.setViolation_date(violation_date);
        actualViolation.setViolation_name("Violation name");
        actualViolation.toString();
        assertEquals(1L, actualViolation.getId().longValue());
        assertSame(person, actualViolation.getPerson());
        assertSame(violation_date, actualViolation.getViolation_date());
        assertEquals("Violation name", actualViolation.getViolation_name());
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new Violation("Violation name"), null);
        assertNotEquals(new Violation("Violation name"), "Different type to Violation");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#equals(Object)}
     *   <li>{@link Violation#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        Violation violation = new Violation("Violation name");
        assertEquals(violation, violation);
        int expectedHashCodeResult = violation.hashCode();
        assertEquals(expectedHashCodeResult, violation.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Violation#equals(Object)}
     *   <li>{@link Violation#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Violation violation = new Violation("Violation name");
        Violation violation2 = new Violation("Violation name");
        assertEquals(violation, violation2);
        int expectedHashCodeResult = violation.hashCode();
        assertEquals(expectedHashCodeResult, violation2.hashCode());
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals4() {
        Violation violation = new Violation(null);
        assertNotEquals(violation, new Violation("Violation name"));
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals5() {
        Violation violation = new Violation("Violation description",
                Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        assertNotEquals(violation, new Violation("Violation name"));
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals6() {
        Violation violation = new Violation("Violation name");
        violation.violation_date = mock(java.sql.Date.class);
        assertNotEquals(violation, 1);
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals7() {
        Violation violation = new Violation("Violation name");
        violation.setId(1L);
        assertNotEquals(violation, new Violation("Violation name"));
    }

    /**
     * Method under test: {@link Violation#equals(Object)}
     */
    @Test
    void testEquals8() {
        Violation violation = new Violation("Violation name");
        violation.setPerson(new Person("Name", 1, 1));
        assertNotEquals(violation, new Violation("Violation name"));
    }
}

