import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface StudentDao {
    @Insert
    void insert (Students students);

    @Update
    void update (Students students);

    @Delete
    void delete (Students students);

    @Query("Select * from Students")
    List<Students> getAllStudents ();
}
