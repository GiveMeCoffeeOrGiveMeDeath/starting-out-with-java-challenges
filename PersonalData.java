import java.io.*;
//import java.util.Scanner;

public class PersonalData{
public static void main(String[]args)throws IOException{ 

String name = "John Doe";
String phone = "555-7864";
int idNumber = 47895;

PrintWriter outputFile = new PrintWriter("PeronalData.txt");
outputFile.println("Name: " + name + " ");
outputFile.println("Phone: " + phone + " ");
outputFile.println("Id Number: " + idNumber);
outputFile.close();
}
}