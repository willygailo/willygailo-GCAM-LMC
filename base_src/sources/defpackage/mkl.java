package defpackage;

import j$.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mkl {
    private final ojc a;
    private String c;
    private int d;
    private boolean b = false;
    private final List e = new ArrayList();

    public mkl(ojc ojcVar) {
        this.a = ojcVar;
    }

    public final synchronized ByteBuffer a() {
        boolean z = true;
        this.b = true;
        String str = this.c;
        int i = this.d;
        List<String> list = this.e;
        ArrayList arrayList = new ArrayList();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length != 4) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
            sb.append("Major brand ");
            sb.append(str);
            sb.append(" is invalid");
            throw new IllegalArgumentException(sb.toString());
        }
        arrayList.add(ByteBuffer.wrap(bytes));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        arrayList.add(byteBufferAllocate);
        for (String str2 : list) {
            byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
            if (bytes2.length != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 28);
                sb2.append("Compatible brand ");
                sb2.append(str2);
                sb2.append(" is invalid");
                throw new IllegalArgumentException(sb2.toString());
            }
            arrayList.add(ByteBuffer.wrap(bytes2));
        }
        ByteBuffer byteBufferAw = mip.aw("ftyp", arrayList);
        if (!this.a.g()) {
            return byteBufferAw;
        }
        int iIntValue = (((Integer) this.a.c()).intValue() * 4) + 24;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iIntValue);
        byteBufferAllocate2.put(byteBufferAw);
        byteBufferAllocate2.put(mip.ax("free", ByteBuffer.allocate((((Integer) this.a.c()).intValue() - this.e.size()) * 4)));
        if (byteBufferAllocate2.remaining() != iIntValue) {
            z = false;
        }
        obr.aQ(z);
        return byteBufferAllocate2;
    }

    public final synchronized void b(String str) {
        if (this.e.contains(str)) {
            return;
        }
        if (this.a.g() && this.e.size() + 1 > ((Integer) this.a.c()).intValue()) {
            String strValueOf = String.valueOf(this.a.c());
            StringBuilder sb = new StringBuilder(str.length() + 49 + String.valueOf(strValueOf).length());
            sb.append("Can't add brand ");
            sb.append(str);
            sb.append(" as it doesn't fit in the max of ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        if (!this.a.g() && this.b) {
            StringBuilder sb2 = new StringBuilder(str.length() + 50);
            sb2.append("Can't add brand ");
            sb2.append(str);
            sb2.append(" as ftyp has already been written.");
            throw new IllegalStateException(sb2.toString());
        }
        this.e.add(str);
    }

    public final synchronized void c(String str, int i) {
        if (!this.a.g() && this.b) {
            throw new IllegalStateException("Can't change major brand as ftyp has already been written");
        }
        this.c = str;
        this.d = i;
    }
}
