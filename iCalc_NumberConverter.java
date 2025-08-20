import java.util.*;
class iCalc_NumberConverter{
 public static void main(String args[]){
	  Scanner input = new Scanner(System.in);
	  ML:while(true){
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
	   L1:while(true){ //Loop start
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
		 SL1:while(true){  
		 System.out.print("Do you want to go to homepage (Y/N)->");
	     String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL1;
				}
			}
	    }else{
	   System.out.println("Invalid Input");
	   
	     System.out.print("Do you want to go to homepage (Y/N)->");
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
	   
	     System.out.print("Do you want to go to homepage (Y/N)->");
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
		  SL2:while(true){  
		 System.out.print("Do you want to go to homepage (Y/N)->");
	     String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL2;
				}
			}  
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
	   
	     System.out.print("Do you want to go to homepage (Y/N)->");
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
		  SL3:while(true){  
		  System.out.print("Do you want to go to homepage (Y/N)->");
	      String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL3;
				}
			}
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
		  SL4:while(true){  
		  System.out.print("Do you want to go to homepage (Y/N)->");
	      String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL4;
				}
			}
		   }else{
	
			  
	     System.out.println("Invalid Input");
	     System.out.print("Do you want to go to homepage (Y/N)->");
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
	  L6:while(true){
	  System.out.println();
	  System.out.println();
	  System.out.println("+-----------------------------------------+");
	  System.out.println("|          Roman Number Converter         |");
	  System.out.println("+-----------------------------------------+"); 
	  System.out.println();
	  System.out.println();
	  op1=1;
	  op2=2;
	  System.out.printf("%5s %d %s %s %n","[",op1,"]","Decimal Number to Roman Number Converter");
	  System.out.printf("%5s %d %s %s %n","[",op2,"]","Roman Number to Decimal Number Converter");
	  System.out.print("Enter an option->");
	  option = input.nextInt();
	  switch(option){
		  
	  case 1:
	  System.out.println("+---------------------------------------------------+");
	  System.out.println("|       Decimal Number to Roman Number Converter    |");
	  System.out.println("+---------------------------------------------------+"); 
      System.out.println();
	  System.out.println();
	  System.out.print("Enter an Decimal number->");
	  int decimalNum = input.nextInt();
	   String s = "";
      if (decimalNum >= 1 && decimalNum <= 1000){  
      while (decimalNum >= 1000) {
        s += "M";
        decimalNum -= 1000; 
        }
      while (decimalNum >= 900) {
        s += "CM";
        decimalNum -= 900;
      }
      while (decimalNum >= 500) {
        s += "D";
        decimalNum -= 500;
     }
     while (decimalNum >= 400) {
        s += "CD";
        decimalNum -= 400;
     }
     while (decimalNum >= 100) {
        s += "C";
        decimalNum -= 100;
     }
     while (decimalNum >= 90) {
        s += "XC";
        decimalNum -= 90;
     }
     while (decimalNum >= 50) {
        s += "L";
        decimalNum -= 50;
     }
     while (decimalNum >= 40) {
        s += "XL";
        decimalNum -= 40;
     }
     while (decimalNum >= 10) {
        s += "X";
        decimalNum -= 10;
     }
     while (decimalNum >= 9) {
        s += "IX";
        decimalNum -= 9;
     }
     while (decimalNum >= 5) {
        s += "V";
        decimalNum -= 5;
     }
     while (decimalNum >= 4) {
        s += "IV";
        decimalNum -= 4;
     }
     while (decimalNum >= 1) {
        s += "I";
        decimalNum -= 1;
    }    
   }else{
    System.out.println("Invalid Input");
	     System.out.print("Do you want to go to homepage (Y/N)->");
	     String decision = input.next();
	     int deci =  decision.charAt(0);
	  	      
	         if(deci==89|deci==121){
			  continue L6;
		     }else{
		       System.out.print("Exit!");	 
		     }
		     
   }
      System.out.println("Roman numeral :"+s);
      SL5:while(true){  
		 System.out.print("Do you want to go to homepage (Y/N)->");
	     String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL5;
				}
			}
      
      //////////
	  case 2:
	  System.out.println("+---------------------------------------------------+");
	  System.out.println("|       Roman Number to Decimal Number Converter    |");
	  System.out.println("+---------------------------------------------------+"); 
      System.out.println();
	  System.out.println();
	  System.out.print("Enter an Decimal number->");
	  int deciNum=0;
	  String romanNum = input.next().toUpperCase();
       
         for(int j =0;j<romanNum.length();j++){
			 char convertD=romanNum.charAt(j);
			  
			 switch(convertD){
			  case 'M':
			  deciNum +=1000;
			  break;
			  
			  case 'D':
			  deciNum +=500;
			  break;
			  
			  case 'C':
			  deciNum +=100;
			  break;
			  
			  case 'L':
			  deciNum +=50;
			  break;
			  
			  case 'X':
			  deciNum +=10;
			  break;
			  
			  case 'V':
			  deciNum +=5;
			  break;
			  
			  case 'I':
			  deciNum +=1;
			  break;
			  default:
			  System.out.print("Invalid Input");
              System.out.print("Do you want to go to homepage (Y/N)->");
	          String decision = input.next();
              int deci =  decision.charAt(0);
	  	      
	          if(deci==89|deci==121){
		      continue L6;
	          }else{
		      System.out.print("Exit!");	 
		      }
	    
			 }
			} 
			 if (romanNum.contains("IV")){
              deciNum-=2;
             }
             if (romanNum.contains("IX")){
              deciNum-=2;
             }
             if (romanNum.contains("XL")){
              deciNum-=10;
             }
             if (romanNum.contains("XC"))
             {
             deciNum-=10;
             }
             if (romanNum.contains("CD")){
             deciNum-=100;
             }
             if (romanNum.contains("CM")){
             deciNum-=100;
             
		 }
		 
		 System.out.println("Decimal Number->"+deciNum);
		 SL6:while(true){  
		 System.out.print("Do you want to go to homepage (Y/N)->");
	     String op = input.next().toUpperCase();
		    switch(op){
				case "Y":
				continue ML;
				case "N":
				break ML;
				default:
				System.out.println("Please Enter Valid Input");
				continue SL6;
				}
			}

      }
    }
  }
   
  }
   }
 }

