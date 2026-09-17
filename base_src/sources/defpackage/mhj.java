package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class mhj extends ContextWrapper implements ClientContextProvider {
    private final Context a;

    public mhj(Context context, Context context2) {
        super(context);
        this.a = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean deleteSharedPreferences(String str) {
        return this.a.deleteSharedPreferences(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return this.a.getCacheDir();
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider
    public final Context getClientContext() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        return this.a.getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return this.a.getFilesDir();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return this.a.getSharedPreferences(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean moveSharedPreferencesFrom(Context context, String str) {
        return this.a.moveSharedPreferencesFrom(context, str);
    }
}
