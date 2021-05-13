package modelingforoccasion;

public class Boutique {
    
    enum Occasion
    {
        summer,work,winter;
    }
    
    private Styler styler;
    
    public model getModel()
    {
        return styler.getModel();
    }
     public Styler getStyler()
    {
        return styler;
    }
    
    public Styler setOccasion(Occasion occasion) {
        if (null != occasion) switch (occasion) {
            case summer:
                styler = new summerWear();
                break;
            case winter:
                styler =new winterWear();
                break;
            case work:
                styler = new workWear();
                break;
            default:
                break;
        }

        return styler;

    }
    
    public void createModel()
    {
        styler.makeNewModel();
        styler.createShoe();
        styler.createThrouser();
        styler.createTopWear();
    }
    
}

