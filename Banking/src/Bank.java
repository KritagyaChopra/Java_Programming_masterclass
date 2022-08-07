import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches ;

    public Bank(String name) {
        this.name = name;
        this.branches  = new ArrayList<>();
    }

    public boolean addBranch(String name){

        if(findBranch(name) != null){
    //        System.out.println("Already there a branch by name " + name);
            return false;
        }
        branches.add(new Branch(name));
     //   System.out.println(" Branch added : "+ name);
        return true;
    }

    public boolean addCustomer(String nameBranch , String nameCustomer , double transaction) {
        Branch branch = findBranch(nameBranch);
        if (branch == null) {
    //        System.out.println("No branch there");
            return false;
        }
        return branch.newCustomer(nameCustomer ,transaction);
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < this.branches.size() ; i++) {
            Branch checkedBranch = this.branches.get(i);
            if(Objects.equals(checkedBranch.getName(), branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public  boolean addCustomerTransaction(String nameBranch , String nameCustomer , double transaction ){
        Branch branch = findBranch(nameBranch);
        if(branch == null){
            System.out.println("No branch there");
            return false;
        }
        return  branch.addCustomerTransaction(nameCustomer,transaction);
    }



}
