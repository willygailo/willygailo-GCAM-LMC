package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ksc implements kqi {
    private final krt a;

    public ksc(krt krtVar) {
        this.a = krtVar;
    }

    public static kvk c(final Context context, final Executor executor, final kqk kqkVar) {
        final kvm kvmVar = new kvm();
        executor.execute(new Runnable() { // from class: kry
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context2 = context;
                kvm kvmVar2 = kvmVar;
                Executor executor2 = executor;
                kqk kqkVar2 = kqkVar;
                synchronized (kqf.a) {
                    z = kqf.b;
                }
                if (!z) {
                    Class<?> cls = context2.getApplicationContext().getClass();
                    if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 146);
                        sb.append("Cannot create in-app trainer: android.app.Application class has been subclassed (");
                        sb.append(name);
                        sb.append(") and BrellaInit.myAppCanHandleMultipleProcesses() was not called");
                        kvmVar2.c(new kig(new Status(10, sb.toString())));
                        return;
                    }
                }
                try {
                    krt krtVar = (krt) krp.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", krw.c);
                    krz krzVar = new krz(kvmVar2, krtVar);
                    try {
                        koh kohVarB = kog.b(context2);
                        koh kohVarB2 = kog.b(executor2);
                        Parcel parcelA = krtVar.a();
                        bmp.e(parcelA, kohVarB);
                        bmp.e(parcelA, kohVarB2);
                        bmp.c(parcelA, kqkVar2);
                        bmp.e(parcelA, krzVar);
                        Parcel parcelY = krtVar.y(10, parcelA);
                        boolean zF = bmp.f(parcelY);
                        parcelY.recycle();
                        if (zF) {
                            return;
                        }
                        if (kqkVar2.k != null) {
                            kvmVar2.c(new kig(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                            return;
                        }
                        try {
                            koh kohVarB3 = kog.b(context2);
                            koh kohVarB4 = kog.b(executor2);
                            Parcel parcelA2 = krtVar.a();
                            bmp.e(parcelA2, kohVarB3);
                            bmp.e(parcelA2, kohVarB4);
                            bmp.c(parcelA2, kqkVar2);
                            bmp.e(parcelA2, krzVar);
                            Parcel parcelY2 = krtVar.y(9, parcelA2);
                            boolean zF2 = bmp.f(parcelY2);
                            parcelY2.recycle();
                            if (zF2) {
                                return;
                            }
                            if (kqkVar2.b().length > 0) {
                                kvmVar2.c(new kig(new Status(10, "Context data is not supported.")));
                                return;
                            }
                            try {
                                koh kohVarB5 = kog.b(context2);
                                koh kohVarB6 = kog.b(executor2);
                                Parcel parcelA3 = krtVar.a();
                                bmp.e(parcelA3, kohVarB5);
                                bmp.e(parcelA3, kohVarB6);
                                bmp.c(parcelA3, kqkVar2);
                                bmp.e(parcelA3, krzVar);
                                Parcel parcelY3 = krtVar.y(8, parcelA3);
                                boolean zF3 = bmp.f(parcelY3);
                                parcelY3.recycle();
                                if (zF3) {
                                    return;
                                }
                                if (kqkVar2.d != null && kqkVar2.j != null) {
                                    kvmVar2.c(new kig(new Status(10, "Training interval is not supported for federated computation.")));
                                    return;
                                }
                                try {
                                    koh kohVarB7 = kog.b(context2);
                                    koh kohVarB8 = kog.b(executor2);
                                    Parcel parcelA4 = krtVar.a();
                                    bmp.e(parcelA4, kohVarB7);
                                    bmp.e(parcelA4, kohVarB8);
                                    bmp.c(parcelA4, kqkVar2);
                                    bmp.e(parcelA4, krzVar);
                                    Parcel parcelY4 = krtVar.y(7, parcelA4);
                                    boolean zF4 = bmp.f(parcelY4);
                                    parcelY4.recycle();
                                    if (zF4) {
                                        return;
                                    }
                                    int i = kqkVar2.e;
                                    if (i != 0 && i != 1) {
                                        kvmVar2.c(new kig(new Status(10, "Unsupported AttestationMode")));
                                        return;
                                    }
                                    try {
                                        koh kohVarB9 = kog.b(context2);
                                        koh kohVarB10 = kog.b(executor2);
                                        Parcel parcelA5 = krtVar.a();
                                        bmp.e(parcelA5, kohVarB9);
                                        bmp.e(parcelA5, kohVarB10);
                                        bmp.c(parcelA5, kqkVar2);
                                        bmp.e(parcelA5, krzVar);
                                        Parcel parcelY5 = krtVar.y(6, parcelA5);
                                        boolean zF5 = bmp.f(parcelY5);
                                        parcelY5.recycle();
                                        if (zF5) {
                                            return;
                                        }
                                        kvmVar2.c(new kig(new Status(17, "Failed to init impl")));
                                    } catch (RemoteException e) {
                                        kvmVar2.c(new kig(new Status(8, okd.b(e))));
                                    }
                                } catch (RemoteException e2) {
                                    kvmVar2.c(new kig(new Status(8, okd.b(e2))));
                                }
                            } catch (RemoteException e3) {
                                kvmVar2.c(new kig(new Status(8, okd.b(e3))));
                            }
                        } catch (RemoteException e4) {
                            kvmVar2.c(new kig(new Status(8, okd.b(e4))));
                        }
                    } catch (RemoteException e5) {
                        kvmVar2.c(new kig(new Status(8, okd.b(e5))));
                    }
                } catch (krn e6) {
                    String strValueOf = String.valueOf(e6.getMessage());
                    kvmVar2.c(new kig(new Status(17, strValueOf.length() != 0 ? "Cannot create in-app trainer: ".concat(strValueOf) : new String("Cannot create in-app trainer: "))));
                }
            }
        });
        return kvmVar.a;
    }

    @Override // defpackage.kqi
    public final kvk a() {
        kvm kvmVar = new kvm();
        ksb ksbVar = new ksb(kvmVar);
        try {
            krt krtVar = this.a;
            Parcel parcelA = krtVar.a();
            bmp.e(parcelA, ksbVar);
            krtVar.z(4, parcelA);
        } catch (RemoteException e) {
            kvmVar.c(new kig(new Status(8, okd.b(e))));
        }
        return kvmVar.a;
    }

    @Override // defpackage.kqi
    public final kvk b() {
        kvm kvmVar = new kvm();
        ksa ksaVar = new ksa(kvmVar);
        try {
            krt krtVar = this.a;
            Parcel parcelA = krtVar.a();
            parcelA.writeInt(0);
            bmp.e(parcelA, ksaVar);
            krtVar.z(3, parcelA);
        } catch (RemoteException e) {
            kvmVar.c(new kig(new Status(8, okd.b(e))));
        }
        return kvmVar.a;
    }
}
