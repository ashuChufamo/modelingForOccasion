package modelingforoccasion;
public class summerWear extends Styler{
    
    @Override
    public void createShoe() {
        Model.setShoe(model.Shoe.siliper);
    }

    @Override
    public void createTopWear() {
        Model.setTopWear(model.TopWear.Tshirt);
    }

    @Override
    public void createThrouser() {
        Model.setThrouser(model.Throuser.shorts);
    }

  
    
}
