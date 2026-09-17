package defpackage;

import android.location.Location;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ksx extends bmo implements ksy {
    private final kkt a;

    public ksx() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public ksx(kkt kktVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.a = kktVar;
    }

    public final synchronized void b(Location location) {
        this.a.b(new ktj(location));
    }

    public final synchronized void c() {
        this.a.a();
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b((Location) bmp.a(parcel, Location.CREATOR));
        return true;
    }
}
