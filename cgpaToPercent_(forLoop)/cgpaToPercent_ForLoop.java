import java.util.Scanner;


class cgpaToPercent_ForLoop
  {
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
        
        //Switch Case:
        switch(option)
          {           
                                                        // ====== For FIRST YEAR (HSC graduate) ====== //
            case 1:  
              {
                System.out.println("\n***************************************************\n|     Read Below Options and Choose one of it     |\n***************************************************" 
                                  +"\n\n1) 8_Sem CGPA: <-- Use this if you don't know average of 2_sems of each year. \n\t\t   Eg:   [sem_1:cgpa | sem_2:cgpa] \n\t\t\t [sem_3:cgpa | sem_4:cgpa] \n\t\t\t [sem_5:cgpa | sem_6:cgpa] \n\t\t\t [sem_7:cgpa | sem_8:cgpa]" 
                                  +"  \n2) 4_Yr  CGPA: <-- Assuming you know each year average CGPA.) \n\t\t   Eg:   [Year_1:cgpa] \n\t\t\t [Year_2:cgpa] \n\t\t\t [Year_3:cgpa] \n\t\t\t [Year_4:cgpa]");

                System.out.println("\n--------------------------------------------------------------------------------------------\n");
                System.out.print("\n[-] Option: ");
                int chooseOption= scan.nextInt();

                // Nested SwitchCase for (FIRST YEAR (HSC graduate)) Starts Here: 
                switch(chooseOption)
                  {
                    case 1:  // Nested SwitchCase Case_1
                      {
                        // By creating FOR LOOP of an input you can conclude Final Percentage: 
                        float totalPercentSum= 0;           //taken as constant to add up further
                        System.out.println("\n\nYou Chose 8_Sems:");
                        System.out.println("-------------------");         //new line
                        for(int i=1; i<=8; i++)
                            {
                                System.out.print("|  Sem_"+ i + ": ");  // Taking input 8th times eg: (sem_1: then sem_2: then sem_3:...... sem_8: ). Here 'i' is number from (1 to 8) as we initialized (i=1)
                                float per_Sem_Cgpi= scan.nextFloat();
                                float percent= (per_Sem_Cgpi-0.67f) * 10 ;  // This will calculate percentage of each Cgpi as it comes.
                                System.out.println("|       : " + String.format("%.2f" ,percent) + "%  |");
                                totalPercentSum = totalPercentSum + percent;  // This will store above percent and add up each percent after each loop until it reaches 8th time
                            }
                        System.out.println("-------------------");    
                        System.out.println("\n\n------------------------------" + "\n|  % Sum Of All Sem: " + String.format("%.2f",totalPercentSum) + "  |" + "\n------------------------------\n"); // this is to print totalPercentSum in a better drawing box around it.
                        float averagePercent = totalPercentSum / 8f ;   // Calculating Average Percentage. And then printing out.
                        System.out.println("\n------------------------------" + "\n|   Final Percent: " + String.format("%.2f", averagePercent) + "%    |" + "\n------------------------------\n");                        
                      } break;

                    case 2://===== Nested SwitchCase Case_2:
                      {
                        float totalPercentSum= 0;
                        System.out.println("\n\nYou Chose 4_Years:");
                        System.out.println("-------------------");
                        for(int i=1; i<=4; i++)
                          {
                            System.out.print("|  Year_" + i + ": ");
                            float per_Year_Cgpi= scan.nextFloat();
                            float percent= (per_Year_Cgpi - 0.67f) * 10;
                            System.out.println("|        :" + String.format("%.2f" ,percent) + "%  |");
                            totalPercentSum = totalPercentSum + percent;
                          }
                          System.out.println("------------------");
                          System.out.println("\n\n-------------------------------" + "\n|  % Sum Of All Sem: " + String.format("%.2f",totalPercentSum) + "   |" + "\n-------------------------------\n");
                          float averagePercent= totalPercentSum / 4f;
                          System.out.println("\n------------------------------" + "\n|   Final Percent: " + String.format("%.2f", averagePercent) + "%    |" + "\n------------------------------\n");                                          
                      }
                  } 
              }break;

                                                        // ====== For DIRECT SECOND YEAR ====== // 
            case 2: 
              {
                System.out.println("\n***************************************************\n|     Read Below Options and Choose one of it     |\n***************************************************" 
                                  +"\n\n1) 6_Sem CGPA: <-- Use this if you don't know average of 2_sems of each year. \n\t\t   Eg:   [sem_3:cgpa | sem_4:cgpa] \n\t\t\t [sem_5:cgpa | sem_6:cgpa] \n\t\t\t [sem_7:cgpa | sem_8:cgpa]" 
                                  +"  \n2) 3_Yr  CGPA: <-- Assuming you know each year average CGPA.) \n\t\t   Eg:   [Year_2:cgpa] \n\t\t\t [Year_3:cgpa] \n\t\t\t [Year_4:cgpa]");
                                  
                System.out.println("\n--------------------------------------------------------------------------------------------\n");
                System.out.print("\n[-] Option: ");
                int choose_Option= scan.nextInt();

                // Nested SwitchCase for (Direct 2nd year)
                switch(choose_Option)
                  {
                    case 1:  //===== Nested SwitchCase Case_1:
                      {
                        float totalPercentSum=0;
                        System.out.println("\n\nYou Chose 6_Sems:");
                        System.out.println("-------------------");         //new line
                        for(int i=3; i<=8; i++)
                        {
                          System.out.print("|  Sem_" + i + ": ");
                          float per_Sem_Cgpi= scan.nextFloat();
                          float percent= (per_Sem_Cgpi-0.67f) * 10;
                          System.out.println("|       :" + String.format("%.2f" ,percent) + "%  |");                          
                          totalPercentSum= totalPercentSum + percent;
                        }
                        System.out.println("------------------");
                        System.out.println("\n\n-------------------------------" + "\n|    Sum Of All %: " + String.format("%.2f",totalPercentSum) + "     |" + "\n-------------------------------\n");
                        float averagePercent= totalPercentSum / 6f;
                        System.out.println("\n-------------------------------" + "\n|    Final Percent: " + String.format("%.2f", averagePercent) + "%    |" + "\n-------------------------------\n"); 

                      }break;

                    case 2:  //===== Nested SwitchCase Case_2:
                      {
                        float totalPercentSum=0;
                        System.out.println("\n\nYou Chose 3_Years:");
                        System.out.println("-------------------");
                        for(int i=2; i<=4; i++)
                          {
                            System.out.print("|  Year_" + i + ": ");
                            float per_Year_Cgpi = scan.nextFloat();
                            float percent = (per_Year_Cgpi-0.67f) * 10;
                            System.out.println("|        :" + String.format("%.2f" ,percent) + "%  |");
                            totalPercentSum= totalPercentSum + percent; 
                          }
                          System.out.println("-------------------");
                          System.out.println("\n\n------------------------------" + "\n|    Sum Of All %: " + String.format("%.2f",totalPercentSum) + "     |" + "\n------------------------------\n");
                          float averagePercent= totalPercentSum / 3f;
                          System.out.println("\n------------------------------" + "\n|   Final Percent: " + String.format("%.2f", averagePercent) + "%    |" + "\n------------------------------\n");   
                        
                      }break;
                  }

             }break;

          }
          scan.close();    
      }
  }