package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrganizationSingleton {

    private List<Employee> empList;

    private static OrganizationSingleton orgSingleton;

    private OrganizationSingleton(){
        this.empList = new ArrayList<>();


    }
    public static OrganizationSingleton getInstance(){
        if(orgSingleton == null){
            return new OrganizationSingleton();
        } return orgSingleton;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
