package com.example.touristapp;

public class Uttar {
    private String name;
    private String elevation;
    private String detail;
    private int imageResourceId;
    private String area;
    private String type;
    private String bttv;
    private String dest;

    // Uttar array func
    public static final Uttar[] uttar ={
            new Uttar("Agra","Located on the banks of Yamuna, Agra is best known for the iconic Taj Mahal. However, the appeal of this historic city is not limited to this magnificent monument alone. There's a lot to explore and experience, from monuments and mausoleums to parks and bazaars.\n", R.drawable.agra,"AREA : 121 km²\n", "ELEVATION : 170 m\n","TYPE : Monuments\n", " BEST TIME TO VISIT : October to March\n","TOURIST DESTINATOIN : Taj Mahal,  Agra Fort, Akbar's Mausoleum\n"),
            new Uttar(" Varanasi","Varanasi grew as an important industrial centre famous for its muslin and silk fabrics, perfumes, ivory works, and sculpture. Buddha is believed to have founded Buddhism here around 528 BCE when he gave his first sermon,The Setting in Motion of the Wheel of Dharma,'at nearby Sarnath'.\n", R.drawable.varanasi, "AREA : 82 km²\n","ELEVATION : 81 m\n","TYPE : Temple\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Kashi Vishwanath Temple, Durga Mandir, Bharat Mata Mandir\n"),
            new Uttar("Lucknow","Lucknow is a historically important city and for many centuries was at the heart of North Indian culture. In particular, the city was famous for its Adab and Tehzeeb (manners and hospitality), intricate embroidery, beautiful gardens and dance forms such as Kathak.\n",R.drawable.lucknow, "AREA : 631 km²\n", "ELEVATION : 123 m\n","TYPE : Temple, Museums,\n","BEST TIME TO VISIT : November to February\n","TOURIST DESTINATION : Bara Imambara, Hazratganj Market, Rumi Darwaza\n"),
            new Uttar("Allahabad","It was constructed by… Prayag in modern-day Allahabad is believed to be the most important pilgrimage centre for Hindus. Traditionally river confluences are regarded… Allahabad University was established on 23rd of September, 1887; it is the fourth oldest university in India.\n",R.drawable.allahabad,"AREA : 365 km²\n","ELEVATION : 98 m\n","TYPE : Museum, University\n","BEST TIME TO VISIT : October to March\n","TOURIST DESTINATION : Triveni Sangam,  Allahabad Museum, Allahabad Fort\n"),
            new Uttar("Mathura","Mathura (or Brajbhoomi) is famous as the birthplace of Lord Krishna, an important deity in the Hindu religious pantheon. It is an important pilgrim place of the Hindus and one of the seven sacred cities in India. The main pilgrim center in Mathura is the Shri Krishna Janmabhoomi temple.\n",R.drawable.mathura,"AREA :  28 km²\n","ELEVATION :  174 m\n","TYPE : Temple\n","BEST TIME TO VISIT : October to November\n","TOURIST DESTINATION : Sri Krishna Janmabhoomi Temple,  Dwarkadhish Temple, Mathura Museum\n")

    };

    //the constructor
    private Uttar(String name, String detail,int imageResourceId,String area,String elevation ,String type ,String bttv, String dest) {
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
