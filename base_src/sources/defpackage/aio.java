package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.room.RoomDatabaseKt", c = "RoomDatabase.kt", d = "withTransaction", e = {R.styleable.AppCompatTheme_colorAccent, R.styleable.AppCompatTheme_colorBackgroundFloating})
public final class aio extends qlu {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;

    public aio(qlh qlhVar) {
        super(qlhVar);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return fx.o(null, null, this);
    }
}
