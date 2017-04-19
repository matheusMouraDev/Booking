package data;

public class Client  implements java.io.Serializable {

     private Integer id;
     private Room room;
     private String name;

    public Client() {
    }

	
    public Client(String name) {
        this.name = name;
    }
    public Client(Room room, String name) {
       this.room = room;
       this.name = name;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Room getRoom() {
        return this.room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


