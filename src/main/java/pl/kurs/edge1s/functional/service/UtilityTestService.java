package pl.kurs.edge1s.functional.service;

import pl.kurs.edge1s.functional.model.Doctor;
import pl.kurs.edge1s.functional.model.Patient;
import pl.kurs.edge1s.functional.repository.VisitRepository;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class UtilityTestService {
    private final VisitRepository visitRepository;

    public UtilityTestService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public Optional<Patient> patientWithGreatestNumberOfVisits() {
        throw new IllegalStateException("Implement me!");
    }

    public Optional<Doctor> doctorWithGreatestNumberOfVisits() {
        throw new IllegalStateException("Implement me!");
    }

    public Map<String, Long> groupBySpecVisitsNumber() {
        throw new IllegalStateException("Implement me!");
    }

    public Map<String, Long> groupByCityNumberOfPatients() {
        throw new IllegalStateException("Implement me!");
    }

    public Map<String, Double> groupByCityAveragePatientAgeInTheCity() {
        throw new IllegalStateException("Implement me!");
    }

    public Optional<Patient> patientWithHighestNumberOfVisitsInCity(String city) {
        throw new IllegalStateException("Implement me!");
    }

    public Set<String> allDistinctPatientCitiesOrdered() {
        throw new IllegalStateException("Implement me!");
    }

    public Map<String, Double> groupByAilmentsAverageAgeOfPatient() {
        throw new IllegalStateException("Implement me!");
    }

    public Map<String, Long> groupBySpecializationNumberOfDoctors() {
        throw new IllegalStateException("Implement me!");
    }

}
