import java.util.ArrayList;
import java.util.Objects;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name,double amount){

        if(findCustomer(name)  != null){
    //        System.out.println("Already present Customer"+ name);
            return false;
        }
        customers.add(new Customer(name , amount));
  //      System.out.println(name + " customer added");
        return true;
    }

    public boolean addCustomerTransaction(String name , double transaction){
        Customer customer = findCustomer(name);
        if(customer==null){
    //        System.out.println("Customer not present  :" + name);
            return false;
        }
        customer.addTransaction(transaction);
    //    System.out.println("transaction added : " + transaction);
        return true;
    }

    private   Customer findCustomer(String name ){
        for (int i = 0; i < this.customers.size() ; i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(Objects.equals(checkedCustomer.getName(), name)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
