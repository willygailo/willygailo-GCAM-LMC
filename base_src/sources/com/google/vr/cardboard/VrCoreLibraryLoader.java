package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.bmo;
import defpackage.bmp;
import defpackage.pxc;
import defpackage.pxj;
import defpackage.pyi;
import defpackage.pyj;
import defpackage.qmd;

/* JADX INFO: loaded from: classes.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        return 0L;
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, pxc.b, pxc.a);
    }

    public static long loadNativeGvrLibrary(Context context, pxc pxcVar, pxc pxcVar2) {
        int i;
        int i2;
        int i3;
        int i4;
        pyi pyiVar;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new pxj(8);
                }
                if (!applicationInfo.enabled) {
                    throw new pxj(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new pxj(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new pxj(4);
                }
                String strSubstring = string.substring(1);
                pxc pxcVarA = pxc.a(strSubstring);
                if (pxcVarA == null) {
                    throw new pxj(4);
                }
                int i5 = pxcVarA.c;
                int i6 = pxcVar.c;
                if (i5 <= i6 && (i5 < i6 || ((i = pxcVarA.d) <= (i2 = pxcVar.d) && (i < i2 || ((i3 = pxcVarA.e) <= (i4 = pxcVar.e) && i3 < i4))))) {
                    Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", strSubstring, pxcVar.toString()));
                    throw new pxj(4);
                }
                Context contextAk = qmd.ak(context);
                qmd.ak(context);
                int i7 = qmd.t;
                pyj pyjVar = null;
                if (qmd.u == null) {
                    IBinder iBinderAl = qmd.al(qmd.ak(context).getClassLoader());
                    if (iBinderAl == null) {
                        pyiVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderAl.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                        pyiVar = iInterfaceQueryLocalInterface instanceof pyi ? (pyi) iInterfaceQueryLocalInterface : new pyi(iBinderAl);
                    }
                    qmd.u = pyiVar;
                }
                pyi pyiVar2 = qmd.u;
                bmo bmoVarB = ObjectWrapper.b(contextAk);
                bmo bmoVarB2 = ObjectWrapper.b(context);
                Parcel parcelA = pyiVar2.a();
                bmp.e(parcelA, bmoVarB);
                bmp.e(parcelA, bmoVarB2);
                Parcel parcelY = pyiVar2.y(4, parcelA);
                IBinder strongBinder = parcelY.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    pyjVar = iInterfaceQueryLocalInterface2 instanceof pyj ? (pyj) iInterfaceQueryLocalInterface2 : new pyj(strongBinder);
                }
                parcelY.recycle();
                if (pyjVar == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (i7 >= 19) {
                    String string2 = pxcVar.toString();
                    String string3 = pxcVar2.toString();
                    Parcel parcelA2 = pyjVar.a();
                    parcelA2.writeString(string2);
                    parcelA2.writeString(string3);
                    Parcel parcelY2 = pyjVar.y(5, parcelA2);
                    long j = parcelY2.readLong();
                    parcelY2.recycle();
                    return j;
                }
                int i8 = pxcVar2.c;
                int i9 = pxcVar2.d;
                int i10 = pxcVar2.e;
                Parcel parcelA3 = pyjVar.a();
                parcelA3.writeInt(i8);
                parcelA3.writeInt(i9);
                parcelA3.writeInt(i10);
                Parcel parcelY3 = pyjVar.y(2, parcelA3);
                long j2 = parcelY3.readLong();
                parcelY3.recycle();
                return j2;
            } catch (PackageManager.NameNotFoundException e) {
                throw new pxj(VrCoreUtils.a(context));
            }
        } catch (RemoteException e2) {
            e = e2;
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
            sb.append("Failed to load native GVR library from VrCore:\n  ");
            sb.append(strValueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String strValueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 49);
            sb2.append("Failed to load native GVR library from VrCore:\n  ");
            sb2.append(strValueOf2);
            Log.e("VrCoreLibraryLoader", sb2.toString());
            return 0L;
        } catch (IllegalStateException e4) {
            e = e4;
            String strValueOf3 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 49);
            sb3.append("Failed to load native GVR library from VrCore:\n  ");
            sb3.append(strValueOf3);
            Log.e("VrCoreLibraryLoader", sb3.toString());
            return 0L;
        } catch (SecurityException e5) {
            e = e5;
            String strValueOf4 = String.valueOf(e);
            StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf4).length() + 49);
            sb4.append("Failed to load native GVR library from VrCore:\n  ");
            sb4.append(strValueOf4);
            Log.e("VrCoreLibraryLoader", sb4.toString());
            return 0L;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            String strValueOf5 = String.valueOf(e);
            StringBuilder sb5 = new StringBuilder(String.valueOf(strValueOf5).length() + 49);
            sb5.append("Failed to load native GVR library from VrCore:\n  ");
            sb5.append(strValueOf5);
            Log.e("VrCoreLibraryLoader", sb5.toString());
            return 0L;
        } catch (pxj e7) {
            e = e7;
            String strValueOf6 = String.valueOf(e);
            StringBuilder sb6 = new StringBuilder(String.valueOf(strValueOf6).length() + 49);
            sb6.append("Failed to load native GVR library from VrCore:\n  ");
            sb6.append(strValueOf6);
            Log.e("VrCoreLibraryLoader", sb6.toString());
            return 0L;
        }
    }
}
