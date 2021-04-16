package com.dbtechprojects.meetingRoomApp.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoomFinderDatabase_Impl extends RoomFinderDatabase {
  private volatile RoomDAO _roomDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RoomItems` (`id` INTEGER, `capacity` INTEGER, `key` TEXT, `name` TEXT, `thumbnailUrl` TEXT, `timestamp` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_RoomItems_key` ON `RoomItems` (`key`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `roomdetails` (`Roomid` INTEGER, `capacity` INTEGER, `equipment` TEXT, `facilities` TEXT, `features` TEXT, `heroImageUrl` TEXT, `key` TEXT, `name` TEXT, `services` TEXT, `timestamp` TEXT, `buildingkey` TEXT, `buildingname` TEXT, `floorkey` TEXT, `floorname` TEXT, `regionkey` TEXT, `regionname` TEXT, `sitekey` TEXT, `sitename` TEXT, PRIMARY KEY(`Roomid`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_roomdetails_key` ON `roomdetails` (`key`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c74be2913bdfaf46aed2ee37b7cdb3cd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `RoomItems`");
        _db.execSQL("DROP TABLE IF EXISTS `roomdetails`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRoomItems = new HashMap<String, TableInfo.Column>(6);
        _columnsRoomItems.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomItems.put("capacity", new TableInfo.Column("capacity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomItems.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomItems.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomItems.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomItems.put("timestamp", new TableInfo.Column("timestamp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomItems = new HashSet<TableInfo.Index>(1);
        _indicesRoomItems.add(new TableInfo.Index("index_RoomItems_key", true, Arrays.asList("key")));
        final TableInfo _infoRoomItems = new TableInfo("RoomItems", _columnsRoomItems, _foreignKeysRoomItems, _indicesRoomItems);
        final TableInfo _existingRoomItems = TableInfo.read(_db, "RoomItems");
        if (! _infoRoomItems.equals(_existingRoomItems)) {
          return new RoomOpenHelper.ValidationResult(false, "RoomItems(com.dbtechprojects.meetingRoomApp.models.RoomItem).\n"
                  + " Expected:\n" + _infoRoomItems + "\n"
                  + " Found:\n" + _existingRoomItems);
        }
        final HashMap<String, TableInfo.Column> _columnsRoomdetails = new HashMap<String, TableInfo.Column>(18);
        _columnsRoomdetails.put("Roomid", new TableInfo.Column("Roomid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("capacity", new TableInfo.Column("capacity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("equipment", new TableInfo.Column("equipment", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("facilities", new TableInfo.Column("facilities", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("features", new TableInfo.Column("features", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("heroImageUrl", new TableInfo.Column("heroImageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("services", new TableInfo.Column("services", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("timestamp", new TableInfo.Column("timestamp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("buildingkey", new TableInfo.Column("buildingkey", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("buildingname", new TableInfo.Column("buildingname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("floorkey", new TableInfo.Column("floorkey", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("floorname", new TableInfo.Column("floorname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("regionkey", new TableInfo.Column("regionkey", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("regionname", new TableInfo.Column("regionname", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("sitekey", new TableInfo.Column("sitekey", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRoomdetails.put("sitename", new TableInfo.Column("sitename", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRoomdetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRoomdetails = new HashSet<TableInfo.Index>(1);
        _indicesRoomdetails.add(new TableInfo.Index("index_roomdetails_key", true, Arrays.asList("key")));
        final TableInfo _infoRoomdetails = new TableInfo("roomdetails", _columnsRoomdetails, _foreignKeysRoomdetails, _indicesRoomdetails);
        final TableInfo _existingRoomdetails = TableInfo.read(_db, "roomdetails");
        if (! _infoRoomdetails.equals(_existingRoomdetails)) {
          return new RoomOpenHelper.ValidationResult(false, "roomdetails(com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem).\n"
                  + " Expected:\n" + _infoRoomdetails + "\n"
                  + " Found:\n" + _existingRoomdetails);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c74be2913bdfaf46aed2ee37b7cdb3cd", "74f991f24a61234f0b0d3943536a27a9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "RoomItems","roomdetails");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `RoomItems`");
      _db.execSQL("DELETE FROM `roomdetails`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RoomDAO roomDao() {
    if (_roomDAO != null) {
      return _roomDAO;
    } else {
      synchronized(this) {
        if(_roomDAO == null) {
          _roomDAO = new RoomDAO_Impl(this);
        }
        return _roomDAO;
      }
    }
  }
}
