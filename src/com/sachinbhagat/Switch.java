package com.sachinbhagat;

public class Switch {

    public static void main(String[] args) {
	   /* int value = 15;
	    if(value ==1){
            System.out.println("value is 1");
        }else if (value == 2){
            System.out.println("value is 2");
        }else {
            System.out.println("was not 1 or 2");
        }*/

	  /* int switchValue = 4;
	   switch (switchValue){
           case 1:
               System.out.println("switch value is 1");
               break;
           case 2:
               System.out.println("switch value is 2");
               break;
           case 3: case 4: case 5:
               System.out.println("switch value is 3 or 4 or 5");
               System.out.println("actuall it was "+switchValue);
               break;
           default:
               System.out.println("not 1 or 2 or 3 or 4 or 5");
               break;
       }*/

	  char charValue = 'G'; // o/p -- no character is found

	  switch (charValue){
          case 'A':
              System.out.println("character A is found");
              break;
          case 'B':
              System.out.println("character B is found");
              break;
          case 'C':
              System.out.println("character C is found");
              break;
          case 'D': case 'E':
              System.out.println("character D or E is found");
              System.out.println("actually is was " + charValue);
              break;
          default:
              System.out.println("no character is found");
              break;
      }

    }
}
