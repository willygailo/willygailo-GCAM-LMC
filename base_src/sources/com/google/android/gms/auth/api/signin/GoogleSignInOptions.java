package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kfr;
import defpackage.kge;
import defpackage.kid;
import defpackage.kno;
import defpackage.kus;
import defpackage.mip;
import defpackage.si;
import defpackage.yc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends kno implements ReflectedParcelable, kid {
    public static final Parcelable.Creator CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final Scope e;
    public static final GoogleSignInOptions f;
    public static Comparator g;
    final int h;
    public final ArrayList i;
    public Account j;
    public boolean k;
    public final boolean l;
    public final boolean m;
    public String n;
    public String o;
    public ArrayList p;
    public String q;

    static {
        Scope scope = new Scope("profile");
        a = scope;
        b = new Scope("email");
        c = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        d = scope2;
        e = new Scope("https://www.googleapis.com/auth/games");
        kfr kfrVar = new kfr();
        kfrVar.b();
        kfrVar.a.add(scope);
        f = kfrVar.a();
        kfr kfrVar2 = new kfr();
        kfrVar2.c(scope2, new Scope[0]);
        kfrVar2.a();
        CREATOR = new si(16);
        g = new yc(8);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.h = i;
        this.i = arrayList;
        this.j = account;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = str;
        this.o = str2;
        this.p = new ArrayList(map.values());
        this.q = str3;
    }

    public static GoogleSignInOptions a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static Map c(List list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kge kgeVar = (kge) it.next();
            map.put(Integer.valueOf(kgeVar.b), kgeVar);
        }
        return map;
    }

    public final ArrayList b() {
        return new ArrayList(this.i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.p.size() <= 0 && googleSignInOptions.p.size() <= 0 && this.i.size() == googleSignInOptions.b().size() && this.i.containsAll(googleSignInOptions.b())) {
                Account account = this.j;
                if (account == null) {
                    if (googleSignInOptions.j == null) {
                        if (TextUtils.isEmpty(this.n)) {
                            if (TextUtils.isEmpty(googleSignInOptions.n)) {
                                if (this.m != googleSignInOptions.m && this.k == googleSignInOptions.k && this.l == googleSignInOptions.l && TextUtils.equals(this.q, googleSignInOptions.q)) {
                                    return true;
                                }
                            }
                        } else if (!this.n.equals(googleSignInOptions.n)) {
                            if (this.m != googleSignInOptions.m) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.j)) {
                    if (TextUtils.isEmpty(this.n)) {
                        if (TextUtils.isEmpty(googleSignInOptions.n)) {
                            if (this.m != googleSignInOptions.m) {
                            }
                        }
                    } else if (!this.n.equals(googleSignInOptions.n)) {
                        if (this.m != googleSignInOptions.m) {
                        }
                    }
                }
                return false;
            }
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        kus kusVar = new kus((byte[]) null);
        kusVar.b(arrayList);
        kusVar.b(this.j);
        kusVar.b(this.n);
        kusVar.a(this.m);
        kusVar.a(this.k);
        kusVar.a(this.l);
        kusVar.b(this.q);
        return kusVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.h);
        mip.cM(parcel, 2, b());
        mip.cH(parcel, 3, this.j, i);
        mip.cw(parcel, 4, this.k);
        mip.cw(parcel, 5, this.l);
        mip.cw(parcel, 6, this.m);
        mip.cI(parcel, 7, this.n);
        mip.cI(parcel, 8, this.o);
        mip.cM(parcel, 9, this.p);
        mip.cI(parcel, 10, this.q);
        mip.cv(parcel, iCt);
    }
}
