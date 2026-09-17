package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngb implements Runnable {
    public final /* synthetic */ nei a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ ngb(nei neiVar, String str, int i) {
        this.c = i;
        this.a = neiVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                nei neiVar = this.a;
                final String str = this.b;
                ArrayList arrayList = new ArrayList();
                arrayList.add(neiVar.g);
                int i = mez.a;
                arrayList.add(mez.a(neiVar.g));
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strValueOf = String.valueOf(((Context) arrayList.get(i2)).getFilesDir().toPath());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
                    sb.append(strValueOf);
                    sb.append("/phenotype/shared");
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        for (File file2 : file.listFiles(new FilenameFilter() { // from class: nga
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file3, String str2) {
                                return str2.equals(str.concat(".pb"));
                            }
                        })) {
                            if (str.length() != 0) {
                                "Removing leftover snapshots for removed package: ".concat(str);
                            } else {
                                new String("Removing leftover snapshots for removed package: ");
                            }
                            file2.delete();
                        }
                    }
                }
                break;
            default:
                nei neiVar2 = this.a;
                String str2 = this.b;
                ojc ojcVar = nfg.a;
                if (!ngt.f(neiVar2.g).containsKey(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 183);
                    sb2.append("Config package ");
                    sb2.append(str2);
                    sb2.append(" cannot use ProtoDataStore backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                    Log.e("PhenotypeCombinedFlags", sb2.toString());
                }
                break;
        }
    }
}
