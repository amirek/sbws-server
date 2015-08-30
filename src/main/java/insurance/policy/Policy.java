package insurance.policy;

import insurance.customer.Customer;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Policy {

    @Id
    @GeneratedValue
    private Long id;

    private Integer value;
    @Nonnull
    private Date startDate;
    @ManyToOne
    private Customer owner;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Nonnull
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(@Nonnull Date startDate) {
        this.startDate = startDate;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
