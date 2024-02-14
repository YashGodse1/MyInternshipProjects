import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    public String questiontext;
    public List<String> options;
    public int answer;

    Question(String questiontext,List<String> options,int answer){
        this.questiontext=questiontext;
        this.options=options;
        this.answer=answer;
    }
    public boolean display(){
        System.out.println(questiontext);
        for(int i=0;i<options.size();i++){
            System.out.println((i+1)+". "+options.get(i));
        }
        System.out.print("Enter Your Option No. ");
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();
        if(userAnswer<1 || userAnswer>4){
            System.out.print("Please Enter Valid Option: ");
            int x=sc.nextInt();
            if(x==answer){
                System.out.println("Answer is Correct.");
                System.out.println();
                return true; 
            }
            else{
                System.out.println("Answer is Incorrect.");
                System.out.println();
            }
        }
        else{
            if(userAnswer==answer){
                System.out.println("Answer is Correct.");
                System.out.println();
                return true;
            }
            else{
                System.out.println("Answer is Incorrect.");
                System.out.println();
            }       
        }      
        return false;      
   }
}
class Quiz{
    Quiz(){
        int countques=0;
        int newscore=0;
        String text="Which is the following place that does not belong in Pune?";
        List <String> OPTIONS=new ArrayList<String>();
        OPTIONS.add("Kothrud");
        OPTIONS.add("Deccan");
        OPTIONS.add("Wakdewadi");
        OPTIONS.add("Dadar");

        List <String> OPTIONS2=new ArrayList<String>();
        OPTIONS2.add("D.Y. Patil College");
        OPTIONS2.add("Modern College");
        OPTIONS2.add("Institute Of Management and Career Courses(IMCC)");
        OPTIONS2.add("MIT");

        List <String> OPTIONS3=new ArrayList<String>();
        OPTIONS3.add("UPSC");
        OPTIONS3.add("JEE");
        OPTIONS3.add("NEET");
        OPTIONS3.add("CA (Chartered Accountant)");

        List <String> OPTIONS4=new ArrayList<String>();
        OPTIONS4.add("University Flyover");
        OPTIONS4.add("Paud Flyover");
        OPTIONS4.add("Wakad Flyover");
        OPTIONS4.add("Lakdi Pul");

        List <String> OPTIONS5=new ArrayList<String>();
        OPTIONS5.add("Shaniwarwada");
        OPTIONS5.add("Kesari Wada");
        OPTIONS5.add("Laal Mahal");
        OPTIONS5.add("None of the above");

        Question q1=new Question("Which is the following place that does not belong in Pune?", OPTIONS,4);
        if(q1.display()){
            newscore++;
            countques++;
        }
        else{
            countques++;
        }
        Question q2=new Question("Which is the best college in Pune for MCA?", OPTIONS2,3);
        if(q2.display()){
            newscore++;
            countques++;
        }
        else{
            countques++;
        }
        Question q3=new Question("Which the most difficult competitive exam in India?", OPTIONS3, 1);
        if(q3.display()){
            newscore++;
            countques++;
        }
        else{
            countques++;
        }
        Question q4 = new Question("Which is the first flyover of Pune?", OPTIONS4, 2);
        if(q4.display()){
            newscore++;
            countques++;
        }
        else{
            countques++;
        }
        Question q5 = new Question("Where did Shahista Khan lost his fingers?", OPTIONS5, 3);
        if(q5.display()){
            newscore++;
            countques++;            
        }
        else{
            countques++;
        };
        System.out.println("Your Score is: "+newscore+" out of "+countques);
        calcPerc(newscore,countques);       
    }
    public void calcPerc(int newscore,int countques){
        float x = ((float)35/(float)100)*(float)countques;
        float y = (float)(75/(float)100)*(float)countques;
        float myperc = ((float)newscore/(float)countques*(float)100);

        if(newscore<x){
            System.out.println("Your Percentage is: "+myperc+"%");
            System.out.println("It is below average.");
        }
        else if(newscore<y && newscore>x){
            System.out.println("Your Percentage is: "+myperc+"%");
            System.out.println("Your Performance is good.");
        }
        else{
            System.out.println("Your Percentage is: "+myperc+"%");
            System.out.println("Your Performance is above distinction.");
        }
    }
}
class Main{
    public static void main(String[] args){
        Quiz q = new Quiz();
    }
}