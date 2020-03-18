/*********************************
 * @author Mufadhal Faraz Addhifa*
 *********************************/
package College;

//deklarasi isi sebuah enum
enum Level {
  AKU,
  KAMU,
  DIA
  }

public class belajar_enums {


    public static void main(String[] args) {
    //pemilihan untuk switch    
    Level myVar = Level.DIA;

    //switch method
    switch(myVar) {
      case AKU:
        System.out.println("AKU ?");
        break;
      case KAMU:
         System.out.println("KAMU ?");
        break;
      case DIA:
        System.out.println("DIA ?");
        break;
    }
  }
}
