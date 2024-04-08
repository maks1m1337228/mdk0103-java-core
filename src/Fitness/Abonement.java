package Fitness;

import java.time.LocalDate;
import java.util.Date;

public class Abonement {
    private Visitor owner;
    private Date registrationDate;
    private Date expirationDate;

    public Abonement(Visitor owner, Date registrationDate, Date expirationDate) {
        this.owner = owner;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    public Visitor getOwner() {
        return owner;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
