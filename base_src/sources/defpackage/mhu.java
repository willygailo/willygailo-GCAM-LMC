package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mhu implements mhs {
    public final mgr a;
    private final Context b;
    private final mhm c;

    public mhu(Context context, mhm mhmVar, mgr mgrVar) {
        this.b = context;
        this.c = mhmVar;
        this.a = mgrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01e6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    @Override // defpackage.mhs
    public final DLEngineApi a(String str) throws mhn {
        DLEngineApi engineApi;
        mhx mhxVar;
        ClassLoader dexClassLoader;
        mhm mhmVar = this.c;
        Context context = (Context) ((pyt) mhmVar.a).a;
        Set set = ((pyw) mhmVar.b).get();
        set.getClass();
        str.getClass();
        mhl mhlVar = new mhl(context, set, str);
        Context context2 = mhlVar.d;
        String str2 = mhlVar.f;
        final int i = 0;
        try {
            Context contextCreatePackageContext = context2.createPackageContext(str2, 3);
            String strC = mhl.c(contextCreatePackageContext, mhlVar.f);
            synchronized (mhl.b) {
                if (!mhl.c.containsKey(strC)) {
                    if (contextCreatePackageContext.getPackageName().equals(mhlVar.d.getPackageName())) {
                        dexClassLoader = mhlVar.d.getClassLoader();
                    } else {
                        String packageCodePath = contextCreatePackageContext.getPackageCodePath();
                        String absolutePath = mhlVar.d.getCodeCacheDir().getAbsolutePath();
                        String str3 = contextCreatePackageContext.getApplicationInfo().nativeLibraryDir;
                        String packageCodePath2 = contextCreatePackageContext.getPackageCodePath();
                        String[] strArr = contextCreatePackageContext.getApplicationInfo().splitSourceDirs;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        if (!TextUtils.isEmpty(packageCodePath2)) {
                            sb.append(File.pathSeparator);
                            sb.append(packageCodePath2);
                            sb.append("!/lib/");
                            sb.append(Build.SUPPORTED_ABIS[0]);
                        }
                        if (strArr != null) {
                            for (String str4 : strArr) {
                                sb.append(File.pathSeparator);
                                sb.append(str4);
                                sb.append("!/lib/");
                                sb.append(Build.SUPPORTED_ABIS[0]);
                            }
                        }
                        dexClassLoader = new DexClassLoader(packageCodePath, absolutePath, sb.toString(), new mhk(mhlVar.d.getClassLoader(), mhl.a));
                    }
                    mhl.c.put(strC, dexClassLoader);
                }
            }
            mhlVar.g = new mhj(contextCreatePackageContext, mhlVar.d);
            String str5 = mhlVar.f;
            for (mhp mhpVar : mhlVar.e) {
                mip mipVar = mhpVar.b;
                long jC = mip.C(mhlVar);
                mip mipVar2 = mhpVar.b;
                long jB = mip.B(mhlVar);
                mhpVar.a.a();
                char c = 4;
                if (jC == 17) {
                    poy poyVarM = mhx.c.m();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    ((mhx) poyVarM.b).a = mip.A(3);
                    mhxVar = (mhx) poyVarM.j();
                } else if (jC < 17 && jC >= 4) {
                    poy poyVarM2 = mhx.c.m();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    ((mhx) poyVarM2.b).a = mip.A(3);
                    mhxVar = (mhx) poyVarM2.j();
                } else if (jC <= 17 || jB > 17) {
                    poy poyVarM3 = mhx.c.m();
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    ((mhx) poyVarM3.b).a = mip.A(4);
                    String str6 = String.format("Client and host versions are incompatible. Client version: %s. Client min version: %s. Host version: %s. Host min version: %s", 17L, 4L, Long.valueOf(jC), Long.valueOf(jB));
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    mhx mhxVar2 = (mhx) poyVarM3.b;
                    str6.getClass();
                    mhxVar2.b = str6;
                    mhxVar = (mhx) poyVarM3.j();
                } else {
                    poy poyVarM4 = mhx.c.m();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    ((mhx) poyVarM4.b).a = mip.A(3);
                    mhxVar = (mhx) poyVarM4.j();
                }
                switch (mhxVar.a) {
                    case 0:
                        c = 2;
                        if (c != 0 || c != 3) {
                            throw new mhn(String.format("Host package %s is not compatible: %s", str5, mhxVar.b));
                        }
                        break;
                        break;
                    case 1:
                        c = 3;
                        if (c != 0) {
                        }
                        throw new mhn(String.format("Host package %s is not compatible: %s", str5, mhxVar.b));
                    case 2:
                        if (c != 0) {
                        }
                        throw new mhn(String.format("Host package %s is not compatible: %s", str5, mhxVar.b));
                    default:
                        c = 0;
                        if (c != 0) {
                        }
                        throw new mhn(String.format("Host package %s is not compatible: %s", str5, mhxVar.b));
                }
            }
            try {
                EngineApiLoader engineApiLoader = (EngineApiLoader) mhlVar.b("com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Context contextA = mhlVar.a();
                if (mip.C(mhlVar) >= ApiVersion.VERSION_6.getVersionCode()) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("shim_version_code", 17L);
                    bundle.putString("host_package_name", str);
                    bundle.putString("shim_package_name", this.b.getPackageName());
                    final int i2 = 1;
                    engineApi = engineApiLoader.getEngineApi(contextA, new Callable(this) { // from class: mht
                        public final /* synthetic */ mhu a;

                        {
                            this.a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return this.a.a.a().toByteArray();
                        }
                    }, bundle);
                } else {
                    engineApi = engineApiLoader.getEngineApi(contextA, new Callable(this) { // from class: mht
                        public final /* synthetic */ mhu a;

                        {
                            this.a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i) {
                                case 0:
                                    break;
                            }
                            return this.a.a.a().toByteArray();
                        }
                    }, 17L);
                }
                String.format("EngineApi loaded from %1$s@%2$s. Host api version: %3$s", str, this.b.getPackageManager().getPackageInfo(str, 0).versionName, Long.valueOf(engineApi.getHostApiVersion()));
                return engineApi;
            } catch (IllegalAccessException e) {
                e = e;
                throw new mhn("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
            } catch (InstantiationException e2) {
                e = e2;
                throw new mhn("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
            } catch (NoSuchMethodException e3) {
                e = e3;
                throw new mhn("Cannot get constructor for com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
            } catch (InvocationTargetException e4) {
                e = e4;
                throw new mhn("Cannot get constructor for com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
            } catch (Throwable th) {
                throw new mhn(th.getMessage() != null ? th.getMessage() : "Failed to load engine", th);
            }
        } catch (PackageManager.NameNotFoundException e5) {
            throw new mho(String.format("remote package %s not found", str2), e5);
        }
    }
}
