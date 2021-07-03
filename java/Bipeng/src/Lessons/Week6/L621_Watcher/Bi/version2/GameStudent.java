package Lessons.Week6.L621_Watcher.Bi.version2;

public class GameStudent extends Observer {
    public GameStudent(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void update(String newState) {
        if (newState.equals("tf")) {
            System.out.println("老师不在，"
                    + this.getName() + "开始玩游戏！");
        }
        if (newState.equals("tt")) {
            System.out.println("老师在，"
                    + this.getName() + "好好学习！");
        }
    }
}
