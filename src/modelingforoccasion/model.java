package modelingforoccasion;
public class model {
    static model Model;
    
    enum Shoe
    {
        siliper, boots,normal;
    }
    enum TopWear
    {
        Tshirt,jacket,shirt;
    }
    enum Throuser
    {
        shorts,throuser;
    }

    private model() {}
    
    
    public static model getModel() {
        if (Model==null)
        {
            Model= new model();
        }
        return Model;
    }
    
    private Shoe shoe;
    private TopWear topWear; 
    private Throuser throuser;

    public Shoe getShoe() {
        return shoe;
    }

    public TopWear getTopWear() {
        return topWear;
    }

    public Throuser getThrouser() {
        return throuser;
    }
    
    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public void setTopWear(TopWear topWear) {
        this.topWear = topWear;
    }
    
    public void setThrouser(Throuser throuser) {
        this.throuser = throuser;
    }
}