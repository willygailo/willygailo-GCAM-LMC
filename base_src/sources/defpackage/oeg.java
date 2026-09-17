package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class oeg extends bmo implements IInterface {
    public final ofi b;
    final /* synthetic */ oed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeg(oed oedVar, ofi ofiVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.c = oedVar;
        this.b = ofiVar;
    }

    public void b(Bundle bundle) {
        this.c.a.e(this.b);
    }

    public void c(Bundle bundle) {
        this.c.a.e(this.b);
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                c((Bundle) bmp.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                b((Bundle) bmp.a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
