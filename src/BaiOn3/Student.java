package BaiOn3;

  public class Student extends  Person {
     private double markAvg;

      public Student(String personID, String personName, String dateOfBirth, double markAvg) {
          super(personID, personName, dateOfBirth);
          this.markAvg = markAvg;
      }

      public double getMarkAvg() {
          return markAvg;
      }

      public void setMarkAvg(double markAvg) {
          this.markAvg = markAvg;
      }

      @Override
      public String toString() {
          return super.toString() + ", Mark Avg: " + markAvg;
      }
  }
