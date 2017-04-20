
package aairline;


public class Price {
    int adult;
    int children;
private String Airline;
private String Class;
private String Type;  
    static final double British = 400.0;
    static final double American = 850.0;
    static final double France = 700.0;
    static final double Turkish = 500.0 ;
    
    static final double oneWay = 400.0;
    static final double returnTicket = 800.0;
    
    static final double first = 700.0;
    static final double business = 500.0 ;
    static final double economy = 300.5;
    

    public String  setAirline(String r){
    return this.Airline=r; 
}
public String  setClass(String c){
    return this.Class=c; 
}
public String  setTypes(String t){
    return this.Type=t; 
}

public String  getAirline(){
    return this.Airline; 
}
public String getClasses(){
    return this.Class; 
}
public String getTypes(){
    return this.Type; 
}
    public Price(String r,String c, String t,String u, String h){
    
        this.adult = Integer.parseInt(u);
        this.children = Integer.parseInt(h);
        this.Airline = "British Airline";
        this.Airline= "American Airline";
        this.Airline= "Turkish Airline";
        this.Airline= "Air France";
        this.Class="First";
        this.Class="Business";
        this.Class="Economy";
        this.Type="One-Way";
        this.Type="Return";
        
    }
    
    public double findPrice(){
    
        //double price = 0;
    if (Airline == "British Airline"){
        double price = 0;
       price = (this.adult + this.children)*(British+first+oneWay); 
       price = (this.adult + this.children)*(British+business+oneWay);
       price = (this.adult + this.children)*(British+economy+oneWay);
       price = (this.adult + this.children)*(British+first+returnTicket); 
       price = (this.adult + this.children)*(British+business+returnTicket);
       price = (this.adult + this.children)*(British+economy+returnTicket);
       return price;
    }
    else if (Airline == "American Airline"){
        double price = 0;
       price = (this.adult + this.children)*(American+first+oneWay); 
       price = (this.adult + this.children)*(American+business+oneWay);
       price = (this.adult + this.children)*(American+economy+oneWay);
       price = (this.adult + this.children)*(American+first+returnTicket); 
       price = (this.adult + this.children)*(American+business+returnTicket);
       price = (this.adult + this.children)*(American+economy+returnTicket);
       return price;
    }
       else if (Airline == "Air France") { 
           double price = 0;
       price = (this.adult + this.children)*(France+first+oneWay); 
       price = (this.adult + this.children)*(France+business+oneWay);
       price = (this.adult + this.children)*(France+economy+oneWay);
       price = (this.adult + this.children)*(France+first+returnTicket); 
       price = (this.adult + this.children)*(France+business+returnTicket);
       price = (this.adult + this.children)*(France+economy+returnTicket);
       return price;
               }
       else if (Airline == "Turkish Airline"){ 
           double price = 0;
       price = (this.adult + this.children)*(Turkish+first+oneWay); 
       price = (this.adult + this.children)*(Turkish+business+oneWay);
       price = (this.adult + this.children)*(Turkish+economy+oneWay);
       price = (this.adult + this.children)*(Turkish+first+returnTicket); 
       price = (this.adult + this.children)*(Turkish+business+returnTicket);
       price = (this.adult + this.children)*(Turkish+economy+returnTicket);
     return price;
       }
     return 0;
    }
}
