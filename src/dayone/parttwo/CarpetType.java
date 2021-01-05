package dayone.parttwo;

import java.util.HashMap;

public class CarpetType {
    private HashMap<String,Double> carpetTypewithCost = new HashMap<>();

    public CarpetType(){
        carpetTypewithCost.put("silk",4.0);
        carpetTypewithCost.put("woolen",2.0);
        carpetTypewithCost.put("nylon",3.0);
    }

    public double getCarpetTypeCost(String value){
        return carpetTypewithCost.get(value);
    }

}
