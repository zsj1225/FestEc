package com.zsj.festec;

import com.zsj.lib.androidlib.activities.ProxyActivity;
import com.zsj.lib.androidlib.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new MainFragment();
    }

}
