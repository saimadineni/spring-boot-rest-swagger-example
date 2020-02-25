package com.hendisantika.springbootrestswaggerexample.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Dependency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    @NotNull
    private String job_name;

    public Dependency() {
    }

    public Dependency(String job_name) {

        this.job_name = job_name;
    }

    public Long getId() {
        return id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

}
