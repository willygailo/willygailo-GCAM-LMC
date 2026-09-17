package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class kgf {
    private static kgf d = null;
    final kgk a;
    GoogleSignInAccount b;
    GoogleSignInOptions c;

    private kgf(Context context) {
        kgk kgkVarC = kgk.c(context);
        this.a = kgkVarC;
        this.b = kgkVarC.a();
        this.c = kgkVarC.b();
    }

    public static synchronized kgf c(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized kgf f(Context context) {
        kgf kgfVar;
        kgfVar = d;
        if (kgfVar == null) {
            kgfVar = new kgf(context);
            d = kgfVar;
        }
        return kgfVar;
    }

    public final synchronized GoogleSignInAccount a() {
        return this.b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.c;
    }

    public final synchronized void d() {
        kgk kgkVar = this.a;
        kgkVar.a.lock();
        try {
            kgkVar.b.edit().clear().apply();
            kgkVar.a.unlock();
            this.b = null;
            this.c = null;
        } catch (Throwable th) {
            kgkVar.a.unlock();
            throw th;
        }
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        kgk kgkVar = this.a;
        mip.dk(googleSignInOptions);
        kgkVar.f("defaultGoogleSignInAccount", googleSignInAccount.i);
        mip.dk(googleSignInOptions);
        String str = googleSignInAccount.i;
        String strE = kgkVar.e("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.i);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, cdg.o);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            kgkVar.f(strE, jSONObject.toString());
            String strE2 = kgkVar.e("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.i, GoogleSignInOptions.g);
                Iterator it = googleSignInOptions.i.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.j;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.k);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.m);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.l);
                if (!TextUtils.isEmpty(googleSignInOptions.n)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.n);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.o)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.o);
                }
                kgkVar.f(strE2, jSONObject2.toString());
                this.b = googleSignInAccount;
                this.c = googleSignInOptions;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
