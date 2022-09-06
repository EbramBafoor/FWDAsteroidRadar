package com.udacity.asteroidradar.data.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDao_Impl implements AsteroidDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AsteroidEntity> __insertionAdapterOfAsteroidEntity;

  public AsteroidDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAsteroidEntity = new EntityInsertionAdapter<AsteroidEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `asteroids_table` (`codename`,`close_approach_date`,`absolute_magnitude`,`estimated_diameter`,`is_potentially_hazardous`,`relative_velocity`,`distance_from_earth`,`id`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AsteroidEntity value) {
        if (value.getCodename() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCodename());
        }
        if (value.getCloseApproachDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCloseApproachDate());
        }
        stmt.bindDouble(3, value.getAbsoluteMagnitude());
        stmt.bindDouble(4, value.getEstimatedDiameter());
        final int _tmp;
        _tmp = value.isPotentiallyHazardous() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindDouble(6, value.getRelativeVelocity());
        stmt.bindDouble(7, value.getDistanceFromEarth());
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public Object insertAsteroid(final AsteroidEntity asteroid, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAsteroidEntity.insert(asteroid);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<AsteroidEntity>> getAsteroidsTodayOnWards(final String date) {
    final String _sql = "SELECT * FROM asteroids_table WHERE close_approach_date >= ? ORDER by close_approach_date ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<AsteroidEntity>>() {
      @Override
      public List<AsteroidEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "close_approach_date");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absolute_magnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimated_diameter");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "is_potentially_hazardous");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relative_velocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_from_earth");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<AsteroidEntity> _result = new ArrayList<AsteroidEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AsteroidEntity _item;
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new AsteroidEntity(_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpIsPotentiallyHazardous,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<AsteroidEntity>> getPastAsteroids(final String date) {
    final String _sql = "SELECT * FROM asteroids_table WHERE close_approach_date < ? ORDER by close_approach_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<AsteroidEntity>>() {
      @Override
      public List<AsteroidEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "close_approach_date");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absolute_magnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimated_diameter");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "is_potentially_hazardous");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relative_velocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_from_earth");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<AsteroidEntity> _result = new ArrayList<AsteroidEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AsteroidEntity _item;
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new AsteroidEntity(_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpIsPotentiallyHazardous,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<AsteroidEntity>> getAsteroidsOfToday(final String date) {
    final String _sql = "SELECT * FROM asteroids_table WHERE close_approach_date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (date == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, date);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"asteroids_table"}, false, new Callable<List<AsteroidEntity>>() {
      @Override
      public List<AsteroidEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "close_approach_date");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absolute_magnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimated_diameter");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "is_potentially_hazardous");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relative_velocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distance_from_earth");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<AsteroidEntity> _result = new ArrayList<AsteroidEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AsteroidEntity _item;
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new AsteroidEntity(_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpIsPotentiallyHazardous,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
