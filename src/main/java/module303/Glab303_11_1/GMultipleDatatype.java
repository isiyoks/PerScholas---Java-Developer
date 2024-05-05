package module303.Glab303_11_1;

public class GMultipleDatatype <Datatypeone, Datatypetwo>{
    Datatypeone valueOne;
    Datatypetwo valueTwo;

    public GMultipleDatatype(Datatypeone v1, Datatypetwo v2){
        this.valueOne =v1;
        this.valueTwo =v2;
    }
    public void setValueOne(Datatypeone v1){
        this.valueOne=v1;
    }
    public Datatypeone getValueOne(){
        return valueOne;
    }
    public void setValueTwo(Datatypetwo v2){
        this.valueTwo=v2;
    }
    public Datatypetwo getValueTwo(){
        return valueTwo;
    }


}
