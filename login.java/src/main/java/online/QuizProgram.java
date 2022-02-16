package online;

import java.util.Scanner;

import org.hibernate.Session;

import com.app.model.QuizBank;
import com.app.utility.HibernateUtil;




public class QuizProgram {

     //Initializaions and Instantiations-
	static Scanner cin = new Scanner(System.in);
public void quiz() {
	 System.out.println("How many Question You want to add:"); int
	  size=cin.nextInt(); Session session=HibernateUtil.getSession();
	  org.hibernate.Transaction tx=session.beginTransaction(); for(int
	  i=0;i<size;i++) { System.out.println("Enter Question:"); String
	  que=cin.next(); System.out.println("Enter Opection 1:"); String
	  ope1=cin.next(); System.out.println("Enter Opection 2:"); String
	  ope2=cin.next(); System.out.println("Enter Opection 3:"); String
	  ope3=cin.next(); System.out.println("Enter Opection 4:"); String
	  ope4=cin.next(); System.out.println("Enter Answer:"); String ans=cin.next();
	  System.out.println("Enter Marks:"); int marks=cin.nextInt(); session.save(new
	  QuizBank(que, ope1, ope2, ope3, ope4, ans, marks));
	  
	  } tx.commit(); session.close();
}
    public void run(){
    {
           double score = 0;
            double NumberofQuestions = 5;
			
			 
    
    

          System.out.println("\n\n\n\n\n\n\n\t\tQuiz 1.0\n\n");

           //Store questions and answers in 2 dimensional array
           String[][] QandA = {
                               {"What is the full form of'OOPs':?","\nChoose 1 for Object Oriented Program structure. \nChoose 2 for Object Organise Program.  \nChoose 3 for Oriented Object Program. \nChoose 4 for None of these.","1"},
                               {"Number of primitive data types in java are ?","\nChoose 1 for 6. \nChoose 2 for 7.  \nChoose 3 for 8. \nChoose 4 for 9.","3"},
                               {"What is the size of float and double in java ?","\nChoose 1 for 32 and 64. \nChoose 2 for 32 and 32.  \nChoose 3 for 64 and 64. \nChoose 4 for 64 and 32.","1"},
                               {"Arrays in java are ?","\nChoose 1 for Objects references. \nChoose 2 for Objects.  \nChoose 3 for Primitive data type. \nChoose 4 for None.","2"},
                               {"when is the object created with new keyword?","\nChoose 1 for At compile time. \nChoose 2 for Depends on the code.  \nChoose 3 for At run time. \nChoose 4 for None.","3"} };

          String[] Answers = new String[(int) NumberofQuestions];

         //loop through each string in the array and compare it to answers
         //for(int x = 0; x < NumberofQuestions; x++)
          int x=0;
          do
         {
              System.out.print("" + (x+1) + ". " + QandA[x][0] + "   "+QandA[x][1]);

              Answers[x] = String.valueOf(cin.nextInt());

              Answers[x].toLowerCase();

              if(QandA[x][2].equals(Answers[x]))
              {
                   score++;
              }//close if 
              else
              {
                  System.out.println("\n Incorrect. The right answer is "+QandA[x][2]);
              }

              System.out.print("\n");
              x++;
         }while(x<NumberofQuestions);//close outer loop                                 

         System.out.println("\n\t\tYou got " + score + " of "
                            + NumberofQuestions + " right!\n\n\n"); 
         double per=(score/NumberofQuestions)*100;
         System.out.println("\n\t\tYour percentage is " + (per+"%")); 


         System.exit(0);

    }//close main() function  

}//close Quiz class
}



