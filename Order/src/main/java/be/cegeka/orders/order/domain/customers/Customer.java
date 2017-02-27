package be.cegeka.orders.order.domain.customers;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "STREET")
    private String street;
    @Column(name = "HOUSENUMBER")
    private String housenumber;
    @Column (name = "POSTAL_CODE")
    private int postalcode;
    @Column (name = "CITY")
    private String city;
    @Column (name = "PHONENUMBER")
    private String phonenumber;
    @Column (name = "EMAIL")
    private String email;


    private Customer() {
    }

    public Customer( String name, String lastName, String email, String street, String housenumber, int postalcode, String city, String phonenumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.street = street;
        this.housenumber = housenumber;
        this.postalcode = postalcode;
        this.city = city;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public int getPostalcode() {
        return postalcode;
    }

    public String getCity() {
        return city;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (postalcode != customer.postalcode) return false;
        if (!name.equals(customer.name)) return false;
        if (!lastName.equals(customer.lastName)) return false;
        if (!street.equals(customer.street)) return false;
        if (!housenumber.equals(customer.housenumber)) return false;
        if (!city.equals(customer.city)) return false;
        if (!phonenumber.equals(customer.phonenumber)) return false;
        return email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + housenumber.hashCode();
        result = 31 * result + postalcode;
        result = 31 * result + city.hashCode();
        result = 31 * result + phonenumber.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
