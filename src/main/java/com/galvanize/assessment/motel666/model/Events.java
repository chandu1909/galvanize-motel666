package com.galvanize.assessment.motel666.model;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.UUID;

@Entity
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String type;
    private BigInteger timeStamp;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(BigInteger timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Events(UUID id, String type, BigInteger timeStamp) {
        this.id = id;
        this.type = type;
        this.timeStamp = timeStamp;
    }
}
