package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class kor {
    public static Boolean a;
    public static int b = -1;
    public static final ThreadLocal c = new ThreadLocal();
    public static final ThreadLocal d = new kok();
    public static final kop e = new kol();
    public static kot f;
    private static String g;
    private static boolean h;
    private static kos j;
    private final Context i;

    public kor(Context context) {
        mip.dk(context);
        this.i = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (mip.dx(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 51 + str.length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e3) {
            String strValueOf2 = String.valueOf(e3.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static kor c(Context context) {
        return new kor(context.getApplicationContext());
    }

    public static kos d(Context context) {
        kos kosVar;
        synchronized (kor.class) {
            kos kosVar2 = j;
            if (kosVar2 != null) {
                return kosVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kosVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kosVar = iInterfaceQueryLocalInterface instanceof kos ? (kos) iInterfaceQueryLocalInterface : new kos(iBinder);
                }
                if (kosVar != null) {
                    j = kosVar;
                    return kosVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0214 A[Catch: all -> 0x021b, TryCatch #13 {, blocks: (B:3:0x0002, B:55:0x00c5, B:58:0x00cc, B:67:0x00f2, B:96:0x0179, B:100:0x0188, B:126:0x0214, B:127:0x0217, B:121:0x020c, B:61:0x00d2, B:63:0x00e4, B:65:0x00ee, B:64:0x00e9, B:130:0x021a, B:4:0x0003, B:7:0x0008, B:8:0x0024, B:53:0x00c2, B:34:0x0079, B:37:0x007c, B:46:0x0096, B:54:0x00c4, B:52:0x009c), top: B:143:0x0002, inners: #11, #12 }] */
    /* JADX WARN: Code duplicated, block: B:156:? A[Catch: all -> 0x021b, SYNTHETIC, TRY_LEAVE, TryCatch #13 {, blocks: (B:3:0x0002, B:55:0x00c5, B:58:0x00cc, B:67:0x00f2, B:96:0x0179, B:100:0x0188, B:126:0x0214, B:127:0x0217, B:121:0x020c, B:61:0x00d2, B:63:0x00e4, B:65:0x00ee, B:64:0x00e9, B:130:0x021a, B:4:0x0003, B:7:0x0008, B:8:0x0024, B:53:0x00c2, B:34:0x0079, B:37:0x007c, B:46:0x0096, B:54:0x00c4, B:52:0x009c), top: B:143:0x0002, inners: #11, #12 }] */
    public static int e(Context context) {
        Throwable th;
        RemoteException e2;
        koh kofVar;
        Cursor cursor;
        synchronized (kor.class) {
            Boolean bool = a;
            Cursor cursor2 = null;
            if (bool == null) {
                try {
                    Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    synchronized (declaredField.getDeclaringClass()) {
                        try {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        f(classLoader);
                                    } catch (koo e3) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if (h || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iH = h(context);
                                    String str = g;
                                    if (str != null && !str.isEmpty()) {
                                        ClassLoader classLoaderA = koj.a();
                                        if (classLoaderA == null) {
                                            String str2 = g;
                                            mip.dk(str2);
                                            classLoaderA = new DelegateLastClassLoader(str2, ClassLoader.getSystemClassLoader());
                                        }
                                        f(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        a = Boolean.TRUE;
                                        return iH;
                                    }
                                    return iH;
                                } catch (koo e4) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                            a = bool;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                    String strValueOf = String.valueOf(e5);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                    sb.append("Failed to load module via V2: ");
                    sb.append(strValueOf);
                    Log.w("DynamiteModule", sb.toString());
                    bool = Boolean.FALSE;
                }
            }
            if (bool.booleanValue()) {
                try {
                    return h(context);
                } catch (koo e6) {
                    String strValueOf2 = String.valueOf(e6.getMessage());
                    Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
            }
            kos kosVarD = d(context);
            if (kosVarD == null) {
                return 0;
            }
            try {
                int iE = kosVarD.e();
                if (iE < 3) {
                    if (iE == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                        koh kohVarB = kog.b(context);
                        Parcel parcelA = kosVarD.a();
                        bmp.e(parcelA, kohVarB);
                        parcelA.writeString("com.google.android.gms.brella_dynamite");
                        bmp.b(parcelA, true);
                        Parcel parcelY = kosVarD.y(5, parcelA);
                        int i = parcelY.readInt();
                        parcelY.recycle();
                        return i;
                    }
                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                    koh kohVarB2 = kog.b(context);
                    Parcel parcelA2 = kosVarD.a();
                    bmp.e(parcelA2, kohVarB2);
                    parcelA2.writeString("com.google.android.gms.brella_dynamite");
                    bmp.b(parcelA2, true);
                    Parcel parcelY2 = kosVarD.y(3, parcelA2);
                    int i2 = parcelY2.readInt();
                    parcelY2.recycle();
                    return i2;
                }
                kom komVar = (kom) c.get();
                if (komVar != null && (cursor = komVar.a) != null) {
                    return cursor.getInt(0);
                }
                koh kohVarB3 = kog.b(context);
                long jLongValue = ((Long) d.get()).longValue();
                Parcel parcelA3 = kosVarD.a();
                bmp.e(parcelA3, kohVarB3);
                parcelA3.writeString("com.google.android.gms.brella_dynamite");
                bmp.b(parcelA3, true);
                parcelA3.writeLong(jLongValue);
                Parcel parcelY3 = kosVarD.y(7, parcelA3);
                IBinder strongBinder = parcelY3.readStrongBinder();
                if (strongBinder == null) {
                    kofVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    kofVar = iInterfaceQueryLocalInterface instanceof koh ? (koh) iInterfaceQueryLocalInterface : new kof(strongBinder);
                }
                parcelY3.recycle();
                Cursor cursor3 = (Cursor) kog.c(kofVar);
                if (cursor3 != null) {
                    try {
                        if (cursor3.moveToFirst()) {
                            int i3 = cursor3.getInt(0);
                            cursor2 = (i3 <= 0 || !g(cursor3)) ? cursor3 : null;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            return i3;
                        }
                    } catch (RemoteException e7) {
                        e2 = e7;
                        cursor2 = cursor3;
                        try {
                            String strValueOf3 = String.valueOf(e2.getMessage());
                            Log.w("DynamiteModule", strValueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf3) : new String("Failed to retrieve remote module version: "));
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor2 != null) {
                                throw th;
                            }
                            cursor2.close();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursor3;
                        if (cursor2 != null) {
                            throw th;
                        }
                        cursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                if (cursor3 == null) {
                    return 0;
                }
                cursor3.close();
                return 0;
            } catch (RemoteException e8) {
                e2 = e8;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    private static void f(ClassLoader classLoader) throws koo {
        kot kotVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kotVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kotVar = iInterfaceQueryLocalInterface instanceof kot ? (kot) iInterfaceQueryLocalInterface : new kot(iBinder);
            }
            f = kotVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new koo("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(Cursor cursor) {
        kom komVar = (kom) c.get();
        if (komVar == null || komVar.a != null) {
            return false;
        }
        komVar.a = cursor;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be A[Catch: all -> 0x00c7, TryCatch #1 {all -> 0x00c7, blocks: (B:34:0x0094, B:35:0x009b, B:47:0x00ba, B:49:0x00be, B:50:0x00bf, B:51:0x00c6), top: B:56:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[Catch: all -> 0x00c7, TryCatch #1 {all -> 0x00c7, blocks: (B:34:0x0094, B:35:0x009b, B:47:0x00ba, B:49:0x00be, B:50:0x00bf, B:51:0x00c6), top: B:56:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    private static int h(Context context) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path("api_force_staging").appendPath("com.google.android.gms.brella_dynamite").appendQueryParameter("requestStartTime", String.valueOf(((Long) d.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z = false;
                        int i = cursorQuery.getInt(0);
                        if (i > 0) {
                            synchronized (kor.class) {
                                g = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    b = cursorQuery.getInt(columnIndex);
                                }
                                int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader");
                                if (columnIndex2 >= 0) {
                                    z = cursorQuery.getInt(columnIndex2) != 0;
                                    h = z;
                                }
                            }
                            if (!g(cursorQuery)) {
                                cursor = cursorQuery;
                            }
                        } else {
                            cursor = cursorQuery;
                        }
                        if (!z) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                        try {
                            try {
                                throw new koo("forcing fallback to container DynamiteLoader impl");
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof koo) {
                                    throw e;
                                }
                                throw new koo("V2 version check failed", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (e instanceof koo) {
                        throw e;
                    }
                    throw new koo("V2 version check failed", e);
                } catch (Throwable th2) {
                    cursor = cursorQuery;
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new koo("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final IBinder b(String str) throws koo {
        try {
            return (IBinder) this.i.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new koo(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2);
        }
    }
}
