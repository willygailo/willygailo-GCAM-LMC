package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class oec extends oeg {
    final /* synthetic */ oed a;

    public oec(oed oedVar, ofi ofiVar) {
        this.a = oedVar;
        new oxk("OnRequestInstallCallback", null);
        super(oedVar, ofiVar);
    }

    @Override // defpackage.oeg
    public final void c(Bundle bundle) {
        super.c(bundle);
        if (oed.a(bundle) != 0) {
            this.b.a(new oej(oed.a(bundle)));
            return;
        }
        ofi ofiVar = this.b;
        oed oedVar = this.a;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        ofiVar.b(new odr(i, i2, i3, bundle.getLong("additional.size.required"), odu.a(new File(oedVar.d.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
