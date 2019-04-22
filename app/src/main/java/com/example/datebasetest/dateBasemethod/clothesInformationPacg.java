package com.example.datebasetest.dateBasemethod;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Create by xu on 2019/4/22
 * 对从ui获得是数据进行封装 传出ContentValues 供数据库中clothesInformation表操作
 */
public class clothesInformationPacg {
      private ContentValues values;
    public clothesInformationPacg(int dressid,String style,String color,String thickness,String photo,String attribute,String userid){
         values = new ContentValues();
        values.put("dressid",dressid);
        values.put("style",style);
        values.put("color",color);
        values.put("thickness",thickness);
        values.put("photo",photo);
        values.put("attribute",attribute);
        values.put("userid",userid);
    }
    public ContentValues getValues(){
        return  values;
    }
}
