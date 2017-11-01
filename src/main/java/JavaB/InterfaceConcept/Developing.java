package JavaB.InterfaceConcept;

/**
 * Created by Marius on 01-Nov-17.
 */
public class Developing implements Bankingclient,Domainclient {
    //now thic class is responsible to omplement ALL THE METHODS of Bankingclient

    public static void main(String[] args) {
        Developing d = new Developing();
        d.checkingbalance();
        d.transferbalance();
        d.paycreditcard();
        d.login();
        Bankingclient dr=new Developing(); //Run time polymorph
        //dr.login();
       Domainclient ds= new Developing();
       ds.investment();

    }

    public void paycreditcard() {
        System.out.println("paycreditcard implemented");

    }

    public void transferbalance() {
        System.out.println("transferbalance implemented");
    }

    public void checkingbalance() {
        System.out.println("checkingbalance implemented");
    }
    public void login()
    {
        System.out.println("logged");
    }

    public void investment() {
        System.out.println("investing something");
    }
}
