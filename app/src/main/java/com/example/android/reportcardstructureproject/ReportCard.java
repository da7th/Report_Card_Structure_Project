package com.example.android.reportcardstructureproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by da7th on 7/2/2016.
 */
public class ReportCard extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_layout);

        // Create a list of courses
        ArrayList<Course> courses = new ArrayList<Course>();

        // Add a new course with the input parameters (Subject,sem1 grade, sem2 grade, teacher's comment)
        courses.add(new Course("Chemistry","C","A","Great improvement in the last semester, keep it up"));
        courses.add(new Course("Physics","A","A","Great improvement in the last semester, keep it up"));
        courses.add(new Course("Biology","B","A","Great improvement in the last semester, keep it up"));
        courses.add(new Course("Mathematics","B","A","Great improvement in the last semester, keep it up"));
        courses.add(new Course("English","C","B","Great improvement in the last semester, keep it up"));
        courses.add(new Course("Spanish","A","A","Great improvement in the last semester, keep it up"));
        courses.add(new Course("IT","A","B","Great improvement in the last semester, keep it up"));
        courses.add(new Course("Art","C","A","Great improvement in the last semester, keep it up"));

        // Custom Course adapter to work with our new object type (Course).
        CourseAdapter adapter = new CourseAdapter(this, courses);

        // create a listview based on @list
        ListView listView = (ListView) findViewById(R.id.list);

        // Append the listview with above created adapter
        listView.setAdapter(adapter);
    }
}