package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ppp extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public ppp(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public ppp(String str) {
        super(str);
    }

    public static ppo a() {
        return new ppo();
    }

    public static ppp b() {
        return new ppp("Protocol message end-group tag did not match expected tag.");
    }

    public static ppp c() {
        return new ppp("Protocol message contained an invalid tag (zero).");
    }

    public static ppp d() {
        return new ppp("Protocol message had invalid UTF-8.");
    }

    static ppp e() {
        return new ppp("CodedInputStream encountered a malformed varint.");
    }

    public static ppp f() {
        return new ppp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ppp g() {
        return new ppp("Failed to parse the message.");
    }

    static ppp h() {
        return new ppp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static ppp i() {
        return new ppp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final void j() {
        this.a = true;
    }
}
