
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
		static{
		  System.out.println("WOMEN EMPOWERMENT");
	    System.out.println("1. SELF HELP GROUP");
	    System.out.println("2. RESERVATION FOR WOMEN");
	    System.out.println("3. GIRL CHILD EDUCATION SCHEMES");
	    System.out.println("4. WIDOW SCHEMES");
       System.out.println("5. EXIT");
	}
	public static void main(String[] args) {
	
		Reservation r=new Reservation ();
		shg ln=new shg();
    	ChildEdu ce=new ChildEdu();
   Wid_Schemes ws=new Wid_Schemes();
	
	  int ch;
do{	  
	  Scanner sr =new Scanner(System.in);
    System.out.println("Enter the choice :");
    ch=sr.nextInt();
 System.out.println("you have entered" + ch);

 switch(ch){

case 1:
    	   ln.details(); //shg
           break;
           
case 2:
    	   r.show(); //reserve
           break;           
           
case 3:
    	   ce.Schemes(); // child edu
           break;
           
case 4:
    	   ws.Schemes();//wid sch
           break;
                                            
case 5:
           System.exit(0);
           
default :
        System.out.println("Enter correct choice!!!!!!!!!!!!");
       
   }
   }while(ch<6);
								
	}
}
    
class shg 
{
    
    String name, nation;
		int age,anual_in;
		boolean mem;
		void details()
		{		    
 Scanner scn=new Scanner (System.in);	
 System.out.println(" Self Help Group ");
    System.out.println("Enter your  name");
        name=scn.nextLine();
     System.out.println("Welcome "+ name);
    System.out.println("Enter your age:");
     int age = scn.nextInt();
     if(age>=18 && age<60)
     {
         System.out.println("In order to acquire loan from Self Help group you should be a member of it and you have to deposit the saving amt in a savings acnt atleast for 6month(enter 'true' or 'false')");
         mem=scn.nextBoolean();
         if(mem==true)
            System.out.println("https://www.kviconline.gov.in/pmegpeportal/jsp/pmegponlineNI.jsp?BENF_CD=4");         
        else
           System.exit(0);
                 }
        else   
         System.out.println("you are not eligible for getting loan from shg"); 
         
    }
		}    

    class  Reservation {
     
     int age;
      String name,sec;
      boolean deg;
        void show(){
     
    Scanner scn =new Scanner (System.in);
    System.out.println("Women Reservation ");
     System.out.println("Enter your name");
     name=scn.nextLine();
     System.out.println("Welcome "+ name);
      System.out.println("this page is about woman employment and the reservation provided by govt");
     System.out.println("Enter your age");
     age=scn.nextInt();
    System.out.println("you are "+ age+"years aged");
    System.out.println("are you a degree holder?('true' or 'false' )");
       deg=scn.nextBoolean();
        System.out.println("in which govt sector do you want job ('central 'or 'state'')");
        sec=scn.next();
      
        if(deg==true&&age>18){
          if(sec.equals("central")&& age<30)
          System.out.println("https://www.indiatoday.in/amp/education-today/central-govt-jobs/graduate/women-s-reservation-bill-1653451-2020-03-07");
          
          else if(sec.equals("state") && age<35)
            System.out.println("https://timesofindia//city/chennai/tamil-nadu-raises-quota-for-women-in-govt-jobs-from-30-to-40/86170164.cms ");
          else 
          System.exit(0);
        }
        
     else if(age>18&& deg==false){
      
        if(sec.equals("central")&& age<30)
                     System.out.println("https://www.indiatoday.in/amp/education-today/central-govt-jobs/nongraduate/women-s-reservation-bill-1653451-2020-03-07");
        
         else if(sec.equals("state")&& age<35)
                System.out.println("https://timesofindia//city/chennai/tamil-nadu-raises-quota-for-women-in-govt-jobs-from-30-to-40/86170164.cms ");
                  else 
          System.exit(0);
                 
    }
      else{
                System.out.println("free skill development program: \n https://www.tnskill.tn.gov.in/");
                 System.out.println( "https://www.jobsforher.com/");
      }
       }
    
    }


    class ChildEdu {
	
   	String name, nation,edu_inst;
		int age,anual_in;

     
		void Schemes()
		{
	
  System.out.println(" Child Education scheme");
  Scanner scn=new Scanner(System.in);
    System.out.println("Enter girl child name");
        name=scn.nextLine();
     System.out.println("Welcome "+ name);
      System.out.println("this Web site is to clarify your doubt regarding women empowerment");
     System.out.println("Enter your age");
     age=scn.nextInt();
    System.out.println("you are "+ age+"years aged");
    System.out.println("enter your  natinality");
    nation=scn.next();
     System.out.println("Nationality: "+       nation);
    
    System.out.println("Enter the anual income of parents/gaurdian of the child.");
     int parentin=scn.nextInt();
      System.out.println("parent income:  Rs "+   parentin);
   
   System.out.println("specify the type of education institute ('school','college', 'University', 'polytechnic')");
 edu_inst=scn.next();
    
   System.out.println("institute type"+edu_inst);
		    if(parentin<1000000&& nation.equals("Indian")){
		  if(edu_inst.equals("school")){
		    System.out.println("enter which class(in numbers)");
		    int std= scn.nextInt();
		    if(std<=5)
		       System.out.println("https://merit-scholarship-primary-tn.gov.in  ");
		    else if(std>5&&std<=10)
		        System.out.println("htttps://nmms-scholarship.gov.in");
            else
                System.out.println("htttps://nmms-merit-scholarship.gov.in ");
		  }
		  	  
		  else if(edu_inst.equals("polytechnic"))
		     System.out.println("https://www.google.com/amp/s/www.indiatoday.in/amp/education-today/news/story/tamil-nadu-govt-to-provide-rs-1-000-to-help-girls-pursue-their-higher-education-1926928-2022-03-19  ");
                
            else
              System.out.println(" https://www.google.com/amp/s/www.indiatoday.in/amp/education-today/news/story/tamil-nadu-govt-to-provide-rs-1-000-to-help-girls-pursue-their-higher-education-1926928-2022-03-19 ");  
                    
		    }  
		    
		else
      System.out.println("you are not eligible for this scheme");        
		  }  
	}
    
class Wid_Schemes
{
    
    	String name,nation; 
		int age,anual_in;
		boolean dc;
	
     
		void Schemes()
		{
  Scanner scn=new Scanner(System.in);
  System.out.println(" Widow schemes");
    System.out.println("Enter your  name");
        name=scn.nextLine();
     System.out.println("Welcome "+ name);
     System.out.println("Enter your age");
     age=scn.nextInt();
    System.out.println("you are "+ age+"years aged");
    System.out.println("enter your  natinality");
  nation=scn.next();
     System.out.println("Nationality: "+       nation);
     
     System.out.println("did you applied for death certificate of your husband within a year of his death('true' or 'false')");
     dc=scn.nextBoolean();
     
      System.out.println("enter your anual income ");
      anual_in=scn.nextInt();
      System.out.println("Anual income is"+anual_in);
     String pl= (anual_in<125000?"BPL" : "APL");
     System.out.println(pl);

     
     if(pl.equals("BPL")&& nation.equals("Indian")&& dc==true){
     
     if(age>40&&age<60)
     System.out.println(" https://goo.gl/EMgUZF");
     else if(age>60)
          System.out.println(" you can apply for senior citizenship pension");
     
     else 
         System.out.println("sorry, you are not eligible for this scheme");
   
       }
     else
       System.out.println("you, are not eligible for this scheme");
 
		}
}
