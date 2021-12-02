package Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> ocs;        //List中存放Department

    public College(String name, String des) {
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
        System.out.println("---------------College：" + getName() + "-------------------");
        for (OrganizationComponent oc : ocs) {
            oc.print();
        }
    }
}
