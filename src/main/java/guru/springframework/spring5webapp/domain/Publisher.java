package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long Id;

private String addressline1;
private String city;
private String state;
private String zip;

//One Publisher has many Books
@OneToMany
@JoinColumn(name = "publisher_id")
private Set<Book> books = new HashSet<>();

public Publisher() {
}


public Publisher(String addressline1, String city, String state, String zip) {
    this.addressline1 = addressline1;
    this.city = city;
    this.state = state;
    this.zip = zip;
}


public Long getId() {
    return Id;
}
public void setId(Long id) {
    Id = id;
}
public String getAddressline1() {
    return addressline1;
}
public void setAddressline1(String addressline1) {
    this.addressline1 = addressline1;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public String getState() {
    return state;
}
public void setState(String state) {
    this.state = state;
}
public String getZip() {
    return zip;
}
public void setZip(String zip) {
    this.zip = zip;
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Id == null) ? 0 : Id.hashCode());
    return result;
}


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Publisher other = (Publisher) obj;
    if (Id == null) {
        if (other.Id != null)
            return false;
    } else if (!Id.equals(other.Id))
        return false;
    return true;
}


@Override
public String toString() {
    return "Publisher [Id=" + Id + ", addressline1=" + addressline1 + ", city=" + city + ", state=" + state + ", zip="
            + zip + "]";
}


public Set<Book> getBooks() {
    return books;
}


public void setBooks(Set<Book> books) {
    this.books = books;
}
    

}
