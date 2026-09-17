package defpackage;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class mfj extends AsyncTask {
    final /* synthetic */ mfk a;
    private int b;
    private int c;

    public mfj(mfk mfkVar) {
        this.a = mfkVar;
    }

    private final int b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        if (mfk.c.contains(Build.MANUFACTURER)) {
            try {
                return this.a.e.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled ? 2 : 3;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
            }
        } else {
            try {
                try {
                    cursorQuery = this.a.d.getContentResolver().query(Uri.parse(str), null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() != 0) {
                                if (!cursorQuery.moveToFirst()) {
                                    cursorQuery.close();
                                    return 16;
                                }
                                if (cursorQuery.getType(0) != 3) {
                                    cursorQuery.close();
                                    return 17;
                                }
                                try {
                                    int i = Integer.parseInt(cursorQuery.getString(0));
                                    if (i > 12) {
                                        i = 12;
                                    }
                                    if (mip.E(i) == 0) {
                                        cursorQuery.close();
                                        return 14;
                                    }
                                    int iE = mip.E(i);
                                    cursorQuery.close();
                                    return iE;
                                } catch (NumberFormatException e2) {
                                    Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", e2);
                                    cursorQuery.close();
                                    return 18;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return 6;
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                }
            } catch (Exception e3) {
                Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", e3);
                return 6;
            }
        }
    }

    public final void a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        mfk mfkVar = this.a;
        mfx mfxVar = mfkVar.g;
        poy poyVar = (poy) mfxVar.G(5);
        poyVar.o(mfxVar);
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        mfx mfxVar2 = (mfx) poyVar.b;
        mfx mfxVar3 = mfx.f;
        mfxVar2.d = i - 2;
        int i3 = mfxVar2.a | 4;
        mfxVar2.a = i3;
        mfxVar2.e = i2 - 2;
        mfxVar2.a = i3 | 8;
        mfkVar.g = (mfx) poyVar.j();
        mfk mfkVar2 = this.a;
        mfkVar2.h = true;
        Iterator it = mfkVar2.f.iterator();
        while (it.hasNext()) {
            ((mfh) it.next()).a(this.a.g);
        }
        this.a.f.clear();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b = b(mfk.a);
        this.c = b(mfk.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        a(this.b, this.c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.a.d.getMainLooper()).postDelayed(new mfi(this), 4000L);
    }
}
