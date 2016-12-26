package com.asterdio.domain;

import javax.persistence.*;

/**
 * Created by Admin on 12/26/2016.
 */
@Entity
public class Poll {

    @GeneratedValue
    @Column(name = "POLL_ID")
    private long poll_id;
    @Column(name = "QUESTION")
    private String question;

    @OneToMany()
    @JoinColumn(name = "POLL_ID")
}
