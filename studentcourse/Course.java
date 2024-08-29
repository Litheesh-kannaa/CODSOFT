public class Course{
    String courseCode;
    String title;
    String description;
    int capacity;
    String schedule;

    public Course(String courseCode,String title,String description,int capacity,String fromDate,
    String toDate,String monTime,String tueTime,String wedTime,String thuTime,String friTime ){
        this.courseCode=courseCode;
        this.title=title;
        this.description=description;
        this.capacity=capacity;
        this.schedule=fromDate+" - "+toDate+" ; Monday: "+monTime+" Tuesday: "+tueTime+" Wednesday: "
        +wedTime+" Thursday "+thuTime+" Friday: "+friTime;
    }

    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getSchedule(){
        return schedule;
    }
    public void setSchedule(String fromDate,String toDate,String monTime,String tueTime,String wedTime,
    String thuTime,String friTime){
        this.schedule="From: "+fromDate+" - "+"To: "+toDate+" ; Monday: "+monTime+" Tuesday: "+tueTime+
        " Wednesday: "+wedTime+" Thursday "+thuTime+" Friday: "+friTime; 
    }
    public String toString(){
        return courseCode+" "+title+" "+description+" "+capacity+" "+schedule;
    }
} 


