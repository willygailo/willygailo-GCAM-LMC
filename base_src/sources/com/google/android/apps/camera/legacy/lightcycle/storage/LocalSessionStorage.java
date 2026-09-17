package com.google.android.apps.camera.legacy.lightcycle.storage;

import defpackage.hqz;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class LocalSessionStorage implements Serializable {
    public String a;
    public hqz b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;

    public final String toString() {
        String str = this.a;
        String str2 = this.c;
        String str3 = this.f;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        StringBuilder sb = new StringBuilder(length + 129 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str7).length() + String.valueOf(str8).length());
        sb.append("Session ID : ");
        sb.append(str);
        sb.append("\n BaseDir : ");
        sb.append(str2);
        sb.append("\n sessionRelativeDir : ");
        sb.append(str3);
        sb.append("\n SessionBaseDir : ");
        sb.append(str4);
        sb.append("\n SessionDir : ");
        sb.append(str5);
        sb.append("\n thumbnail : ");
        sb.append(str6);
        sb.append("\n metadata : ");
        sb.append(str7);
        sb.append("\n orientationFile : ");
        sb.append(str8);
        return sb.toString();
    }
}
