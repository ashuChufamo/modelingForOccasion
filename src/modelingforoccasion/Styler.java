package modelingforoccasion;

public abstract class Styler {
    

    protected model Model=model.getModel();
   
   
    public model getModel() {
        return Model;
    }

     
   
   public void makeNewModel(){}
   public abstract void createShoe();
   public abstract void createTopWear();
   public abstract void createThrouser();
   

   

}
