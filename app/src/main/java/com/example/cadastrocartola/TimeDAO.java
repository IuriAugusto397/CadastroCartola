package com.example.cadastrocartola;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class TimeDAO {

    public static void inserir(Context contexto, Time time){

        Banco banco = new Banco(contexto);
        SQLiteDatabase db = banco.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", time.getNome());
        valores.put("ano", time.getAno());

        db.insert("times", null, valores)
    }


}
