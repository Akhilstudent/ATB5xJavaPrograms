package oops_Collection_28th_Jan_self_pace.Queue;

public class ATBStudent implements Comparable<ATBStudent>{
    private int id;
    private String name;
    private String coursename;

    @Override
    public String toString() {
        return "ATBStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public ATBStudent(int id, String name, String coursename) {
        this.id = id;
        this.name = name;
        this.coursename = coursename;
    }

    @Override
    public int compareTo(ATBStudent o) {
        return Integer.compare(this.id, o.id);
    }
}
