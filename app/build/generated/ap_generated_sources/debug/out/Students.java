import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Students {
    @PrimaryKey(autoGenerate = true)
    private int id ;
    @NonNull
    private String name;
    @NonNull
    private double Gpa;

    public Students(String name, double gpa) {
        this.name = name;
        Gpa = gpa;
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

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double gpa) {
        Gpa = gpa;
    }
}
