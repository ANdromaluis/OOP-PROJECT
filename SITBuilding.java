public class SITBuilding extends Building {
 
    public SITBuilding(String buildingId, String buildingName) {
        super(buildingId, buildingName);
        buildFloor1();
        buildFloor2();
        buildFloor3();
        buildFloor4();
    }
 
    // รหัสห้อง = รหัสตึก + เลขห้อง เช่น SIT + 101 -> SIT101 (กันซ้ำถ้ามี SITBuilding หลายตัว)
    private String id(int number) {
        return getBuildingId() + number;
    }
 
    // ชั้น 1: ห้อง Study 3 ห้อง + ห้องประชุม 1 ห้อง
    private void buildFloor1() {
        addFloor(1);
        addRoom(new StudyRoom(id(101), 1, 30, 6, 8, 3, true));
        addRoom(new StudyRoom(id(102), 1, 30, 6, 8, 3, true));
        addRoom(new StudyRoom(id(103), 1, 20, 5, 6, 3, false));
        addRoom(new meetingRoom(id(104), 1, 15, 4, 6, 3, true));
    }
 
    // ชั้น 2: Lab ใหญ่ 2 ห้อง + Study 1 ห้อง
    private void buildFloor2() {
        addFloor(2);
        addRoom(new labRoom(id(201), 2, 80, 10, 12, 3.5, 60));
        addRoom(new labRoom(id(202), 2, 80, 10, 12, 3.5, 60));
        addRoom(new StudyRoom(id(203), 2, 20, 5, 6, 3, true));
    }
 
    // ชั้น 3: Lab 3 ห้อง + ห้องประชุม 1 ห้อง
    private void buildFloor3() {
        addFloor(3);
        addRoom(new labRoom(id(301), 3, 40, 8, 10, 3, 30));
        addRoom(new labRoom(id(302), 3, 40, 8, 10, 3, 30));
        addRoom(new labRoom(id(303), 3, 40, 8, 10, 3, 30));
        addRoom(new meetingRoom(id(304), 3, 15, 4, 6, 3, true));
    }
 
    // ชั้น 4: ห้องประชุม 3 ห้อง (ขนาดต่างกัน) + Study 1 ห้อง
    private void buildFloor4() {
        addFloor(4);
        addRoom(new meetingRoom(id(401), 4, 10, 4, 5, 3, true));
        addRoom(new meetingRoom(id(402), 4, 25, 6, 8, 3, true));
        addRoom(new meetingRoom(id(403), 4, 100, 12, 15, 4, true));
        addRoom(new StudyRoom(id(404), 4, 20, 5, 6, 3, false));
    }
}
 