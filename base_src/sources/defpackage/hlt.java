package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class hlt extends bmo implements IInterface {
    final /* synthetic */ RemoteControlService a;

    public hlt() {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlt(RemoteControlService remoteControlService) {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
        this.a = remoteControlService;
    }

    public final boolean b() {
        RemoteControlService remoteControlService = this.a;
        boolean z = remoteControlService.b.c > 0;
        if (remoteControlService.f()) {
            return z;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(2);
                return true;
            case 2:
                boolean zF = this.a.f();
                parcel2.writeNoException();
                bmp.b(parcel2, zF);
                return true;
            case 3:
                boolean zB = b();
                parcel2.writeNoException();
                bmp.b(parcel2, zB);
                return true;
            case 4:
                int i2 = parcel.readInt();
                if (this.a.f()) {
                    RemoteControlService remoteControlService = this.a;
                    remoteControlService.d = i2;
                    remoteControlService.c().b = 1 == (this.a.d & 1);
                }
                return true;
            case 5:
                int i3 = parcel.readInt();
                boolean zF2 = bmp.f(parcel);
                if (this.a.f()) {
                    boolean zB2 = b();
                    if (zB2 || i3 == 5) {
                        switch (i3) {
                            case 1:
                                this.a.d(1, zF2);
                                break;
                            case 2:
                                this.a.d(2, zF2);
                                break;
                            case 3:
                                this.a.d(3, zF2);
                                break;
                            case 4:
                                this.a.d(4, zF2);
                                break;
                            case 5:
                                if (zB2) {
                                    this.a.d(5, zF2);
                                } else if (zF2) {
                                    this.a.e(true);
                                }
                                break;
                            case 6:
                                if (zB2) {
                                    this.a.d(6, zF2);
                                } else if (zF2) {
                                    this.a.e(false);
                                }
                                break;
                            case 7:
                                this.a.d(7, zF2);
                                break;
                            default:
                                ((oug) ((oug) RemoteControlService.a.b()).G((char) 2540)).o("handleRemoteKeyEvent: Unknown Key event received. Ignoring it.");
                                break;
                        }
                    } else if (i3 == 6) {
                        if (zB2) {
                            this.a.d(6, zF2);
                        } else if (zF2) {
                            this.a.e(false);
                        }
                    }
                }
                return true;
            case 6:
                int i4 = parcel.readInt();
                if (this.a.f()) {
                    if (i4 < 0 || i4 > 100) {
                        ((oug) ((oug) RemoteControlService.a.b()).G(2541)).p("Ignoring invalid value for external case battery: %d", i4);
                    } else {
                        hlv hlvVarC = this.a.c();
                        hlvVarC.c = i4;
                        Iterator it = hlvVarC.h.iterator();
                        while (it.hasNext()) {
                            ((hlu) it.next()).a(i4);
                        }
                    }
                }
                return true;
            case 7:
                float f = parcel.readFloat();
                if (this.a.f()) {
                    hlv hlvVarC2 = this.a.c();
                    hlvVarC2.d = f;
                    hlvVarC2.e = System.currentTimeMillis();
                    Iterator it2 = hlvVarC2.h.iterator();
                    while (it2.hasNext()) {
                        ((hlu) it2.next()).c(f);
                    }
                }
                return true;
            case 8:
                float f2 = parcel.readFloat();
                if (this.a.f()) {
                    hlv hlvVarC3 = this.a.c();
                    hlvVarC3.f = f2;
                    hlvVarC3.g = System.currentTimeMillis();
                    Iterator it3 = hlvVarC3.h.iterator();
                    while (it3.hasNext()) {
                        ((hlu) it3.next()).d(f2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
