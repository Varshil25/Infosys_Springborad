// Data Encapsulation Concept...
package v3_OOP_Concept;

public class classroom {
    private String Sub;
    private  int stdCount;

    public String getSub(){
        return Sub;
    }

    public void setSub(String Sub){
        this.Sub = Sub;
    }

    public int getStdCount(){
        return stdCount;
    }

    public void setstdCount(int stdCount){
        this.stdCount = stdCount;
    }

    public void displayInformation(){
        System.out.println("This class is "+ Sub + " subject and " + stdCount + " students..");
    }
}
