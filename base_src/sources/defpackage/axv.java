package defpackage;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class axv implements ComponentCallbacks2 {
    private static volatile axv h;
    private static volatile boolean i;
    public final bcv a;
    public final aya b;
    public final ayi c;
    public final bct d;
    public final bju e;
    public final List f = new ArrayList();
    public final wk g;
    private final bdr j;

    public axv(Context context, bby bbyVar, bdr bdrVar, bcv bcvVar, bct bctVar, bju bjuVar, wk wkVar, Map map, List list, nvb nvbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        azv bhrVar;
        azv bhwVar;
        this.a = bcvVar;
        this.d = bctVar;
        this.j = bdrVar;
        this.e = bjuVar;
        this.g = wkVar;
        Resources resources = context.getResources();
        if (((axy) ((ayb) nvbVar.a.get(axy.class))) != null) {
            bhk.a = 0;
        }
        ayi ayiVar = new ayi();
        this.c = ayiVar;
        ayiVar.i(new bgw());
        ayiVar.i(new bhi());
        List listB = ayiVar.b();
        bip bipVar = new bip(context, listB, bcvVar, bctVar);
        bif bifVar = new bif(bcvVar, new bic(2));
        bhe bheVar = new bhe(ayiVar.b(), resources.getDisplayMetrics(), bcvVar, bctVar);
        if (nvbVar.m(axw.class)) {
            bhwVar = new bhp(0);
            bhrVar = new bhp(1, null);
        } else {
            bhrVar = new bhr(bheVar, 1);
            bhwVar = new bhw(bheVar, bctVar);
        }
        bim bimVar = new bim(context);
        bfo bfoVar = new bfo(resources, 2);
        bfo bfoVar2 = new bfo(resources, 3);
        bfo bfoVar3 = new bfo(resources, 0);
        bfo bfoVar4 = new bfo(resources, 1);
        bgm bgmVar = new bgm(bctVar);
        bjd bjdVar = new bjd();
        bji bjiVar = new bji(1);
        ContentResolver contentResolver = context.getContentResolver();
        ayiVar.d(ByteBuffer.class, new bel());
        ayiVar.d(InputStream.class, new bfq(bctVar));
        ayiVar.h("Bitmap", ByteBuffer.class, Bitmap.class, bhrVar);
        ayiVar.h("Bitmap", InputStream.class, Bitmap.class, bhwVar);
        ayiVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new bhr(bheVar, 0));
        ayiVar.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bifVar);
        ayiVar.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bif(bcvVar, new bic(1)));
        ayiVar.g(Bitmap.class, Bitmap.class, bfv.a);
        ayiVar.h("Bitmap", Bitmap.class, Bitmap.class, new bin(1));
        ayiVar.e(Bitmap.class, bgmVar);
        ayiVar.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bgk(resources, bhrVar));
        ayiVar.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bgk(resources, bhwVar));
        ayiVar.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bgk(resources, bifVar));
        ayiVar.e(BitmapDrawable.class, new bgl(bcvVar, bgmVar));
        ayiVar.h("Gif", InputStream.class, bis.class, new bjc(listB, bipVar, bctVar));
        ayiVar.h("Gif", ByteBuffer.class, bis.class, bipVar);
        ayiVar.e(bis.class, new bit());
        ayiVar.g(ayy.class, ayy.class, bfv.a);
        ayiVar.h("Bitmap", ayy.class, Bitmap.class, new bja(bcvVar));
        ayiVar.f(Uri.class, Drawable.class, bimVar);
        ayiVar.f(Uri.class, Bitmap.class, new bhu(bimVar, bcvVar));
        ayiVar.j(new big());
        ayiVar.g(File.class, ByteBuffer.class, new bej(2));
        ayiVar.g(File.class, InputStream.class, new beq(new bet(0)));
        ayiVar.f(File.class, File.class, new bin(2));
        ayiVar.g(File.class, ParcelFileDescriptor.class, new beq(new bet(1)));
        ayiVar.g(File.class, File.class, bfv.a);
        ayiVar.j(new bam(bctVar));
        ayiVar.j(new bap());
        ayiVar.g(Integer.TYPE, InputStream.class, bfoVar);
        ayiVar.g(Integer.TYPE, ParcelFileDescriptor.class, bfoVar3);
        ayiVar.g(Integer.class, InputStream.class, bfoVar);
        ayiVar.g(Integer.class, ParcelFileDescriptor.class, bfoVar3);
        ayiVar.g(Integer.class, Uri.class, bfoVar2);
        ayiVar.g(Integer.TYPE, AssetFileDescriptor.class, bfoVar4);
        ayiVar.g(Integer.class, AssetFileDescriptor.class, bfoVar4);
        ayiVar.g(Integer.TYPE, Uri.class, bfoVar2);
        ayiVar.g(String.class, InputStream.class, new bep());
        ayiVar.g(Uri.class, InputStream.class, new bep());
        ayiVar.g(String.class, InputStream.class, new bej(5));
        ayiVar.g(String.class, ParcelFileDescriptor.class, new bej(4));
        ayiVar.g(String.class, AssetFileDescriptor.class, new bej(3));
        ayiVar.g(Uri.class, InputStream.class, new bee(context.getAssets(), 0));
        ayiVar.g(Uri.class, ParcelFileDescriptor.class, new bee(context.getAssets(), 1));
        ayiVar.g(Uri.class, InputStream.class, new bfz(context, 0));
        ayiVar.g(Uri.class, InputStream.class, new bfz(context, 2));
        ayiVar.g(Uri.class, InputStream.class, new bgb(context, InputStream.class));
        ayiVar.g(Uri.class, ParcelFileDescriptor.class, new bgb(context, ParcelFileDescriptor.class));
        ayiVar.g(Uri.class, InputStream.class, new bfs(contentResolver, 2));
        ayiVar.g(Uri.class, ParcelFileDescriptor.class, new bfs(contentResolver, 0));
        ayiVar.g(Uri.class, AssetFileDescriptor.class, new bfs(contentResolver, 1));
        ayiVar.g(Uri.class, InputStream.class, new bfv(0));
        ayiVar.g(URL.class, InputStream.class, new bfv(2));
        ayiVar.g(Uri.class, File.class, new bfz(context, 1));
        ayiVar.g(bev.class, InputStream.class, new bfx());
        ayiVar.g(byte[].class, ByteBuffer.class, new bej(1));
        ayiVar.g(byte[].class, InputStream.class, new bej(0));
        ayiVar.g(Uri.class, Uri.class, bfv.a);
        ayiVar.g(Drawable.class, Drawable.class, bfv.a);
        ayiVar.f(Drawable.class, Drawable.class, new bin(0));
        ayiVar.k(Bitmap.class, BitmapDrawable.class, new bje(resources));
        ayiVar.k(Bitmap.class, byte[].class, bjdVar);
        ayiVar.k(Drawable.class, byte[].class, new bjf(bcvVar, bjdVar, bjiVar));
        ayiVar.k(bis.class, byte[].class, bjiVar);
        bif bifVar2 = new bif(bcvVar, new bic(0));
        ayiVar.f(ByteBuffer.class, Bitmap.class, bifVar2);
        ayiVar.f(ByteBuffer.class, BitmapDrawable.class, new bgk(resources, bifVar2));
        this.b = new aya(context, bctVar, ayiVar, map, list, bbyVar, nvbVar, null, null, null);
    }

    public static axv b(Context context) {
        if (h == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (axv.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    i = true;
                    axz axzVar = new axz();
                    Context applicationContext = context.getApplicationContext();
                    Collections.emptyList();
                    ArrayList<GlideConfiguration> arrayList = new ArrayList();
                    try {
                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                        if (applicationInfo.metaData != null) {
                            for (String str : applicationInfo.metaData.keySet()) {
                                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                    arrayList.add(dgg.d(str));
                                }
                            }
                        }
                        if (generatedAppGlideModuleD != null && !generatedAppGlideModuleD.a().isEmpty()) {
                            Set setA = generatedAppGlideModuleD.a();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (setA.contains(((GlideConfiguration) it.next()).getClass())) {
                                    it.remove();
                                }
                            }
                        }
                        for (GlideConfiguration glideConfiguration : arrayList) {
                        }
                        if (axzVar.e == null) {
                            bdx bdxVar = new bdx(false);
                            bdxVar.b(bec.a());
                            bdxVar.a = "source";
                            axzVar.e = bdxVar.a();
                        }
                        if (axzVar.f == null) {
                            bdx bdxVar2 = new bdx(true);
                            bdxVar2.b(1);
                            bdxVar2.a = "disk-cache";
                            axzVar.f = bdxVar2.a();
                        }
                        if (axzVar.h == null) {
                            int i2 = bec.a() >= 4 ? 2 : 1;
                            bdx bdxVar3 = new bdx(true);
                            bdxVar3.b(i2);
                            bdxVar3.a = "animation";
                            axzVar.h = bdxVar3.a();
                        }
                        if (axzVar.g == null) {
                            axzVar.g = new bdt(new bds(applicationContext));
                        }
                        if (axzVar.l == null) {
                            axzVar.l = new wk();
                        }
                        if (axzVar.c == null) {
                            int i3 = axzVar.g.a;
                            if (i3 > 0) {
                                axzVar.c = new bdd(i3);
                            } else {
                                axzVar.c = new bcw();
                            }
                        }
                        if (axzVar.d == null) {
                            axzVar.d = new bdc(axzVar.g.c);
                        }
                        if (axzVar.j == null) {
                            axzVar.j = new bdr(axzVar.g.b);
                        }
                        if (axzVar.k == null) {
                            axzVar.k = new bdo(applicationContext);
                        }
                        if (axzVar.b == null) {
                            bdr bdrVar = axzVar.j;
                            bdo bdoVar = axzVar.k;
                            bec becVar = axzVar.f;
                            bec becVar2 = axzVar.e;
                            new ThreadPoolExecutor(0, Integer.MAX_VALUE, bec.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new beb(new bdz(0), "source-unlimited", false));
                            axzVar.b = new bby(bdrVar, bdoVar, becVar, becVar2, axzVar.h);
                        }
                        List list = axzVar.i;
                        if (list == null) {
                            axzVar.i = Collections.emptyList();
                        } else {
                            axzVar.i = Collections.unmodifiableList(list);
                        }
                        axv axvVar = new axv(applicationContext, axzVar.b, axzVar.j, axzVar.c, axzVar.d, new bju(), axzVar.l, axzVar.a, axzVar.i, new nvb(axzVar.n, null, null, null, null), null, null, null);
                        for (GlideConfiguration glideConfiguration2 : arrayList) {
                        }
                        applicationContext.registerComponentCallbacks(axvVar);
                        h = axvVar;
                        i = false;
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
                    }
                }
            }
        }
        return h;
    }

    public static ayn c(Context context) {
        aae.w(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).e.a(context);
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e2) {
            e(e2);
            return null;
        } catch (InstantiationException e3) {
            e(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            e(e4);
            return null;
        } catch (InvocationTargetException e5) {
            e(e5);
            return null;
        }
    }

    private static void e(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        bmf.i();
        this.j.i();
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        bmf.i();
        synchronized (this.f) {
            for (ayn aynVar : this.f) {
            }
        }
        bdr bdrVar = this.j;
        if (i2 >= 40) {
            bdrVar.i();
        } else if (i2 >= 20) {
            bdrVar.j(bdrVar.e() / 2);
        } else if (i2 == 15) {
            i2 = 15;
            bdrVar.j(bdrVar.e() / 2);
        }
        this.a.e(i2);
        this.d.d(i2);
    }
}
