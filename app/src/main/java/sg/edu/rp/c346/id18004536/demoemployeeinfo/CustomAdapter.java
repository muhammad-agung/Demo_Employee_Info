package sg.edu.rp.c346.id18004536.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Employee> employeeList;


    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object\\//layout inflater shows XML file
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvPosition = rowView.findViewById(R.id.TvPosition);
        TextView tvPay = rowView.findViewById(R.id.tvPay);

        // Obtain the Android Version information based on the position
        Employee currentEmployee = employeeList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentEmployee.getName());
        tvPosition.setText(currentEmployee.getPosition());
        tvPay.setText(currentEmployee.getPay().toString());


        return rowView;
    }

}