/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eoop1;



public class Eoop1 {

    public static void main(String[] args) {
        Product product1 = new Product();
       product1.setName("delongi kahve makinesi");
       product1.setDicount(7);
       product1.setUnitPrice(7500);
       product1.setUnitsInStock(6);
       product1.setImageUrls("image1.jpg");
       
        Product product2 = new Product();
        product2.setName("smeg kahve makinesi");
       product2.setDicount(4);
       product2.setUnitPrice(6500);
       product2.setUnitsInStock(5);
       product2.setImageUrls("image2.jpg");

        Product product3 = new Product();
        product3.setName("kitchen kahve makinesi");
       product3.setDicount(3);
       product3.setUnitPrice(4500);
       product3.setUnitsInStock(2);
       product3.setImageUrls("image3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");

        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "<li>");
            System.out.println(product.getDicount());
            System.out.println(product.getImageUrls());
            System.out.println(product.getUnitsInStock());
        }
        System.out.println("</ul>");
        IndividualCustomer individualCustomer= new IndividualCustomer() ;
        individualCustomer.setId(1);
        individualCustomer.setPhone("161861616");
        individualCustomer.setName("selami");
        individualCustomer.setSoyisim("kanca");
        CorporateCustomer corporatCustomer =new CorporateCustomer();
        corporatCustomer.setId(2);
        corporatCustomer.setCustomerNummer("cotlamadabugun");
        corporatCustomer.setPhone("124112414");
        
        Customer[] customers={individualCustomer,corporatCustomer};
      
        
        
        
        
        
        
        

    }

}
