package  com.example.czi_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import com.example.czi_list.listViewClasses.SH;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static int animationItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        SH testingScav1 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav2 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");
        SH testingScav3 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav4 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");
        SH testingScav5 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav6 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");
        SH testingScav7 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav8 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");
        SH testingScav9 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav10 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");
        SH testingScav11 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");

        SH testingScav12 = new SH("THIS", "TEST ", "TITLE IS WORKING", "SCAVENGER");


        /*
        //Create the Person objects
        Person john = new Person("John","12-20-1998","Male");
        Person steve = new Person("Steve","08-03-1987","Male");
        Person stacy = new Person("Stacy","11-15-2000","Female");
        Person ashley = new Person("Ashley","07-02-1999","Female");
        Person matt = new Person("Matt","03-29-2001","Male");
        Person matt2 = new Person("Matt2","03-29-2001","Male");
        Person matt3 = new Person("Matt3","03-29-2001","Male");
        Person matt4 = new Person("Matt4","03-29-2001","Male");
        Person matt5 = new Person("Matt5","03-29-2001","Male");
        Person matt6 = new Person("Matt6","03-29-2001","Male");
        Person matt7 = new Person("Matt7","03-29-2001","Male");
        Person matt8 = new Person("Matt8","03-29-2001","Male");
        Person matt9 = new Person("Matt9","03-29-2001","Male");
        Person matt10 = new Person("Matt10","03-29-2001","Male");
        Person matt11 = new Person("Matt11","03-29-2001","Male");
        /*/
        //Add the Person objects to an ArrayList
        ArrayList<SH> peopleList = new ArrayList<>();
        peopleList.add(testingScav1);
        peopleList.add(testingScav2);
        peopleList.add(testingScav3);
        peopleList.add(testingScav4);
        peopleList.add(testingScav5);
        peopleList.add(testingScav6);
        peopleList.add(testingScav7);
        peopleList.add(testingScav8);
        peopleList.add(testingScav9);
        peopleList.add(testingScav10);
        peopleList.add(testingScav11);
        peopleList.add(testingScav12);


        /*
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
        peopleList.add(matt11);
        */

        scavHuntAdapter adapter = new scavHuntAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);


    }

}
