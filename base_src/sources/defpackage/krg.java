package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class krg extends bmo implements IInterface {
    private final kqg a;
    private final oke b;
    private final Object c;
    private boolean d;

    public krg() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }

    public krg(kqg kqgVar, oke okeVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        this.c = new Object();
        this.d = false;
        this.a = kqgVar;
        this.b = okeVar;
    }

    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
            } else {
                this.d = true;
                this.a.close();
            }
        }
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        krf krfVar;
        switch (i) {
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    krfVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                    krfVar = iInterfaceQueryLocalInterface instanceof krf ? (krf) iInterfaceQueryLocalInterface : new krf(strongBinder);
                }
                obr.aF(krfVar != null);
                synchronized (this.c) {
                    if (this.d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
                    } else {
                        this.a.a(new krd(this, krfVar, this.b));
                    }
                }
                break;
            case 3:
                parcel.readInt();
                synchronized (this.c) {
                    if (this.d) {
                        Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                    } else {
                        this.a.b();
                    }
                }
                break;
            case 4:
                b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
