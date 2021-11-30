package com.example.touristapp;

public class Delhi {
    private String name;
    private String height;
    private String detail;
    private int imageResourceId;
    private String area;
    private String type;
    private String bttv;

    //delhi arraay func
    public static final Delhi[] delhi = {
            new Delhi("India Gate","India Gate, an important monument of the city, is a memorial built in commemoration of more than 80,000 Indian soldiers who were killed during World War I. The monument is an imposing 42 meters high arch and was designed by the famous architect Edwin Lutyens. India gate was earlier named All India War Memorial.\n",R.drawable.indiagate, "AREA : 306,000 sqkm\n", "HEIGHT :42m\n", "TYPE : War Memorial\n","BEST TIME TO VISIT : 07:00 PM and 09:30 PM\n"),
            new Delhi(" The Red Fort","Delhi's famous Red Fort is known by that name because of the red stone with which it is built and it is one of the most magnificent palaces in the world. India's history is also closely linked with this fort.\n",R.drawable.redfort," AREA : 94 acres (38 ha)\n","HEIGHT : 70 feet\n","TYPE : Fort\n","BEST TIME TO VISIT : November to March\n"),
            new Delhi("Qutub Minar"," Qutub Minar is one of the highest minarets in India with a height of 73 metres. It is a UNESCO World Heritage Site and the tallest brick minaret in the world. This 12th-century minaret is considered as the earliest Islamic structure in India with both Arabic and Brahmi inscriptions.\n",R.drawable.qutub,"AREA : Diameter of 14.32m at the base\n","HEIGHT :  73m\n","TYPE : Monument\n","BEST TIME TO VISIT : 7:00 am to 5:00 pm\n"),
            new Delhi("The Lotus Temple","The temple was completed in 1986 and is one of the most visited places in the world. There are nine sides to the temple formed by 27 marble petals, arranged in groups of three. The nine doors lead to a central prayer hall that has a capacity of 2500 people and is about 40m high.\n",R.drawable.lotus,"AREA :  Diameter OF 70 metres (230 ft)\n","HEIGHT : 34.27 m\n","TYPE : House of Worship\n","BEST TIME TO VISIT :  October to March\n"),
            new Delhi("Jama Masjid","Built in 1656, it is an eloquent reminder of the Mughal religious fervour. Its spacious courtyard holds thousands of the faithful who offer their prayers here. It's also known as 'Masjid-i-Jahanuma' or 'Mosque commanding view of the world'. It was designed as Emperor Shahjahan's principal mosque.\n",R.drawable.jama,"AREA : 12.7 Hectares\n","HEIGHT : 41 m\n","TYPE : Mosque\n","BEST TIME TO VISIT :  12:00 pm,and 2:00 pm to 4:00 pm\n")
    };

    //the constructor
    private Delhi(String name, String detail,int imageResourceId,String area,String height ,String type ,String bttv) {
        this.name = name;
        this.detail = detail;
        this.imageResourceId = imageResourceId;
        this.area = area;
        this.height = height;
        this.type = type;
        this.bttv = bttv;
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
    public String getHeight(){return height;}
    public String getType(){return type;}
    public String getBttv(){return bttv;}
    public String toString() {
        return this.name;
    }

}
