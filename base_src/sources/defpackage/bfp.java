package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class bfp implements bfg {
    private final bfg a;
    private final Resources b;

    public bfp(Resources resources, bfg bfgVar) {
        this.b = resources;
        this.a = bfgVar;
    }

    private final Uri c(Integer num) {
        try {
            String resourcePackageName = this.b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.b.getResourceEntryName(num.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String strValueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(strValueOf);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ bff a(Object obj, int i, int i2, azt aztVar) {
        Uri uriC = c((Integer) obj);
        if (uriC == null) {
            return null;
        }
        return this.a.a(uriC, i, i2, aztVar);
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
