/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfizm;

/**
 *
 * @author selami
 * 
 */
class Hayvan{

public void sescikar(){

    System.out.println("hayvan ses cikardi");
}      
}
class Aslan extends Hayvan{
@Override
public void sescikar(){

    System.out.println("aslan kukredi ");
}

}
class kedi extends Hayvan{
@Override
public void sescikar(){
    System.out.println("kedi miyavladi");
}


}



public class Polimorfizm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aslan aslan=new Aslan();
        aslan.sescikar();
       kedi kedi1=new kedi();
       kedi1.sescikar();
    }
    
}
