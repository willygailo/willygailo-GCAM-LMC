package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pif implements Runnable {
    Runnable a;
    final /* synthetic */ pig b;

    public pif(pig pigVar) {
        this.b = pigVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0052 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r2 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r4 = defpackage.pig.a;
        r5 = java.util.logging.Level.SEVERE;
        r3 = java.lang.String.valueOf(r11.a);
        r10 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 35);
        r10.append("Exception while executing runnable ");
        r10.append(r3);
        r4.logp(r5, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r10.toString(), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        r11.a = null;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            pig r3 = r11.b     // Catch: java.lang.Throwable -> L8f
            java.util.Deque r3 = r3.b     // Catch: java.lang.Throwable -> L8f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L25
            pig r0 = r11.b     // Catch: java.lang.Throwable -> L8c
            int r4 = r0.d     // Catch: java.lang.Throwable -> L8c
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L9a
            r0.interrupt()     // Catch: java.lang.Error -> L9a
            return
        L1c:
            long r6 = r0.c     // Catch: java.lang.Throwable -> L8c
            r8 = 1
            long r6 = r6 + r8
            r0.c = r6     // Catch: java.lang.Throwable -> L8c
            r0.d = r5     // Catch: java.lang.Throwable -> L8c
        L25:
            pig r0 = r11.b     // Catch: java.lang.Throwable -> L8c
            java.util.Deque r0 = r0.b     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L8c
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L8c
            r11.a = r0     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L42
            pig r0 = r11.b     // Catch: java.lang.Throwable -> L8c
            r0.d = r1     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L9a
            r0.interrupt()     // Catch: java.lang.Error -> L9a
        L41:
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8f
            r2 = r2 | r0
            r0 = 0
            java.lang.Runnable r3 = r11.a     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r3.run()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r11.a = r0     // Catch: java.lang.Throwable -> L52
            r0 = 1
            goto L3
        L52:
            r0 = move-exception
            goto L90
        L54:
            r3 = move-exception
            goto L89
        L56:
            r3 = move-exception
            r9 = r3
            java.util.logging.Logger r4 = defpackage.pig.a     // Catch: java.lang.Throwable -> L54
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r3 = r11.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L54
            int r8 = r8 + 35
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "Exception while executing runnable "
            r10.append(r8)     // Catch: java.lang.Throwable -> L54
            r10.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L54
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54
            r11.a = r0     // Catch: java.lang.Throwable -> L52
            r0 = 1
            goto L3
        L89:
            r11.a = r0     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L52
        L8c:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
        L90:
            if (r2 == 0) goto L99
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L9a
            r2.interrupt()     // Catch: java.lang.Error -> L9a
        L99:
            throw r0     // Catch: java.lang.Error -> L9a
        L9a:
            r0 = move-exception
            pig r2 = r11.b
            java.util.Deque r2 = r2.b
            monitor-enter(r2)
            pig r3 = r11.b     // Catch: java.lang.Throwable -> La6
            r3.d = r1     // Catch: java.lang.Throwable -> La6
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            throw r0
        La6:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La6
            goto Laa
        La9:
            throw r0
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pif.run():void");
    }

    public final String toString() {
        String str;
        Runnable runnable = this.a;
        if (runnable != null) {
            String strValueOf = String.valueOf(runnable);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
            sb.append("SequentialExecutorWorker{running=");
            sb.append(strValueOf);
            sb.append("}");
            return sb.toString();
        }
        switch (this.b.d) {
            case 1:
                str = "IDLE";
                break;
            case 2:
                str = "QUEUING";
                break;
            case 3:
                str = "QUEUED";
                break;
            case 4:
                str = "RUNNING";
                break;
            default:
                str = "null";
                break;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append("SequentialExecutorWorker{state=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
