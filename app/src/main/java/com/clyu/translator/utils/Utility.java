package com.clyu.translator.utils;

import com.google.gson.Gson;
import com.clyu.translator.gson.Translate;


public class Utility {
    public static Translate handleTranslateResponse(String response){
        Gson gson=new Gson();
        Translate translate=gson.fromJson(response,Translate.class);
        return translate;
    }

}
