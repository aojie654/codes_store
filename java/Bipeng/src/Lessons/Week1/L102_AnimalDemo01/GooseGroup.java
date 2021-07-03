package Lessons.Week1.L102_AnimalDemo01;

public class GooseGroup {
    private Goose[] gooses;

    //Goose group is make up by gooses.
    public void setGoose(Goose[] gooses) {
        this.gooses = gooses;
    }

    //Int goose group by "Set" for the goose is come from out!
    public void flyV() {
        System.out.println("There are " + this.gooses.length + " gooses flying in letter V.");
    }

    public void flyOne() {
        System.out.println("There are " + this.gooses.length + " gooses flying in number 1.");
    }
    public int goosesCount(){
        return gooses.length;
    }
}