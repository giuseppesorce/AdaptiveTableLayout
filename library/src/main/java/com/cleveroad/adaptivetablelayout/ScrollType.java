package com.cleveroad.adaptivetablelayout;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.cleveroad.adaptivetablelayout.ScrollType.SCROLL_HORIZONTAL;
import static com.cleveroad.adaptivetablelayout.ScrollType.SCROLL_VERTICAL;

@IntDef({
        SCROLL_HORIZONTAL,
        SCROLL_VERTICAL
})
/**
 * Scroll type for drag and drop mode.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface ScrollType {
    int SCROLL_HORIZONTAL = 0;
    int SCROLL_VERTICAL = 1;
}
