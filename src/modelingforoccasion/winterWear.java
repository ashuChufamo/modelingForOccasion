package modelingforoccasion;
public class winterWear extends Styler {

    
    
    @Override
    public void createShoe() {
         Model.setShoe(model.Shoe.boots);
    }

    
    
    @Override
    public void createTopWear() {
        Model.setTopWear(model.TopWear.jacket);
    }

    @Override
    public void createThrouser() {
        Model.setThrouser(model.Throuser.throuser);
    }


}
