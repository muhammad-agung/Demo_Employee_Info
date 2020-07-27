package sg.edu.rp.c346.id18004536.demoemployeeinfo;

import androidx.annotation.NonNull;

public class Employee {

    private String name;
    private String position;
    private Double pay;


        public Employee(String name, String position, Double pay){
                this.name =name;
                this.position = position;
                this.pay = pay;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    @NonNull
    @Override
    public String toString() {

        return name +"/"+pay;
    }
}
