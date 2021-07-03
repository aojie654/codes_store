package Advanced.Lessons.Week5.L531castle.src.castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String dir, Room room) {
        exits.put(dir, room);
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDesc() {
        StringBuffer sb0 = new StringBuffer();
        for (String dir:exits.keySet()){
            sb0.append(dir);
            sb0.append(" ");
        }
       return sb0.toString();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
