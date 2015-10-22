package com.example.course.helloworlds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.course.hello.Dog;
import com.example.course.hello.Employee;
import com.example.course.hello.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("Hellow World");

        Person person = new Person("Petre", "Petkovski");
        person.setAge(20);
        person.setMydog(new Dog("SHARKO"));

        System.out.println(person.getMydog().getName());

        Employee employee = new Employee("Dejan", "Stolevski", "Android", 25000);
        System.out.println(employee.getDepartment());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());


        System.out.println(employee.getAge());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
