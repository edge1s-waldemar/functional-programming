package pl.kurs.edge1s.functional.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.kurs.edge1s.functional.model.Doctor;
import pl.kurs.edge1s.functional.model.Patient;
import pl.kurs.edge1s.functional.repository.VisitRepository;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class UtilityTestServiceTest {

    private UtilityTestService service;

    @Before
    public void init() {
        service = new UtilityTestService(new VisitRepository());
    }

    @Test
    public void shouldFindPatientWithGratestNumberOfVisits() {
        // given: service and repository, no mock
        // when:
        Optional<Patient> result = service.patientWithGreatestNumberOfVisits();
        // then:
        Assert.assertTrue(result.isPresent());
        Assert.assertSame("Marek", result.get().getName());
        Assert.assertSame("Szczepanski", result.get().getSurname());
        Assert.assertSame(8, result.get().getVisits().size());
    }

    @Test
    public void shouldFindDoctorWithGratestNumberOfVisits() {
        // given: service and repository, no mock
        // when:
        Optional<Doctor> result = service.doctorWithGreatestNumberOfVisits();
        // then:
        Assert.assertTrue(result.isPresent());
        Assert.assertSame("Genowefa", result.get().getName());
        Assert.assertSame("Sercowa", result.get().getSurname());
        Assert.assertSame(8, result.get().getVisits().size());
    }

    @Test
    public void shouldGroupBySpecializationNumberOfVisits() {
        // given: service and repository, no mock
        // when:
        Map<String, Long> result = service.groupBySpecVisitsNumber();
        // then:
        Assert.assertSame(2L, result.get("Ortopeda"));
        Assert.assertSame(5L, result.get("Patologia"));
        Assert.assertSame(5L, result.get("Ginekologia"));
        Assert.assertSame(6L, result.get("Psychiatria"));
        Assert.assertSame(16L, result.get("Kardiologia"));
    }

    @Test
    public void shouldGroupByCityNumberOfPatients() {
        // given: service and repository, no mock
        // when:
        Map<String, Long> result = service.groupByCityNumberOfPatients();
        // then:
        Assert.assertSame(3L, result.get("Warszawa"));
        Assert.assertSame(3L, result.get("Krakow"));
        Assert.assertSame(1L, result.get("Królestwo Konstaincina"));
    }

    @Test
    public void shouldGroupByCityAveragePatientAge() {
        // given: service and repository, no mock
        // when:
        Map<String, Double> result = service.groupByCityAveragePatientAgeInTheCity();
        // then:
        Assert.assertEquals(36.33, result.get("Warszawa"), 0.01);
        Assert.assertEquals(34.0, result.get("Krakow"), 0);
        Assert.assertEquals(31.0, result.get("Królestwo Konstaincina"), 0);
    }

    @Test
    public void shouldFindOldestPatientInWarsaw() {
        // given: service and repository, no mock
        String city = "Krakow";
        // when:
        Optional<Patient> result = service.patientWithHighestNumberOfVisitsInCity(city);
        // then:
        Assert.assertTrue(result.isPresent());
        Assert.assertSame("Anna", result.get().getName());
        Assert.assertSame("Kowalska", result.get().getSurname());
    }

    @Test
    public void shouldFindOldestPatientInZakopane() {
        // given: service and repository, no mock
        String city = "Zakopane";
        // when:
        Optional<Patient> result = service.patientWithHighestNumberOfVisitsInCity(city);
        // then:
        Assert.assertFalse(result.isPresent());
    }

    @Test
    public void shouldReturnOrderedPatientCityNames() {
        // given: service and repository, no mock
        // when:
        Set<String> result = service.allDistinctPatientCitiesOrdered();
        // then:
        Assert.assertEquals(new TreeSet<>(Arrays.asList("Krakow", "Królestwo Konstaincina", "Warszawa")), result);
    }

    @Test
    public void shouldGroupByAilmentsAveragePatientAge() {
        // given: service and repository, no mock
        // when:
        Map<String, Double> result = service.groupByAilmentsAverageAgeOfPatient();
        // then:
        Assert.assertEquals(30.44, result.get("Leczenie"), 0.01);
        Assert.assertEquals(34.57, result.get("Kontrola"), 0.01);
        Assert.assertEquals(35.75, result.get("Porada"), 0);
    }

    @Test
    public void shouldGroupSpecializationNumberOfDoctors() {
        // given: service and repository, no mock
        // when:
        Map<String, Long> result = service.groupBySpecializationNumberOfDoctors();
        // then:
        Assert.assertSame(1L, result.get("Ortopeda"));
        Assert.assertSame(1L, result.get("Patologia"));
        Assert.assertSame(1L, result.get("Ginekologia"));
        Assert.assertSame(2L, result.get("Psychiatria"));
        Assert.assertSame(4L, result.get("Kardiologia"));
    }

}
