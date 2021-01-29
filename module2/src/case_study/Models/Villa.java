package case_study.Models;

public class Villa extends Services {
    protected String typeRoom;
    protected String equipment;
    protected String acreagePool;
    protected int floor;

    public Villa(String typeRoom, String equipment, String acreagePool, int floor) {
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.acreagePool = acreagePool;
        this.floor = floor;
    }

    public Villa(String id, String serviceName, double acreage, double cost, int numberPeople, String rentalType,
                 String typeRoom, String equipment, String acreagePool, int floor) {
        super(id, serviceName, acreage, cost, numberPeople, rentalType);
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.acreagePool = acreagePool;
        this.floor = floor;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getAcreagePool() {
        return acreagePool;
    }

    public void setAcreagePool(String acreagePool) {
        this.acreagePool = acreagePool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa: " +
                "typeRoom: " + typeRoom + '\'' +
                ", equipment: " + equipment + '\'' +
                ", acreagePool: " + acreagePool + '\'' +
                ", floor: " + floor;
    }

    @Override
    public String showInfor() {
        return super.toString() + ", " + typeRoom + ", " + equipment + ", " + acreagePool + ", " + floor;
    }
}
