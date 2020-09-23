package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
       id = nextId;
       nextId++;
    }
    public Job(String name, Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String jobName;
        String jobEmployer;
        String jobLocation;
        String jobPosition;
        String jobCoreCompetency;

        // if job field is blank
        // set variable to equal "Data not available"
        // else set varriable to equal this.field.toString()

        if (this.name.equals("")){
            jobName="Data not available";
        } else { jobName = this.name;}

        if (this.employer.toString().equals("")){
            jobEmployer="Data not available";
        } else { jobEmployer = this.employer.toString();}

        if (this.location.toString().equals("")){
            jobLocation="Data not available";
        } else { jobLocation = this.location.toString();}

        if (this.positionType.toString().equals("")){
            jobPosition="Data not available";
        } else { jobPosition = this.positionType.toString();}

        if (this.coreCompetency.toString().equals("")){
            jobCoreCompetency="Data not available";
        } else { jobCoreCompetency = this.coreCompetency.toString();}

        return "\n"+ "ID: "+ this.getId() +
                "\n"+"Name: " + jobName +
                "\n"+"Employer: " + jobEmployer +
                "\n"+"Location: " + jobLocation +
                "\n"+"Position Type: " + jobPosition +
                "\n"+"Core Competency: " + jobCoreCompetency + "\n";
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
