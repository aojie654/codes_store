package Advanced.Lessons.Week6.L631FoxAndRabbits.src.animal;

public abstract class Animal {
    private int ageLimit;
    private int breedableAge;
    private int age;
    private boolean isAlive = true;

    public Animal(int ageLimit, int breedableAge) {
        this.ageLimit = ageLimit;
        this.breedableAge = breedableAge;
    }
    protected int getAge(){
        return age;
    }
    protected double getAgePercent() {
        return (double)age/ageLimit;
    }

    public abstract Animal breed();

    public void grow(){
        age+=1;
        if (age>=ageLimit){
            die();
        }
    }
    public void die(){
        isAlive = false;
    }
    public boolean isBreedable() {
        return true;
    }

}
