package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;

/* JADX INFO: loaded from: classes2.dex */
public final class mgi implements mgk, mgg {
    private final Context a;
    private final String b;
    private final String c;
    private final odu d;

    public mgi(odu oduVar, Context context, ojc ojcVar, byte[] bArr, byte[] bArr2) {
        this.d = oduVar;
        this.a = context;
        this.c = ((mil) ojcVar.e(mil.c)).b;
        this.b = ((mil) ojcVar.e(mil.c)).a;
    }

    private final Intent c() {
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.a);
        Intent intent = new Intent();
        if (oje.d(defaultSmsPackage)) {
            intent.setPackage("com.android.sms");
        } else {
            intent.setPackage(defaultSmsPackage);
        }
        intent.setAction("android.intent.action.SEND");
        if (!oje.d(this.b) && !oje.d(this.c)) {
            intent.putExtra("address", this.c);
            intent.putExtra("sms_body", this.b);
        }
        intent.setType("text/plain");
        return intent;
    }

    @Override // defpackage.mgg
    public final Intent a() {
        return c();
    }

    @Override // defpackage.mgk
    public final void b() {
        this.d.b(c());
    }
}
