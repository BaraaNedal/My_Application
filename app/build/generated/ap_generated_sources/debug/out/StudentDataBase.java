import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Students.class}, version = 1, exportSchema = false)
public abstract class StudentDataBase extends RoomDatabase {

    public abstract StudentDao studentDao();

    private static volatile StudentDataBase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static StudentDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (StudentDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    StudentDataBase.class, "student_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}