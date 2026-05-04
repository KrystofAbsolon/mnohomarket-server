package io.github.mnohomarket_server.Objects;

public class Market {

    public int ID;
    public String Name;
    public int Probability;
    public String ImageLink;
    public int YesBets, NoBets;

    public Market(int id, String name, int probability, String imageLink) {
        ID = id;
        Name = name;
        Probability = probability;
        ImageLink = imageLink;
        YesBets = 0;
        NoBets = 0;
    }
    

    
}
