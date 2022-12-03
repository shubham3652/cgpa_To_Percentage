import java.util.Scanner;


class cgpaToPercent_no_ForLoop
  {
                                                            // ======= Main Function ======== //
    public static void main(String[] args)
        {
            System.out.print("\033[H\033[2J"); 
            System.out.println("\n*********************************************\n|     Choose Option Best suited for you     |\n*********************************************" 
                              +"\n\nStudent: "
                              +"1. FIRST year      ...[FE] " 
                              +"\n\t 2. DIRECT 2nd year ...[DSE]\n");

            System.out.print("\nOPTION [1] or [2]: ");
            cgpiToPercent();
            
            
        }

    public static void cgpiToPercent() // cgpiToPercent Function (Created by programmer)
      {
        Scanner scan= new Scanner(System.in);
        int option= scan.nextInt(); 
        System.out.print("\033[H\033[2J");  // before this code whatever was displayed get cleared (Clear-Screen)
        System.out.flush();
      
        switch(option) 
          {            
                                                        // ====== For FIRST YEAR (HSC graduate) ====== //
            case 1:  
              {
                System.out.println("\n***************************************************\n|     Read Below Options and Choose one of it     |\n***************************************************" 
                                  +"\n\n1) 8_Sem CGPA: <-- Use this if you don't know average of 2_sems of each year. \n\t\t   Eg:   [sem_1:cgpa | sem_2:cgpa] \n\t\t\t [sem_3:cgpa | sem_4:cgpa] \n\t\t\t [sem_5:cgpa | sem_6:cgpa] \n\t\t\t [sem_7:cgpa | sem_8:cgpa]" 
                                  +"  \n2) 4_Yr  CGPA: <-- Assuming you know each year average CGPA. \n\t\t   Eg:   [Year_1:cgpa] \n\t\t\t [Year_2:cgpa] \n\t\t\t [Year_3:cgpa] \n\t\t\t [Year_4:cgpa]");
                
                System.out.println("\n--------------------------------------------------------------------------------------------\n");
                System.out.print("\n[-] Option: ");
                int chooseOption= scan.nextInt();

                // Nested SwitchCase for (FIRST YEAR (HSC graduate)) Starts Here: 
                switch(chooseOption)  
                  {
                    case 1:  // Nested SwitchCase Case_1:
                      {                        
                        System.out.println("\n\nYou Chose 8_Sems:"); 
                        System.out.println("\ncgpa: \n--------------");     
                        //Take input in cgpa format
                        System.out.print("1st sem: ");
                        float firstSem= scan.nextFloat();

                        System.out.print("2nd sem: ");
                        float secondSem= scan.nextFloat();

                        System.out.print("3rd sem: ");
                        float thirdSem= scan.nextFloat();

                        System.out.print("4th sem: ");
                        float fourthSem= scan.nextFloat();

                        System.out.print("5th sem: ");
                        float fifthSem= scan.nextFloat();

                        System.out.print("6th sem: ");
                        float sixSem= scan.nextFloat();

                        System.out.print("7th sem: ");
                        float sevenSem= scan.nextFloat();

                        System.out.print("8th sem: ");
                        float eightSem= scan.nextFloat();

                        //closing Scanner to prevent leakage of data:
                        scan.close();

                        // Calculating % of each sem individually
                        float firstPercent= (firstSem-0.67f) * 10;
                        float secondPercent= (secondSem-0.67f) * 10;
                        float thirdPercent= (thirdSem-0.67f) * 10;
                        float fourthPercent= (fourthSem-0.67f) * 10;
                        float fifthPercent= (fifthSem -0.67f) * 10;
                        float sixthPercent= (sixSem-0.67f) * 10;
                        float sevenPercent= (sevenSem-0.67f) * 10;
                        float eightPercent= (eightSem-0.67f) * 10;

                        // Adding Percentage resulting in totalPercentage
                        float totalSemPercent = firstPercent + secondPercent + thirdPercent + fourthPercent + fifthPercent + sixthPercent + sevenPercent + eightPercent;
                        System.out.printf("\n\nPercentage:\n------------------" + String.format("\n|  Sem_1: %.2f  |  \n|  Sem_2: %.2f  |  \n|  Sem_3: %.2f  |  \n|  Sem_4: %.2f  |  \n|  Sem_5: %.2f  |  \n|  Sem_6: %.2f  |  \n|  Sem_7: %.2f  |  \n|  Sem_8: %.2f  | ",firstPercent, secondPercent, thirdPercent, fourthPercent, fifthPercent, sixthPercent, sevenPercent,eightPercent) + "\n------------------\n");
                        // Final Percent through Average
                        float averagePercent = totalSemPercent / 8.0f ;
                        System.out.println("\n\n-------------------------------" + "\n|  Final Percentage: " + String.format("%.2f", averagePercent) + "%   |" + "\n-------------------------------\n");
                      } break;


                    case 2: //===== Nested SwitchCase Case_2:
                      {    
                        System.out.println("\n\nYou Chose 4_Years:");  
                        System.out.println("\ncgpa: \n--------------");                                        
                        //Take input in cgpa format
                        System.out.print("1st year: ");
                        float firstYear= scan.nextFloat();
        
                        System.out.print("2nd year: ");
                        float secondYear= scan.nextFloat();
        
                        System.out.print("3rd year: ");
                        float thirdYear= scan.nextFloat();
        
                        System.out.print("4th year: ");
                        float fourthYear= scan.nextFloat();
        
                        //closing Scanner to prevent leakage of data:
                        scan.close();
                        // Calculating % of each sem individually
                        float firstYearPercent= (firstYear -0.67f)*10;
                        float secondYearPercent= (secondYear-0.67f)*10;
                        float thirdYearPercent= (thirdYear-0.67f)*10;
                        float fourthYearPercent= (fourthYear-0.67f)*10;
        
                        // Adding Percentage resulting in totalPercentage
                        float totalYearPercent = firstYearPercent + secondYearPercent + thirdYearPercent + fourthYearPercent;
                        System.out.printf("\n\nPercentage:\n------------------" + String.format("\n|  Sem_1: %.2f  |  \n|  Sem_2: %.2f  |  \n|  Sem_3: %.2f  |  \n|  Sem_4: %.2f  |  ",firstYearPercent, secondYearPercent, thirdYearPercent, fourthYearPercent) + "\n------------------\n");
                        // Final Percent through Average
                        float averagePercent = totalYearPercent / 4.0f ;
                        System.out.println("\n\n-------------------------------" + "\n|  Final Percentage: " + String.format("%.2f", averagePercent) + "%   |" + "\n-------------------------------\n");
                      }break;
                  } 
              }break;

                                                        // ====== For DIRECT SECOND YEAR ====== // 
            case 2: 
              {
                System.out.println("\n***************************************************\n|     Read Below Options and Choose one of it     |\n***************************************************" 
                                  +"\n\n1) 6_Sem CGPA: <-- Use this if you don't know average of 2_sems of each year. \n\t\t   Eg:   [sem_3:cgpa | sem_4:cgpa] \n\t\t\t [sem_5:cgpa | sem_6:cgpa] \n\t\t\t [sem_7:cgpa | sem_8:cgpa]" 
                                  +"  \n2) 3_Yr  CGPA: <-- Assuming you know each year average CGPA. \n\t\t   Eg:   [Year_2:cgpa] \n\t\t\t [Year_3:cgpa] \n\t\t\t [Year_4:cgpa]");
                                  
                System.out.println("\n--------------------------------------------------------------------------------------------\n");
                System.out.print("\n[-] Option: ");
                int choose_Option= scan.nextInt();

                // Nested SwitchCase for (Direct 2nd year) 
                switch(choose_Option)
                  {
                    case 1:  //===== Nested SwitchCase Case_1:
                    {
                        System.out.println("\n\nYou Chose 6_Sems:");
                        System.out.println("\ncgpa: \n--------------");
                        System.out.print("3rd sem: ");
                          float thirdSem= scan.nextFloat();

                          System.out.print("4th sem: ");
                          float fourthSem= scan.nextFloat();

                          System.out.print("5th sem: ");
                          float fifthSem= scan.nextFloat();

                          System.out.print("6th sem: ");
                          float sixSem= scan.nextFloat();

                          System.out.print("7th sem: ");
                          float sevenSem= scan.nextFloat();

                          System.out.print("8th sem: ");
                          float eightSem= scan.nextFloat();

                          //closing Scanner to avoid leakage of data:
                          scan.close();

                          // Calculating % of each sem individually
                          float thirdPercent= (thirdSem-0.67f)*10;
                          float fourthPercent= (fourthSem-0.67f)*10;
                          float fifthPercent= (fifthSem -0.67f)*10;
                          float sixthPercent= (sixSem-0.67f)*10;
                          float sevenPercent= (sevenSem-0.67f)*10;
                          float eightPercent= (eightSem-0.67f)*10;

                          // Adding Percentage resulting in totalPercentage
                          float totalSemPercent = thirdPercent + fourthPercent + fifthPercent + sixthPercent + sevenPercent + eightPercent;
                          System.out.printf("\n\nPercentage:\n------------------" + String.format("\n|  Sem_3: %.2f  |  \n|  Sem_4: %.2f  |  \n|  Sem_5: %.2f  |  \n|  Sem_6: %.2f  |  \n|  Sem_7: %.2f  |  \n|  Sem_8: %.2f  | ", thirdPercent, fourthPercent, fifthPercent, sixthPercent, sevenPercent,eightPercent) + "\n------------------\n");
                          // Final Percent through Average
                          float averagePercent = totalSemPercent / 6.0f ;                 
                          System.out.println("\n\n-------------------------------" + "\n|  Final Percentage: " + String.format("%.02f", averagePercent) + "%   |" + "\n-------------------------------\n");
                      }break;

                    case 2:  //===== Nested SwitchCase Case_2:
                      {
                        System.out.println("\n\nYou Chose 3_Years:");
                        System.out.println("\ncgpa: \n--------------");
                        System.out.print("2nd Year: ");
                        float secondYear= scan.nextFloat();

                        System.out.print("3rd Year: ");
                        float thirdYear= scan.nextFloat();

                        System.out.print("4th Year: ");
                        float fourthYear= scan.nextFloat();

                        //closing Scanner to prevent leakage of data:
                        scan.close();

                        // Calculating % of each sem individually                        
                        float secondYearPercent= (secondYear-0.67f)*10;
                        float thirdYearPercent= (thirdYear-0.67f)*10;
                        float fourthYearPercent= (fourthYear-0.67f)*10;

                        // Adding Percentage resulting in totalPercentage
                        float totalYearPercent= secondYearPercent + thirdYearPercent + fourthYearPercent;
                        System.out.printf("\n\nPercentage:\n------------------" + String.format("\n|  Sem_2: %.2f  |  \n|  Sem_3: %.2f  |  \n|  Sem_4: %.2f  | ", secondYearPercent, thirdYearPercent, fourthYearPercent) + "\n------------------\n");
                        // Final Percent through Average
                        float averagePercent = totalYearPercent / 3.0f ;
                        System.out.println("\n\n-------------------------------" + "\n|  Final Percentage: " + String.format("%.02f", averagePercent) + "%   |" + "\n-------------------------------\n");
                      }break;
                  }
            }break;
          }
          scan.close();  // Closing Scanner to avoid leakage   
        }
  }