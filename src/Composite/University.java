package Composite;

import java.util.ArrayList;
import java.util.List;

//University相当于 Composite，可以管理College
public class University extends OrganizationComponent {
    List<OrganizationComponent> ocs;        //List中存放College

    public University(String name, String des) {
        super(name, des);
        ocs = new ArrayList<>();
    }

    @Override
    public void add(OrganizationComponent oc) {
        ocs.add(oc);
    }

    @Override
    public void remove(OrganizationComponent oc) {
        ocs.remove(oc);
    }

    @Override
    public void print() {
        System.out.println("---------------University：" + getName() + "-------------------");
        for(OrganizationComponent oc : ocs){
            oc.print();
        }
    }
}
