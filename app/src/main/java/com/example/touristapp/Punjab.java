package com.example.touristapp;

public class Punjab {
    private String name;
    private String elevation;
    private String detail;
    private int imageResourceId;
    private String area;
    private String type;
    private String bttv;
    private String dest;

    //punjab array func
    public static final Punjab[] punjab = {
            new Punjab("Amristar","Amritsar is the largest and most important city in Punjab and is a major commercial, cultural, and transportation centre. It is also the centre of Sikhism and the site of the Sikhs' principal place of worship—the Harmandir Sahib, or Golden Temple.\n",R.drawable.amristar,"AREA :139 km²\n","ELEVATION : 234 m\n","TYPE : Temple\n","BEST TIME TO VISIT : November to March\n","TOURIST DESTINATION : Golden Temple, Jallianwala Bagh, Wagah Border\n"),
            new Punjab("Chandigarh","Also called the city beautiful, Chandigarh was designed by the Swiss-French modernist architect, Le Corbusier. Apart from the city's architecture and buildings like Capitol Complex, High Court, Secretariat, Legislative Assembly and giant Open Hand Monument, it is also famous for its clean roads and greenery.\n",R.drawable.chandigarh,"AREA : 114 km²\n","ELEVATION :  321 m\n","TYPE : Monuments, Statues\n","BEST TIME TO VISIT :  September to November\n","TOURIST DESTINATOIN : The Rock Garden, Rose Garden, Sukhna Lake\n"),
            new Punjab("Ludhiana","Ludhiana is also famous for its industry of shawls and stoles and satisfies the demand of major domestic and international brands. As a result of its dominance in the textile industry it is often dubbed as the Manchester of India.\n",R.drawable.ludhiana,"AREA : 159 km²\n","ELEVATION : 247 m\n","TYPE : Fort, Museum\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Lodhi Fort, Rural Heritage Museum, Maharaja Ranjit Singh War Museum\n"),
            new Punjab("Jalandhar","Jalandhar is famous for its sports industry and equipment manufactured in Jalandhar has been used in many international sporting games including Olympics, Commonwealth Games, Asian Games, among others. It is also a hub for manufacturing of hand tools.\n",R.drawable.jalandhar,"AREA : 110 km²\n","ELEVATION :  228 m\n","TYPE : Historical sites\n","BEST TIME TO VISIT : January to March\n","TOURIST DESTINATION : Imam Nasir Masjid, Tulsi Mandir, Devi Talab Mandir\n"),
            new Punjab("Pathankot","Pathankot was known for Loi and shawl weaving industry for many centuries. Pathankot currently houses the base for the defence forces - Indian Army and the Indian Air Force.\n",R.drawable.pathankot,"AREA :  19.7 km²\n","ELEVATION :  332 m\n","TYPE : Hill Station\n","BEST TIME TO VISIT : October to April\n","TOURIST DESTINATION : Mukteshwar Temple, Kathgarh Temple, Shahpurkandi Fort\n")

    };

    //the constructor
    private Punjab(String name, String detail,int imageResourceId,String area,String elevation ,String type ,String bttv, String dest) {
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
