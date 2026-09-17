package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;

/* JADX INFO: loaded from: classes2.dex */
public final class hlx implements ServiceConnection {
    final /* synthetic */ RemoteControlService a;

    public hlx(RemoteControlService remoteControlService) {
        this.a = remoteControlService;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kcw kcwVar;
        RemoteControlService remoteControlService = this.a;
        if (iBinder == null) {
            kcwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.photos.cameraassistant.ICameraAssistantService");
            kcwVar = iInterfaceQueryLocalInterface instanceof kcw ? (kcw) iInterfaceQueryLocalInterface : new kcw(iBinder);
        }
        remoteControlService.h = kcwVar;
        this.a.c = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        RemoteControlService remoteControlService = this.a;
        remoteControlService.h = null;
        remoteControlService.c = false;
    }
}
