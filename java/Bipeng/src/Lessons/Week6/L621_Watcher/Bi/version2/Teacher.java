package Lessons.Week6.L621_Watcher.Bi.version2;

public class Teacher extends Subject{
    @Override
    public void attach(Observer stu) {
        super.attach(stu);
    }

    @Override
    public void dettach(Observer stu) {
        super.dettach(stu);
    }

    @Override
    public String getState() {
        return super.getState();
    }

    @Override
    public void setState(String state) {
        super.setState(state);
    }

    @Override
    public void inform(String newState) {
        super.inform(newState);
    }
}
