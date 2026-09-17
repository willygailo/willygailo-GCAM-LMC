package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mgl implements mgk, mgg {
    private final Context a;
    private final String b;
    private final Locale c;
    private final odu d;

    public mgl(odu oduVar, Context context, String str, Locale locale, byte[] bArr, byte[] bArr2) {
        this.d = oduVar;
        this.a = context;
        this.b = str;
        this.c = locale;
    }

    @Override // defpackage.mgg
    public final Intent a() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        try {
            this.a.getPackageManager().getPackageInfo("com.google.android.apps.translate", 1);
            intent.setPackage("com.google.android.apps.translate");
        } catch (PackageManager.NameNotFoundException e) {
        }
        intent.setData(new Uri.Builder().scheme("https").authority("translate.google.com").path("/m/translate").appendQueryParameter("q", this.b).appendQueryParameter("tl", this.c.getLanguage()).build());
        return intent;
    }

    @Override // defpackage.mgk
    public final void b() {
        this.d.b(a());
    }
}
