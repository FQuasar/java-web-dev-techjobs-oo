package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job testJobX;
    private Job testJobY;

    @Before
    public void createJobObject(){
        testJobX = new Job();
        testJobY = new Job();
    }
    @Test
    public void testSettingJobId(){
      assertEquals(1,testJobY.getId() - testJobX.getId(),.01);
    }

    @Test
   public void testJobConstructorSetsAllFields(){
        //setup
        String jobNameValue = "Product test";
        Employer testEmployerValue = new Employer("ACME");
        Location testLocationValue = new Location("Desert");
        PositionType testPositionValue = new PositionType("Quality control");
        CoreCompetency testCoreCompetencyValue = new CoreCompetency("Persistence");
        //execute
       Job testJob = new Job(jobNameValue,testEmployerValue,testLocationValue,testPositionValue,testCoreCompetencyValue );
        //assert
        //make assertions about test result
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(), jobNameValue);
        assertEquals(testJob.getEmployer(),testEmployerValue);
        assertEquals(testJob.getLocation(),testLocationValue);
        assertEquals(testJob.getPositionType(),testPositionValue);
        assertEquals(testJob.getCoreCompetency(),testCoreCompetencyValue);
    }
    @Test
    public void testJobsForEquality(){

        String jobNameValue = "Product test";
        Employer testEmployerValue = new Employer("ACME");
        Location testLocationValue = new Location("Desert");
        PositionType testPositionValue = new PositionType("Quality control");
        CoreCompetency testCoreCompetencyValue = new CoreCompetency("Persistence");

//        testJobX.setName(jobNameValue);
//        testJobX.setEmployer(testEmployerValue);
//        testJobX.setLocation(testLocationValue);
        testJobX = new Job(jobNameValue, testEmployerValue, testLocationValue, testPositionValue, testCoreCompetencyValue);
        testJobY = new Job(jobNameValue, testEmployerValue, testLocationValue, testPositionValue, testCoreCompetencyValue);

        assertFalse(testJobX.equals(testJobY));
    }

}
