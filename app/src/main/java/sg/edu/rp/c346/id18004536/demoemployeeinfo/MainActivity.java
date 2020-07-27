package sg.edu.rp.c346.id18004536.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView listViewEmployee;

    ArrayList<Employee> arrayList;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewEmployee = findViewById(R.id.listViewEmployee);

        arrayList = new ArrayList<>();

        Employee emp = new Employee("john","Software technical leader",12.0);

        arrayList.add(emp);

        adapter = new CustomAdapter(this, R.layout.row, arrayList);

        listViewEmployee.setAdapter(adapter);

    }
}
