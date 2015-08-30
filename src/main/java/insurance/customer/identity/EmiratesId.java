package insurance.customer.identity;

import javax.persistence.Embeddable;

@Embeddable
public class EmiratesId {
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
