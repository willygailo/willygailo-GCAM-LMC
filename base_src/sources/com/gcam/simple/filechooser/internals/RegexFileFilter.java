package com.gcam.simple.filechooser.internals;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter implements FileFilter {
    boolean a;
    boolean b;
    Pattern c;

    public RegexFileFilter() {
        this(null);
    }

    public RegexFileFilter(Pattern pattern) {
        this(false, false, pattern);
    }

    public RegexFileFilter(boolean z, boolean z2, String str) {
        this.a = z2;
        this.b = z;
        this.c = Pattern.compile(str, 2);
    }

    public RegexFileFilter(boolean z, boolean z2, String str, int i) {
        this.a = z2;
        this.b = z;
        this.c = Pattern.compile(str, i);
    }

    public RegexFileFilter(boolean z, boolean z2, Pattern pattern) {
        this.a = z2;
        this.b = z;
        this.c = pattern;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (!this.a && file.isHidden()) {
            return false;
        }
        if (this.b && !file.isDirectory()) {
            return false;
        }
        if (this.c == null || file.isDirectory()) {
            return true;
        }
        return this.c.matcher(file.getName()).matches();
    }
}
