package tuan4;

public class TestDivers {
    public static void main(String[] args) {
        Account account;
    
        account= new Account(2008110255,500000);
        account.showData();
        account.deposit(500000);
        account.showData();
        account.withdraw(100000);
        account.showData();

        customer customer;
        customer=new customer();

       customer.getName();
       customer.getAddress();
       customer.showCustomer();


        Employee employee;
        employee = new Employee();
        employee.getName();
        employee.getSalary();
    }

}
