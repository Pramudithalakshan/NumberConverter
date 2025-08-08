import java.util.*;
class Example{
 public static void main(String args[]){
	  Scanner input = new Scanner(System.in);
	  System.out.println(" __   ______             __");
	  System.out.println("|  \\ /      \\           |  \\");
	  System.out.println(" \\$$|  $$$$$$\\  ______  | $$   ______");
	  System.out.println("|  \\| $$   \\$$ |      \\ | $$ /       \\");
	  System.out.println("| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
	  System.out.println("| $$| $$   __  /      $$| $$| $$");
	  System.out.println("| $$| $$__/  \\   $$$$$$$| $$| $$_____");
	  System.out.println("| $$ \\      $$ \\$$    $$| $$ \\$$     \\");
	  System.out.println(" \\$$  \\$$$$$$  \\$$$$$$$ \\$$  \\$$$$$$$");
	  
	  System.out.println();
	  System.out.println(" _   _                         _                          _____                                           _");
	  System.out.println("| \\ | |                       | |                       / _____|                                         | |");
	  System.out.println("|  \\| |  __   __   _ __ ___   | |__      ___    _ __   | |         ___    _ __   __    __   ___   _ __   | |_    ___    _ __");
	  System.out.println("| . ` | |  | |  | | '_  `_ \\  | '_ \\   /  _ \\  | *__|  | |        / _ \\  | '_ \\  \\ \\  / /  / _ \\ | '__|  | __|  / _ \\  | '__|");
	  System.out.println("| |\\  | |  |_|  | | | | | | | | | ) | |  __ /  | |     | |_____  | (_) | | | | |  \\ \\/ /  |  __/ | |     | |_  |  __/  | |");
	  System.out.println("|_| \\_|  \\__,___| |_| |_| |_| |_.__/   \\____|  |_|      \\______|  \\___/  |_| |_|   \\__/    \\___| |_|      \\__|  \\___|  |_|");
	  System.out.println();
	  System.out.println("====================================================================================================================================");
	  System.out.println();
	  System.out.println();
	  
	  int op1=1,op2=2,op3=3,op4=4,op5=5;
	  System.out.printf("%5s %d %s %s %n","[",op1,"]","Decimal Converter");
	  System.out.printf("%5s %d %s %s %n","[",op2,"]","Binary Converter");
	  System.out.printf("%5s %d %s %s %n","[",op3,"]","Octal Converter");
	  System.out.printf("%5s %d %s %s %n","[",op4,"]","Hexadecimal Converter");
	  System.out.printf("%5s %d %s %s %n","[",op5,"]","Roman Converter");
	  System.out.println();
	  System.out.print("Enter Option ->");
	  int option = input.nextInt();
	  switch(option){
	  case 1:
	   L1:
	   while(true){ //Loop start
	  System.out.println("+-----------------------------------------+");
	  System.out.println("|             Decimal Converter           |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();	  
	  System.out.print("Enter an Decimal number :");
	  int deciNum = input.nextInt();
	  if(deciNum>0){
		  String binSt = "";
	      int binTemp=deciNum;
	      
	      String octSt = "";
	      int octTemp=deciNum;
	      
	      String hexSt ="";
	      int hexTemp=deciNum;
	      
	      //Decimal to binary
	      do{
			  binSt=binTemp%2+binSt;
			  binTemp/=2;
			  
		  }while(binTemp!=0);
		  
		  //Decimal to octal
		  do{
			octSt=octTemp%8+octSt;
			octTemp/=8;
		  }while(octTemp!=0);
		  
		   //Decimal to hexadecimal
		 
		  do{

			int remainder=hexTemp%16;
			 
			switch(remainder){
			  case 10:
			    hexSt="a"
			    +hexSt;
			    break;
			  case 11:
			    hexSt="b"
			    +hexSt;
			    break;
			  case 12:
			    hexSt="c"
			    +hexSt;
			    break;
			  case 13:
			    hexSt="d"
			    +hexSt;
			    break;
			  case 14:
			    hexSt="e"
			    +hexSt;
			    break;
			  case 15:
			    hexSt="f"
			    +hexSt;
			   	break; 
			  default:
			    hexSt=remainder+hexSt;
			 }	 
			hexTemp/=16;
		 
			
		  }while(hexTemp!=0);
		  
		  System.out.println();
		  System.out.println("Binary number :"+binSt);
		  System.out.println("Octal number :"+octSt);
		  System.out.println("Hexadecimal number :"+hexSt);  
	    }else{
	   System.out.println("Invalid Input");
	   
	     System.out.print("Do you want to go to homepase (Y/N)->");
	     String decision = input.next();
	     int deci =  decision.charAt(0);
	  	      
	     if(deci==89|deci==121){
			  continue L1;
		 }else{
		   System.out.print("Exit!");	 
		 }
	   
		} //Loop end
		  break;
	  }
	
	
	
	
	  case 2:
	  L2:while(true){
	  System.out.println("+-----------------------------------------+");
	  System.out.println("|             Binary Converter            |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();
	  System.out.print("Enter an Binary number :");
	  int binNum = input.nextInt();
      int temp=binNum%10;
	  if(temp>1 | binNum<0){
	   System.out.println("Invalid Input");
	   
	     System.out.print("Do you want to go to homepase (Y/N)->");
	     String decision = input.next();
	     int deci =  decision.charAt(0);
	  	      
	     if(deci==89|deci==121){
			  continue L2;
		 }else{
		   System.out.print("Exit!");	 
		 }
	  }else{
		  int deciSt = 0;
	      int deciTemp=binNum;
	      int position=0;
	      
	      String octSt2="";
	      String hexSt2="";
	      
	    
	  //Binary to decimal
	    while (deciTemp!=0)
		{
			int b =deciTemp%10;
			deciSt+=b*Math.pow(2,position);
			deciTemp/=10;
			position++;
		}
		position=0;
		int octTemp2=deciSt;
 	//Binary to octal
		 do 
		 {
			octSt2=octTemp2%8+octSt2;
			octTemp2/=8;
			
		 }while(octTemp2!=0);
		 
	//Binary to hexadecimal
	     int hexTemp2=deciSt;
	     do 
		 {
			
			int remainder=hexTemp2%16;
	
			switch(remainder){
			  case 10:
			    hexSt2="a"
			    +hexSt2;
			    break;
			  case 11:
			    hexSt2="b"
			    +hexSt2;
			    break;
			  case 12:
			    hexSt2="c"
			    +hexSt2;
			    break;
			  case 13:
			    hexSt2="d"
			    +hexSt2;
			    break;
			  case 14:
			    hexSt2="e"
			    +hexSt2;
			    break;
			  case 15:
			    hexSt2="f"
			    +hexSt2;
			   	break; 
			  default:
			    hexSt2=remainder+hexSt2;
			 }	 
			hexTemp2/=16;
		 
			
		 }while(hexTemp2!=0);
		 
	      System.out.println();
	      System.out.println("Decimal number :"+deciSt);
		  System.out.println("Octal number :"+octSt2);
		  System.out.println("Hexadecimal number :"+hexSt2);  
	  }
      break;
      }
	  case 3:
	  L3:while(true){
	  System.out.println("+-----------------------------------------+");
	  System.out.println(" |             Octal Converter            |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();
	  System.out.print("Enter an octal number :");
	  int octNum = input.nextInt();
      int temp=octNum%10;
      if(temp==8 | temp==9 | temp<0){
		  System.out.println("Invalid Input");
	   
	     System.out.print("Do you want to go to homepase (Y/N)->");
	     String decision = input.next();
	     int deci =  decision.charAt(0);
	  	      
	     if(deci==89|deci==121){
			  continue L3;
		 }else{
		   System.out.print("Exit!");	 
		 }
	   }else{
		   int deciTemp = octNum;
		   int deciSt=0;
		   int position=0;
		   //Octal to decimal
		   while (deciTemp!=0){
			int b =deciTemp%10;
			deciSt+=b*Math.pow(8,position);
			deciTemp/=10;
			position++;
		   }
		   String binSt="";
		   int binTemp=deciSt;
		   //Octal to binary
		   do{
			  binSt=binTemp%2+binSt;
			  binTemp/=2;
			  
		  }while(binTemp!=0);
		  
		   //Octal to hexadecimal
		   int hexTemp=deciSt;
		   String hexSt="";
	     do 
		 {
			
			int remainder=hexTemp%16;
	
			switch(remainder){
			  case 10:
			    hexSt="a"
			    +hexSt;
			    break;
			  case 11:
			    hexSt="b"
			    +hexSt;
			    break;
			  case 12:
			    hexSt="c"
			    +hexSt;
			    break;
			  case 13:
			    hexSt="d"
			    +hexSt;
			    break;
			  case 14:
			    hexSt="e"
			    +hexSt;
			    break;
			  case 15:
			    hexSt="f"
			    +hexSt;
			   	break; 
			  default:
			    hexSt=remainder+hexSt;
			 }	 
			hexTemp/=16;
		 
			
		 }while(hexTemp!=0);
		   
		    System.out.println();
	      System.out.println("Decimal number :"+deciSt);
		  System.out.println("binary number :"+binSt);
		  System.out.println("Hexadecimal number :"+hexSt); 
	   }
	     break;
	  }
	
	  case 4:
	  L4:while(true){
	  System.out.println("+-----------------------------------------+");
	  System.out.println("|          Hexadecimal Converter          |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Enter an hexadecimal number :");
	  String hexNum = input.next();
      boolean novalid=true;
    
	   for (int i = 0; i < hexNum.length(); i++){
		  char ch = hexNum.charAt(i);
		  if(!((ch>='0' && ch<='9')||(ch>='A' && ch<='F') ||(ch>='a' && ch<='f') )){	    	 
		     novalid=false;
		     break;
	     }
	   }
	   
		  if(novalid){
		    		   
              int deciNum = Integer.parseInt(hexNum,16);
              String binSt="";
              int binTemp=deciNum;
              
              String octSt="";
              int octTemp=deciNum;
           //Hexadecimal to binary
           do{
			  binSt=binTemp%2+binSt;
			  binTemp/=2;
			  
		  }while(binTemp!=0);   
              
          do{
			octSt=octTemp%8+octSt;
			octTemp/=8;
			
		 }while(octTemp!=0);    
              
          System.out.println();
	      System.out.println("Decimal number :"+deciNum);
		  System.out.println("binary number :"+binSt);
		  System.out.println("Hexadecimal number :"+octSt);
			  
		   }else{
	
			  
	     System.out.println("Invalid Input");
	     System.out.print("Do you want to go to homepase (Y/N)->");
	     String decision = input.next();
	     int deci =  decision.charAt(0);
	  	      
	         if(deci==89|deci==121){
			  continue L4;
		     }else{
		       System.out.print("Exit!");	 
		     }
		     }
          break;
	  }
	  case 5:
	  while(true){
		   L4:while(true){
	  System.out.println("+-----------------------------------------+");
	  System.out.println("|          Hexadecimal Converter          |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();
	  
	  System.out.print("Enter an hexadecimal number :");
	  String hexNum = input.next();
      boolean novalid=true;
	  }
  }
	  
  
   }
 }

