package com.example.carsharing.entities;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car()}
     *   <li>{@link Car#setId(Long)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setNumber(int)}
     *   <li>{@link Car#setOdometr(int)}
     *   <li>{@link Car#setTravels(List)}
     *   <li>{@link Car#setVin(String)}
     *   <li>{@link Car#toString()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getNumber()}
     *   <li>{@link Car#getOdometr()}
     *   <li>{@link Car#getTravels()}
     *   <li>{@link Car#getVin()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Car actualCar = new Car();
        actualCar.setId(1L);
        actualCar.setModel("Model");
        actualCar.setNumber(10);
        actualCar.setOdometr(1);
        ArrayList<Travel> travels = new ArrayList<>();
        actualCar.setTravels(travels);
        actualCar.setVin("Vin");
        String actualToStringResult = actualCar.toString();
        assertEquals(1L, actualCar.getId().longValue());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10, actualCar.getNumber());
        assertEquals(1, actualCar.getOdometr());
        assertSame(travels, actualCar.getTravels());
        assertEquals("Vin", actualCar.getVin());
        assertEquals("Car{id=1, vin='Vin', number=10, model='Model', odometr=1}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Car#Car(String, int, String, int)}
     *   <li>{@link Car#setId(Long)}
     *   <li>{@link Car#setModel(String)}
     *   <li>{@link Car#setNumber(int)}
     *   <li>{@link Car#setOdometr(int)}
     *   <li>{@link Car#setTravels(List)}
     *   <li>{@link Car#setVin(String)}
     *   <li>{@link Car#toString()}
     *   <li>{@link Car#getId()}
     *   <li>{@link Car#getModel()}
     *   <li>{@link Car#getNumber()}
     *   <li>{@link Car#getOdometr()}
     *   <li>{@link Car#getTravels()}
     *   <li>{@link Car#getVin()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Car actualCar = new Car("Vin", 10, "Model", 1);
        actualCar.setId(1L);
        actualCar.setModel("Model");
        actualCar.setNumber(10);
        actualCar.setOdometr(1);
        ArrayList<Travel> travels = new ArrayList<>();
        actualCar.setTravels(travels);
        actualCar.setVin("Vin");
        String actualToStringResult = actualCar.toString();
        assertEquals(1L, actualCar.getId().longValue());
        assertEquals("Model", actualCar.getModel());
        assertEquals(10, actualCar.getNumber());
        assertEquals(1, actualCar.getOdometr());
        assertSame(travels, actualCar.getTravels());
        assertEquals("Vin", actualCar.getVin());
        assertEquals("Car{id=1, vin='Vin', number=10, model='Model', odometr=1}", actualToStringResult);
    }

    /**
     * Method under test: {@link Car#getSizeTravel()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSizeTravel() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.size()" because "that" is null
        //       at com.example.carsharing.entities.Car.getSizeTravel(Car.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Car("Vin", 10, "Model", 1)).getSizeTravel();
    }

    /**
     * Method under test: {@link Car#getSizeTravel()}
     */
    @Test
    void testGetSizeTravel2() {
        Car car = new Car("Vin", 10, "Model", 1);
        car.setTravels(new ArrayList<>());
        assertEquals(0, car.getSizeTravel());
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTravelsSort() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Iterable.iterator()" because "iterable" is null
        //       at com.example.carsharing.entities.Car.getTravelsSort(Car.java:98)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Car("Vin", 10, "Model", 1)).getTravelsSort(1);
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTravelsSort2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: date must not be null
        //       at java.util.Objects.requireNonNull(Objects.java:233)
        //       at java.util.Calendar.setTime(Calendar.java:1792)
        //       at com.example.carsharing.entities.Car.getTravelsSort(Car.java:100)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(new Travel());

        Car car = new Car("Vin", 10, "Model", 1);
        car.setTravels(travels);
        car.getTravelsSort(1);
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    void testGetTravelsSort3() {
        Car car = new Car("Vin", 10, "Model", 1);
        ArrayList<Travel> travels = new ArrayList<>();
        car.setTravels(travels);
        List<Travel> actualTravelsSort = car.getTravelsSort(1);
        assertSame(travels, actualTravelsSort);
        assertTrue(actualTravelsSort.isEmpty());
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    void testGetTravelsSort4() {
        Travel travel = new Travel();
        travel.setTravel_date(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(travel);

        Car car = new Car("Vin", 10, "Model", 1);
        car.setTravels(travels);
        List<Travel> actualTravelsSort = car.getTravelsSort(1);
        assertSame(travels, actualTravelsSort);
        assertEquals(1, actualTravelsSort.size());
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetTravelsSort5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read field "travel_date" because "travel" is null
        //       at com.example.carsharing.entities.Car.getTravelsSort(Car.java:100)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(null);

        Car car = new Car("Vin", 10, "Model", 1);
        car.setTravels(travels);
        car.getTravelsSort(1);
    }

    /**
     * Method under test: {@link Car#getTravelsSort(int)}
     */
    @Test
    void testGetTravelsSort6() {
        Travel travel = new Travel();
        travel.setTravel_date(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(travel);

        Car car = new Car("Vin", 10, "Model", 1);
        car.setTravels(travels);
        List<Travel> actualTravelsSort = car.getTravelsSort(0);
        assertSame(travels, actualTravelsSort);
        assertEquals(1, actualTravelsSort.size());
    }
}

