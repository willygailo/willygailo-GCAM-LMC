package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class kec implements ServiceConnection {
    public volatile boolean a;
    final /* synthetic */ ked b;
    public volatile key c;

    protected kec(ked kedVar) {
        this.b = kedVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mip.dp("AnalyticsServiceConnection.onServiceConnected");
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.b.n("Service connected with null binder");
                    notifyAll();
                    return;
                }
                key keyVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        keyVar = iInterfaceQueryLocalInterface instanceof key ? (key) iInterfaceQueryLocalInterface : new key(iBinder);
                        try {
                            this.b.q("Bound to IAnalyticsService interface");
                        } catch (RemoteException e) {
                            this.b.n("Service connect failed to get IAnalyticsService");
                        }
                    } else {
                        this.b.o("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e2) {
                }
                if (keyVar == null) {
                    try {
                        knx.a().b(this.b.d(), this.b.a);
                    } catch (IllegalArgumentException e3) {
                    }
                } else if (this.a) {
                    this.c = keyVar;
                } else {
                    this.b.t("onServiceConnected received after the timeout limit");
                    this.b.e().b(new kea(this, keyVar));
                }
                notifyAll();
            } catch (Throwable th) {
                notifyAll();
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        mip.dp("AnalyticsServiceConnection.onServiceDisconnected");
        this.b.e().b(new keb(this, componentName));
    }
}
