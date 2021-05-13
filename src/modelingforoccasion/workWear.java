package modelingforoccasion;
public class workWear extends Styler {

    @Override
    public void createShoe() {
        Model.setShoe(model.Shoe.normal);
    }

    @Override
    public void createTopWear() {
        Model.setTopWear(model.TopWear.shirt);
    }

    @Override
    public void createThrouser() {
        Model.setThrouser(model.Throuser.throuser);
    }
    
}
