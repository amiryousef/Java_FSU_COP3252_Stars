/*
Yousef, Amir
COP-3252
Assignment3
Class Knight
2/16/2014
*/

// to use dialog inputs
import javax.swing.JOptionPane;

// implement class Knight
public class Knight extends Stars 
{

// define attributes
private String knightName;
private int knightAge;
private int knightHealth;
private int knightBattles;
private int knightGold;

// constructor to intialize the knight's attributes
public Knight()
{ 
knightName = JOptionPane.showInputDialog("Enter Knight Name: "); 
String message = String.format("Enter Knight Health: ");
knightHealth = Integer.parseInt(JOptionPane.showInputDialog(message));
message = String.format("Enter Knight Number of Battles: ");
knightBattles = Integer.parseInt(JOptionPane.showInputDialog(message));
message = String.format("Enter Knight Age: ");
knightAge = Integer.parseInt(JOptionPane.showInputDialog(message));
message = String.format("Enter Knight Amount of Gold Procured: ");
knightGold = Integer.parseInt(JOptionPane.showInputDialog(message));
} 

// method to set the knight's attributes
public void setKnightAttributes(String name, int age, int health, int battles, int gold)
{
knightName = name; 	
knightAge = age;
knightHealth = health;
knightBattles = battles;
knightGold = gold; 
} 

// method to retrieve the knight's name
public String getknightName()
{
return knightName;
} 

// method to retrieve the knight's age
public int getknightAge()
{
return knightAge;
} 

// method to retrieve the knight's health
public int getknightHealth()
{
return knightHealth;
} 

// method to retrieve the knight's battles
public int getknightBattles()
{
return knightBattles;
} 

// method to retrieve the knight's gold
public int getknightGold()
{
return knightGold;
} 

// display the knight's attributes
public void displayknightAttributes()
{
System.out.printf("\n\n%s%s\n\n%s%d\n\n%s%d\n\n%s%d\n\n%s%d\n\n", 
"Knight Name: ", getknightName(), 
"Knight Health: ", getknightHealth(), 
"Knight Battles: ", getknightBattles(), 
"Knight Age: ", getknightAge(), 
"Knight Gold: $", getknightGold());
} 

}


