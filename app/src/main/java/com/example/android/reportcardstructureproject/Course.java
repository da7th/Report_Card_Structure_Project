package com.example.android.reportcardstructureproject;

/**
 * Created by da7th on 7/2/2016.
 */
public class Course {

    /* The name of the course**/
    private String mCourseName;

    /* The course result for the first semester**/
    private String mSemOneGrade;

    /* The course result for the second semester**/
    private String mSemTwoGrade;

    /* Teacher's comment on the course grades**/
    private String mCourseComment;

    public Course(String mCourseName, String mSemOneGrade, String mSemTwoGrade, String mCourseComment) {
        mCourseName = courseName;
        mSemOneGrade = semOneGrade;
        mSemTwoGrade = semTwoGrade;
        mCourseComment = courseComment;
    }

    /**
     * get the name of the course
     **/
    public String getCourseName() {
        return mCourseName;
    }

    /**
     * get the course result for the first semester
     **/
    public String getSemOneGrade() {
        return mSemOneGrade;
    }

    /**
     * get course result for the second semester
     **/
    public String getSemTwoGrade() {
        return mSemTwoGrade;
    }

    /**
     * get Teacher's comment on the course grades
     **/
    public String getCourseComment() {
        return mCourseComment;
    }

    @Override
    public String toString() {
        return "Course{" +
                "mCourseName='" + mCourseName + '\'' +
                ", mSemOneGrade='" + mSemOneGrade + '\'' +
                ", mSemTwoGrade='" + mSemTwoGrade + '\'' +
                ", mCourseComment='" + mCourseComment + '\'' +
                '}';
    }
}
