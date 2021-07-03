package Lessons.Week4.L431_Derector.H_SunWuKong;

public class Description implements Functions {
    private Functions description0;

    public void discribe(Functions functions0) {
        this.description0 = functions0;
    }

    @Override
    public void function() {
        if (description0 != null) {
            description0.function();
        }
    }
}
