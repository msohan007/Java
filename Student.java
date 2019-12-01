package Class;
public class Student {
    private int geography;
    private int history;
    private int english;
    private int mathemetic;
    private int science;
    private int assignment;

   
//parameter constructor
    Student(int geography, int history, int english, int mathemetic, int science, int assignment) {
        this.geography=geography;
        this.history=history;
        this.english=english;
        this.mathemetic=mathemetic;
        this.science=science;
        this.assignment=assignment;
    }

            
            
    @Override
    public String toString(){
    
    return "Geography:"+geography+"\nHistory: "+history+"\nEnglish: "+english+"\nMathemetic: "
            +mathemetic+"\nScience: "+science+"\nAssignment: "+assignment;
    }
    
}
