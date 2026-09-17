package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pvz implements pwo {
    private static final String a = pvz.class.getSimpleName();
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;

    public pvz(ContentProviderClient contentProviderClient, String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.b = contentProviderClient;
        this.c = qmd.an(str, "device_params");
        this.d = qmd.an(str, "user_prefs");
        this.e = qmd.an(str, "phone_params");
        this.f = qmd.an(str, "sdk_configuration_params");
        qmd.an(str, "recent_headsets");
    }

    private final pqm g(pql pqlVar, Uri uri, String str) throws Throwable {
        byte[] bArrH = h(uri, str);
        if (bArrH == null) {
            return null;
        }
        try {
            return pqlVar.d(bArrH).j();
        } catch (ppp e) {
            Log.e(a, "Error reading params from ContentProvider", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    private final byte[] h(Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        ?? r0 = 0;
        try {
            try {
                cursorQuery = this.b.query(uri, null, str, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            if (blob == null) {
                                cursorQuery.close();
                                return null;
                            }
                            cursorQuery.close();
                            return blob;
                        }
                    } catch (CursorIndexOutOfBoundsException e) {
                        e = e;
                        Log.e(a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (RemoteException e2) {
                        e = e2;
                        Log.e(a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        Log.e(a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                }
                String str2 = a;
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Invalid params result from ContentProvider query: ");
                sb.append(strValueOf);
                Log.e(str2, sb.toString());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (CursorIndexOutOfBoundsException e4) {
            e = e4;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (RemoteException e5) {
            e = e5;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (IllegalArgumentException e6) {
            e = e6;
            cursorQuery = null;
            Log.e(a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    @Override // defpackage.pwo
    public final ozn a(pxg pxgVar) {
        String strEncodeToString = Base64.encodeToString(pxgVar.g(), 0);
        ozn oznVar = pwz.c;
        poy poyVar = (poy) oznVar.G(5);
        poyVar.o(oznVar);
        return (ozn) g(poyVar, this.f, strEncodeToString);
    }

    @Override // defpackage.pwo
    public final pxd b() {
        return (pxd) g(pxd.a.m(), this.c, null);
    }

    @Override // defpackage.pwo
    public final pxe c() {
        return (pxe) g(pxe.e.m(), this.e, null);
    }

    @Override // defpackage.pwo
    public final pxf d() {
        return (pxf) g(pxf.a.m(), this.d, null);
    }

    @Override // defpackage.pwo
    public final void e() {
        this.b.close();
    }

    @Override // defpackage.pwo
    public final boolean f(pxd pxdVar) {
        int iUpdate;
        Uri uri = this.c;
        try {
            if (pxdVar == null) {
                iUpdate = this.b.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", pxdVar.g());
                iUpdate = this.b.update(uri, contentValues, null, null);
            }
            return iUpdate > 0;
        } catch (RemoteException e) {
            Log.e(a, "Failed to write params to ContentProvider", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(a, "Insufficient permissions to write params to ContentProvider", e2);
            return false;
        }
    }
}
