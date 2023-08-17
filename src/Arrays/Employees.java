package Arrays;

public class Employees {
    private String name;
    private String address;
    private int id;

    public String getName() {
        return "Mukesh";
    }

    public void setName(String name) {
        this.name = "Mukesh";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employees() {
        super();
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

}
