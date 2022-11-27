package Animals;

public abstract class Animals {
    public String name;
    public int age =0;

    public Animals(String name, int age) {
        if(name  == null || name.isEmpty()|| name.isBlank()){
            this.name = "Безымянный";
        }else {
            this.name = name;
        }
        if(age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();
}
