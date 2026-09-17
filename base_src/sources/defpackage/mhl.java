package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.lens.lenslite.api.DownloadEvent;
import com.google.android.libraries.lens.lenslite.api.DownloadListener;
import com.google.android.libraries.lens.lenslite.api.DownloadParam;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester;
import com.google.android.libraries.lens.lenslite.api.LogPolicyType;
import com.google.android.libraries.lens.lenslite.api.LoggingListener;
import com.google.android.libraries.lens.lenslite.api.ModelInfo;
import com.google.android.libraries.lens.lenslite.api.ModelInfoListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import com.google.android.libraries.lens.smartsapi.SmartsResult$SmartsEngineType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mhl {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(EngineApiLoader.class.getName(), DLEngineApi.class.getName(), SmartsResult$SmartsEngineType.class.getName(), LinkEventListener.class.getName(), LinkChipResult.class.getName(), DLLinkResultListener.class.getName(), LinkChipResult.BitmapProvider.class.getName(), LinkHighResBitmapRequester.class.getName(), LinkHighResBitmapRequester.LinkHighResBitmapCallback.class.getName(), KeyguardDismisser.class.getName(), LogPolicyType.class.getName(), ClientContextProvider.class.getName(), DownloadParam.class.getName(), DownloadListener.class.getName(), DownloadEvent.class.getName(), ModelInfo.class.getName(), ModelInfoListener.class.getName(), ImageProxy.class.getName(), ImageProxy.Plane.class.getName(), LoggingListener.class.getName())));
    public static final Object b = new Object();
    public static final Map c = new HashMap();
    public final Context d;
    public final Set e;
    public final String f;
    public Context g;

    public mhl(Context context, Set set, String str) {
        this.d = context;
        this.e = set;
        this.f = str;
    }

    public static String c(Context context, String str) throws mho {
        try {
            long j = context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(".");
            sb.append(j);
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            throw new mho(String.format("Remote package %s can't be found", str), e);
        }
    }

    public final Context a() {
        Context context = this.g;
        context.getClass();
        return context;
    }

    public final Class b(String str) throws mhn {
        try {
            return Class.forName(str, true, (ClassLoader) c.get(c(a(), this.f)));
        } catch (ClassNotFoundException e) {
            throw new mhn(String.format("%s class is not found", str), e);
        }
    }
}
