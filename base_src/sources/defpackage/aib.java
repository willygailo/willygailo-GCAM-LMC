package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
final class aib implements Runnable {
    final /* synthetic */ aif a;

    public aib(aif aifVar) {
        this.a = aifVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:82:0x011e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        Throwable th;
        Lock lockE = this.a.d.e();
        lockE.lock();
        try {
            try {
                aif aifVar = this.a;
                if (aifVar.d.l()) {
                    if (!aifVar.f) {
                        aifVar.d.c.a();
                    }
                    if (!aifVar.f) {
                        Log.e("ROOM", "database is not initialized even though it is open");
                    } else if (this.a.e.compareAndSet(true, false) && !this.a.d.k()) {
                        ajy ajyVarA = this.a.d.c.a();
                        ajyVarA.e();
                        try {
                            hashSet = new HashSet();
                            Cursor cursorO = this.a.d.o(new ajp("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                            while (cursorO.moveToNext()) {
                                try {
                                    hashSet.add(Integer.valueOf(cursorO.getInt(0)));
                                } catch (Throwable th2) {
                                    cursorO.close();
                                    throw th2;
                                }
                            }
                            cursorO.close();
                            if (!hashSet.isEmpty()) {
                                this.a.j.a();
                            }
                            try {
                                ajyVarA.h();
                                try {
                                    ajyVarA.f();
                                } catch (SQLiteException e) {
                                    e = e;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                }
                                lockE.unlock();
                                if (hashSet != null || hashSet.isEmpty()) {
                                    return;
                                }
                                synchronized (this.a.h) {
                                    Iterator it = this.a.h.iterator();
                                    while (it.hasNext()) {
                                        aie aieVar = (aie) ((uz) ((vb) it).next()).b;
                                        int length = aieVar.a.length;
                                        Set hashSet2 = null;
                                        for (int i = 0; i < length; i++) {
                                            if (hashSet.contains(Integer.valueOf(aieVar.a[i]))) {
                                                if (length == 1) {
                                                    hashSet2 = aieVar.d;
                                                } else {
                                                    if (hashSet2 == null) {
                                                        hashSet2 = new HashSet(length);
                                                    }
                                                    hashSet2.add(aieVar.b[i]);
                                                }
                                            }
                                        }
                                        if (hashSet2 != null) {
                                            aieVar.c.b.c(aiw.a);
                                        }
                                    }
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    ajyVarA.f();
                                    throw th;
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                    lockE.unlock();
                                    if (hashSet != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (IllegalStateException e4) {
                                    e = e4;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                    lockE.unlock();
                                    if (hashSet != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            hashSet = null;
                        }
                    }
                }
                lockE.unlock();
            } catch (Throwable th5) {
                lockE.unlock();
                throw th5;
            }
        } catch (SQLiteException | IllegalStateException e5) {
            e = e5;
            hashSet = null;
        }
    }
}
