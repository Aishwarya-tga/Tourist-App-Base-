package com.example.touristapp;

public class Rajasthan {
    private String name;
    private String detail;
    private int imageResourceId;
    private String area;
    private String elevation;
    private String type;
    private String bttv;
    private String dest;

    //rajasthan array func
    public static final Rajasthan[] rajasthan = {
        new Rajasthan("Jaipur", " Jaipur is famous as Pink City of India and it is also the Capital City of Rajasthan. Jaipur is famous for Rajasthani traditional Jewelry, traditional fabrics and handicrafts, and also for traditional rajasthani cuisine\n", R.drawable.jaipur, "AREA : 484.6 km²\n", "ELEVATION : 431 m\n", "TYPE : Forts , Palaces\n", "BEST TIME TTO VISIT : November to January\n", "TOURIST DESTINATION :  City Palace, Jantar Mantar, Hawa Mahal\n"),
        new Rajasthan("Udaipur", "Picturesque and elegant, Udaipur is known by many names, including “the City of Lakes”. Undoubtedly one of India's most romantic cities, it nestles between the glassy waters of its famous lakes and the ancient Aravelli Hills.\n", R.drawable.udaipur, "AREA :  64 km²\n", "ELEVATION :  423 m\n", "TYPE : lakes\n", "BEST TIME TO VISIT : September to March\n", "TOURIST DESTINATION : Udaipur City Palace,  Lake Pichola, Fateh Sagar Lake\n"),
        new Rajasthan(" Jaisalmer", "The city is known for the grand fort that fences the city and other tourist attractions in Jaisalmer.The most amazing thing about this fort is that it is a living urban center.Taking a city sightseeing tour is one of the most desired things to do in Jaisalmer.\n", R.drawable.jaisalmer, "AREA : 5.1 km²\n", "ELEVATION : 225 m\n", "TYPE : Forts, Sand Castles\n", "BEST TIME TO VISIT : November to March\n", "TOURIST DESTINATION : Jaisalmer Fort, Bada Bagh, Sam Sand Dunes\n"),
        new Rajasthan("Jodhpur", "Jodhpur is a popular tourist destination, featuring many palaces, forts, and temples, set in the stark landscape of the Thar Desert. It is popularly known as the 'Blue City' among people of Rajasthan and all over India.\n", R.drawable.jodhpur, "AREA : 233.5 km²\n", "ELEVATION : 231 m\n", "TYPE : Forts, Temples\n", "BEST TIME TO VISIT : October to March\n", "TOURIST DESTINATION : Umaid Bhawan Palace,  Mehrangarh Fort,  Jaswant Thada\n"),
        new Rajasthan("Pushkar", "Known as 'the rose garden of Rajasthan', the essence of the famous Pushkar rose is exported all over the world. Along with an interesting mythological history, a legacy of timeless architectural heritage makes Pushkar a fascinating city.\n", R.drawable.pushkaar, "AREA :  10 km (6.2 mi) northwest of Ajmer \n", "ELEVATION : 510 m\n", "TYPE : Temples\n", "BEST TIME TO VISIT : November to March\n", "TOURIST DESTINATION : Pushkar Lake, Brahma Temple, Savitri Temple\n")
    };

    // the constructor
    private Rajasthan(String name, String detail, int imageResourceId,String area, String elevation, String type, String bttv, String dest) {
        this.name = name;
        this.detail = detail;
        this.imageResourceId = imageResourceId;
        this.area=area;
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
