package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kri extends bmo implements IInterface {
    final /* synthetic */ kqh a;

    public kri() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kri(kqh kqhVar) {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
        this.a = kqhVar;
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        koh kofVar;
        koh kofVar2;
        koh kofVar3;
        koh kofVar4;
        krh krhVar;
        krh krhVar2 = null;
        koh kofVar5 = null;
        switch (i) {
            case 2:
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    kofVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar = iInterfaceQueryLocalInterface instanceof koh ? (koh) iInterfaceQueryLocalInterface : new kof(strongBinder);
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    kofVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar2 = iInterfaceQueryLocalInterface2 instanceof koh ? (koh) iInterfaceQueryLocalInterface2 : new kof(strongBinder2);
                }
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                    krhVar2 = iInterfaceQueryLocalInterface3 instanceof krh ? (krh) iInterfaceQueryLocalInterface3 : new krh(strongBinder3);
                }
                kqh kqhVar = this.a;
                byte[] bArr = (byte[]) kog.c(kofVar);
                byte[] bArr2 = (byte[]) kog.c(kofVar2);
                kre kreVar = new kre(krhVar2);
                pls plsVar = pls.a;
                kqhVar.d(string, bArr, bArr2, kreVar);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                bmp.b(parcel2, true);
                return true;
            case 4:
                String string2 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    kofVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar3 = iInterfaceQueryLocalInterface4 instanceof koh ? (koh) iInterfaceQueryLocalInterface4 : new kof(strongBinder4);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    kofVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar4 = iInterfaceQueryLocalInterface5 instanceof koh ? (koh) iInterfaceQueryLocalInterface5 : new kof(strongBinder5);
                }
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    krhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                    krhVar = iInterfaceQueryLocalInterface6 instanceof krh ? (krh) iInterfaceQueryLocalInterface6 : new krh(strongBinder6);
                }
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar5 = iInterfaceQueryLocalInterface7 instanceof koh ? (koh) iInterfaceQueryLocalInterface7 : new kof(strongBinder7);
                }
                pls plsVar2 = pls.a;
                byte[] bArr3 = (byte[]) kog.c(kofVar5);
                if (bArr3 != null) {
                    try {
                    } catch (ppp e) {
                        new kre(krhVar).a(8, e.getMessage());
                    }
                    break;
                }
                this.a.d(string2, (byte[]) kog.c(kofVar3), (byte[]) kog.c(kofVar4), new kre(krhVar));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
