package pl.kurs.edge1s.functional.repository;

import pl.kurs.edge1s.functional.model.Doctor;
import pl.kurs.edge1s.functional.model.Patient;
import pl.kurs.edge1s.functional.model.Visit;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class VisitRepository {
    private List<Visit> visits;

    public VisitRepository() {
        Patient p1 = new Patient("Jan", "Kowalski", 30, "Krakow");
        Patient p2 = new Patient("Anna", "Kowalska", 32, "Krakow");
        Patient p3 = new Patient("Marek", "Szczepanski", 28, "Warszawa");
        Patient p4 = new Patient("Sylwia", "Piekarska", 40, "Krakow");
        Patient p5 = new Patient("Katarzyna", "Nowak", 56, "Warszawa");
        Patient p6 = new Patient("Franek", "Jozef", 25, "Warszawa");
        Patient p7 = new Patient("Bartek", "Frączek", 31, "Królestwo Konstaincina");

        Doctor md1 = new Doctor("Genowefa", "Sercowa", 60, "Warszawa", "Kardiologia");
        Doctor md2 = new Doctor("Stefan", "Cipny", 55, "Krakow", "Ginekologia");
        Doctor md3 = new Doctor("Zenon", "Umierający", 45, "Warszawa", "Patologia");
        Doctor md4 = new Doctor("Mirosław", "Psycho", 30, "Krakow", "Psychiatria");
        Doctor md5 = new Doctor("Angelika", "Lubiloda", 25, "Królestwo Konstaincina", "Kardiologia");
        Doctor md6 = new Doctor("Judyna", "Jupiter", 45, "Warszawa", "Kardiologia");
        Doctor md7 = new Doctor("Kazimierz", "Jupiter", 50, "Krakow", "Psychiatria");
        Doctor md8 = new Doctor("Rudolf", "Jupiter", 29, "Warszawa", "Kardiologia");
        Doctor md9 = new Doctor("Marlena", "Jupiter", 32, "Warszawa", "Ortopeda");

        this.visits = Arrays.asList(//
                new Visit(p1, md1, date(2017, 06, 01, 13, 00), "Kontrola"), //
                new Visit(p2, md1, date(2017, 05, 02, 13, 00), "Leczenie"), //
                new Visit(p3, md1, date(2017, 04, 03, 13, 00), "Porada"), //
                new Visit(p4, md1, date(2017, 03, 04, 13, 00), "Kontrola"), //
                new Visit(p5, md1, date(2017, 02, 05, 13, 00), "Kontrola"), //
                new Visit(p6, md1, date(2017, 06, 06, 13, 00), "Kontrola"), //
                new Visit(p7, md1, date(2017, 06, 07, 13, 00), "Kontrola"), //
                new Visit(p1, md2, date(2017, 06, 8, 13, 00), "Kontrola"), //
                new Visit(p2, md1, date(2017, 06, 9, 13, 00), "Leczenie"), //
                new Visit(p2, md2, date(2017, 04, 1, 13, 00), "Kontrola"), //
                new Visit(p3, md2, date(2017, 12, 2, 13, 00), "Porada"), //
                new Visit(p3, md2, date(2017, 12, 1, 13, 00), "Kontrola"), //
                new Visit(p3, md2, date(2017, 12, 1, 13, 00), "Leczenie"), //
                new Visit(p4, md3, date(2017, 12, 1, 13, 00), "Kontrola"), //
                new Visit(p4, md3, date(2017, 11, 1, 13, 00), "Leczenie"), //
                new Visit(p5, md3, date(2017, 10, 11, 13, 00), "Kontrola"), //
                new Visit(p5, md3, date(2017, 06, 21, 13, 00), "Kontrola"), //
                new Visit(p6, md3, date(2017, 06, 21, 13, 00), "Kontrola"), //
                new Visit(p7, md4, date(2017, 06, 21, 13, 00), "Porada"), //
                new Visit(p7, md5, date(2017, 06, 11, 13, 00), "Kontrola"), //
                new Visit(p1, md4, date(2017, 10, 11, 13, 00), "Leczenie"), //
                new Visit(p2, md5, date(2017, 07, 21, 13, 00), "Kontrola"), //
                new Visit(p3, md4, date(2017, 02, 11, 13, 00), "Kontrola"), //
                new Visit(p6, md5, date(2017, 03, 11, 13, 00), "Leczenie"), //
                new Visit(p7, md4, date(2017, 04, 21, 13, 00), "Kontrola"), //
                new Visit(p4, md6, date(2017, 8, 01, 13, 00), "Kontrola"), //
                new Visit(p3, md6, date(2017, 06, 01, 13, 00), "Leczenie"), //
                new Visit(p3, md6, date(2017, 06, 01, 14, 00), "Kontrola"), //
                new Visit(p2, md7, date(2017, 06, 01, 15, 00), "Kontrola"), //
                new Visit(p3, md7, date(2017, 06, 01, 16, 00), "Leczenie"), //
                new Visit(p1, md8, date(2017, 06, 01, 17, 00), "Kontrola"), //
                new Visit(p7, md8, date(2017, 06, 01, 18, 00), "Leczenie"), //
                new Visit(p6, md9, date(2017, 06, 01, 19, 00), "Kontrola"), //
                new Visit(p5, md9, date(2017, 06, 01, 13, 00), "Porada")//
        );//

    }

    private static Date date(int year, int month, int day, int hour, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hour, minute);
        return cal.getTime();
    }

    public List<Visit> getVisits() {
        return visits;
    }
}
