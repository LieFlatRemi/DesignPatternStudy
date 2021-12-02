package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Request request1 = new Request(2000, 123);
        Request request2 = new Request(9999, 2333);
        Request request3 = new Request(20000, 888);

        DepartmentHandler departmentHandler = new DepartmentHandler("CS");
        CollegeHandler collegeHandler = new CollegeHandler("SE");
        MasterHandler masterHandler  = new MasterHandler("pipi");

        departmentHandler.setHandler(collegeHandler);
        collegeHandler.setHandler(masterHandler);

        departmentHandler.handleRequest(request1);
        departmentHandler.handleRequest(request2);
        departmentHandler.handleRequest(request3);
    }
}
