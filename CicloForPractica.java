
package ciclo.forpractica;

import javax.swing.JOptionPane;

public class CicloForPractica {
    public static void main(String[] args) {
      byte Edad=1;
      
          Edad=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu edad porfavor"));
          if (Edad<=5) {
            System.out.println("Eres un bebe,tienes"+Edad+"años");
            
        }
          else if (Edad>=6&&Edad<=12) {
            System.out.println("Eres un niño ya que tienes"+Edad+"años");
        }
          else if (Edad>=13&&Edad<=18) {
            System.out.println("Estas en la adolecencia ya que tienes"+Edad+"años");
        }
          else if (Edad>=19&&Edad<=30) {
            System.out.println("Aun eres joven ya que tienes"+Edad+"años");
        }
          else if(Edad>=31&&Edad<=45){
              System.out.println("Ya eres un adulto tienes"+Edad+"años");
          }
         else  if (Edad<=90) {
                  System.out.println("Ya eres muy viejo");
              }
          
          
  
          
         
    }
    }
