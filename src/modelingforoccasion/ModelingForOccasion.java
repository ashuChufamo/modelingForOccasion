package modelingforoccasion;

import modelingforoccasion.Boutique.Occasion;

public class ModelingForOccasion {
    public static void main(String[] args) 
    {
        Boutique boutique1= new Boutique();
        boutique1.setOccasion(Occasion.summer);
        boutique1.createModel();
        model ronaldoAtSummer=boutique1.getModel();  
        System.out.println("Summer wear for Ronaldo");
        System.out.print(">>> "+ronaldoAtSummer.getShoe()+", ");
        System.out.print(ronaldoAtSummer.getThrouser()+", ");
        System.out.println(ronaldoAtSummer.getTopWear());

    
        System.out.println("Winter wear for Ronaldo");
        Boutique boutique2= new Boutique();
        boutique2.setOccasion(Occasion.winter);
        boutique2.createModel();
        model ronaldoAtWinter= boutique2.getModel();
        System.out.print(">>> "+ronaldoAtWinter.getShoe()+", ");
        System.out.print(ronaldoAtWinter.getThrouser()+", ");
        System.out.println(ronaldoAtWinter.getTopWear());
        
        
        System.out.println("Work wear for Ronaldo");
        Boutique boutique3= new Boutique();
        boutique2.setOccasion(Occasion.work);
        boutique2.createModel();
        model ronaldoAtWork= boutique2.getModel();
        System.out.print(">>> "+ronaldoAtWork.getShoe()+", ");
        System.out.print(ronaldoAtWork.getThrouser()+", ");
        System.out.println(ronaldoAtWork.getTopWear());
        

        System.out.println("Hash code for Ronaldo in different styles");
        System.out.println(ronaldoAtSummer.hashCode());
        System.out.println(ronaldoAtWinter.hashCode());
        System.out.println(ronaldoAtWork.hashCode());

    }
    
}
