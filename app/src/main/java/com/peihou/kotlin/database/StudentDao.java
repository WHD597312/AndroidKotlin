package com.peihou.kotlin.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.peihou.kotlin.pojo.Student;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STUDENT".
*/
public class StudentDao extends AbstractDao<Student, Long> {

    public static final String TABLENAME = "STUDENT";

    /**
     * Properties of entity Student.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Username = new Property(1, String.class, "username", false, "USERNAME");
        public final static Property Age = new Property(2, int.class, "age", false, "AGE");
    }


    public StudentDao(DaoConfig config) {
        super(config);
    }
    
    public StudentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STUDENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USERNAME\" TEXT," + // 1: username
                "\"AGE\" INTEGER NOT NULL );"); // 2: age
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STUDENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Student entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(2, username);
        }
        stmt.bindLong(3, entity.getAge());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Student entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(2, username);
        }
        stmt.bindLong(3, entity.getAge());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Student readEntity(Cursor cursor, int offset) {
        Student entity = new Student( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // username
            cursor.getInt(offset + 2) // age
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Student entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUsername(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAge(cursor.getInt(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Student entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Student entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Student entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
