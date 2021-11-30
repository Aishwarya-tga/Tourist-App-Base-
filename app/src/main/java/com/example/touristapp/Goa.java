package com.example.touristapp;

public class Goa {
    private String name;
    private String elevation;
    private String detail;
    private int imageResourceId;
    private String area;
    private String type;
    private String bttv;
    private String dest;

    //goa array func
    public static final Goa[] goa = {
            new Goa("Panaji","The state in western India is known for its beaches, colonial buildings, cuisine and the easy going lifestyle. Panaji remains the most famous tourist destination in Goa, in terms of beaches, churches, carnivals and natural beauty. Being the capital city, it is the focal point of tourism in Goa.\n",R.drawable.panaji,"AREA :  8.27 km²\n","ELEVATION :  7m\n","TYPE : Fort, Beaches\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Reis Magos Fort, Fort Aguada, Old Goa\n"),
            new Goa("Vasco Da Gama","Vasco da Gama was best known for being the first to sail from Europe to India by rounding Africa's Cape of Good Hope. Over the course of two voyages, beginning in 1497 and 1502, da Gama landed and traded in locales along the coast of southern Africa before reaching India on May 20, 1498.\n",R.drawable.vascodagama,"AREA : 36 km²\n","ELEVATION :  43 m\n","TYPE : Beaches\n","BEST TIME TO VISIT : March to May\n","TOURIST DESTINATION : Velsao Beach, Pilot Beach, Bogmalo Beach\n"),
            new Goa("Mapusa","Mapusa is a town in North Goa, India. It is situated 13 km north of the capital Panaji. The town is the headquarters of Bardez Taluka.Mapusa market is especially known for spices, marinated pork sausages, strings of Goan home-made chouriço, cashew nut shops and of course fenny stores. Seedless tamarind, pickles, vegetables, coir mats and ropes are also sold here.\n",R.drawable.mapusa,"AREA : 13 km north of the capital Panaji\n","ELEVATION : 15 m (49 ft)\n","TYPE : Beach, Temple\n","BEST TIME TO VISIT : March to May\n,","TOURIST DESTINATION : Kalacha Beach, Chapora Fort, Sri Kalika Temple\n"),
            new Goa("Calangute","Calangute is a town in the North Goa district of the Indian state of Goa. It is famous for its beach, the largest in North Goa and a popular tourist destination. ... The beach offers water sport activities like parasailing and water skiing, among others.\n",R.drawable.calangute,"AREA : 11.72 (Ha)\n","ELEVATION : 16.42 m\n","TYPE : Beach, Fort\n","BEST TIME TO VISIT : Decemeber and May\n","TOURIST DESTINATION : Calangute Beach, Baga Beach, Se Cathedral\n"),
            new Goa("Margao","Madgaon or Margao, as it commonly known is the cultural hub and the commercial capital of Goa. The city quietly rests at the banks of River Sal and is known to be one of the oldest settlements in GoaBefore the invasion of the Portuguese Margao was a Matha gram, a land with nine monastic endowments of the Hindus.\n",R.drawable.margao,"AREA : 16.1 km²\n","ELEVATION :10 m\n","TYPE : Religious Center, Beaches\n","BEST TIME TO VISIT : February to March\n","TOURIST DESTINATION : Canopy Goa, Monte Hill, Loutolim\n")
    };

    //the constructor
    private Goa(String name, String detail,int imageResourceId,String area,String elevation ,String type ,String bttv, String dest) {
        this.name= name;
        this.detail = detail;
        this.imageResourceId = imageResourceId;
        this.area = area;
        this.elevation = elevation;
        this.type = type;
        this.bttv = bttv;
        this.dest = dest;
    }

    public String getName() {
        return name;
    }
    public String getDetail() {
        return detail;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String getArea(){return area;}
    public String getElevation(){return elevation;}
    public String getType(){return type;}
    public String getBttv(){return bttv;}
    public String getDest(){return dest;}
    public String toString() {
        return this.name;
    }

}
