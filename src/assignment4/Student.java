/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author jeppjleemoritzled
 */
public class Student
{

    private int studentId;
    private String name;
    private double grade;
    private double multiplier;

    /**
     * The constructor must create a new student object with default values for
     * the multiplier and grade. The grade the student has defaults to 0. The
     * multiplier is used to adjust the grade and it defaults to 1.06.
     *
     * @param studentId A unique number used to identify a student
     * @param name The name of the student

     */
    public Student(int studentId, String name)
    {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return the value of the instance field
     */
    public double getMultiplier()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * The setter for the multiplier must check that the value is either 
     * 1.08 * 1.06 or 1.08 or 1.06
     *
     * If not, then do not update the value
     *
     * @param multiplier
     * @return if the input was valid
     */
    public boolean setMultiplier(double multiplier)
    {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return the value of the grade multiplied by the set multiplier.
     */
    public double getGrade()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * The setter for grade, must check that it is a value between -3 *
     * multiplier and 12 * multiplier, both inclusive Do not set the value, if
     * outside of this range
     *
     * @param grade
     * @return if input was valid
     */
    public boolean setGrade(double grade)
    {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return the value of the instance field
     */
    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * The setter for name, must check that the name is valid. A name must hold
     * at least 2 words (seperated by space) A name must not be null or empty. A
     * name cannot have the following characters: .\/,()&%€#!$ Do not set the
     * value, if the name is not valid.
     *
     * @param name
     * @return if input was valid
     */
    public boolean setName(String name)
    {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @return the value of the instance field
     */
    public int getStudentId()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * The setter for studentId must check that it is larger than -1 Do not set
     * the value, if this is false.
     *
     * @param studentId
     * @return
     */
    public boolean setStudentId(int studentId)
    {
        throw new UnsupportedOperationException();
    }

}
