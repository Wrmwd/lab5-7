package com.example.carsharing.controllers;

import com.example.carsharing.entities.Car;
import com.example.carsharing.entities.Travel;
import com.example.carsharing.exeptions.TravelNotFoundException;
import com.example.carsharing.repositories.CarRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CarControllerTest {

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    void testAllSorted() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(new ArrayList<>());
        assertTrue((new CarController(repository)).allSorted().isEmpty());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllSorted2() {
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
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Iterable.iterator()" because "iterable" is null
        //       at com.example.carsharing.controllers.CarController.hasTravelInMonth(CarController.java:56)
        //       at com.example.carsharing.controllers.CarController.lambda$allSorted$0(CarController.java:48)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.example.carsharing.controllers.CarController.allSorted(CarController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Vin", 10, "Model", 2));
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        (new CarController(repository)).allSorted();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllSorted3() {
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
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.size()" because "that" is null
        //       at com.example.carsharing.entities.Car.getSizeTravel(Car.java:63)
        //       at com.example.carsharing.controllers.CarController$1ComparatorByAvgMark.compare(CarController.java:37)
        //       at com.example.carsharing.controllers.CarController$1ComparatorByAvgMark.compare(CarController.java:34)
        //       at java.util.TimSort.countRunAndMakeAscending(TimSort.java:355)
        //       at java.util.TimSort.sort(TimSort.java:220)
        //       at java.util.Arrays.sort(Arrays.java:1307)
        //       at java.util.ArrayList.sort(ArrayList.java:1721)
        //       at java.util.Collections.sort(Collections.java:179)
        //       at com.example.carsharing.controllers.CarController.allSorted(CarController.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Vin", 10, "Model", 2));
        carList.add(new Car("Vin", 10, "Model", 2));
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        (new CarController(repository)).allSorted();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    void testAllSorted4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenThrow(new TravelNotFoundException(1L));
        assertThrows(TravelNotFoundException.class, () -> (new CarController(repository)).allSorted());
        verify(repository).findAll();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    void testAllSorted5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        assertTrue((new CarController(repository)).allSorted().isEmpty());
        verify(repository).findAll();
        verify(car).getTravels();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllSorted6() {
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
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.size()" because "that" is null
        //       at com.example.carsharing.entities.Car.getSizeTravel(Car.java:63)
        //       at com.example.carsharing.controllers.CarController$1ComparatorByAvgMark.compare(CarController.java:37)
        //       at com.example.carsharing.controllers.CarController$1ComparatorByAvgMark.compare(CarController.java:34)
        //       at java.util.TimSort.countRunAndMakeAscending(TimSort.java:355)
        //       at java.util.TimSort.sort(TimSort.java:220)
        //       at java.util.Arrays.sort(Arrays.java:1307)
        //       at java.util.ArrayList.sort(ArrayList.java:1721)
        //       at java.util.Collections.sort(Collections.java:179)
        //       at com.example.carsharing.controllers.CarController.allSorted(CarController.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getSizeTravel()).thenReturn(3);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Vin", 10, "Model", 2));
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        (new CarController(repository)).allSorted();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    void testAllSorted7() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getSizeTravel()).thenReturn(3);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        Car car2 = new Car("Vin", 10, "Model", 2);
        car2.setTravels(new ArrayList<>());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car2);
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        assertTrue((new CarController(repository)).allSorted().isEmpty());
        verify(repository).findAll();
        verify(car).getSizeTravel();
        verify(car).getTravels();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllSorted8() {
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
        //   java.lang.NullPointerException: date must not be null
        //       at java.util.Objects.requireNonNull(Objects.java:233)
        //       at java.util.Calendar.setTime(Calendar.java:1792)
        //       at com.example.carsharing.controllers.CarController.hasTravelInMonth(CarController.java:58)
        //       at com.example.carsharing.controllers.CarController.lambda$allSorted$0(CarController.java:48)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.example.carsharing.controllers.CarController.allSorted(CarController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getSizeTravel()).thenReturn(3);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(new Travel());

        Car car2 = new Car("Vin", 10, "Model", 2);
        car2.setTravels(travels);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car2);
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        (new CarController(repository)).allSorted();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    void testAllSorted9() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getSizeTravel()).thenReturn(3);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        Travel travel = new Travel();
        travel.setTravel_date(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(travel);

        Car car2 = new Car("Vin", 10, "Model", 2);
        car2.setTravels(travels);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car2);
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        assertTrue((new CarController(repository)).allSorted().isEmpty());
        verify(repository).findAll();
        verify(car).getSizeTravel();
        verify(car).getTravels();
    }

    /**
     * Method under test: {@link CarController#allSorted()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllSorted10() {
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
        //   java.lang.NullPointerException: Cannot read field "travel_date" because "travel" is null
        //       at com.example.carsharing.controllers.CarController.hasTravelInMonth(CarController.java:58)
        //       at com.example.carsharing.controllers.CarController.lambda$allSorted$0(CarController.java:48)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.example.carsharing.controllers.CarController.allSorted(CarController.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        when(car.getSizeTravel()).thenReturn(3);
        when(car.getTravels()).thenReturn(new ArrayList<>());

        ArrayList<Travel> travels = new ArrayList<>();
        travels.add(null);

        Car car2 = new Car("Vin", 10, "Model", 2);
        car2.setTravels(travels);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car2);
        carList.add(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.findAll()).thenReturn(carList);
        (new CarController(repository)).allSorted();
    }

    /**
     * Method under test: {@link CarController#newCar(Car)}
     */
    @Test
    void testNewCar() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        Car car = new Car("Vin", 10, "Model", 1);

        when(repository.save(Mockito.<Car>any())).thenReturn(car);
        CarController carController = new CarController(repository);
        assertSame(car, carController.newCar(new Car("Vin", 10, "Model", 1)));
        verify(repository).save(Mockito.<Car>any());
    }

    /**
     * Method under test: {@link CarController#newCar(Car)}
     */
    @Test
    void testNewCar2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        when(repository.save(Mockito.<Car>any())).thenThrow(new TravelNotFoundException(1L));
        CarController carController = new CarController(repository);
        assertThrows(TravelNotFoundException.class, () -> carController.newCar(new Car("Vin", 10, "Model", 1)));
        verify(repository).save(Mockito.<Car>any());
    }

    /**
     * Method under test: {@link CarController#one(Long)}
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

        CarRepository repository = mock(CarRepository.class);
        Car car = new Car("Vin", 10, "Model", 1);

        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(car));
        assertSame(car, (new CarController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link CarController#one(Long)}
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

        CarRepository repository = mock(CarRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        assertThrows(TravelNotFoundException.class, () -> (new CarController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link CarController#one(Long)}
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

        CarRepository repository = mock(CarRepository.class);
        when(repository.findById(Mockito.<Long>any())).thenThrow(new TravelNotFoundException(1L));
        assertThrows(TravelNotFoundException.class, () -> (new CarController(repository)).one(1L));
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    void testReplaceCar() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        Car car = new Car("Vin", 10, "Model", 1);

        when(repository.save(Mockito.<Car>any())).thenReturn(car);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Car("Vin", 10, "Model", 1)));
        CarController carController = new CarController(repository);
        assertSame(car, carController.replaceCar(new Car("Vin", 10, "Model", 1), 1L));
        verify(repository).save(Mockito.<Car>any());
        verify(repository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    void testReplaceCar2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        when(repository.save(Mockito.<Car>any())).thenReturn(null);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Car("Vin", 10, "Model", 1)));
        CarController carController = new CarController(repository);
        Car newCar = new Car("Vin", 10, "Model", 1);

        assertNull(carController.replaceCar(newCar, 1L));
        verify(repository, atLeast(1)).save(Mockito.<Car>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newCar.getId().longValue());
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    void testReplaceCar3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        doThrow(new TravelNotFoundException(1L)).when(car).setModel(Mockito.<String>any());
        Optional<Car> ofResult = Optional.of(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.save(Mockito.<Car>any())).thenReturn(new Car("Vin", 10, "Model", 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        CarController carController = new CarController(repository);
        assertThrows(TravelNotFoundException.class, () -> carController.replaceCar(new Car("Vin", 10, "Model", 1), 1L));
        verify(repository).findById(Mockito.<Long>any());
        verify(car).setModel(Mockito.<String>any());
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    void testReplaceCar4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        new TravelNotFoundException(1L);
        CarRepository repository = mock(CarRepository.class);
        Car car = new Car("Vin", 10, "Model", 1);

        when(repository.save(Mockito.<Car>any())).thenReturn(car);
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        CarController carController = new CarController(repository);
        Car newCar = new Car("Vin", 10, "Model", 1);

        assertSame(car, carController.replaceCar(newCar, 1L));
        verify(repository).save(Mockito.<Car>any());
        verify(repository).findById(Mockito.<Long>any());
        assertEquals(1L, newCar.getId().longValue());
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceCar5() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Car.getModel()" because "newCar" is null
        //       at com.example.carsharing.controllers.CarController.lambda$replaceCar$2(CarController.java:83)
        //       at java.util.Optional.map(Optional.java:260)
        //       at com.example.carsharing.controllers.CarController.replaceCar(CarController.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        Car car = mock(Car.class);
        doThrow(new TravelNotFoundException(1L)).when(car).setModel(Mockito.<String>any());
        Optional<Car> ofResult = Optional.of(car);
        CarRepository repository = mock(CarRepository.class);
        when(repository.save(Mockito.<Car>any())).thenReturn(new Car("Vin", 10, "Model", 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        (new CarController(repository)).replaceCar(null, 1L);
    }

    /**
     * Method under test: {@link CarController#replaceCar(Car, Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testReplaceCar6() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.example.carsharing.entities.Car.setId(java.lang.Long)" because "newCar" is null
        //       at com.example.carsharing.controllers.CarController.lambda$replaceCar$3(CarController.java:87)
        //       at java.util.Optional.orElseGet(Optional.java:364)
        //       at com.example.carsharing.controllers.CarController.replaceCar(CarController.java:86)
        //   See https://diff.blue/R013 to resolve this issue.

        new TravelNotFoundException(1L);
        CarRepository repository = mock(CarRepository.class);
        when(repository.save(Mockito.<Car>any())).thenReturn(new Car("Vin", 10, "Model", 1));
        when(repository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new CarController(repository)).replaceCar(null, 1L);
    }

    /**
     * Method under test: {@link CarController#deleteCar(Long)}
     */
    @Test
    void testDeleteCar() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        doNothing().when(repository).deleteById(Mockito.<Long>any());
        (new CarController(repository)).deleteCar(1L);
        verify(repository).deleteById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link CarController#deleteCar(Long)}
     */
    @Test
    void testDeleteCar2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        CarRepository repository = mock(CarRepository.class);
        doThrow(new TravelNotFoundException(1L)).when(repository).deleteById(Mockito.<Long>any());
        assertThrows(TravelNotFoundException.class, () -> (new CarController(repository)).deleteCar(1L));
        verify(repository).deleteById(Mockito.<Long>any());
    }
}

