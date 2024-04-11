package Fitness;

import java.time.LocalDate;

public class Abonement {
    private Visitor owner;
    private LocalDate registrationDate;
    private LocalDate expirationDate;

    public Abonement(Visitor owner, LocalDate registrationDate, LocalDate expirationDate) {
        this.owner = owner;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    public Visitor getOwner() {
        return owner;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}