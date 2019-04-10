package beans;

public class Student {
    private int regno;
    private String name;
    private int mark;

    static{
        System.out.println("Loading Student Bean...");
    }

    public Student(){
        System.out.println("Creating Bean object");
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setId(int id){
        this.regno = id;
    }

    @Override
    public String toString() {
        return String.format("%-10s: %s\n%-10s: %d\n%-10s: %d\n", "Name", this.getName(), "Reg No", this.getRegno(), "Mark", this.getMark());
    }
}
