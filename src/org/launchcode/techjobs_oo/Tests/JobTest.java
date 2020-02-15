package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    //    @Before
    public JobTest() {



    }

    //Testing the Constructor is setting each job a unique id
    @Test
    public void testSettingJobId() {
        Job jobs1 = new Job();
        Job jobs2 = new Job();
        assertEquals(1, (jobs2.getId()) - (jobs1.getId()), .001);
    }

    //Testing the Constructor is correctly assigning class and value of each field
    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobs3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", jobs3.getName());
        assertEquals("ACME", jobs3.getEmployer().getValue());
        assertEquals("Desert", jobs3.getLocation().getValue());
        assertEquals("Quality control", jobs3.getPositionType().getValue());
        assertEquals("Persistence", jobs3.getCoreCompetency().getValue());
    }

    //Testing jobs for Equality
    @Test
    public void testJobsForEquality(){
        Job jobs4 = new Job();
        Job jobs5 = new Job();
        assertFalse(jobs4.equals(jobs5));
    }

    //Testing for toString method
    @Test
    public void testToStringFormat(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: 6\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", testJob1.toString());
    }







}







//    @Test
//    public void testSettingJobId() {
//        Job jobs1 = new Job();
//        Job jobs2 = new Job();
//        assertEquals(jobs1,jobs2);
//        assertFalse(jobs1.equals(jobs2));
//            assertTrue((jobs1.getId()) < (jobs2.getId()));
//    }
