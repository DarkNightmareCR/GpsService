package cr.ac.gpsservice.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import cr.ac.gpsservice.entity.Location


@Dao
interface LocationDao {
    @Insert
    fun insert(location: Location)

    @Query("select * from Location_table")
    fun query(): List<Location>
}