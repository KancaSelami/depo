
package einterface;


public class EInterface {

   
    public static void main(String[] args) {
        ICustomerDal iCustomerDal=new OracleCustomerDal();
        iCustomerDal.add();
    }
    
}
