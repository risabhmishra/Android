package com.rm.dell.srmfoodies;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class Database extends SQLiteOpenHelper {

    private static final String DB_NAME = "srmfoodies"; // the name of our database
    private static final int DB_VERSION = 2; // the version of the database

    StarbuzzDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Al_Sham_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Al_Sham_2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.BBery);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.BBery_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.BBery_2);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.BBery_3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.BBery_4);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Beach_House2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Beach_House_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bhouse1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bhouse2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bhouse5_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bihari_Dabha);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bihari_Dabha_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bihari_Dabha_2);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Bihari_Dabha_3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Food_King_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Foodking3_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.foodies_home);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Foodvillage_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Foodvillage2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Foodvillage3_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Foodvillage4_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.JUICES_WAALA_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Kabab_House_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.KebabHouse1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.KebabHouse2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.KebabHouse3_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.KebabHouse4);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Meeting_Point_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Meeting_Point_3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.MilansRes2);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.MilansRes3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.MomsDining_e1457555131251);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Munchies_2);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Munchies2_2);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.NawabDine1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Orange_Blossom_1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Orange_Blossom_2_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Orange_Blossom_3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Pizzahunt1_1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Pizzahunt3_1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Real_Food_Mall1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Real_Food_Mall_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.SRM_Chetinnad_1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.SRM_Chettinad_3);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.SRM_Chettinad_5);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.SRM_Chettinad_6);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Taj1_1);
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.Taj2_1);


        }
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    private static void insertDrink(SQLiteDatabase db, String name,
                                    String description, int resourceId) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("DESCRIPTION", description);
        drinkValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("DRINK", null, drinkValues);
    }
}
