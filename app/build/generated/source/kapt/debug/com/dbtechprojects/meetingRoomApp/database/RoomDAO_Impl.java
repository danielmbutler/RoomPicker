package com.dbtechprojects.meetingRoomApp.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dbtechprojects.meetingRoomApp.models.Building;
import com.dbtechprojects.meetingRoomApp.models.Converters;
import com.dbtechprojects.meetingRoomApp.models.Equipment;
import com.dbtechprojects.meetingRoomApp.models.Facility;
import com.dbtechprojects.meetingRoomApp.models.Feature;
import com.dbtechprojects.meetingRoomApp.models.Floor;
import com.dbtechprojects.meetingRoomApp.models.Location;
import com.dbtechprojects.meetingRoomApp.models.Region;
import com.dbtechprojects.meetingRoomApp.models.RoomDetailsItem;
import com.dbtechprojects.meetingRoomApp.models.RoomItem;
import com.dbtechprojects.meetingRoomApp.models.Service;
import com.dbtechprojects.meetingRoomApp.models.Site;
import java.lang.Exception;
import java.lang.Integer;
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
public final class RoomDAO_Impl implements RoomDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoomItem> __insertionAdapterOfRoomItem;

  private final EntityInsertionAdapter<RoomDetailsItem> __insertionAdapterOfRoomDetailsItem;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllRoomItems;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllRoomDetailtems;

  public RoomDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomItem = new EntityInsertionAdapter<RoomItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RoomItems` (`id`,`capacity`,`key`,`name`,`thumbnailUrl`,`timestamp`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCapacity() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCapacity());
        }
        if (value.getKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKey());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimestamp());
        }
      }
    };
    this.__insertionAdapterOfRoomDetailsItem = new EntityInsertionAdapter<RoomDetailsItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `roomdetails` (`Roomid`,`capacity`,`equipment`,`facilities`,`features`,`heroImageUrl`,`key`,`name`,`services`,`timestamp`,`buildingkey`,`buildingname`,`floorkey`,`floorname`,`regionkey`,`regionname`,`sitekey`,`sitename`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomDetailsItem value) {
        if (value.getRoomid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getRoomid());
        }
        if (value.getCapacity() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getCapacity());
        }
        final String _tmp;
        _tmp = __converters.fromEquipmentList(value.getEquipment());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.fromFacilitiesList(value.getFacilities());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.fromFeatureList(value.getFeatures());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        if (value.getHeroImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHeroImageUrl());
        }
        if (value.getKey() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getKey());
        }
        if (value.getName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getName());
        }
        final String _tmp_3;
        _tmp_3 = __converters.fromServiceList(value.getServices());
        if (_tmp_3 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_3);
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTimestamp());
        }
        final Location _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          final Building _tmpBuilding = _tmpLocation.getBuilding();
          if(_tmpBuilding != null) {
            if (_tmpBuilding.getBuildingkey() == null) {
              stmt.bindNull(11);
            } else {
              stmt.bindString(11, _tmpBuilding.getBuildingkey());
            }
            if (_tmpBuilding.getBuildingname() == null) {
              stmt.bindNull(12);
            } else {
              stmt.bindString(12, _tmpBuilding.getBuildingname());
            }
          } else {
            stmt.bindNull(11);
            stmt.bindNull(12);
          }
          final Floor _tmpFloor = _tmpLocation.getFloor();
          if(_tmpFloor != null) {
            if (_tmpFloor.getFloorkey() == null) {
              stmt.bindNull(13);
            } else {
              stmt.bindString(13, _tmpFloor.getFloorkey());
            }
            if (_tmpFloor.getFloorname() == null) {
              stmt.bindNull(14);
            } else {
              stmt.bindString(14, _tmpFloor.getFloorname());
            }
          } else {
            stmt.bindNull(13);
            stmt.bindNull(14);
          }
          final Region _tmpRegion = _tmpLocation.getRegion();
          if(_tmpRegion != null) {
            if (_tmpRegion.getRegionkey() == null) {
              stmt.bindNull(15);
            } else {
              stmt.bindString(15, _tmpRegion.getRegionkey());
            }
            if (_tmpRegion.getRegionname() == null) {
              stmt.bindNull(16);
            } else {
              stmt.bindString(16, _tmpRegion.getRegionname());
            }
          } else {
            stmt.bindNull(15);
            stmt.bindNull(16);
          }
          final Site _tmpSite = _tmpLocation.getSite();
          if(_tmpSite != null) {
            if (_tmpSite.getSitekey() == null) {
              stmt.bindNull(17);
            } else {
              stmt.bindString(17, _tmpSite.getSitekey());
            }
            if (_tmpSite.getSitename() == null) {
              stmt.bindNull(18);
            } else {
              stmt.bindString(18, _tmpSite.getSitename());
            }
          } else {
            stmt.bindNull(17);
            stmt.bindNull(18);
          }
        } else {
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
        }
      }
    };
    this.__preparedStmtOfDeleteAllRoomItems = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM roomitems";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllRoomDetailtems = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM roomdetails";
        return _query;
      }
    };
  }

  @Override
  public void insertRooms(final List<RoomItem> room) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRoomItem.insert(room);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertIndividualRoom(final RoomItem room) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRoomItem.insert(room);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object insertRoomDetailItem(final RoomDetailsItem roomdetails,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoomDetailsItem.insert(roomdetails);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllRoomItems(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllRoomItems.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllRoomItems.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllRoomDetailtems(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllRoomDetailtems.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllRoomDetailtems.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public List<RoomItem> getRooms() {
    final String _sql = "SELECT * FROM roomitems";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "capacity");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final List<RoomItem> _result = new ArrayList<RoomItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RoomItem _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final Integer _tmpCapacity;
        if (_cursor.isNull(_cursorIndexOfCapacity)) {
          _tmpCapacity = null;
        } else {
          _tmpCapacity = _cursor.getInt(_cursorIndexOfCapacity);
        }
        final String _tmpKey;
        _tmpKey = _cursor.getString(_cursorIndexOfKey);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpThumbnailUrl;
        _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
        final String _tmpTimestamp;
        _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
        _item = new RoomItem(_tmpId,_tmpCapacity,_tmpKey,_tmpName,_tmpThumbnailUrl,_tmpTimestamp);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public RoomDetailsItem getRoomdetails(final String keyid) {
    final String _sql = "SELECT * FROM roomdetails WHERE `key` Like ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (keyid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, keyid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfRoomid = CursorUtil.getColumnIndexOrThrow(_cursor, "Roomid");
      final int _cursorIndexOfCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "capacity");
      final int _cursorIndexOfEquipment = CursorUtil.getColumnIndexOrThrow(_cursor, "equipment");
      final int _cursorIndexOfFacilities = CursorUtil.getColumnIndexOrThrow(_cursor, "facilities");
      final int _cursorIndexOfFeatures = CursorUtil.getColumnIndexOrThrow(_cursor, "features");
      final int _cursorIndexOfHeroImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "heroImageUrl");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfServices = CursorUtil.getColumnIndexOrThrow(_cursor, "services");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfBuildingkey = CursorUtil.getColumnIndexOrThrow(_cursor, "buildingkey");
      final int _cursorIndexOfBuildingname = CursorUtil.getColumnIndexOrThrow(_cursor, "buildingname");
      final int _cursorIndexOfFloorkey = CursorUtil.getColumnIndexOrThrow(_cursor, "floorkey");
      final int _cursorIndexOfFloorname = CursorUtil.getColumnIndexOrThrow(_cursor, "floorname");
      final int _cursorIndexOfRegionkey = CursorUtil.getColumnIndexOrThrow(_cursor, "regionkey");
      final int _cursorIndexOfRegionname = CursorUtil.getColumnIndexOrThrow(_cursor, "regionname");
      final int _cursorIndexOfSitekey = CursorUtil.getColumnIndexOrThrow(_cursor, "sitekey");
      final int _cursorIndexOfSitename = CursorUtil.getColumnIndexOrThrow(_cursor, "sitename");
      final RoomDetailsItem _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpRoomid;
        if (_cursor.isNull(_cursorIndexOfRoomid)) {
          _tmpRoomid = null;
        } else {
          _tmpRoomid = _cursor.getInt(_cursorIndexOfRoomid);
        }
        final Integer _tmpCapacity;
        if (_cursor.isNull(_cursorIndexOfCapacity)) {
          _tmpCapacity = null;
        } else {
          _tmpCapacity = _cursor.getInt(_cursorIndexOfCapacity);
        }
        final List<Equipment> _tmpEquipment;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfEquipment);
        _tmpEquipment = __converters.toEquipmentList(_tmp);
        final List<Facility> _tmpFacilities;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfFacilities);
        _tmpFacilities = __converters.toFacilitiesList(_tmp_1);
        final List<Feature> _tmpFeatures;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfFeatures);
        _tmpFeatures = __converters.toFeatureList(_tmp_2);
        final String _tmpHeroImageUrl;
        _tmpHeroImageUrl = _cursor.getString(_cursorIndexOfHeroImageUrl);
        final String _tmpKey;
        _tmpKey = _cursor.getString(_cursorIndexOfKey);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final List<Service> _tmpServices;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfServices);
        _tmpServices = __converters.toServiceList(_tmp_3);
        final String _tmpTimestamp;
        _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
        final Location _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfBuildingkey) && _cursor.isNull(_cursorIndexOfBuildingname) && _cursor.isNull(_cursorIndexOfFloorkey) && _cursor.isNull(_cursorIndexOfFloorname) && _cursor.isNull(_cursorIndexOfRegionkey) && _cursor.isNull(_cursorIndexOfRegionname) && _cursor.isNull(_cursorIndexOfSitekey) && _cursor.isNull(_cursorIndexOfSitename))) {
          final Building _tmpBuilding;
          if (! (_cursor.isNull(_cursorIndexOfBuildingkey) && _cursor.isNull(_cursorIndexOfBuildingname))) {
            final String _tmpBuildingkey;
            _tmpBuildingkey = _cursor.getString(_cursorIndexOfBuildingkey);
            final String _tmpBuildingname;
            _tmpBuildingname = _cursor.getString(_cursorIndexOfBuildingname);
            _tmpBuilding = new Building(_tmpBuildingkey,_tmpBuildingname);
          }  else  {
            _tmpBuilding = null;
          }
          final Floor _tmpFloor;
          if (! (_cursor.isNull(_cursorIndexOfFloorkey) && _cursor.isNull(_cursorIndexOfFloorname))) {
            final String _tmpFloorkey;
            _tmpFloorkey = _cursor.getString(_cursorIndexOfFloorkey);
            final String _tmpFloorname;
            _tmpFloorname = _cursor.getString(_cursorIndexOfFloorname);
            _tmpFloor = new Floor(_tmpFloorkey,_tmpFloorname);
          }  else  {
            _tmpFloor = null;
          }
          final Region _tmpRegion;
          if (! (_cursor.isNull(_cursorIndexOfRegionkey) && _cursor.isNull(_cursorIndexOfRegionname))) {
            final String _tmpRegionkey;
            _tmpRegionkey = _cursor.getString(_cursorIndexOfRegionkey);
            final String _tmpRegionname;
            _tmpRegionname = _cursor.getString(_cursorIndexOfRegionname);
            _tmpRegion = new Region(_tmpRegionkey,_tmpRegionname);
          }  else  {
            _tmpRegion = null;
          }
          final Site _tmpSite;
          if (! (_cursor.isNull(_cursorIndexOfSitekey) && _cursor.isNull(_cursorIndexOfSitename))) {
            final String _tmpSitekey;
            _tmpSitekey = _cursor.getString(_cursorIndexOfSitekey);
            final String _tmpSitename;
            _tmpSitename = _cursor.getString(_cursorIndexOfSitename);
            _tmpSite = new Site(_tmpSitekey,_tmpSitename);
          }  else  {
            _tmpSite = null;
          }
          _tmpLocation = new Location(_tmpBuilding,_tmpFloor,_tmpRegion,_tmpSite);
        }  else  {
          _tmpLocation = null;
        }
        _result = new RoomDetailsItem(_tmpRoomid,_tmpCapacity,_tmpEquipment,_tmpFacilities,_tmpFeatures,_tmpHeroImageUrl,_tmpKey,_tmpLocation,_tmpName,_tmpServices,_tmpTimestamp);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public RoomDetailsItem getIndividualRoom(final int id) {
    final String _sql = "SELECT * FROM roomitems WHERE id Like ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCapacity = CursorUtil.getColumnIndexOrThrow(_cursor, "capacity");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final RoomDetailsItem _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpCapacity;
        if (_cursor.isNull(_cursorIndexOfCapacity)) {
          _tmpCapacity = null;
        } else {
          _tmpCapacity = _cursor.getInt(_cursorIndexOfCapacity);
        }
        final String _tmpKey;
        _tmpKey = _cursor.getString(_cursorIndexOfKey);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpTimestamp;
        _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
        _result = new RoomDetailsItem(null,_tmpCapacity,null,null,null,null,_tmpKey,null,_tmpName,null,_tmpTimestamp);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
