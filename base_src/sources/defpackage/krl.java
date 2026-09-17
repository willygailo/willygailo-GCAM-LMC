package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class krl implements krm {
    private static kor b;
    private static final Object a = new Object();
    private static boolean c = false;

    public krl(Context context) {
    }

    @Override // defpackage.krm
    public final IInterface a(Context context, String str, kro kroVar) throws krn {
        kor korVar;
        kor korVarC;
        ThreadLocal threadLocal;
        Boolean bool;
        koh kofVar;
        kot kotVar;
        Boolean boolValueOf;
        koh kofVar2;
        try {
            synchronized (a) {
                if (b == null) {
                    try {
                        Boolean bool2 = kor.a;
                        kom komVar = (kom) kor.c.get();
                        kom komVar2 = new kom();
                        kor.c.set(komVar2);
                        long jLongValue = ((Long) kor.d.get()).longValue();
                        try {
                            kor.d.set(Long.valueOf(SystemClock.elapsedRealtime()));
                            koq koqVarCj = mip.cj(context, kor.e);
                            int i = koqVarCj.c;
                            if (i == 0 || ((i == -1 && koqVarCj.a == 0) || (i == 1 && koqVarCj.b == 0))) {
                                int i2 = koqVarCj.a;
                                int i3 = koqVarCj.b;
                                StringBuilder sb = new StringBuilder(91);
                                sb.append("No acceptable module found. Local version is ");
                                sb.append(i2);
                                sb.append(" and remote version is ");
                                sb.append(i3);
                                sb.append(".");
                                throw new koo(sb.toString());
                            }
                            if (i == -1) {
                                korVarC = kor.c(context);
                                if (jLongValue == 0) {
                                    kor.d.remove();
                                } else {
                                    kor.d.set(Long.valueOf(jLongValue));
                                }
                                Cursor cursor = komVar2.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                kor.c.set(komVar);
                            } else {
                                if (i != 1) {
                                    StringBuilder sb2 = new StringBuilder(47);
                                    sb2.append("VersionPolicy returned invalid code:");
                                    sb2.append(0);
                                    throw new koo(sb2.toString());
                                }
                                try {
                                    int i4 = koqVarCj.b;
                                    try {
                                        synchronized (kor.class) {
                                            bool = kor.a;
                                        }
                                        if (bool == null) {
                                            throw new koo("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            synchronized (kor.class) {
                                                kotVar = kor.f;
                                            }
                                            if (kotVar == null) {
                                                throw new koo("DynamiteLoaderV2 was not cached.");
                                            }
                                            kom komVar3 = (kom) kor.c.get();
                                            if (komVar3 == null || komVar3.a == null) {
                                                throw new koo("No result cursor");
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = komVar3.a;
                                            kog.b(null);
                                            synchronized (kor.class) {
                                                boolValueOf = Boolean.valueOf(kor.b >= 2);
                                            }
                                            if (boolValueOf.booleanValue()) {
                                                koh kohVarB = kog.b(applicationContext);
                                                koh kohVarB2 = kog.b(cursor2);
                                                Parcel parcelA = kotVar.a();
                                                bmp.e(parcelA, kohVarB);
                                                parcelA.writeString("com.google.android.gms.brella_dynamite");
                                                parcelA.writeInt(i4);
                                                bmp.e(parcelA, kohVarB2);
                                                Parcel parcelY = kotVar.y(3, parcelA);
                                                IBinder strongBinder = parcelY.readStrongBinder();
                                                if (strongBinder == null) {
                                                    kofVar2 = null;
                                                } else {
                                                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    kofVar2 = iInterfaceQueryLocalInterface instanceof koh ? (koh) iInterfaceQueryLocalInterface : new kof(strongBinder);
                                                }
                                                parcelY.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                koh kohVarB3 = kog.b(applicationContext);
                                                koh kohVarB4 = kog.b(cursor2);
                                                Parcel parcelA2 = kotVar.a();
                                                bmp.e(parcelA2, kohVarB3);
                                                parcelA2.writeString("com.google.android.gms.brella_dynamite");
                                                parcelA2.writeInt(i4);
                                                bmp.e(parcelA2, kohVarB4);
                                                Parcel parcelY2 = kotVar.y(2, parcelA2);
                                                IBinder strongBinder2 = parcelY2.readStrongBinder();
                                                if (strongBinder2 == null) {
                                                    kofVar2 = null;
                                                } else {
                                                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    kofVar2 = iInterfaceQueryLocalInterface2 instanceof koh ? (koh) iInterfaceQueryLocalInterface2 : new kof(strongBinder2);
                                                }
                                                parcelY2.recycle();
                                            }
                                            Context context2 = (Context) kog.c(kofVar2);
                                            if (context2 == null) {
                                                throw new koo("Failed to get module context");
                                            }
                                            korVarC = new kor(context2);
                                        } else {
                                            kos kosVarD = kor.d(context);
                                            if (kosVarD == null) {
                                                throw new koo("Failed to create IDynamiteLoader.");
                                            }
                                            int iE = kosVarD.e();
                                            if (iE >= 3) {
                                                kom komVar4 = (kom) kor.c.get();
                                                if (komVar4 == null) {
                                                    throw new koo("No cached result cursor holder");
                                                }
                                                koh kohVarB5 = kog.b(context);
                                                koh kohVarB6 = kog.b(komVar4.a);
                                                Parcel parcelA3 = kosVarD.a();
                                                bmp.e(parcelA3, kohVarB5);
                                                parcelA3.writeString("com.google.android.gms.brella_dynamite");
                                                parcelA3.writeInt(i4);
                                                bmp.e(parcelA3, kohVarB6);
                                                Parcel parcelY3 = kosVarD.y(8, parcelA3);
                                                IBinder strongBinder3 = parcelY3.readStrongBinder();
                                                if (strongBinder3 == null) {
                                                    kofVar = null;
                                                } else {
                                                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    kofVar = iInterfaceQueryLocalInterface3 instanceof koh ? (koh) iInterfaceQueryLocalInterface3 : new kof(strongBinder3);
                                                }
                                                parcelY3.recycle();
                                            } else if (iE == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                koh kohVarB7 = kog.b(context);
                                                Parcel parcelA4 = kosVarD.a();
                                                bmp.e(parcelA4, kohVarB7);
                                                parcelA4.writeString("com.google.android.gms.brella_dynamite");
                                                parcelA4.writeInt(i4);
                                                Parcel parcelY4 = kosVarD.y(4, parcelA4);
                                                IBinder strongBinder4 = parcelY4.readStrongBinder();
                                                if (strongBinder4 == null) {
                                                    kofVar = null;
                                                } else {
                                                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    kofVar = iInterfaceQueryLocalInterface4 instanceof koh ? (koh) iInterfaceQueryLocalInterface4 : new kof(strongBinder4);
                                                }
                                                parcelY4.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                koh kohVarB8 = kog.b(context);
                                                Parcel parcelA5 = kosVarD.a();
                                                bmp.e(parcelA5, kohVarB8);
                                                parcelA5.writeString("com.google.android.gms.brella_dynamite");
                                                parcelA5.writeInt(i4);
                                                Parcel parcelY5 = kosVarD.y(2, parcelA5);
                                                IBinder strongBinder5 = parcelY5.readStrongBinder();
                                                if (strongBinder5 == null) {
                                                    kofVar = null;
                                                } else {
                                                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                    kofVar = iInterfaceQueryLocalInterface5 instanceof koh ? (koh) iInterfaceQueryLocalInterface5 : new kof(strongBinder5);
                                                }
                                                parcelY5.recycle();
                                            }
                                            if (kog.c(kofVar) == null) {
                                                throw new koo("Failed to load remote module.");
                                            }
                                            korVarC = new kor((Context) kog.c(kofVar));
                                        }
                                        if (jLongValue == 0) {
                                            kor.d.remove();
                                        } else {
                                            kor.d.set(Long.valueOf(jLongValue));
                                        }
                                        Cursor cursor3 = komVar2.a;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        threadLocal = kor.c;
                                        threadLocal.set(komVar);
                                    } catch (RemoteException e) {
                                        throw new koo("Failed to load remote module.", e);
                                    } catch (koo e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        throw new koo("Failed to load remote module.", th);
                                    }
                                } catch (koo e3) {
                                    String strValueOf = String.valueOf(e3.getMessage());
                                    Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                                    int i5 = koqVarCj.a;
                                    if (i5 == 0 || mip.cj(context, new kon(i5)).c != -1) {
                                        throw new koo("Remote load failed. No local fallback found.", e3);
                                    }
                                    korVarC = kor.c(context);
                                    if (jLongValue == 0) {
                                        kor.d.remove();
                                    } else {
                                        kor.d.set(Long.valueOf(jLongValue));
                                    }
                                    Cursor cursor4 = komVar2.a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    threadLocal = kor.c;
                                }
                            }
                            b = korVarC;
                        } catch (Throwable th2) {
                            if (jLongValue == 0) {
                                kor.d.remove();
                            } else {
                                kor.d.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor5 = komVar2.a;
                            if (cursor5 != null) {
                                cursor5.close();
                            }
                            kor.c.set(komVar);
                            throw th2;
                        }
                    } catch (koo e4) {
                        if (c) {
                            throw e4;
                        }
                        context.sendBroadcast(new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()));
                        c = true;
                        throw e4;
                    }
                }
                korVar = b;
            }
            IBinder iBinderB = korVar.b(str);
            IInterface iInterfaceA = iBinderB == null ? null : kroVar.a(iBinderB);
            if (iInterfaceA == null) {
                throw new krn(str.length() != 0 ? "null impl for ".concat(str) : new String("null impl for "));
            }
            return iInterfaceA;
        } catch (koo e5) {
            String message = e5.getMessage();
            StringBuilder sb3 = new StringBuilder(str.length() + 21 + String.valueOf(message).length());
            sb3.append("Couldn't load impl ");
            sb3.append(str);
            sb3.append(": ");
            sb3.append(message);
            throw new krn(sb3.toString(), e5);
        }
    }
}
