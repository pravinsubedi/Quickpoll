package com.asterdio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Admin on 12/26/2016.
 */

@Entity
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "COLUMN_ID")
    private Long id;
    @Column(name = "OPTIONg_VALUE")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Option() {
    }

    public Option(String value) {
        this.value = value;
    }
}
