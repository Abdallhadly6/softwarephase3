
package User;

public class NormalUser extends User {

  public void upgrade(String creditCardnum ) {
      System.out.println("If You Need To Be A premium User");
      System.out.println("You Need To pay 99$ For A year");
     
      if(prem){
          System.out.println("You aleardy primium User");
      }
      else{
          if(checkcredit(creditCardnum) && card.credit >= 99) {
              System.out.println("You Now primium User");
              prem = true;
          }
          else{
              System.out.println("Not Valid Credit Card");
          }
      } 
    }
}