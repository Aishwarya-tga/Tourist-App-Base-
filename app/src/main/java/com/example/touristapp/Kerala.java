package com.example.touristapp;

public class Kerala {
    private String name;
    private String elevation;
    private String detail;
    private int imageResourceId;
    private String area;
    private String type;
    private String bttv;
    private String dest;


    //kerala array func
    public static final Kerala[] kerala = {
            new Kerala("Alappuzha", "Alappuzha, famous for its boat races, beaches, marine products and coir industry, is a world renowned backwater tourist destination of India. Kuttanad, Alappuzha backwaters and Alappuzha beach are the must-see tourist attractions in the district.\n", R.drawable.alappuzha, " AREA : 46.2 km²\n", "ELEVATION : 11 m\n","TYPE : Beaches, Backwater canals\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Alappuzha Beach , Marari Beach , Punnapra Beach\n"),
            new Kerala("Munnar", "Located at the Western Ghats with an average elevation of 1700 meters above sea level, Munnar is a famous hill station in Kerala. The hill station enjoys a favorable and pleasant climate all year round and is famous for its lush green hills and tea plantations.\n", R.drawable.munnar, "AREA: 187 km²\n", "ELEVATION : 1,532 m\n","TYPE : Hill station\n","BEST TIME TO VISIT : August to March\n","TOURIST DESTINATION : Echo Point , Attukad Waterfalls , Top Station\n"),
            new Kerala("Kumarakom", "Kumarakom is a popular tourism destination located near the city of Kottayam (10 kilometres (6 mi)), in Kerala, India, famous for its backwater tourism. It is set in the backdrop of the Vembanad Lake, the largest lake in the state of Kerala.\n", R.drawable.kumarakom, "AREA : Located near the city of Kottayam 10 kilometres (6 mi)\n", "ELEVATION : 9.84 feet\n","TYPE : Verdant Green Village, Lake\n","BEST TIME TO VISIT : September to March\n","TOURIST DESTINATION : Kumarakom Bird Sanctuary , Aruvikkuzhi Waterfall , Vembanad Lake\n"),
            new Kerala("Wayanad","Wayanad is famous for its large amount of camping and trekking trails, breathtaking waterfalls, caves, bird watching sites, flora, fauna and an overall plethora of magnificent sights. This area has been a tourist favourite over the years.\n",R.drawable.wayanad,"AREA : 2,132 km²\n","ELEVATION : 2,339 m\n","TYPE : Hill Station, Waterfalls\n","BEST TIME TO VISIT : October to February\n","TOURIST DESTINATION : Edakkal Caves , Kuruva Island , Chembra Peak\n"),
            new Kerala("Kochi","Popularly known as the Queen of Arabian Sea, the city also flaunts one of the finest natural harbours of the world and was the centre of the world spice trade for many centuries. Old Kochi (presently called West Kochi), loosely refers to a group of islands which comprise Willingdon Island, Fort Kochi, Mattancherry etc.\n",R.drawable.kochi,"AREA : 94.88 km²\n","ELEVATION : 0 cm\n","TYPE : Harbour\n","BEST TIME TO VISIT : September to March \n","TOURIST DESTINATION : Chottanikara Bhagavathy Temple , Folklore Museum , Andhakaranazhi Beach\n")
    };


    //the constructor
    private Kerala(String name, String detail,int imageResourceId,String area,String elevation ,String type ,String bttv, String dest) {
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
