package com.hendisantika.springbootrestswaggerexample.domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/3/17
 * Time: 6:38 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="job_id")
    private Long id;

    @NotNull
    @Column(name="job_name", nullable = false)
    private String jobName;

    @NotNull
    @Column(name="schedule", nullable = false)
    private String schedule;

    @Column(name="job_Family")
    private String jobFamily;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Set<Dependency> Deps;

    protected Person() {}

    public Person(Long id, String jobName, String jobFamily) {
        this.id = id;
        this.jobName = jobName;
        this.jobFamily = jobFamily;
    }

    public Person(String jobName, String jobFamily) {
        this.jobName = jobName;
        this.jobFamily = jobFamily;
    }

    public Long getId() {
        return id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobNameName(String jobName) {
        this.jobName = jobName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getJobFamily() {
        return jobFamily;
    }

    public void setJobFamily(String jobFamily) {
        this.jobFamily = jobFamily;
    }

    public Set<Dependency> getDeps() { return Deps; }

    public void setDeps(Set<Dependency> Deps) { this.Deps = Deps; }


    public void addDependency(Dependency dependency) {

        if (getDeps() == null) {
            setDeps(new HashSet<>());
        }
        getDeps().add(dependency);
    }

}
