package rocks.zipcode.assessment2.objectorientation;

import java.math.BigInteger;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private long id;
    private BigInteger deid;
    private String name;
    private Address address;

    public Person(Long id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
    }

    public Person() {
      this (Long.MIN_VALUE,"",new Address());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
       this.id = id;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
    this.address= address;}

    @Override
    public boolean equals(Object o) {
        Person oTest = new Person();
        Person person = (Person) o;
        if (o == oTest) {
            return true;
        } else if (
                id == person.getId() &&
                name.equals(person.getName()) &&
                address.equals(person.getAddress())) {
            return true;
        }
         else
        return false;
    }

}