package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.C0316k;
import androidx.lifecycle.C0371c;
import androidx.lifecycle.C0375d;
import java.util.Objects;
import p226y0.C4031f;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a */
    public LayoutInflater f5269a;

    /* renamed from: b */
    public LayoutInflater f5270b;

    /* renamed from: c */
    public final C0375d f5271c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, C0316k kVar) {
        super(context);
        Objects.requireNonNull(context);
        C16381 r2 = new C0375d() {
            /* renamed from: b */
            public void mo112b(C4031f fVar, C0371c.C0373b bVar) {
                if (bVar == C0371c.C0373b.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    Objects.requireNonNull(viewComponentManager$FragmentContextWrapper);
                    viewComponentManager$FragmentContextWrapper.f5269a = null;
                    viewComponentManager$FragmentContextWrapper.f5270b = null;
                }
            }
        };
        this.f5271c = r2;
        this.f5269a = null;
        Objects.requireNonNull(kVar);
        kVar.f1551Q.mo1937a(r2);
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5270b == null) {
            if (this.f5269a == null) {
                this.f5269a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f5270b = this.f5269a.cloneInContext(this);
        }
        return this.f5270b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, androidx.fragment.app.C0316k r3) {
        /*
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            android.content.Context r0 = r2.getContext()
            java.util.Objects.requireNonNull(r0)
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f5271c = r0
            r1.f5269a = r2
            java.util.Objects.requireNonNull(r3)
            androidx.lifecycle.e r2 = r3.f1551Q
            r2.mo1937a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, androidx.fragment.app.k):void");
    }
}
