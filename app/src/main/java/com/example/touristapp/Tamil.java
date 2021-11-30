package com.example.touristapp;

public class Tamil {
    private String name;
    private String detail;
    private int imageResourceId;
    private String area;
    private String elevation;
    private String type;
    private String bttv;
    private String dest;


    //tamil array func
    public static final Tamil [] tamil = {
            new Tamil("Chennai","Famous as the biggest cultural and economic centre down south, Chennai was earlier known as Madras. The city houses several Hindu temples, churches and museums. From its white-sand beaches to mouth-watering seafood, Chennai has everything for travellers.\n",R.drawable.chennai,"AREA : 426 km²\n","ELEVATION : 6.7 m\n","TYPE : Cultural centre\n","BEST TIME TO VISIT: November to Februray\n","TOURIST DESTINATION : Marina Beach, Birla Planetarium, Valluvar Kottam\n"),
            new Tamil("Thanjavur","Thanjavur is an important center of South Indian religion, art, and architecture. Most of the Great Living Chola Temples, which are UNESCO World Heritage Monuments, are located in and around Thanjavur. The foremost among these, the Brihadeeswara Temple, is located in the centre of the city.\n",R.drawable.thanjavur,"AREA : 128 km²\n","ELEVATION : 88 m\n","TYPE : Temples\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Brihadeeswara Temple, Gangaikonda Cholapuram, Thanjavur Royal Palace\n"),
            new Tamil("Ooty","Ooty is one of the important and Interesting Tourist spots of Tamil Nadu. This place has very cool and chill climate in summer season so it one of the best known hill resorts of India. The other name of Ooty is Udhagamandalam. It is also called as the “Queen of Hills Stations” \n",R.drawable.ooty,"AREA : 36 sq.kms\n","ELEVATION : 2,240 m\n","TYPE : Hill Station\n","BEST TIME TO VISIT : October to June\n","TOURIST DESTINATION : Avalanche Lake, Ooty Botanical Gardens, Doddabetta Peak\n"),
            new Tamil("Rameshwaram","Rameshwaram is also a popular pilgrimage destination. The town has special significance to Hindus as one of the holy Char Dham—the four sacred abodes associated with incarnations of Lord Vishnu. ... Hindus believe that visiting all the Char Dham will help them achieve moksha (liberation from rebirth).\n",R.drawable.rameshwaram,"AREA : 55 km²\n","ELEVATION : 10 m\n","TYPE : Temples , Beaches\n","BEST TIME TO VISIT : October to April\n","TOURIST DESTINATION : Sri Ramanathaswamy Temple, Dhanushkodi Beach, Adam’s Bridge\n"),
            new Tamil("Madurai","The city has a number of historical monuments, with the Meenakshi Temple and the Tirumalai Nayak Palace being the most prominent. Madurai is an important industrial and educational hub in South Tamil Nadu. The city is home to various automobile, rubber, chemical and granite manufacturing industries.\n",R.drawable.madurai,"AREA : 148 km²\n","ELEVATION :  101 m\n","TYPE : Temples\n","BEST TIME TO VISIT : October to March \n","TOURIST DESTINATION : Meenakshi Amman Temple, Thirumalai Nayakkar Mahal, Vaigai Dam\n")


    };

    //the constructor
    private Tamil (String name, String detail, int imageResourceId, String area,String elevation, String type, String bttv, String dest) {
        this.name = name;
        this.detail = detail;
        this.imageResourceId = imageResourceId;
        this.area = area;
        this.elevation = elevation;
        this.type = type;
        this.bttv = bttv;
        this.dest = dest;
    }

    public String getName() {return name;}
    public String getDetail() {return detail;}
    public int getImageResourceId() {return imageResourceId;}
    public String getArea() { return area;}
    public String getElevation() {return elevation;}
    public String  getType() { return type;}
    public String getBttv() { return bttv;}
    public String getDest() { return dest;}
    public String toString() {
        return this.name;
    }



}
