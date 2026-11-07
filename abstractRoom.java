interface room{
    String getRoomID();
    int getFloor();
    int timeThatTheRoomNotEmpty();
    boolean book(int timeStart , int timeEnd, User user);
    void cancleBook();
    String getUserWhoBook();
    int getHowManyPeople();
    String getRoomType();
    double getWidth();
    double getHeigth();
    double getLength();
    boolean isOccupy();
    double getVolume();
    
}

public abstract class abstractRoom implements room{
    private String roomID;
    private int floor;
    private boolean occupy;
    private int maxCapacity;
    private double width;
    private double length;
    private double height;
    private int timeStart;
    private int timeEnd;
    private User userWhoBook;

    public abstractRoom(String roomID, int floor, int maxCapacity, double width, double length, double height){
        this.roomID = roomID;
        this.floor = floor;
        this.maxCapacity = maxCapacity;
        this.width = width;
        this.length = length;
        this.height = height;
        this.occupy = false;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getHeigth(){
        return height;
    }
    public String getRoomID(){
        return roomID;
    }
    public int getFloor(){
        return floor;
    }
    public boolean isOccupy() { 
        return occupy; 
    }
    public int timeThatTheRoomNotEmpty() {
        if (!occupy) return 0;
        return timeEnd - timeStart;
    }
    public double getVolume() {
        return width * length * height;
    }
    public int getHowManyPeople() { 
        return maxCapacity; 
    }
    public String getBookTime() {
        if (!occupy) return "ห้องนี้ยังไม่ได้ถูกจองนะจ้ะ";
        return String.format("ช่วงเวลาที่จอง: %02d:00 - %02d:00 น. นะจ้ะ", timeStart, timeEnd);
    }
    public boolean book(int timeStart, int timeEnd, User user) {
        if (this.occupy) return false;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.occupy = true;
        this.userWhoBook = user;
        return true;
    }
    public void cancleBook(){
        this.occupy = false;
        this.timeStart = 0;
        this.timeEnd = 0;
        this.userWhoBook = null;
    }
    public String getUserWhoBook(){
        return userWhoBook.toString();
    }
}