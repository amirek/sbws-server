package insurance.customer;

import insurance.customer.identity.EmiratesId;
import insurance.policy.Policy;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Embedded
    private EmiratesId eid;
    @OneToMany(mappedBy = "owner")
    private List<Policy> policies;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmiratesId getEid() {
        return eid;
    }

    public void setEid(EmiratesId eid) {
        this.eid = eid;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
