/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstrachtsoyutsinif;

/**
 *
 * @author selami
 */
public class Abstrachtsoyutsinif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //soyut siniflardan obje olusturulmuyor asagidaki gibi.
   // hayvanlar hayvan1=new hayvanlar();    
//aslan sinifi kurup extend edildiktensonra yenibir atama simdik yapilablir.
 //  hayvanlar aslan =new aslan();
 aslan aslan=new aslan();
 //asagida kedigiller cinsinden eleman tanim yapabilmemiz icin ower ride yapmaliyiz burada tanim yapabiliyoruz.
kedigiller leopar;
        leopar = new kedigiller() {
            @Override
            public void hareketet() {
                
            }
            aslan aslan2=new aslan();
            //burada aslan2 elemanini tamimlamak icin owerride aslan sinifi icinde owerride edilmeli.
        };

 aslan.isim="lion";
  aslan.yas=6;
  aslan.renk="yesil";
   System.out.println(aslan.isim+" li hayvan  "+aslan.yas+" yasindadir.");
   //aslan tipindeki ogenin renk ozelligine erisemiyoruz cunku hayvanlar genel yapinin catisi erisebilmemiz icin+
   //hayvanlar aslan diye degil aslan sinifi icinde aslan elemani olusturmaliyiz asagidaki gibi
   // aslan aslan= new aslan(); artik aslan.renk ozelligine deger atayip cagirabiliriz ama yukaridaki ilk hali ile renk ozelligine erismeiyoruz.
aslan.hareketet();

    }
    
}
