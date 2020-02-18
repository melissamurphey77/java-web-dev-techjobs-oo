package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    private static Job jobs1;
    private static Job jobs2;
    private static Job testJob1;
    private static Job testJob2;
    private static Job testJob3;
    private static Job testEmptyJob;

    @BeforeClass
    public static void  createJobObjects() {
        jobs1 = new Job ();
        jobs2 = new Job ();;
        testJob1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        testJob3 = new Job("Product Tester", new Employer(""), new Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        testEmptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));



    }

    //Testing the Constructor is setting each job a unique id
    @Test
    public void testSettingJobId() {
      assertEquals(1, (jobs2.getId()) - (jobs1.getId()), .001);
    }

    //Testing the Constructor is correctly assigning class and value of each field
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product Tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().getValue());
        assertEquals("Desert", testJob1.getLocation().getValue());
        assertEquals("Quality Control", testJob1.getPositionType().getValue());
        assertEquals("Persistence",testJob1.getCoreCompetency().getValue());
    }

    //Testing jobs for Equality
    @Test
    public void testJobsForEquality(){
        assertFalse(testJob1.equals(testJob2));
    }

    //Testing for toString method starts and ends with blank line
    @Test
    public void testToStringFormat(){
       assertTrue(testJob1.toString().startsWith("\n")&& testJob1.toString().endsWith("\n"));

    }

    //Testing for toString Job has label and data
    @Test
    public void testForJobFormat(){
       assertEquals((testJob1.toString()) , ("\nID: 3\nName: Product Tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n") );

    }

    //Testing for toString if Job has empty data field
    @Test
    public void testJobEmptyData(){
        assertEquals((testJob3.toString()) , ("\nID: 5\nName: Product Tester\nEmployer: Data Not Available\nLocation: Data Not Available\nPosition Type: Quality Control\nCore Competency: Persistence\n") );

    }

    //Testing for toString if Job has id only
    @Test
    public void testJobIdOnly(){
        if((testEmptyJob.toString()) == ("\nID: 6\nName: Data Not Available\nEmployer: Data Not Available\nLocation: Data Not Available\nPosition Type: Data Not Available\nCore Competency: Data Not Available\n") ){
            System.out.println("OOPS! This job does not seem to exist.");
        };
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
