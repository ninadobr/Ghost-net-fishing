package com.example.ghostnet;

import javax.persistence.*;

@Entity
public class GhostNet {

    @Id
    @GeneratedValue
    private Long id;

    private String location;
    private String size;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Person reportingPerson;

    @ManyToOne
    private Person salvagingPerson;

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getReportingPerson() {
        return reportingPerson;
    }

    public void setReportingPerson(Person reportingPerson) {
        this.reportingPerson = reportingPerson;
    }

    public Person getSalvagingPerson() {
        return salvagingPerson;
    }

    public void setSalvagingPerson(Person salvagingPerson) {
        this.salvagingPerson = salvagingPerson;
    }
}
