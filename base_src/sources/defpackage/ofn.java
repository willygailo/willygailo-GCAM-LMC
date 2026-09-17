package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ofn extends bmo implements IInterface {
    final /* synthetic */ dku a;

    public ofn() {
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofn(dku dkuVar) {
        super("com.google.android.systemui.elmyra.IElmyraServiceGestureListener");
        this.a = dkuVar;
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readFloat();
                parcel.readInt();
                synchronized (this.a.b) {
                    break;
                }
                return true;
            case 2:
                synchronized (this.a.b) {
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
