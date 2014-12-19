package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * Province表创建
	 * id自增，province_name省名，procince_code省代号
	 */
	public static final String CREATE_PROVINCE="create table Province("
			+"id integer primary key autoincrement,"
			+"province_name text,"
			+"province_code text)";
	/**
	 * City表创建
	 * id自增，city_name市名，city_code市号,
	 * province_id是City表关联Province表的外键
	 */
	public static final String CREATE_CITY = "create table City("
			+"id integer primary key autonicrement,"
			+"city_name text,"
			+"city_code text,"
			+"province_id integer)";
	/**
	 * County表创建
	 */
	public static final String CREATE_COUNTY="create table County("
			+"id integer primary key autonicrement,"
			+"county_name text,"
			+"county_code text,"
			+"city_id integer)";
			
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
