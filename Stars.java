/*
Yousef, Amir
COP-3252
Assignment3
Class Stars
2/16/2014
*/

// to use dialog inputs
import javax.swing.JOptionPane;

// implement Stars
public class Stars 
{

// define attributes
private int row;
private int column;

// to print * on screen
public void OutputStars() 
{

//get the attributes from user
row = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars per each row: "));
column = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stars per each column: "));

// for loop to print *
for (int i = 1; i <= row; i++) 
{
for (int j = 1; j <= column; j++) 
{
System.out.print("* "); 
} 
System.out.println();
}
}
}

 