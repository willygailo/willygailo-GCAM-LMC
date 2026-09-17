package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class oet extends oen {
    final /* synthetic */ IBinder a;
    final /* synthetic */ oev b;

    public oet(oev oevVar, IBinder iBinder) {
        this.b = oevVar;
        this.a = iBinder;
    }

    @Override // defpackage.oen
    public final void a() {
        oef oefVar;
        oew oewVar = this.b.a;
        IBinder iBinder = this.a;
        if (iBinder == null) {
            oefVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            oefVar = iInterfaceQueryLocalInterface instanceof oef ? (oef) iInterfaceQueryLocalInterface : new oef(iBinder);
        }
        oewVar.j = oefVar;
        oew oewVar2 = this.b.a;
        try {
            ((bmn) oewVar2.j).a.linkToDeath(oewVar2.h, 0);
        } catch (RemoteException e) {
            oewVar2.k.h(e, "linkToDeath failed", new Object[0]);
        }
        this.b.a.e = false;
        Iterator it = this.b.a.b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.a.b.clear();
    }
}
