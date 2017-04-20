
package aairline;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aairline extends JFrame implements ActionListener {

JPanel panel1 = new JPanel();
JPanel panel2 = new JPanel();
JPanel panel3 = new JPanel();
String[] departBoxValues = {"","John F Kennedy International Airport","Istanbul International Airport","Heathrow Airport","Charles de Gaulle Airport"};
JComboBox airlineDepart = new JComboBox(departBoxValues); 
String[] arriveBoxValues = {"","John F Kennedy International Airport","Istanbul International Airport","Heathrow Airport","Charles de Gaulle Airport"};
JComboBox airlineArrive = new JComboBox(arriveBoxValues); 
String[] airlineBoxValues = {"","British Airline","American Airline","Turkish Airline","Air France"};
JComboBox airlineAirline = new JComboBox(airlineBoxValues); 
JTextField adultTextField = new JTextField (15);
JTextField childrenTextField = new JTextField (15);
/*String[] adultBoxValues = {"","0","1","2","3","4","5"};
JComboBox airlineAdult = new JComboBox(adultBoxValues); 
String[] childrenBoxValues = {"","0","1","2","3","4","5"};
JComboBox airlineChildren = new JComboBox(childrenBoxValues); */
JTextField allegicTextField = new JTextField (15);
JRadioButton firstRadioButton = new JRadioButton("First Class");
JRadioButton businessRadioButton = new JRadioButton("Business Class");
JRadioButton economyRadioButton = new JRadioButton("Economy Class");
JCheckBox oneCheckBox = new JCheckBox("One-way ");
JCheckBox returnCheckBox = new JCheckBox("Return");
JButton findButton = new JButton ("Find Flight");
JButton returnButton = new JButton ("Return");
JTextField totalPrice = new JTextField(5);
ButtonGroup ticketGroup = new ButtonGroup();
private String Departure=" ";
private String Arrival=" ";
private String Airline=" ";
private String Class=" ";
private String Type=" ";
private String Adult=" ";
private String Children=" ";
private String Allegic=" ";
private String Price=" ";

   public Aairline(){
    setLayout(new FlowLayout());
    setSize(700,700);
    setTitle("AIRLINE TICKET");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    airlineDepart.setSelectedIndex(0);
    airlineArrive.setSelectedIndex(0);
    //airlineAdult.setSelectedIndex(0);
    //airlineChildren.setSelectedIndex(0);
    ticketGroup.add(oneCheckBox);
    ticketGroup.add(returnCheckBox);
    
    totalPrice.setEditable(false);
    
    panel1.add(new JLabel("**FLIGHT RESERVATION**"));
    panel1.add(new JLabel("                                                                    "));
    /*panel1.add(new JLabel("2.For American Airline"));
    panel1.add(new JLabel("3.For Turkish Airline"));
    panel1.add(new JLabel("4.For Air France"));*/
    panel1.add(new JLabel("Book a Flight"));
    panel1.add(new JLabel("                                                                    "));
    panel2.add(new JLabel("Departure Airport:"));
    panel2.add(airlineDepart);
    panel2.add(new JLabel("Arrival Airport:"));
    panel2.add(airlineArrive);
    panel2.add(new JLabel("Which airline would you like to use?:"));
    panel2.add(airlineAirline);
    panel2.add(new JLabel("Which class?"));
    panel2.add(firstRadioButton);
    panel2.add(businessRadioButton);
    panel2.add(economyRadioButton);
    panel2.add(new JLabel("Type of ticket:"));
    panel2.add(oneCheckBox);
    panel2.add(returnCheckBox);
    panel2.add(new JLabel("How many adults?(Ages 12+)"));
    //panel2.add(airlineAdult);
    panel2.add(adultTextField);
    panel2.add(new JLabel("How many children?"));
    //panel2.add(airlineChildren);
    panel2.add(childrenTextField);
    panel2.add(new JLabel("Any allegies?"));
    panel2.add(allegicTextField);
    panel3.add(findButton);
    panel3.add(returnButton);
    panel2.add(new JLabel("This is the total price for your ticket($) : "));
    panel2.add(totalPrice);        
    
panel1.setPreferredSize(new Dimension(390,50));
panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
panel1.setAlignmentX(Component.LEFT_ALIGNMENT);
panel2.setPreferredSize(new Dimension(380,450));
panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
panel3.setPreferredSize(new Dimension(550,250));
add(panel1);
add(panel2);
add(panel3);
    findButton.addActionListener(this);
    returnButton.addActionListener(this);
    setVisible(true);

    }
public String  setDeparture(String d){
    return this.Departure=d; 
}
public String  setArrival(String a){
    return this.Arrival=a; 
}
public String  setAirline(String r){
    return this.Airline=r; 
}
public String  setClasses(String c){
    return this.Class=c; 
}
public String  setTypes(String t){
    return this.Type=t; 
}
public String  setAdult(String u){
    return this.Adult=u; 
}
public String  setChildren(String h){
    return this.Children=h; 
}
public String  setAllegic(String l){
    return this.Allegic=l; 
}
public String  setPrice(String p){
    return this.Price=p; 
}
public String  getDeparture(){
    return this.Departure; 
}
public String  getArrival(){
    return this.Arrival; 
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
public String  getAdult(){
    return this.Adult; 
}
public String  getChildren(){
    return this.Children; 
}
public String  getAllegic(){
    return this.Allegic; 
}
public String  getPrice(){
    return this.Price; 
}
    public void actionPerformed (ActionEvent a){
        
    
     if (a.getSource()== findButton){
           
     Allegic = this.allegicTextField.getText();
     Price = this.totalPrice.getText();
     Adult = this.adultTextField.getText();
     Children = this.childrenTextField.getText();
     
     Price p = new Price (Airline,Class, Type,Adult, Children);
     totalPrice.setText("" + p.findPrice());
     
if (airlineDepart.getSelectedItem() == "John F Kennedy International Airport")
{Departure = "John F Kennedy International Airport";}
else if (airlineDepart.getSelectedItem() == "Istanbul International Airport")
{Departure  = "Istanbul International Airport";}
else if (airlineDepart.getSelectedItem() == "Heathrow Airport")
{Departure  = "Heathrow Airport";}
else if (airlineDepart.getSelectedItem() == "Charles de Gaulle Airport")
{Departure  = "Charles de Gaulle Airport";}
else if (!(this.airlineDepart.getSelectedItem()== "John F Kennedy International Airport"&& this.airlineDepart.getSelectedItem()== "Istanbul International Airport" && this.airlineDepart.getSelectedItem()== "Heathrow Airport" && this.airlineDepart.getSelectedItem()== "Charles de Gaulle Airport"))
{JOptionPane.showMessageDialog(null, "Please select your Departure Airport", "Your departure airport is missing", JOptionPane.ERROR_MESSAGE);
}
if (airlineArrive.getSelectedItem() == "John F Kennedy International Airport")
{Arrival = "John F Kennedy International Airport";}
else if (airlineArrive.getSelectedItem() == "Istanbul International Airport")
{Arrival  = "Istanbul International Airport";}
else if (airlineArrive.getSelectedItem() == "Heathrow Airport")
{Arrival  = "Heathrow Airport";}
else if (airlineArrive.getSelectedItem() == "Charles de Gaulle Airport")
{Arrival = "Charles de Gaulle Airport";}
else if (!(this.airlineArrive.getSelectedItem()== "John F Kennedy International Airport"&& this.airlineArrive.getSelectedItem()== "Istanbul International Airport" && this.airlineArrive.getSelectedItem()== "Heathrow Airport" && this.airlineArrive.getSelectedItem()== "Charles de Gaulle Airport"))
{JOptionPane.showMessageDialog(null, "Please select your Arrival Airport", "Your arrival airport is missing", JOptionPane.ERROR_MESSAGE);
}
if (airlineAirline.getSelectedItem() == "British Airline")
{Airline = "British Airline";}
else if (airlineAirline.getSelectedItem() == "American Airline")
{Airline  = "American Airline";}
else if (airlineAirline.getSelectedItem() == "Turkish Airline")
{Airline  = "Turkish Airline";}
else if (airlineAirline.getSelectedItem() == "Air France")
{Airline  = "Air France";}
else if (!(this.airlineAirline.getSelectedItem()== "British Airline"&& this.airlineAirline.getSelectedItem()== "American Airline" && this.airlineAirline.getSelectedItem()== "Turkish Airline" && this.airlineAirline.getSelectedItem()== "Air France"))
{JOptionPane.showMessageDialog(null, "Please select the airline of your choice", "Your airline is missing", JOptionPane.ERROR_MESSAGE);
/*if (airlineAdult.getSelectedItem() == "0" )
{Adult = "0";}
else if (airlineAdult.getSelectedItem() == "1")
{Adult = "1";}
else if (airlineAdult.getSelectedItem() == "2")
{Adult = "2";}
else if (airlineAdult.getSelectedItem() == "3")
{Adult = "3";}
else if (airlineAdult.getSelectedItem() == "4")
{Adult= "4";}
else if (airlineAdult.getSelectedItem() == "5")
{Adult = "5";}
else if (!(this.airlineAdult.getSelectedItem()== "0" && this.airlineAdult.getSelectedItem()== "1" &&this.airlineAdult.getSelectedItem()== "2" && this.airlineAdult.getSelectedItem()== "3" && this.airlineAdult.getSelectedItem()== "4" && this.airlineAdult.getSelectedItem()== "5"))
{JOptionPane.showMessageDialog(null, "Please select the number of adults", "Your number of adults is missing", JOptionPane.ERROR_MESSAGE);
}
if (airlineChildren.getSelectedItem() == "0")
{Children = "0";}
else if (airlineChildren.getSelectedItem() == "1")
{Children = "1";}
else if (airlineChildren.getSelectedItem() == "2")
{Children = "2";}
else if (airlineChildren.getSelectedItem() == "3")
{Children = "3";}
else if (airlineChildren.getSelectedItem() == "4")
{Children= "4";}
else if (airlineChildren.getSelectedItem() == "5")
{Children = "5";}
else if (!(this.airlineChildren.getSelectedItem()== "0" && this.airlineChildren.getSelectedItem()== "1" &&this.airlineChildren.getSelectedItem()== "2" && this.airlineChildren.getSelectedItem()== "3" && this.airlineChildren.getSelectedItem()== "4" && this.airlineChildren.getSelectedItem()== "5"))
{JOptionPane.showMessageDialog(null, "Please select the number of children", "Your number of children is missing", JOptionPane.ERROR_MESSAGE);
}*/
if (firstRadioButton.isSelected())
{Class= "First";}
else if (businessRadioButton.isSelected())
{Class= "Business";}
else if (economyRadioButton.isSelected())
{Class= "Economy";}
else if (!(this.firstRadioButton.isSelected() && this.businessRadioButton.isSelected() && this.economyRadioButton.isSelected()))
{JOptionPane.showMessageDialog(null, "Please select the class", "Your class is missing", JOptionPane.ERROR_MESSAGE);
} 
if (oneCheckBox.isSelected())
{Type= "PlayStation";}
else if (returnCheckBox.isSelected())
{Type= "PC";}
else if (!(oneCheckBox.isSelected() && returnCheckBox.isSelected()))
{JOptionPane.showMessageDialog(null, "Please select the type of ticket", "Your type is missing", JOptionPane.ERROR_MESSAGE);
} 
    }

if ((oneCheckBox.isSelected()|| returnCheckBox.isSelected()) && (firstRadioButton.isSelected()||businessRadioButton.isSelected()||economyRadioButton.isSelected()) &&(airlineAirline.getSelectedItem() == "British Airline" ||airlineAirline.getSelectedItem() == "American Airline" ||airlineAirline.getSelectedItem() == "Turkish Airline" ||airlineAirline.getSelectedItem() == "Air France")
        &&(airlineArrive.getSelectedItem() == "John F Kennedy International Airport"||airlineArrive.getSelectedItem() == "Istanbul International Airport"||airlineArrive.getSelectedItem() == "Heathrow Airport"||airlineArrive.getSelectedItem() == "Charles de Gaulle Airport")
        &&(airlineDepart.getSelectedItem() == "John F Kennedy International Airport")||airlineDepart.getSelectedItem() == "Istanbul International Airport"||airlineDepart.getSelectedItem() == "Heathrow Airport"||airlineDepart.getSelectedItem() == "Charles de Gaulle Airport")
{JOptionPane.showMessageDialog(null, "**Flight booking** \n\n"
        + "Departure Airport: "
        +this.Departure + "\nArrival Airport: "
        +this.Arrival+ "\nAirline: "
        +this.Airline+ "\nClass: "
        +this.Class+ "\nType of ticket: "
        +this.Type+ "\nNumber of adults: "
        +this.Adult+ "\nNumber of children: "
        +this.Children+ "\nAllegies: "
        +this.Allegic+ "\nTotal Price($) = "
        +this.Price);
     }
     }
       else if (a.getSource()== returnButton){
        
        
        dispose();
    }
    }
    public static void main(String[] args) {
     Aairline f1 = new Aairline();
    }
    
}

