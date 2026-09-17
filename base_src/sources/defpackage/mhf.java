package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mhf {
    public static final boolean a;
    public static final mhy b;
    private static final List c;

    static {
        boolean zC = mhg.c();
        a = zC;
        mhg.d();
        if (!mhg.a()) {
            mhg.b();
        }
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("GM1900", "GM1901", "GM1903", "GM1905", "GM1910", "GM1911", "GM1913", "GM1917", "GM1915", "GM1920", "GM1925", "SS8821", "SS8831", "SS8827", "SS8857", "HD1910", "HD1911", "HD1913", "HD1917", "HD1900", "HD1901", "HD1903", "HD1905", "HD1907", "HD1925", "IN2020", "IN2021", "IN2023", "IN2025", "IN2010", "IN2011", "IN2013", "IN2015", "IN2017", "IN2019"));
        c = listUnmodifiableList;
        if (!mhg.c()) {
            listUnmodifiableList.contains(Build.MODEL);
        }
        if (!mhg.b() && !mhg.a()) {
            mhg.e();
        }
        if (!mhg.b() && !mhg.a()) {
            mhg.e();
        }
        if (!mhg.b()) {
            mhg.a();
        }
        if (!mhg.b()) {
            mhg.a();
        }
        if (!mhg.b()) {
            mhg.a();
        }
        if (zC) {
            mhg.e();
        }
        if (!zC) {
            mhg.e();
        }
        if (!zC) {
            mhg.e();
        }
        listUnmodifiableList.contains(Build.MODEL);
        b = (mhg.a() || mhg.b()) ? mhy.ENABLED : mhy.DISABLED;
        if (!mhg.a() && !mhg.b()) {
            mhg.e();
        }
        mhg.d();
    }
}
