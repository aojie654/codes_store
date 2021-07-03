package Lessons.Week6.L621_Watcher.Bi.demo;

public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}