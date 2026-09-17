package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class fiu implements LocationListener {
    final Location a;
    boolean b = false;
    final String c;

    public fiu(String str) {
        this.c = str;
        this.a = new Location(str);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) {
            return;
        }
        this.a.set(location);
        this.b = true;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.b = false;
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        switch (i) {
            case 0:
            case 1:
                this.b = false;
                break;
        }
    }
}
