package prog2.fingrp;

import java.io.Serializable;

public abstract class AbstractCourse implements Serializable {
    /**
     * Represents an abstract course with basic information.
     *
     * <p>
     * This class serves as a base class for specific course implementations.
     * It contains common attributes and methods shared by different types of courses.
     * Subclasses should extend this class to provide specific implementations
     * for different types of courses, such as math courses, science courses, etc.
     * </p>
     *
     * <p>
     * This class defines common attributes such as year, semester, course number,
     * course name, units, and grade, along with methods for accessing and modifying
     * these attributes. Additionally, it provides functionality to determine whether
     * a course is being taken, selected, or can be taken.
     * </p>
     */
    protected byte year;
    protected byte semester;
    protected String courseNo;
    protected String courseName;
    protected  float grade;

    protected float unit1;

    protected  float  unit2 = 0;
    protected boolean selected;

    protected boolean taking;
    protected boolean canBeTaken;

    /**
     * Constructs an abstract course with the specified parameters.
     *
     * @param year      The year when the course is taken.
     * @param semester  The semester when the course is taken.
     * @param courseNo  The course number.
     * @param courseName    The name of the course.
     * @param unit     The unit of the course.
     * @param grade     The grade achieved in the course.
     * @param taking    Indicates whether the course is being taken currently.
     */

    public AbstractCourse(byte year, byte semester, String courseNo, String courseName, float unit, float grade, boolean taking) {

        this.year = year;
        this.semester = semester;
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.unit1 = unit;
        this.grade = grade;
        this.taking = taking;
    }
    /**
     * Constructs an abstract course with the specified parameters.
     *
     * @param year          The year when the course is taken.
     * @param semester      The semester when the course is taken.
     * @param courseNo      The course number.
     * @param courseName    The name of the course.
     * @param unit1         The first unit of the course.
     * @param unit2         The second unit of the course.
     * @param selected      Indicates whether the course is selected.
     * @param canBeTaken    Indicates whether the course can be taken.
     */
    public AbstractCourse(byte year, byte semester, String courseNo, String courseName, float unit1, float unit2, boolean selected, boolean canBeTaken ) {

        this.year = year;
        this.semester = semester;
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.selected = selected;
        this.canBeTaken = canBeTaken;



    }

// setters and getters

    /**
     * sets the year of the course
     * @param year year of the course
     */
    public void setYear(byte year) {
    this.year = year;
}

    /**
     * sets the semester of the course
     * @param semester gets the term of the course
     */
    public void setSemester(byte semester) {
        this.semester = semester;
    }

    /**
     * sets the course number of the course
     * @param courseNo number of the course
     */
    public void setCourseNo(String courseNo) {
    this.courseNo = courseNo;
}

    /**
     * sets the course name of the course
     * @param courseName name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * sets the unit of the course
     * @param unit units of the course
     */
    public void setUnit1(byte unit) {
        this.unit1 = unit;
    }

    /**
     * gets the grade of the course
     * @param grade grade in the course
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * sets if the course is being taken
     * @param taking if course is being taken
     */
    public void setTaking(boolean taking) {
        this.taking = taking;
    }
    // Getter methods

    /**
     * gets the course number of the course
     * @return courseNo
     */
    public String getCourseNo() {
        return courseNo;
    }

    /**
     * gets the name of the course
     * @return courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * gets the units in the course
     * @return unit1
     */
    public float getUnit() {
        return unit1;
    }

    /**
     * gets the grade in the course
     * @return grade
     */

    public float getGrade() {
        return grade;
    }

    /**
     * gets the status of taking
     * @return taking
     */
    public boolean isTaking() {
        return taking;
    }

    /**
     * gets the year of the course
     * @return year
     */

    public byte getYear() {
        return year;
    }

    /**
     * gets the semester of the course
     * @return semester
     */
    public byte getSemester() {
        return semester;
    }

}